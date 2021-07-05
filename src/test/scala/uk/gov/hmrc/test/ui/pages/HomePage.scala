/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration

object HomePage extends BasePage {
  val url: String = TestConfiguration.url("home-frontend")
  val title: String = "Home Page"
  def loginButton: WebElement = driver.findElement(By.id("login-button"))
  def registerButton: WebElement = driver.findElement(By.id("register-button"))
}
