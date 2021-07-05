package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By

object StartPage extends BasePage {

  override val url: String = "http://localhost:9005/agents-frontend/start-page"

  def navigate(): Unit = {
    driver.navigate().to(url)
  }

  val title: String = driver.getTitle

  val signInButton: Unit = driver.findElement(By.linkText("Sign in")).click()

  val registerButton: Unit = driver.findElement(By.linkText("Register")).click()

}
