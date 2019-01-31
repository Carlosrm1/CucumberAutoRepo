Feature: Create account of Facebook

As a user you need to open facebook home page and do the validations

Background: common login step

Given User need to be on Facebook login page


Scenario: Validate First Name field


When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser


Scenario: Validate create user multiple fields

When User enters user "Cork" first name
And User enters user "Munster" surname
Then User checks user "Cork" first name is present
Then User Mobile field should be blank
Then close browser