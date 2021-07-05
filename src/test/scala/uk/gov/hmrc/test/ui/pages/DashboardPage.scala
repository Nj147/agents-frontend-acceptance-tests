package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By

object DashboardPage extends BasePage {
  override val url: String = "http://localhost:9005/agents-frontend/dashboard"

  def navigate(): Unit = {
    driver.navigate().to(url)
  }

  val title: String = driver.getTitle

  val getArn: String = driver.findElement(By.tagName("h2")).getText

  val getClients: String = driver.findElement(By.className("govuk-table__row")).getText

  val addClientButton: Unit = driver.findElement(By.linkText("Add a client")).click()

  val removeClientButton: Unit = driver.findElement(By.linkText("Remove ")).click()

  val logoutButton: Unit = driver.findElement(By.linkText("Logout")).click()

}
