Feature: Test Free CRM Application
Background:
Given user is login page
When user enter valid username and valid password
Then user is on home page

@End2EndContactPage
Scenario: Test Contact Page
Then user click on contact link
And user click on create button
And user enter first name and last name

@End2EndDealsPage
Scenario: Test Deals page
Then user click on Deals link
And user click on create deals button


