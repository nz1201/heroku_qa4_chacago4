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



@reg @aigerim
Scenario: Room reservation  
Given the user "abowfinc1@ning.com" and "emeryvassar"
And the user should click signin button
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not
And cancelation of room reservation


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
    |teacheriljanettebaskett@gmail.com|	janettebaskett			|
	|teacherillemmyearland@gmail.com  |		lemmyearland		|
	|teacherilsamnickel@gmail.com	  |	samnickel			|



@reg	@a
Scenario Outline:: TeamLead's reservation 
Given the user "<email>" and "<password>"
And the user should click signin button
Then the user should click hunt button
And the user should select available date
Then the user should select avaliable time
And the user should select available room
Then the user should go schedule page 
Then the user check if it was reserved or not
And cancel of Teamlead "<email>" "<password>"

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
    |dfrederickb5@yellowbook.com	|engraciahuc	|
	|apainb6@google.co.jp			|rosettalightollers	|
	|fbawmeb7@studiopress.com |	sherilyngohn|
	|dhughillb8@gov.uk  |celiefaltin	|
	|nasgodbyb9@amazon.co.jp|jockodellenbach	|
	|apretleybb@t.co 		|cindradomsalla	|
	|alanneybc@booking.com |	randenemacgown|
	|mflethambd@163.com  	|	herschtrunks|
	|bolennikovbe@taobao.com |adinamcclean	|
	|dayreebg@1und1.de   |	clemmieklazenda|
	|sweeklybh@spotify.com 	|bartletcarlin	|
	|dswatheridgebi@list-manage.com 	|auriamullis	|
	|awagenenbk@cnet.com 			|nikesmall	|
	|rlittellbl@cloudflare.com			|otislangtree	|
	|sfearnsidesbn@cpanel.net			|victoirlapish	|
	|ryurocjkinbo@utexas.edu			|erichapinnere	|
	|kcotterelbq@homestead.com			|hannierrington	|
	|ejurczakbr@mac.com					|	mariallyas|
	|bgrebertbs@shareasale.com			|alansonlacey	|
	|dbrandesbt@goo.gl					|	florellalally|
	|nguerrinbu@indiegogo.com			|ellenunworth	|
	|ucarlislebv@gizmodo.com			|	herbyedwicke|
	|cdooheybw@biglobe.ne.jp			|	emilymoorcroft|
	|bduranteby@wikia.com	|adanmalser	|
	|rdunbobbinbz@nifty.com|	jeanelleshilleto|
	|mdarlastonc0@skyrock.com|wildencreavan	|
	|vferrieric2@state.tx.us|quentinambler	|
	|jtiesmanc3@booking.com|	jonisbirdwhistle|
	|cmcfadzeanc4@posterous.com|brennaxelbee	|
	|vwincklec5@latimes.com|	standfordboase|
	|gsnowdenc6@istockphoto.com|orellerehm	|
   
	
	
	