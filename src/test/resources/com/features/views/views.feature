Feature: Views 


@reg	 @aizada1
Scenario: Daily view 
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
When the user should click "<eachRoom>" with "<no>" room
And the user should see daily view



@reg	 @aizada2
Scenario: Weekly view
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
When the user should click "<eachRoom>" room
And the user should see weekly view




@reg	 @aizada3
Scenario: Calendar view of date
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
Then the user should click hunt button
And the user should click date box
Then the user should see calendar




