Narrative: 
In order to share what I think with other people
As a user
I want to login into the system

Scenario: Login with valid data

Given I am on Share your predictions home page
When I login as merlo2013 with password merlo2013
Then I must see the button Log Out
And Your Lists screen must be opened with name Your Lists
And I click on logout button

When I login as merlo2013 with password merlo2013
Then I must see the button Log Out
And Your Lists screen must be opened with name Your Lists
And I click on logout button

When I login as leandro with password 1234567
Then I must see the button Log Out
And Your Lists screen must be opened with name Your Lists
And I click on logout button

When I login as brunotx1 with password 12345678
Then I must see the button Log Out
And Your Lists screen must be opened with name Your Lists
And I click on logout button

Scenario: Login with invalid login

Given I am on Share your predictions home page
When I login as merlonetti2013 with password merlo2013
Then I must see the message Please try again.

When I login as merlonetti with password merlo2013
Then I must see the message Please try again.

When I login as merlone with password merlo2013
Then I must see the message Please try again.

When I login as merlo2014 with password merlo2013
Then I must see the message Please try again.

Scenario: Login with invalid password

Given I am on Share your predictions home page
When I login as merlo2013 with password merloXXXX
Then I must see the message Please try again.

When I login as merlo2013 with password merlo20133
Then I must see the message Please try again.

When I login as merlo2013 with password merloBarbosa
Then I must see the message Please try again.

When I login as merlo2013 with password merlonet
Then I must see the message Please try again.
