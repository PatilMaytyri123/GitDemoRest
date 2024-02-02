Feature: Application Login


Scenario: Home page default login
Given User is Net Banking landing page
When User login into application with "Shree" & password "1808"
Then Home page Populated
And Cards Displayed are "true"



Scenario: Home page default login
Given User is Net Banking landing page
When User login into application with "Mayuri" & password "1304"
Then Home page Populated
And Cards Displayed are "false"