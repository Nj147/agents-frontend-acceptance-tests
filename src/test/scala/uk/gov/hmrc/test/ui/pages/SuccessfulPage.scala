/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By

object SuccessfulPage extends BasePage {

  override val url: String = """ """

  def success: String = driver.findElement(By.className("govuk-panel__title")).getText

}
