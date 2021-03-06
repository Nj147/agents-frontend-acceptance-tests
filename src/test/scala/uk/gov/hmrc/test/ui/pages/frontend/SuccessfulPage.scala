/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages.frontend

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object SuccessfulPage extends BasePage {

  override val url: String = s"http://localhost:9005/agents-frontend/removed-confirmed/"

  def success: String = driver.findElement(By.className("govuk-panel__title")).getText

}
