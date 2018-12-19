Feature:  login and branchcreation
Scenario: validate the login functionality with valid data
Given     launch the site
When      enter the username with "Admin" and enter the password with "Admin" and click login button
Then      branches button should be displayed
Then      close the site

Scenario Outline: validate the branchcreation with multiple data
Given     launch the site
When      enter the username with "Admin" and enter the password with "Admin" and click login button
Then      branches button should be displayed
When      Enter the "<row_index>" data from excel

Examples:
         |row_index|
         |2|
         |3|
         |4|

         
