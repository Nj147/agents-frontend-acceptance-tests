/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.frontend.StartPage
import uk.gov.hmrc.test.ui.pages.reg_frontend.{AddressPage, BusinessNamePage, ContactNumberPage, CorrespondencePage, EmailPage, PasswordPage, SummaryConfPage, SummaryPage}

class RegistrationStepDef extends BaseStepDef {

  Given("a user is on the home screen") {
    StartPage.navigate()
  }

  When("the user fills in all the fields with valid information") {
    StartPage.registerButton()

    BusinessNamePage.bNameField.sendKeys("Business Name")
    BusinessNamePage.submitButton.click()

    EmailPage.emailField.sendKeys("test@test.com")
    EmailPage.submitButton.click()

    ContactNumberPage.contactNumberField.sendKeys("01234567890")
    ContactNumberPage.submitButton.click()

    AddressPage.pNameField.sendKeys("23")
    AddressPage.postcodeField.sendKeys("AA1 2BC")
    AddressPage.submitButton.click()

    CorrespondencePage.callBox.click()
    CorrespondencePage.letterBox.click()
    CorrespondencePage.submitButton.click()

    PasswordPage.passField.sendKeys("Password1?")
    PasswordPage.passCheckField.sendKeys("Password1?")
    PasswordPage.submitButton.click()
  }

  When("the user presses the submit button") {
    SummaryPage.submitButton.click()
  }

  Then("the user should be taken to the Registration success page") { () =>
    driver.getTitle shouldBe SummaryConfPage.title
    SummaryConfPage.successText.getText should include("Application complete")
    SummaryConfPage.arnText.getText should include("Agent Reference Number:")
  }

  When("clicks change on the update business name and submits a new value") {
    SummaryPage.updateBName().click()
    BusinessNamePage.bNameField.sendKeys("NewBusinessName")
    BusinessNamePage.submitButton.click()
  }

  Then("the summary page should display the new business name") { () =>
    SummaryPage.bNameText.getText should include("NewBusinessName")
  }
}
