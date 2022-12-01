Scenario: User tries to log in with valid data
Given I load account data
When I open the homepage
When I accept privacy modal
When I click search button
When I search cat
When I click search icon
Then I should see 9 results
Then Driver quits