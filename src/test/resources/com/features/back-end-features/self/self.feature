Feature: Information about me 

@db
Scenario: my self 
	Given user logs in using "htwinbrowb4@blogspot.com" "kanyabang" 
	When the user is on the my self page 
	Then user info should match the db records using "htwinbrowb4@blogspot.com" 
	
	
@db 
Scenario: batches 
	Given I retrieve the batches information 
	Then following batches should be displayed 
		| 7	| true |
		| 8	| false|
		
@db @temp 
Scenario Outline: campus test 
	Given user logs in using "<email>" "<password>" 
	Then correct campus should be displayed for "<email>"
	Examples: 
		|   email                         | password|
		|	efewtrell8c@craigslist.org	  |jamesmay   |
#		|	teachervamikemarcus@gmail.com | mikemarcus|
#		|	htwinbrowb4@blogspot.com	      |kanyaang   |
		