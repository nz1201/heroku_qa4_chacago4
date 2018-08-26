Feature: Verifications 


@reg	
Scenario Outline: Students' locations
Given the user "dfrederickb5@yellowbook.com" and "engraciahuc"
And the user should click signin button
Then the user should see just study rooms: "<eachRoom>" are clickable

Examples:
|eachRoom |
|apple |
|facebook|
|amazon|
|tesla|
|microsoft |




@reg	//@adilet
Scenario Outline: Name verification
	Given the user "<email>" and "<password>"
	And the user should click signin button
	Then the user should go to my-self account page
	And the user's name: "<userName>" should be displayed
	
	Examples:
    | email						       |password	| userName|
	|htwinbrowb4@blogspot.com		  |	kanyabang			|Kanya Bang |
	|efieldenba@cbslocal.com		  |	claudinebarnsley	| Claudine Barnsley|
	|osurmeyersbf@illinois.edu		  |	jacquenettakelling	|Jacquenetta Kelling|
	|sbirdbj@fc2.com				  |	asenorval			|     Ase Norval      |
	|ggreeninbm@flavors.me			  |	arleenjoney			|       Arleen Joney |
	|larnaezbp@symantec.com			  |	kialstowgill		|      Kial Stowgill |
	|hcranfieldbx@blinklist.com		  |	belviaizzatt		|    Belvia Izzatt|

	
	
@reg @adilet
Scenario Outline: Team's name verification
	Given the user "<email>" and "<password>"
	And the user should click signin button
	Then the user should go to my-team account page
	And the user's team name: "<teamName>" should be displayed
	
	Examples:
    |email 						  	  |password				| teamName			|
	|htwinbrowb4@blogspot.com		  	|kanyabang				|Hibernate|
	|dfrederickb5@yellowbook.com        |engraciahuc			|Hibernate|
	|apainb6@google.co.jp		      	|rosettalightollers		|Hibernate|
	|fbawmeb7@studiopress.com	      	|sherilyngohn			|Hibernate |
	|dhughillb8@gov.uk			      	|celiefaltin			|JSP   |
	|nasgodbyb9@amazon.co.jp	     	|jockodellenbach		|JSP |
	|efieldenba@cbslocal.com	      	|claudinebarnsley		|JSP|
	|apretleybb@t.co			        |cindradomsalla			|JSP  |
	|alanneybc@booking.com		      	|randenemacGown			|Docker |
	|mflethambd@163.com			      	|herschtrunks			|Docker   |
	|bolennikovbe@taobao.com	        |adinamcClean			|Docker|
	|osurmeyersbf@illinois.edu	        |jacquenettakelling		|Docker|
	|dayreebg@1und1.de			      	|clemmieklazenga		|Cucumber|
	|sweeklybh@spotify.com		      	|bartletcarlin			|Cucumber|
	|dswatheridgebi@list-manage.com   	|auriamullis			|Cucumber|
	|sbirdbj@fc2.com				    |asenorval				|Cucumber|
	|awagenenbk@cnet.com			  	|nikesmall				|Cucumber|
	|rlittellbl@cloudflare.com		  	|otislangtree			|Protractor        |
	|ggreeninbm@flavors.me			  	|arleenjoney			|Protractor   |
	|sfearnsidesbn@cpanel.net		  	|victoirlapish			|Protractor |
	|ryurocjkinbo@utexas.edu		  	|erichapinnere			|Protractor         |
	|larnaezbp@symantec.com 			|kialstowgill			|Kubernetes|
	|kcotterelbq@homestead.com		  	|hannierrington			|Kubernetes|
	|ejurczakbr@mac.com				  	|mariailyas				|Kubernetes |
	|bgrebertbs@shareasale.com		  	|alansonlacey			|Kubernetes      |
	|dbrandesbt@goo.gl				  	|florellalally			|Swift              |
	|nguerrinbu@indiegogo.com		  	|ellenunworth			|Swift        |
	|ucarlislebv@gizmodo.com		  	|herbyedwicke			|Swift          |
	|cdooheybw@biglobe.ne.jp		  	|emilymoorcroft			|Swift        |
	|hcranfieldbx@blinklist.com		  	|belviaizzatt			|Swift       |
	|bduranteby@wikia.com				|adanmalser	            |MIT          |
	|rdunbobbinbz@nifty.com			  	|jeanelleshilleto		|MIT        |
	|mdarlastonc0@skyrock.com		 	|wildencreavan			|MIT          |
	|abowfinc1@ning.com				  	|emeryvassar			|MIT              |
	|vferrieric2@state.tx.us		  	|quentinambler			|MIT          |
	|jtiesmanc3@booking.com			  	|jonisbirdwhistle		|JSGuru        |
	|cmcfadzeanc4@posterous.com		  	|brennaxelbee			|JSGuru        |
	|vwincklec5@latimes.com			  	|standfordboase			|JSGuru        |
	|gsnowdenc6@istockphoto.com		  	|orellerehm				|JSGuru        |
	|teacheriljanettebaskett@gmail.com	|janettebaskett			|ilteachers   |
	|teacherillemmyearland@gmail.com  	|lemmyearland			|ilteachers     |
	|teacherilsamnickel@gmail.com	  	|samnickel				|ilteachers         |



	@reg
Scenario: Modules verification
	Given the user "dfrederickb5@yellowbook.com" and "engraciahuc"
	And the user should click signin button
	Then the user should see all modules:
	|map	  |
	|schedule |
	|hunt     |
	|my       |
	
@reg	
Scenario: Reservation time verification
	Given the user "teacheriljanettebaskett@gmail.com" and "janettebaskett"
	And the user should click signin button
	Then the user should click hunt button
	And the user should select available date
	Then the user should select avaliable time
	And the user should be able to choose min and max time
	|min  |30|
	|max  |2 |