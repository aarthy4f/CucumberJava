Feature: To test login functionality

  Scenario Outline: Check login is successful with Valid credentional
    Given user is in login page
    When user enters <username> and <password>
    And click on login button
    Then user  is navigated to login page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |