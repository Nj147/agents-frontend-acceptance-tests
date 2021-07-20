/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.frontend

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object StartPage extends BasePage {

  override val url: String = "http://localhost:9005/agents-frontend/start-page"

  def navigate(): Unit = driver.navigate().to(url)

  def title(): String = driver.getTitle

  def signInButton(): Unit = driver.findElement(By.id("signIn")).click()

  def registerButton(): Unit = driver.findElement(By.id("register")).click()

}
