Feature: Login to Omayo application

@All @Login
Scenario Outline: User should be able to login with valid credentials
Given I navigate to application URL
When I enter Username as <someusername> and Password as <somepassword> into the field
And I click to Login button
Then User should be able to login based on <expected> login status
Examples: 
|someusername		|somepassword	|loginstatus	|
|Skr   		|12345    	|failure   	|
|SeleniumByArun	|Test143$	|success	|
|Singh	|00123	|failure 		|


