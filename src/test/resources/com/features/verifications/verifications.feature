Feature: Verifications 


@reg	
Scenario Outline: Students' locations
Given the user "dfrederickb5@yellowbook.com" and "engraciahuc"
And the user should click signin button
When the user should be on homePage
Then the user should see just study rooms: "<eachRoom>" are clickable

Examples:
|eachRoom |
|apple |
|facebook|
|amazon|
|tesla|
|microsoft |




@reg	
Scenario Outline: Name verification
	Given the user "<email>" and "<password>"
	And the user should click signin button
	When the user should be on homePage
	Then the user should go to my-self account page
	And the user's name: "<userName>" should be displayed
	
	Examples:
    |<email> 						  |<password>| <userName>|
    |htwinbrowb4@blogspot.com		  | 		 ||
	|dfrederickb5@yellowbook.com      |			||
	|apainb6@google.co.jp		      |			||
	|fbawmeb7@studiopress.com	      |			||
	|dhughillb8@gov.uk			      |			||
	|nasgodbyb9@amazon.co.jp	      |			||
	
	
	
@reg	
Scenario Outline: Team's name verification
	Given the user "<email>" and "<password>"
	And the user should click signin button
	When the user should be on homePage
	Then the user should go to my-team account page
	And the user's team name: "<teamName>" should be displayed
	
	Examples:
    |<email> 						  |<password>| <teamName>|
    |htwinbrowb4@blogspot.com		  | 		 ||
	|dfrederickb5@yellowbook.com      |			||
	|apainb6@google.co.jp		      |			||
	|fbawmeb7@studiopress.com	      |			||
	|dhughillb8@gov.uk			      |			||
	|nasgodbyb9@amazon.co.jp	      |			||



@reg	
Scenario: Modules verification
	Given the user "dfrederickb5@yellowbook.com" and "engraciahuc"
	And the user should click signin button
	When the user should be on homePage
	Then the user should see all modules:
	|map	  |
	|schedule |
	|hunt     |
	|my       |
	
@reg	
Scenario: Reservation time verification
	Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
	And the user should click signin button
	When the user should be on homePage
	Then the user should click hunt button
	And the user should select available date
	Then the user should select avaliable time
	And the user should be able to choose min and max time
	|min  |30|
	|max  |2 |