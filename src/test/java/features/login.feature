Feature: Login into TutorialsNinja Applcation

@All @ninja
Scenario: Login to the Application with Application
Given I navigate to Login page of the Application
When I enter emailaddress as "Shreyaskarsingh10@gmail.com" and password as "Second@123" into the fields
And I click on Login button
Then I the user should be able to successfully login
