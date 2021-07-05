/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By

object RemoveClientPage extends BasePage {
  override val url: String = """"""

  def getTitle: String = driver.getTitle

  def yes(): Unit = driver.findElement(By.id("confirmButton")).click()

  def no(): Unit = driver.findElement(By.id("cancelButton")).click()
}
