Feature: Account Creation and Login on Magento

  Scenario: Create a new account
    Given I am on the Magento registration page
    When I enter valid registration details
    And I submit the registration form
    Then I should see a confirmation message

  Scenario: Login with the newly created account
    Given I am on the Magento login page
    When I enter valid login credentials
    And I submit the login form
    Then I should be logged in successfully



