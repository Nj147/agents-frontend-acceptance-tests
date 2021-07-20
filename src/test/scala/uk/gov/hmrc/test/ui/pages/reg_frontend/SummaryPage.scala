/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.reg_frontend

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.BasePage

object SummaryPage extends BasePage {
  val url: String = TestConfiguration.url("summary-frontend")
  val title: String = "Summary"

  def bNameText: WebElement = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/dl/div[1]/dd[1]"))

  def updateBName(): WebElement = driver.findElement(By.xpath("/html/body/div/main/div/div/dl/div[1]/dd[2]/a"))

  def submitButton: WebElement = driver.findElement(By.id("next-button"))
}
