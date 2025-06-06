Feature: Informal Trader registering on the portal
  Scenario Outline: Successfully sending job application to iLab via their website portal
Given IMS baseURL "https://cojqainformaltrader.azurewebsites.net/" browser "chrome"
Then The user clicks register button
When The user enter name "<name>" in step
Then The user enter surname "<surname>" in step
When The user enter phone "<phone>" in step
Then The user enter email "<email>" in step
When The user select IDtype "<IDtype>" in step
Then The user enter IDNumber "<IDNumber>" in step
When The user enter DOB "<DOB>" in step
Then The user enter password "<password>" in step
When The user enter ConfrimPassword "<ConfrimPassword>" in step
Then The user enter address1 "<Address1>" in step
When The user enter address2 "<Address2>" in step
Then The user enter address3 "<Address3>" in step
When The user enter post code "<PostCode>" in step
Then The user click accept terms
Then The user click submit button



    Examples: 
      | name  		| surname | phone  			| email  			| IDtype				| IDNumber  		| DOB  			| password 	| ConfrimPassword  	| Address1  | Address2| Address3  |PostCode|
     # | Simikahle | Dlomo		| 0718585464	|mazet@qa.com	|	1						|69010182721810	|01-01-1969	|	P@ssw0rd1	|	P@ssw0rd1					| QA1				| QA2			| QA3				|12345|
     # | Simikahle | Dlomo		| 0718585465	|maze1t@qa.com|	1						|6901015065181	|01-01-1969	|	P@ssw0rd1	|	P@ssw0rd1					| QA1				| QA2			| QA3				|12345|
      | Simikahle | Dlomo		| 0718585465	|maze2t@qa.com	|SA ID Number |6901015449088	|01-01-1969	|	P@ssw0rd1	|	P@ssw0rd1					| QA1				| QA2			| QA3				|12345|
