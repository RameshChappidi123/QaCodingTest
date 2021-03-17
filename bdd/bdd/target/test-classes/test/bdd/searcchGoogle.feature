Feature: search Ducks in google and verify result
This fature file will verify when user search with ducks it wll search only for ducks and show respective search page.

@test
Scenario: verify search results displayed correctly on google search page
Given open an browser
When user search in google 
Then verify result page shows correct result