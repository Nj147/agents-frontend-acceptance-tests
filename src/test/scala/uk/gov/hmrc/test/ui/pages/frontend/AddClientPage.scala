/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.frontend

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object AddClientPage extends BasePage {
  override val url: String = "http://localhost:9005/agents-frontend/client-code"

  def crnInput(crn: String): Unit = driver.findElement(By.id("crn")).sendKeys(crn)

  def submit(): Unit = driver.findElement(By.className("govuk-button")).click()
}
