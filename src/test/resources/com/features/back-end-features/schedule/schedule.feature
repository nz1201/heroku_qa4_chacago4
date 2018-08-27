Feature: Schedule verification

@db5
Scenario: Google schedule 
	Given user logs in using "htwinbrowb4@blogspot.com" "kanyabang" 
	And the user should click signin button
	Then the user should click hunt button
	And the user should select available date
	Then the user should select avaliable time for db
	And the user should select available room 
	Then the user should verify db with last reservation by UI