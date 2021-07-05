package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By


object LoginPage extends BasePage {
  override val url: String = "http://localhost:9005/agents-frontend/agent-login"

  def navigate(): Unit = {
    driver.navigate().to(url)
  }

  val title: String = driver.getTitle

  def arnInput(arn: String): Unit = driver.findElement(By.id("arn")).sendKeys(arn)

  def passwordInput(password: String): Unit = driver.findElement(By.id("password")).sendKeys(password)

  val submitButton: Unit = driver.findElement(By.className("govuk-button")).click()

}
