package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetTitle {
WebDriver driver;


    @Given("the user is on google page")
    public void the_user_is_on_google_page() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @When("user get the title from first page")
    public void user_get_the_title_from_first_page() {

        String name= driver.getTitle();
        System.out.println("First Page Title  :"+name);
    }
    @When("clicks on Gmail at the top corner")
    public void clicks_on_gmail_at_the_top_corner() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/header/div[1]/div[1]/a")).click();
    }
    @Then("user get the title from second page")
    public void user_get_the_title_from_scond_page() {
        String name2 = driver.getTitle();
        System.out.println("Second Page Title :"+name2);
        driver.quit();
    }


}







