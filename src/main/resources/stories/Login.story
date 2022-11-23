Scenario: User tries to log in without any data

Given I load account data
Given I initialize driver
Given I open the homepage
When I accept privacy modal
When I click account button
When I open the log in sidebar
When I click log in
Then There is a login error
Then There is an email error
Then There is a password error
Then Driver quits

Meta: @debug

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