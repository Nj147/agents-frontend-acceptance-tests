/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.reg_frontend

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.BasePage

object ContactNumberPage extends BasePage {
  val url: String = TestConfiguration.url("contact-frontend")
  val title: String = "Contact Number"

  def contactNumberField: WebElement = driver.findElement(By.id("number"))

  def submitButton: WebElement = driver.findElement(By.id("next-button"))
}
