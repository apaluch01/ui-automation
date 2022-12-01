Scenario: User tries to log in with valid data
Given I load account data
When I open the homepage
When I accept privacy modal
When I click account button
When I open the log in sidebar
When I input jzlbrgomdsmczytskf@tmmcv.net as login mail
When I input G3v2c89GHc4wKn9 as login password
When I click log in
Then I am logged in
Then Driver quits