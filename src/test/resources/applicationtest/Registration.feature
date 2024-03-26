Feature: Registration Functionality 
Scenario: Creation of account for user
Given user should be at registration page 
When user enters the following information 
|Ericcoson|Wicksy|Ericcoson.Wicksy@gmail.com|9272637168|
|Maxwell|John|Maxwell.John@gmail.com|97262637168|
And User clicks on registration button 
Then User got created successfully 