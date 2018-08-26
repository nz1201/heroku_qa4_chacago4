Feature: Views 


@reg
Scenario: Daily view 
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
And the user should see daily view



@reg
Scenario: Weekly view
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
And the user should see weekly view




@reg
Scenario: Calendar view of date
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
Then the user should click hunt button
And the user should click date box
Then the user should see calendar




