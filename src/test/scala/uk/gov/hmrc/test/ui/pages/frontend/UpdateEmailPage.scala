/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.frontend

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.pages.BasePage

object UpdateEmailPage extends BasePage{
  override val url: String = "_"

  def inputEmail(email: String): Unit = driver.findElement(By.id("email")).sendKeys(email)

  def submit: WebElement = driver.findElement(By.id("next-button"))

  def cancel: WebElement = driver.findElement(By.id("cancel"))
}
