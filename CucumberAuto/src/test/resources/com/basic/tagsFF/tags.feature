@Important
Feature: Create account of Facebook

As a user you need to open facebook home page and do the validations

@Smoke
Scenario: Validate First Name field1

Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

@Smoke @Regresion
Scenario: Validate create user multiple fields2
Given User need to be on Facebook login page
When User enters user "Cork" first name
And User enters user "Munster" surname
Then User checks user "Cork" first name is present
Then User Mobile field should be blank
Then close browser

Scenario: Validate First Name field3

Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

@Regresion
Scenario: Validate First Name field4

Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

@Smoke
Scenario: Validate First Name field5

Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

Scenario: Validate First Name field6

Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

Scenario: Validate First Name field7

Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser
