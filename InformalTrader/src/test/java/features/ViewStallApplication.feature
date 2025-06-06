#Author: simikahledlomo@gmail.com

#Sending appliction through DED for Informal Trader to have permit
Feature: Send job Application

Scenario: Successfully sending job application to iLab via their website portal
Given IMS baseURL "https://cojqainformaltrader.azurewebsites.net/" browser "chrome"
Then The user clicks Login button
Then The user enter "0106146053082" and "P@ssw0rd1"
Then The user clicks sign in button
Then The user will click View Application Status button