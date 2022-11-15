package Selenium_Ass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
