/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration

object CorrespondencePage extends BasePage {
  val url: String = TestConfiguration.url("correspondence-frontend")
  val title: String = "Correspondence"
  def pNameField: WebElement = driver.findElement(By.id("propertyNumber"))
  def callBox: WebElement = driver.findElement(By.name("modes[0]"))
  def textMessageBox: WebElement = driver.findElement(By.name("modes[1]"))
  def emailBox: WebElement = driver.findElement(By.name("modes[2]"))
  def letterBox: WebElement = driver.findElement(By.name("modes[3]"))
  def submitButton: WebElement = driver.findElement(By.id("next-button"))
}
