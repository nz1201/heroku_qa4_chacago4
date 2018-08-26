Feature: Team

@db 
Scenario: my team 
	Given user logs in using "efewtrell8c@craigslist.org" "jamesmay" 
	When the user is on the my team page 
	Then team info should match the db records using "efewtrell8c@craigslist.org" 
	