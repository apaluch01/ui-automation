Scenario: User tries to log in without any data
Given I load account data
When I open the homepage
When I accept privacy modal
Then Driver quits
