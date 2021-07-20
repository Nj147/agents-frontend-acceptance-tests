@Test
Feature: logging in a user

  Scenario: An agent lands on the homepage and logs in using their arn and password.
    Given the Homepage has loaded
    When the agent clicks the sign in button
    And the agent fills in the ARN0EB04960 and password123 fields with existing credentials and click the submit button
    Then the agent should be redirected to the dashboard

  Scenario: An agent is able to view their ARN and a List of all clients
    Given the dashboard page has loaded
    Then the ARN should be displayed
    And there will be an area of the page that displays all clients linked to the agent

  Scenario: An agent is able to remove a client
    Given the agent is on the dashboard page
    When the agent clicks on remove
    And the agent clicks on yes to confirm they want to remove client
    Then the agent should be shown a successfull state

  Scenario: An agent is able to add in a client
    Given the agent is redirected to the dashboard page
    When the agent clicks on add client
    And the agent inserts the crn
    And submits
    Then the agent is shown a successfull state

  Scenario: An agent is able to update their email details
    Given the agent is on the dashboard page
    When the user clicks change on the my account button
    And the user clicks change on the email
    And the user types in new email and submits a new email address
    Then they should be redirected to the update page which now displays the newly entered email value
