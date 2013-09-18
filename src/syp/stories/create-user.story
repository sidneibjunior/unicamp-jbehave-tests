Narrative:
Insert a new user

Scenario: Insert a new User

Given I am on Create User Page
And the database is ready

When I add Login Name JFreitas, Screen Name Jussara Freitas, Email jussara@gmail.com, Password 123456789, Confirm Password 123456789, Captcha xxx
And I click on Register button
Then I must see the message Thank you! It works! Yesss!!!
And the user JFreitas is inserted on the database


Scenario: Insert a new user without filling the captcha

Given I am on Create User Page
And the database is ready

When I add Login Name Monique, Screen Name Monique Ribeiro, Email monique@email.com, Password Senha123, Confirm Password Senha123, Captcha vazio
And I click on Register button
Then I must see the message Please type in the fuzzy characters (CAPTCHA)


Scenario: Insert a new User with existing e-mail

Given I am on Create User Page
And the database is ready

When I add Login Name JFreitas, Screen Name Jussara Freitas, Email jussara@gmail.com, Password 123456789, Confirm Password 123456789, Captcha xxx
And I click on Register button
Then I must see the message Please try again. That user name (or email address) is already taken.


Scenario: Insert a new User with invalid email

Given I am on Create User Page
And the database is ready

When I add Login Name Monique, Screen Name Monique Ribeiro, Email usuarioemail.com, Password Senha123, Confirm Password Senha123, Captcha xxx
And I click on Register button
Then I must see the message Valid email address is required (in case you forget your password).


Scenario: Insert a new User with smaller fields of 6 characters

Given I am on Create User Page
And the database is ready
When I add Login Name Monique, Screen Name Monique Ribeiro, Email monique@email.com, Password Senha, Confirm Password Senha, Captcha xxx
And I click on Register button
Then I must see the message Password is required, minimum 6 characters.

Given I am on Create User Page
When I add Login Name Monique, Screen Name Moniq, Email monique@email.com, Password Monique, Confirm Password Monique, Captcha xxx
And I click on Register button
Then I must see the message Screen Name is required, minimum 6 characters.

Given I am on Create User Page
When I add Login Name LuanFarias, Screen Name Luan, Email lu_farias@gmail.com, Password L, Confirm Password L, Captcha xxx
And I click on Register button
Then I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Password is required, minimum 6 characters.

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan Farias, Email lu_farias@gmail.com, Password LF0000, Confirm Password LF0000, Captcha xxx
And I click on Register button
Then I must see the message Login Name is required, must be at least 6 characters.

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan Farias, Email lu_farias@gmail.com, Password LF000, Confirm Password LF000, Captcha xxx
And I click on Register button
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Password is required, minimum 6 characters.

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan, Email lu_farias@gmail.com, Password AaaaaZzzz, Confirm Password AaaaaZzzz, Captcha xxx
And I click on Register button
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Screen Name is required, minimum 6 characters.

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan, Email lu_farias@gmail.com, Password LF, Confirm Password LF, Captcha xxx
And I click on Register button
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Password is required, minimum 6 characters.


Scenario: Insert a new User with invalid email and smaller fields of 6 characters

Given I am on Create User Page
And the database is ready

When I add Login Name Monique, Screen Name Monique Ribeiro, Email monique@email.., Password QqqAA, Confirm Password QqqAA, Captcha xxx
And I click on Register button
Then I must see the message Password is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).

Given I am on Create User Page
When I add Login Name Monique, Screen Name Mo Ri, Email monique@.com, Password Senha123, Confirm Password Senha123, Captcha xxx
And I click on Register button 
Then I must see the message Screen Name is required, minimum 6 characters.,
And I must see the message Valid email address is required (in case you forget your password).

Given I am on Create User Page
When I add Login Name LuanFarias, add Screen Name Luan, Email lu_fariasgmail.com, Password L, Confirm Password L, Captcha xxx
And I click on Register button 
Then I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan Farias, Email lu_farias.com, Password LF0000, Confirm Password LF0000, Captcha xxx
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Valid email address is required (in case you forget your password).
 
Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan Farias, Email lu_farias@gmail, Password LF000, Confirm Password LF000, Captcha xxx
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).

Given I am on Create User Page 
When I add Login Name Luan, Screen Name Luan, Email lu_farias, Password 123456789, Confirm Password 123456789, Captcha xxx
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Screen Name is required, minimum 6 characters..
And I must see the message Valid email address is required (in case you forget your password).

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan, Email @gmail.com, Password LF, Confirm Password LF, Captcha xxx
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).


Scenario: Insert a new User with invalid email and without filling the captcha

Given I am on Create User Page
And the database is ready

When I add Login Name Josefa, Screen Name Josefa Arruda Magalhães, Email j_magalhaes@.com, Password JosefaMaga, Confirm Password JosefaMaga, Captcha vazio 
And I click on Register button 
Then I must see the message Valid email address is required (in case you forget your password).
And I must see the message Please type in the fuzzy characters (CAPTCHA)



Scenario: Insert a new User with smaller fields of 6 characters and without filling the captcha

Given I am on Create User Page
And the database is ready

When I add Login Name Monique, Screen Name Monique Ribeiro, Email monique@email.com, Password Senha, Confirm Password Senha, Captcha vazio 
And I click on Register button 
Then I must see the message Password is required, minimum 6 characters.
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Monique, Screen Name Mo Ri, Email monique@email.com, Password Senha123, Confirm Password Senha123, Captcha vazio 
And I click on Register button 
Then I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name LuanFarias, Screen Name Luan, Email lu_farias@gmail.com, Password L, Confirm Password L, Captcha vazio 
And I click on Register button 
Then I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan Farias, Email lu_farias@gmail.com, Password LF0000, Confirm Password LF0000, Captcha vazio 
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan Farias, Email lu_farias@gmail.com, Password LF000, Confirm Password LF000, Captcha vazio 
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan, Email lu_farias@gmail.com, Password A123450Z, Confirm Password A123450Z, Captcha vazio 
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan, Email lu_farias@gmail.com, Password AaaZz, Confirm Password AaaZz, Captcha vazio 
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Please type in the fuzzy characters (CAPTCHA)


Scenario: Insert a new User with smaller fields of 6 characters and with invalid email and without filling the captcha

Given I am on Create User Page
And the database is ready

When I add Login Name Monique, Screen Name  Nome do Usuario, Email monique.com, Password Senha, Confirm Password Senha, Captcha vazio 
And I click on Register button 
Then I must see the message Password is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Usuar, Screen Name Moniq, Email usu, Password 12345, Confirm Password 12345, Captcha vazio 
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Monique, Screen Name Mo Ri, Email mon12.com, Password Senha123, Confirm Password Senha123, Captcha vazio 
And I click on Register button 
Then I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name LuanFarias, Screen Name Luan, Email lu_farias_gmail.com, Password L, Confirm Password L, Captcha vazio 
And I click on Register button 
Then I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan Farias de Albuquerque, Email lu_farias.com, Password LF0000z, Confirm Password LF0000z, Captcha vazio 
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Valid email address is required (in case you forget your password).

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan Farias, Email lu_farias@gmail, Password LF000, Confirm Password LF000, Captcha vazio 
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Password is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password). 
And I must see the message Please type in the fuzzy characters (CAPTCHA)

Given I am on Create User Page
When I add Login Name Luan, Screen Name Luan, Email lu_farias, Password 123456789, Confirm Password 123456789, Captcha vazio 
And I click on Register button 
Then I must see the message Login Name is required, must be at least 6 characters.
And I must see the message Screen Name is required, minimum 6 characters.
And I must see the message Valid email address is required (in case you forget your password).
And I must see the message Please type in the fuzzy characters (CAPTCHA)