@smokeTest
Feature: To test my cucumber test is running
I want to run a sample feature file.


Scenario: login with valid credentials
  Given I am on the login page
  When I fill the username with "test@qa-experience.com"
  And I fill in password with "Password1"
  And I press Login
  Then I should see "Successfully logged in!"


  Scenario Outline: Negative scenarios for User Name
    Given I am on the login page
    When I fill the username with <UserName>
    Then I should get validation error "Error message"
    Examples:
        | UserName |
        | " "    |
        | "T"    |
        | "Test"     |
        | "test@qa-experience"    |
        | "1@qa-experience.com"  |


  Scenario Outline: Negative scenarios for Password
      Given I am on the login page
      When I fill in password with <Password>
      Then I should get validation error "Error message"
      Examples:
          | Password |
          | " "    |
          | "P"    |
          | "Pass"     |
          | "Pass123"    |


 Scenario Outline: Check Passwords fields is encrypted
      Given I am on the login page
      When I fill in password with "Password1"
      Then I should see the paswords field encrypted