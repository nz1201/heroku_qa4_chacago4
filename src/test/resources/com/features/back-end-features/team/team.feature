Feature: Team

@db1
Scenario: my team 
	Given user logs in using "htwinbrowb4@blogspot.com" "kanyabang" 
	When the user is on the my team page 
	Then team info should match the db records using "htwinbrowb4@blogspot.com" 
	