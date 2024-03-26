Feature: Home Page Functionality
Scenario: Verify the title of portal 
Given User is at landing page 
Then Page title should contains "Shopping"

Scenario: Verify cart page 
Given User is at landing page
Then Cart icon should get displayed 

Scenario: Checkout the deal section
Given User is at landing page
When User click on the black friday section deal 

Scenario: Login to app
Given User is at landing page
When User click on sign in button
And user enters the username as "9765434652"
And User enters the password as "9765434652" with Sign in 

