Scenario: User tries to create account with valid data
Given I load account data
When I open the homepage
When I accept privacy modal
When I click account button
When I click create account button
When I input jzlbrgomdsmcdeytskf@tmmcv.net as mail for new account
When I input ABC as first name
When I input XYZ as last name
When I input xX123Xx! as password for new account
When I confirm xX123Xx! as password for new account
When I input 90001 as zip code
When I input July as month
When I input 1 as day
When I accept terms
When I click create account button
Then Driver quits