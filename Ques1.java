package Selenium_Ass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
      //  driver.manage().window().
        driver.close();
    }
}
