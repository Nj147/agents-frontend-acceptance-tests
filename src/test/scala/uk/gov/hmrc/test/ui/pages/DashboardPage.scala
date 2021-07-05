/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

import java.util

object DashboardPage extends BasePage {
  override val url: String = "http://localhost:9005/agents-frontend/dashboard"

  def navigate(): Unit = driver.navigate().to(url)

  def title: String = driver.getTitle

  def getArn: String = driver.findElement(By.tagName("h2")).getText

  def getClients: util.List[WebElement] = driver.findElements(By.className("govuk-table__row"))

  def addClientButton(): Unit = driver.findElement(By.id("addClient")).click()

  def removeClientButton(xpath: String): Unit = driver.findElement(By.xpath(xpath)).click()

  def logoutButton(): Unit = driver.findElement(By.linkText("Logout")).click()

}
