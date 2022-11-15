package Selenium_Ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\MavenProject\\src\\main\\resources\\chromedriver2.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tothenew.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//a[text()=\"contact us\"])[2]")).click();
       
        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl());
     
        driver.close();
    }
}
