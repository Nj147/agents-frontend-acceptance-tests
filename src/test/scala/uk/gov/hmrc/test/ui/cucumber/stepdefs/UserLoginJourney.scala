/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{AddClientPage, ClientInputSuccessfull, DashboardPage, LoginPage, RemoveClientPage, StartPage, SuccessfulPage}

class UserLoginJourney extends BaseStepDef {

  Given("the Homepage has loaded") { () =>
    StartPage.navigate()
  }

  When("the agent clicks the sign in button") { () =>
    StartPage.signInButton()
  }

  When("""^the agent fills in the ARN51226238 and gg fields with existing credentials and click the submit button$""") { () =>
    LoginPage.arnInput("ARN51226238")
    LoginPage.passwordInput("gg")
    LoginPage.submitButton()
  }

  Then("the agent should be redirected to the dashboard") { () =>
    DashboardPage.title shouldBe("Agent DashBoard")
  }

  Given("""^the dashboard page has loaded$""") { () =>
    DashboardPage.title shouldBe("Agent DashBoard")
  }

  Then("""^the ARN should be displayed$""") { () =>
    DashboardPage.getArn should include ("ARN51226238")
  }

  And("""^there will be an area of the page that displays all clients linked to the agent$""") { () =>
    DashboardPage.getClients.size() shouldBe(3)
  }

  Given("the agent is on the dashboard page") { () =>
    DashboardPage.title shouldBe("Agent DashBoard")
  }

  When("the agent clicks on remove") { () =>
    DashboardPage.removeClientButton("/html/body/div/main/div/div/div/main/table/tbody/tr[1]/td[5]/a")
  }

  And("the agent clicks on yes to confirm they want to remove client") { () =>
    RemoveClientPage.yes()
  }

  Then("the agent should be shown a successfull state") { () =>
    SuccessfulPage.success should include ("Successful")
  }

  Given("the agent is redirected to the dashboard page") { () =>
    DashboardPage.navigate()
  }

  When("the agent clicks on add client") { () =>
    DashboardPage.addClientButton()
  }

  And("the agent inserts the crn") { () =>
    AddClientPage.crnInput("CRNF487638B")
  }

  And("submits") { () =>
    AddClientPage.submit()
  }

  Then("the agent is shown a successfull state") {() =>
    ClientInputSuccessfull.success should include ("Successful")
  }

}
