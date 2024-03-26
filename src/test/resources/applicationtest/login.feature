Feature: login functionality
Scenario: verify the login functionality 
Given User is at login page 
When Enter the username 
And Enter the Password
And Click on the login button 
Then User is logged in  

Scenario: Verify the car insurance page
Given user is launched the URL   
And user is logged into application 
When Click on insurance tab 
And Click on car insurance option 
Then user is at car insurance page 

