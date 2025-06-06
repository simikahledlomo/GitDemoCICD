Feature: Informal Trader learning about the portal
  Scenario Outline: Successfully learining all the key featrues of the portal
Given IMS baseURL "https://cojqainformaltrader.azurewebsites.net/" browser "chrome"
Then The user scroll down to FAQs
When The user clicks on how to register
Then The user clicks on Formas of trading 
When The user clicks on requirements to trade
Then The user clicks on how do i register for lease agreement
When The user clicks on how much is the cost for the tarding permit
Then The user clicks on how to reset password