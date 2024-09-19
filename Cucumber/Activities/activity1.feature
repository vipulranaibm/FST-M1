@activity1

Feature: DuckDuckGo Search

@SmokeTest
Scenario: Search for Cheese	on DuckDuckGo Website 
	Given User is on the DuckDuckGo Website
	When User searches for Cheese
	Then User should see search results
