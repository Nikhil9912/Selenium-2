package Selenium_Ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ques4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com/");
        driver.manage().window().maximize();
        //ID is duplicate that is why I have used xpath for it.
        driver.findElement(By.xpath("(//a[text()=\"contact us\"])[2]")).click();
       // driver.findElement(By.id("h-contact-us")).click();
        Thread.sleep(5000);
        driver.close();
    }
}