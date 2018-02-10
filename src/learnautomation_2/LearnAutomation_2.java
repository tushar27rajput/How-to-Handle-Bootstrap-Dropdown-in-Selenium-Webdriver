/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation_2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author tusshar
 */
public class LearnAutomation_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
                System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
                
                // Start firefox browser
                WebDriver driver = new FirefoxDriver();
              
                // start the application
               driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");

               // First we have to click on menu item then only dropdown items will display
                WebElement ele =driver.findElement(By.xpath("//*[@id=\"menu1\"]"));
                                        
                
                ele.click();
                
                Thread.sleep(2000);
                
                List<WebElement> dd_menu =driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
                
                
                for(int i=0;i<dd_menu.size();i++)
                {
                    WebElement element=dd_menu.get(i);
                    
                    String innerhtml =element.getAttribute("innerHTML");
                    
                    System.out.println("values of Dropdownlist is ==>"+innerhtml);
                
                   
                    
                }
                driver.quit();
                
                
                
                
                
                
                
                
                
        
    }
    
}
