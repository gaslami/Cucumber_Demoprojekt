Feature: Login to the website

  Scenario: Successful Login
    Given I am on the demo website "https://demowebshop.tricentis.com/"
    When I click on tab "Log in" and fill with valid credentials
    Then I will be successfully logged in and redirected to the homepage




