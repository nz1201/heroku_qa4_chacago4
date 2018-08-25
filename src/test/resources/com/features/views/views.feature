Feature: Views 


@reg	
Scenario Outline: Daily view 
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
When the user should click "<eachRoom>" room
And the user should see daily view

Examples:
|eachRoom |
|apple |
|facebook|
|amazon|
|tesla|
|microsoft |

@reg	
Scenario Outline: Weekly view
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
And the user should click signin button
When the user should click "<eachRoom>" room
And the user should see weekly view

Examples:
|eachRoom |
|apple |
|facebook|
|amazon|
|tesla|
|microsoft |


@reg	
Scenario: Calendar view of date
Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
And the user should click signin button
Then the user should click hunt button
And the user should click date box
Then the user should see calendar




