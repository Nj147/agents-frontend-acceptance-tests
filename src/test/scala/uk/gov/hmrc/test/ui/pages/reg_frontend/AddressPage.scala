/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.reg_frontend

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.BasePage

object AddressPage extends BasePage {
  val url: String = TestConfiguration.url("address-frontend")
  val title: String = "Business Address"

  def pNameField: WebElement = driver.findElement(By.id("propertyNumber"))

  def postcodeField: WebElement = driver.findElement(By.id("postcode"))

  def submitButton: WebElement = driver.findElement(By.id("next-button"))
}
