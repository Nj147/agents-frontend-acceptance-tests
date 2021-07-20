/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.frontend

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object RemoveClientPage extends BasePage {

  override val url: String = s"http://localhost:9005/agents-frontend/removeClient/"

  def getTitle: String = driver.getTitle

  def yes(): Unit = driver.findElement(By.id("ConfirmRemoveClient")).click()

  def cancel(): Unit = driver.findElement(By.className("cancel")).click()
}
