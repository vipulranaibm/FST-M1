@activity5

Feature: Login Test

@SmokeTest
Scenario Outline: Testing Login without Examples
	Given User is on Login page
	When User enters "<Usernames>" and "<Passwords>"
	Then Read the page title and confirmation message
	And Close the Browser
	
	Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |