Feature: Login and logout 
@reg @hus
 Scenario Outline: Login functionality 
	Given the user "<email>" and "<password>"
	And the user should click signin button
	Then IL text should be displayed
	Then the user should click log out on My module
	
	Examples:
    |email 						  	    |password 				|
    |htwinbrowb4@blogspot.com		  	|kanyabang				|
	|dfrederickb5@yellowbook.com        |engraciahuc			|
	|apainb6@google.co.jp		      	|rosettalightollers		|
	|fbawmeb7@studiopress.com	      	|sherilyngohn			|
	|dhughillb8@gov.uk			      	|celiefaltin			|
	|nasgodbyb9@amazon.co.jp	     	|jockodellenbach		|
	|efieldenba@cbslocal.com	      	|claudinebarnsley		|
	|apretleybb@t.co			        |cindradomsalla			|
	|alanneybc@booking.com		      	|randenemacGown			|
	|mflethambd@163.com			      	|herschtrunks			|
	|bolennikovbe@taobao.com	        |adinamcClean			|
	|osurmeyersbf@illinois.edu	        |jacquenettakelling		|
	|dayreebg@1und1.de			      	|clemmieklazenga		|
	|sweeklybh@spotify.com		      	|bartletcarlin			|
	|dswatheridgebi@list-manage.com   	|auriamullis			|
	|sbirdbj@fc2.com				    |asenorval				|
	|awagenenbk@cnet.com			  	|bikesmall				|
	|rlittellbl@cloudflare.com		  	|otislangtree			|
	|ggreeninbm@flavors.me			  	|arleenjoney			|
	|sfearnsidesbn@cpanel.net		  	|victoirlapish			|
	|ryurocjkinbo@utexas.edu		  	|erichapinnere			|
	|larnaezbp@symantec.com			  	|kialstowgill			|
	|kcotterelbq@homestead.com		  	|hannierrington			|
	|ejurczakbr@mac.com				  	|mariailyas				|
	|bgrebertbs@shareasale.com		  	|alansonlacey			|
	|dbrandesbt@goo.gl				  	|florellalally			|
	|nguerrinbu@indiegogo.com		  	|ellenunworth			|
	|ucarlislebv@gizmodo.com		  	|herbyedwicke			|
	|cdooheybw@biglobe.ne.jp		  	|emilymoorcroft			|
	|hcranfieldbx@blinklist.com		  	|belviaizzatt			|
	|bduranteby@wikia.com			  	|adanmalser				|
	|rdunbobbinbz@nifty.com			  	|jeanelleshilleto		|
	|mdarlastonc0@skyrock.com		 	|wildencreavan			|
	|abowfinc1@ning.com				  	|emeryvassar			|
	|vferrieric2@state.tx.us		  	|quentinambler			|
	|jtiesmanc3@booking.com			  	|jonisbirdwhistle		|
	|cmcfadzeanc4@posterous.com		  	|brennaxelbee			|
	|vwincklec5@latimes.com			  	|standfordboase			|
	|gsnowdenc6@istockphoto.com		  	|orellerehm				|
	|teacheriljanettebaskett@gmail.com	|janettebaskett			|
	|teacherillemmyearland@gmail.com  	|lemmyearland			|
	|teacherilsamnickel@gmail.com	  	|samnickel				|
@reg @hus	
Scenario Outline: Logout functionality 
Given the user "<email>" and "<password>"
And the user should click signin button
Then the user should click log out on My module
Then the user should be landed sign in page

Examples:
   	|email 						  	    |password 				|
    |htwinbrowb4@blogspot.com		  	|kanyabang				|
	|dfrederickb5@yellowbook.com        |engraciahuc			|
	|apainb6@google.co.jp		      	|rosettalightollers		|
	|fbawmeb7@studiopress.com	      	|sherilyngohn			|
	|dhughillb8@gov.uk			      	|celiefaltin			|
	|nasgodbyb9@amazon.co.jp	     	|jockodellenbach		|
	|efieldenba@cbslocal.com	      	|claudinebarnsley		|
	|apretleybb@t.co			        |cindradomsalla			|
	|alanneybc@booking.com		      	|randenemacGown			|
	|mflethambd@163.com			      	|herschtrunks			|
	|bolennikovbe@taobao.com	        |adinamcClean			|
	|osurmeyersbf@illinois.edu	        |jacquenettakelling		|
	|dayreebg@1und1.de			      	|clemmieklazenga		|
	|sweeklybh@spotify.com		      	|bartletcarlin			|
	|dswatheridgebi@list-manage.com   	|auriamullis			|
	|sbirdbj@fc2.com				    |asenorval				|
	|awagenenbk@cnet.com			  	|bikesmall				|
	|rlittellbl@cloudflare.com		  	|otislangtree			|
	|ggreeninbm@flavors.me			  	|arleenjoney			|
	|sfearnsidesbn@cpanel.net		  	|victoirlapish			|
	|ryurocjkinbo@utexas.edu		  	|erichapinnere			|
	|larnaezbp@symantec.com			  	|kialstowgill			|
	|kcotterelbq@homestead.com		  	|hannierrington			|
	|ejurczakbr@mac.com				  	|mariailyas				|
	|bgrebertbs@shareasale.com		  	|alansonlacey			|
	|dbrandesbt@goo.gl				  	|florellalally			|
	|nguerrinbu@indiegogo.com		  	|ellenunworth			|
	|ucarlislebv@gizmodo.com		  	|herbyedwicke			|
	|cdooheybw@biglobe.ne.jp		  	|emilymoorcroft			|
	|hcranfieldbx@blinklist.com		  	|belviaizzatt			|
	|bduranteby@wikia.com			  	|adanmalser				|
	|rdunbobbinbz@nifty.com			  	|jeanelleshilleto		|
	|mdarlastonc0@skyrock.com		 	|wildencreavan			|
	|abowfinc1@ning.com				  	|emeryvassar			|
	|vferrieric2@state.tx.us		  	|quentinambler			|
	|jtiesmanc3@booking.com			  	|jonisbirdwhistle		|
	|cmcfadzeanc4@posterous.com		  	|brennaxelbee			|
	|vwincklec5@latimes.com			  	|standfordboase			|
	|gsnowdenc6@istockphoto.com		  	|orellerehm				|
	|teacheriljanettebaskett@gmail.com	|janettebaskett			|
	|teacherillemmyearland@gmail.com  	|lemmyearland			|
	|teacherilsamnickel@gmail.com	  	|samnickel				|
	
@reg @akmal	
Scenario: Title  
Given the user "htwinbrowb4@blogspot.com" and "kanyabang"
And the user should click signin button
Then actualTitle should match expectedTitle: "cybertek-bnb"
 
