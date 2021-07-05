@Test
  Feature: logging in a user
    Scenario: An agent lands on the homepage and logs in using their arn and password.
      Given the Homepage has loaded
      When the agent clicks the sign in button
      And the agent fills in the ARN51226238 and gg fields with existing credentials and click the submit button
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
