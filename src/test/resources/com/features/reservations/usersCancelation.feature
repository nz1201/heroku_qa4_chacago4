Feature: Users Reservations 


@reg	
Scenario: Cancelation of reservation  
Given the user "htwinbrowb4@blogspot.com" and "kanyabang"
And the user should click signin button
When the user should be on homePage
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not
Then the user click cancel and message will displayed 

@reg	
Scenario Outline:: Teacher's cancelation 
Given the user "<email>" and "<password>"
And the user should click signin button
When the user should be on homePage
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not
Then the user click cancel and message will displayed 

Examples:
    |<email> 						  |<password> 	|
    |teacheriljanettebaskett@gmail.com|				|
	|teacherillemmyearland@gmail.com  |				|
	|teacherilsamnickel@gmail.com	  |				|



@reg	
Scenario Outline:: TeamLead's cancelation 
Given the user "<email>" and "<password>"
And the user should click signin button
When the user should be on homePage
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not
Then the user click cancel and message will displayed 

Examples: 
	|<email> 						  |<password> 	|
    |htwinbrowb4@blogspot.com		  |				|
	|efieldenba@cbslocal.com		  |				|
	|osurmeyersbf@illinois.edu		  |				|
 	|sbirdbj@fc2.com				  |				|
	|ggreeninbm@flavors.me			  |				|
	|larnaezbp@symantec.com			  |				|
	|hcranfieldbx@blinklist.com		  |				|
	|abowfinc1@ning.com				  |				|
   

	
@reg	
Scenario Outline:: Student's cancelation 
Given the user "<email>" and "<password>"
And the user should click signin button
When the user should be on homePage
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not
Then the user click cancel and message will displayed 

Examples:
    |<email> 						  |<password> 	|
    |dfrederickb5@yellowbook.com	|	|
	|apainb6@google.co.jp			|	|
	|fbawmeb7@studiopress.com |	|
	|dhughillb8@gov.uk  |	|
	|nasgodbyb9@amazon.co.jp|	|
	|apretleybb@t.co 		|	|
	|alanneybc@booking.com |	|
	|mflethambd@163.com  	|	|
	|bolennikovbe@taobao.com |	|
	|dayreebg@1und1.de   |	|
	|sweeklybh@spotify.com 	|	|
	|dswatheridgebi@list-manage.com 	|	|
	|awagenenbk@cnet.com 			|	|
	|rlittellbl@cloudflare.com			|	|
	|sfearnsidesbn@cpanel.net			|	|
	|ryurocjkinbo@utexas.edu			|	|
	|kcotterelbq@homestead.com			|	|
	|ejurczakbr@mac.com					|	|
	|bgrebertbs@shareasale.com			|	|
	|dbrandesbt@goo.gl					|	|
	|nguerrinbu@indiegogo.com			|	|
	|ucarlislebv@gizmodo.com			|	|
	|cdooheybw@biglobe.ne.jp			|	|
	|bduranteby@wikia.com	|	|
	|rdunbobbinbz@nifty.com|	|
	|mdarlastonc0@skyrock.com|	|
	|vferrieric2@state.tx.us|	|
	|jtiesmanc3@booking.com|	|
	|cmcfadzeanc4@posterous.com|	|
	|vwincklec5@latimes.com|	|
	|gsnowdenc6@istockphoto.com|	|
   
	
	
	