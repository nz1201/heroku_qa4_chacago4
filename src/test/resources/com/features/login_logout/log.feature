Feature: Login and logout 
@reg
 Scenario Outline: Login functionality 
	Given the user "<email>" and "<password>"
	And the user should click signin button
	When the user should be on homePage
	Then IL text should be displayed
	
	Examples:
    |<email> 						  |<password> 			|
    |htwinbrowb4@blogspot.com		  | 		|
	|dfrederickb5@yellowbook.com      |			|
	|apainb6@google.co.jp		      |			|
	|fbawmeb7@studiopress.com	      |			|
	|dhughillb8@gov.uk			      |			|
	|nasgodbyb9@amazon.co.jp	      |			|
	|efieldenba@cbslocal.com	      |			|
	|apretleybb@t.co			      |			|
	|alanneybc@booking.com		      |			|
	|mflethambd@163.com			      |			|
	|bolennikovbe@taobao.com	      |			|
	|osurmeyersbf@illinois.edu	      |			|
	|dayreebg@1und1.de			      |			|
	|sweeklybh@spotify.com		      |			|
	|dswatheridgebi@list-manage.com   |			|
	|sbirdbj@fc2.com				  |			|
	|awagenenbk@cnet.com			  |			|
	|rlittellbl@cloudflare.com		  |			|
	|ggreeninbm@flavors.me			  |			|
	|sfearnsidesbn@cpanel.net		  |			|
	|ryurocjkinbo@utexas.edu		  |			|
	|larnaezbp@symantec.com			  |			|
	|kcotterelbq@homestead.com		  |			|
	|ejurczakbr@mac.com				  |			|
	|bgrebertbs@shareasale.com		  |			|
	|dbrandesbt@goo.gl				  |			|
	|nguerrinbu@indiegogo.com		  |			|
	|ucarlislebv@gizmodo.com		  |			|
	|cdooheybw@biglobe.ne.jp		  |			|
	|hcranfieldbx@blinklist.com		  |			|
	|bduranteby@wikia.com			  |			|
	|rdunbobbinbz@nifty.com			  |			|
	|mdarlastonc0@skyrock.com		  |			|
	|abowfinc1@ning.com				  |			|
	|vferrieric2@state.tx.us		  |			|
	|jtiesmanc3@booking.com			  |			|
	|cmcfadzeanc4@posterous.com		  |			|
	|vwincklec5@latimes.com			  |			|
	|gsnowdenc6@istockphoto.com		  |			|
	|teacheriljanettebaskett@gmail.com|			|
	|teacherillemmyearland@gmail.com  |			|
	|teacherilsamnickel@gmail.com	  |			|
	
@reg	
Scenario Outline: Logout functionality 
Given the user "<email>" and "<password>"
And the user should click signin button
When the user should be on homePage
Then the user should click log out on My module
Then the user should be landed sign in page

Examples:
    |<email> 						  |<password> 			|
    |htwinbrowb4@blogspot.com		  | 		|
	|dfrederickb5@yellowbook.com      |			|
	|apainb6@google.co.jp		      |			|
	|fbawmeb7@studiopress.com	      |			|
	|dhughillb8@gov.uk			      |			|
	|nasgodbyb9@amazon.co.jp	      |			|
	|efieldenba@cbslocal.com	      |			|
	|apretleybb@t.co			      |			|
	|alanneybc@booking.com		      |			|
	|mflethambd@163.com			      |			|
	|bolennikovbe@taobao.com	      |			|
	|osurmeyersbf@illinois.edu	      |			|
	|dayreebg@1und1.de			      |			|
	|sweeklybh@spotify.com		      |			|
	|dswatheridgebi@list-manage.com   |			|
	|sbirdbj@fc2.com				  |			|
	|awagenenbk@cnet.com			  |			|
	|rlittellbl@cloudflare.com		  |			|
	|ggreeninbm@flavors.me			  |			|
	|sfearnsidesbn@cpanel.net		  |			|
	|ryurocjkinbo@utexas.edu		  |			|
	|larnaezbp@symantec.com			  |			|
	|kcotterelbq@homestead.com		  |			|
	|ejurczakbr@mac.com				  |			|
	|bgrebertbs@shareasale.com		  |			|
	|dbrandesbt@goo.gl				  |			|
	|nguerrinbu@indiegogo.com		  |			|
	|ucarlislebv@gizmodo.com		  |			|
	|cdooheybw@biglobe.ne.jp		  |			|
	|hcranfieldbx@blinklist.com		  |			|
	|bduranteby@wikia.com			  |			|
	|rdunbobbinbz@nifty.com			  |			|
	|mdarlastonc0@skyrock.com		  |			|
	|abowfinc1@ning.com				  |			|
	|vferrieric2@state.tx.us		  |			|
	|jtiesmanc3@booking.com			  |			|
	|cmcfadzeanc4@posterous.com		  |			|
	|vwincklec5@latimes.com			  |			|
	|gsnowdenc6@istockphoto.com		  |			|
	|teacheriljanettebaskett@gmail.com|			|
	|teacherillemmyearland@gmail.com  |			|
	|teacherilsamnickel@gmail.com	  |			|
	
@reg	
Scenario: Title  
Given the user "htwinbrowb4@blogspot.com" and "kanyabang"
And the user should click signin button
When the user should be on homePage
Then actualTitle should match expectedTitle: "cybertek-bnb"
 
