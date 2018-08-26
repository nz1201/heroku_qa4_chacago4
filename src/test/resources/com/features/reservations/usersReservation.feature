Feature: Users Cancelations 


@reg @huso
Scenario: End to End reservation 
Given the user "abowfinc1@ning.com" and "emeryvassar"
And the user should click signin button
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not
And the student from same group check if it was reserved or not
Then the student from different group check if it was reserved or not
And  cancel reservation of end to end


@reg	
Scenario: Room reservation  
Given the user "htwinbrowb4@blogspot.com" and "kanyabang"
And the user should click signin button
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not


@reg	
Scenario Outline:: Teacher's reservation 
Given the user "<email>" and "<password>"
And the user should click signin button
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not

Examples:
    |<email> 						  |<password> 	|
    |teacheriljanettebaskett@gmail.com|				|
	|teacherillemmyearland@gmail.com  |				|
	|teacherilsamnickel@gmail.com	  |				|



@reg	@ado
Scenario Outline:: TeamLead's reservation 
Given the user "<email>" and "<password>"
And the user should click signin button
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not
And cancel of Teamlead

Examples: 
	|email					  |password			|
    |htwinbrowb4@blogspot.com		  |	kanyabang			|
	|efieldenba@cbslocal.com		  |	claudinebarnsley	|
	|osurmeyersbf@illinois.edu		  |	jacquenettakelling	|
 	|sbirdbj@fc2.com				  |	asenorval			|
	|ggreeninbm@flavors.me			  |	arleenjoney			|
	|larnaezbp@symantec.com			  |	kialstowgill		|
	|hcranfieldbx@blinklist.com		  |	belviaizzatt		|
	|abowfinc1@ning.com				  |	emeryvassar			|
   

	
@reg	
Scenario Outline:: Student's reservation 
Given the user "<email>" and "<password>"
And the user should click signin button
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not

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
   
	
	
	