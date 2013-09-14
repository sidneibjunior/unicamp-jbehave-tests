Narrative:
In order to share what I think with other people
As a user
I want to add my list of predictions

Scenario: Create a valid list of predictions

Given I am on Share your predictions home page
And I login as merlo2013 with password merlo2013

When I add the list of prediction Maíra
Then Your Lists screen must be opened with name Your Lists
And The list must have the value 1 at line 1 and column 1
And The list must have the value Maíra at line 1 and column 2
And The list must have the value September 07, 2013 at line 1 and column 3

When I add the list of prediction Taça Sulamericana
Then Your Lists screen must be opened with name Your Lists
And The list must have the value 2 at line 2 and column 1
And The list must have the value Taça Sulamericana at line 2 and column 2
And The list must have the value September 07, 2013 at line 2 and column 3

When I add the list of prediction Campeonato Basquete
Then Your Lists screen must be opened with name Your Lists
And The list must have the value 3 at line 3 and column 1
And The list must have the value Campeonato Basquete at line 3 and column 2
And The list must have the value September 07, 2013 at line 3 and column 3

When I add the list of prediction Campeonato Brasileiro
Then Your Lists screen must be opened with name Your Lists
And The list must have the value 2 at line 4 and column 1
And The list must have the value Campeonato Brasileiro at line 4 and column 2
And The list must have the value September 07, 2013 at line 4 and column 3


Scenario: Create an list of predictions with more than 50 characters

Given I am on Share your predictions home page
And I login as merlo2013 with password merlo2013

When I add the list of prediction aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
Then I must see the message Oops! Please provider a title (up to 50 characters)

When I add the list of prediction aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2
Then I must see the message Oops! Please provider a title (up to 50 characters)

When I add the list of prediction bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
Then I must see the message Oops! Please provider a title (up to 50 characters)

When I add the list of prediction zzzzz zzzzz zzzzzzzzzzzz zzzzzz zzzzzzzzzz zzzzzzzz zzzz zzzzzzzzzzz zzzzzz zzzzz zzzz zzzzzz zzz zzzz
Then I must see the message Oops! Please provider a title (up to 50 characters)

