@Test
  Scenario An agent lands on the homepage and should be able to login and direct themself to the dashboard where you are able to see a list of clients, and their ARN.
    Given the Homepage has loaded
    When the agent clicks the sign in button
    Then the sign in page loads
    When the agent fills in the Username and Password fields with existing credentials and click the submit button
    Then the agent should be redirected to the dashboard
    And the ARN should be displayed
    And there will be an area of the page that displays all clients linked to the agent

