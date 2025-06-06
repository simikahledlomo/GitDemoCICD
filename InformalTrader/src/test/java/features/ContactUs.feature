Feature: The user sending massage to DED
  Scenario Outline: Successfully sending job application to iLab via their website portal
Given IMS baseURL "https://cojqainformaltrader.azurewebsites.net/" browser "chrome"
Then The user clicks Contact us button
When The user enter first name "<name>" in step
Then The user enter last surname "<surname>" in step
When The user enter cellphone "<phone>" in step
Then The user enter email address "<email>" in step
When The user enter message "<message>" in step
Then The user clicks submit buuton in step


    Examples: 
      | name  		| surname | phone  			| email  			| message				|
      | Simikahle | Dlomo		| 0718585464	|mazet@qa.com	|	Text					|
     
