# Draft
# Schedule, 
# Sent 

Feature: Campaign Functionality 

@sanity
Scenario: Creation of Campaign 
Given User is at campaign Page 
When User click on create campaign button 
And User Enters the information 
And User clicks on save button 
Then Campaign Should get created 

@regression
Scenario: Scheduling Campaign 
Given User is at campaign Page 
When User click on Edit campaign button 
And User Enters Sending information 
And User clicks on Schedule button 
Then Campaign Should get Scheduled 

@functional
Scenario: Sent Campaign 
Given User is at campaign Page 
When User click on Sent campaign button 
Then User should see the sent count 
 