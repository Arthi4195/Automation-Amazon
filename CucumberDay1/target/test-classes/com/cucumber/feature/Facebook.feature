Feature: Facebook application smoke test automation script

Scenario: verify the login fuctionality of th application
Given User should able to launch the application
Then user should be able to see the facebook logo
When User enter the email address in the email field
And User enter the password in the password field
And User should click the login
Then User should able to login into forget password page
