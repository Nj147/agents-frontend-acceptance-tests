@Test
  Feature: Registering a new account
    Scenario: The user attempts to register an account
      Given a user is on the home screen
      When the user fills in all the fields with valid information
      And the user presses the submit button
      Then the user should be taken to the Registration success page

    Scenario: The user updates their inputted data value
      Given a user is on the home screen
      When the user fills in all the fields with valid information
      And clicks change on the update business name and submits a new value
      Then the summary page should display the new business name