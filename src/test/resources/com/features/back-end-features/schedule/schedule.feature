Feature: Schedule verification

@db5
Scenario: Google schedule 
	Given user logs in using "osurmeyersbf@illinois.edu" "jacquenettakelling" 
	And the user should click signin button
	Then the user should click hunt button
	And the user should select available date
	Then the user should select avaliable time for db
	Then the user should verify db with last reservation by UI
	Then the user should cancel reservation of db