/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.frontend

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object LoginPage extends BasePage {
  override val url: String = "http://localhost:9005/agents-frontend/agent-login"

  def navigate(): Unit = driver.navigate().to(url)

  def title(): String = driver.getTitle

  def arnInput(arn: String): Unit = driver.findElement(By.id("arn")).sendKeys(arn)

  def passwordInput(password: String): Unit = driver.findElement(By.id("password")).sendKeys(password)

  def submitButton(): Unit = driver.findElement(By.className("govuk-button")).click()

}
