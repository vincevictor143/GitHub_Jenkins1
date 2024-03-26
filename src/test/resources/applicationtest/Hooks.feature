Feature: Profile Picture Functionality 
Scenario: Verify the Add profile Profile Picture 
Given User should be at profile picture portal 
When User should click on Add Profile button  
And User should be select the profile picture to upload 
Then Profile picture should get Added 

Scenario: Verify the Update profile Picture 
Given User should be at profile picture portal 
When User should click on update Profile button  
And User should update the Image   
Then Profile picture should get updated 

Scenario: Verify the delete profile Picture 
Given User should be at profile picture portal 
When User should click on delete Profile button  
And User should update the Image   
Then Profile picture should get deleted  