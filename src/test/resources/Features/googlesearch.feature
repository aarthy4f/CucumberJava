Feature: Feature to test google search functionality

Scenario: Validate google search

Given browser is open
And user is navigaated to google search
When user enter  a text on search box
And click on search
Then User must be navigated to the searched screen