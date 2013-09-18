package syp;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

import java.util.List;
import java.util.Locale;

import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import syp.webdriver.SeleniumProvider;

/**
 * <p>
 * {@link Embeddable} class to run multiple textual stories via JUnit.
 * </p>
 * <p>
 * Stories are specified in classpath and correspondingly the
 * {@link LoadFromClasspath} story loader is configured.
 * </p>
 */
public class MyStories extends JUnitStories {

	public MyStories() {
		configuredEmbedder().embedderControls()
				.doGenerateViewAfterStories(true)
				.doIgnoreFailureInStories(true).doIgnoreFailureInView(true)
				.useThreads(1).useStoryTimeoutInSecs(300);
	}

	@Override
	public Configuration configuration() {
		Class<? extends Embeddable> embeddableClass = this.getClass();
		// Start from default ParameterConverters instance
		Keywords keywords = new LocalizedKeywords(new Locale("en"));

		return new MostUsefulConfiguration()
				.useStoryLoader(new LoadFromClasspath(embeddableClass))
				.useKeywords(keywords)
				.useStoryParser(new RegexStoryParser(keywords))
				.useStoryReporterBuilder(
						new StoryReporterBuilder()
								.withCodeLocation(
										CodeLocations
												.codeLocationFromClass(embeddableClass))
								.withDefaultFormats()
								.withFormats(Format.CONSOLE, Format.TXT,
										Format.HTML, Format.XML));
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new MySteps(),
				new SeleniumProvider());
	}

	@Override
	protected List<String> storyPaths() {
		return new StoryFinder().findPaths(
				codeLocationFromClass(this.getClass()),
				"**/*.story", "**/*excluded*.story");

	}

}