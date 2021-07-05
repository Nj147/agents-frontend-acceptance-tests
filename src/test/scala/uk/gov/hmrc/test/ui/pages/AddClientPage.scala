/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object AddClientPage extends BasePage {
  override val url: String = """_"""

  def crnInput(crn: String): Unit = driver.findElement(By.id("crn")).sendKeys(crn)

  def submit(): Unit = driver.findElement(By.className("govuk-button")).click()
}
