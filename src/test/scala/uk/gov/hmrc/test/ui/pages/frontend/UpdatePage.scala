/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.frontend

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.pages.BasePage

object UpdatePage extends BasePage {

  override val url: String = ""

  def updateEmail(): WebElement = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/dl/div[2]/dd[2]/a"))
  def getEmail: String = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/dl/div[2]/dd[1]")).getText

  def updateContactNumber(): WebElement = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/dl/div[3]/dd[2]/a"))

  def updateCorrespondence(): WebElement = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/dl/div[4]/dd[2]/a"))

  def updateAddress(): WebElement = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/dl/div[5]/dd[2]/a"))
}
