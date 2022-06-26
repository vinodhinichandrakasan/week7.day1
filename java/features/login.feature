Feature: Login scenario for the LeafTaps application
Scenario: Login to leaftaps app
Given open the chrome browser
And launch the application Url as 'http://leaftaps.com/opentaps/control/main'
And enter the username as 'DemoSalesManager'
And enter the password as 'crmsfa'
When click on Login button
Then check the homepage is loaded
