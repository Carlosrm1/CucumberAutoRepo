Feature: Create account of Facebook

As a user you need to open facebook home page and do the validations


Scenario Outline: Validate create user multiple fields

Given User need to be on Facebook login page
When User enters user "<user>" first name
And User enters user "<surname>" surname
Then User checks user "<user>" first name is present
Then User Mobile field should be blank
Then close browser

Examples:

| user   |surname   |
| Tralee | Clare    |
|Lime    |limerick  |