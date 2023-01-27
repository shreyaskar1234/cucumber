Feature: Search for various product categories should be possible along with product search

It is good to provide an option to our end users where they can search for the products
based on their category, rather than only searching a product.This will increase our 
business and make end users happy. 

@All @Books @dev @SmokeTest
Scenario: User should be able to search for te products under books category
Given I visit the website as a guest user
When I select the books option from the dropdown
And I click on Search icon
Then I should see the books page loaded 
But I should not see the other category products

@SmokeTest @All @baby @wip
Scenario: User should be able to search for the products under baby category
Given I visit the website as a guest user
When I select the baby option from the search dropdown 
And I click on search icon option 
Then I should see the page having as offers on baby product is getting displayed
But I should not see the other category products

