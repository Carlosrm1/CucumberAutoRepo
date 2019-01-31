Feature: Create account of Facebook

As a user you need to open facebook home page and do the validations


Scenario: Validate create user multiple fields
Given User need to be on Facebook login page
When Enter following date
|UserName| UserSurname|Mobile1|
|Tom     |Tralee      |123456|
|Cork    |Munster     |1234455|

Then close browser