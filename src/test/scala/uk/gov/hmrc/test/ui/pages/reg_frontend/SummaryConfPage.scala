/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.reg_frontend

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.BasePage

object SummaryConfPage extends BasePage {
  val url: String = TestConfiguration.url("summary-frontend")
  val title: String = "Successful Registration"

  def arnText: WebElement = driver.findElement(By.id("arn"))

  def successText: WebElement = driver.findElement(By.id("success"))

  def getArn: String = driver.findElement(By.id("arn")).getText

}
