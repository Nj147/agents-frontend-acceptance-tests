/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.frontend.{AddClientPage, ClientInputSuccessfull, DashboardPage, LoginPage, RemoveClientPage, StartPage, SuccessfulPage, UpdateEmailPage, UpdatePage}

class UserLoginJourney extends BaseStepDef {

  //Scenario 1
  Given("the Homepage has loaded") { () =>
    StartPage.navigate()
  }

  When("the agent clicks the sign in button") { () =>
    StartPage.signInButton()
  }

  When("""^the agent fills in the ARN0EB04960 and password123 fields with existing credentials and click the submit button$""") { () =>
    LoginPage.arnInput("ARN0EB04960")
    LoginPage.passwordInput("password123")
    LoginPage.submitButton()
  }

  Then("the agent should be redirected to the dashboard") { () =>
    DashboardPage.title shouldBe ("Agent DashBoard")
  }

  //Scenario 2
  Given("""the agent is on the dashboard page""") { () =>
    DashboardPage.navigate()
  }

  Then("""^the ARN should be displayed$""") { () =>
    DashboardPage.getArn should include("ARN0EB04960")
  }

  And("""^there will be an area of the page that displays all clients linked to the agent$""") { () =>
    DashboardPage.getClients.size() shouldBe (2)
  }

  When("the agent clicks on remove") { () =>
    DashboardPage.removeClientButton("/html/body/div[2]/main/div/div/div/main/table/tbody/tr/td[5]/a")
  }

  And("the agent clicks on yes to confirm they want to remove client") { () =>
    RemoveClientPage.yes()
  }

  Then("the agent should be shown a successful state") { () =>
    SuccessfulPage.success should include("Successful")
  }

  //Scenario 3
  When("the agent clicks on add client") { () =>
    DashboardPage.addClientButton()
  }

  And("the agent inserts the crn") { () =>
    AddClientPage.crnInput("CRNBF53E559")
  }

  And("submits") { () =>
    AddClientPage.submit()
  }

  Then("the agent is shown a successful state") { () =>
    ClientInputSuccessfull.success should include("Successful")
  }

  //Scenario 4
  When("the user clicks change on the my account button") { () =>
    DashboardPage.yourAccount().click()
  }

  And("the user clicks change on the email") { () =>
    UpdatePage.updateEmail().click()
  }

  And("the user types in new email and submits a new email address") { () =>
    UpdateEmailPage.inputEmail("testing@testing.com")
    UpdateEmailPage.submit.click()
  }

  Then("they should be redirected to the update page which now displays the newly entered email value") {() =>
    UpdatePage.getTitle shouldBe ("Your Account")
    UpdatePage.getEmail shouldBe ("testing@testing.com")
  }
}
