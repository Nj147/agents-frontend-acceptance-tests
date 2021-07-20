/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.reg_frontend

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.BasePage

object BusinessNamePage extends BasePage {
  val url: String = TestConfiguration.url("bName-frontend")
  val title: String = "Business Name Details"

  def bNameField: WebElement = driver.findElement(By.id("businessName"))

  def submitButton: WebElement = driver.findElement(By.id("next-button"))
}
