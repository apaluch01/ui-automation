Scenario: User tries to log in with valid data

Given I load account data
Given I initialize driver
Given I open the homepage
When I accept privacy modal
When I click account button
When I open the log in sidebar
When I input $field as login mail
When I input $field as login password
When I click log in
Then I am logged in
Then Driver quits

Meta: @debug