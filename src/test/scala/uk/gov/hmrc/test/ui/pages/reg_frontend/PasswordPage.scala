/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.reg_frontend

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.BasePage

object PasswordPage extends BasePage {
  val url: String = TestConfiguration.url("password-frontend")
  val title: String = "Password"

  def passField: WebElement = driver.findElement(By.id("password"))

  def passCheckField: WebElement = driver.findElement(By.id("passwordCheck"))

  def submitButton: WebElement = driver.findElement(By.id("next-button"))
}
