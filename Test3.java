package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://license.ntheye.com/admin/login");
		 WebElement n = d.findElement(By.id("region"));
	     Select sl = new Select(n);
	      //option by value
	      sl.selectByValue("1");
	      //get option with text
	      d.findElement(By.id("email")).sendKeys("gaurang.pohankar@ntheye.com");
	      d.findElement(By.id("password")).sendKeys("test@123Q");
	      d.findElement(By.id("password_eye_admin")).click();
	      d.findElement(By.id("login-button")).click();
	      
	      
d.get("https://license.ntheye.com/admin/company/list_company?type=3");
d.get("https://license.ntheye.com/admin/company/info?c_uniqueid=6325d0d057c8f");
d.get("https://license.ntheye.com/admin/company/add_company_admin?c_uniqueid=6325d0d057c8f");
d.findElement(By.id("firstname")).sendKeys("firstname");
d.findElement(By.id("lastname")).sendKeys("lastname");
d.findElement(By.id("email")).sendKeys("email@gmail.com");
d.findElement(By.id("phone")).sendKeys("0123456789");
d.findElement(By.id("address")).sendKeys("Hyderabad");
WebElement t = d.findElement(By.id("role"));  
Select dropdown = new Select(t); 
dropdown.selectByValue("Administrator");  
d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();



d.get("https://license.ntheye.com/admin/company/edit_company?c_uniqueid=6325d0d057c8f");
d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
d.get("https://license.ntheye.com/admin/company/block_company?c_uniqueid=6325d0d057c8f");
d.get("https://license.ntheye.com/admin/company/unblock_company?c_uniqueid=6325d0d057c8f");

d.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).click();

d.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th[1]/p[1]")).click();
	
d.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/th[1]/p[1]")).click();



d.get("https://license.ntheye.com/admin/company/edit_company_admin?c_a_id=73&c_uniqueid=6325d0d057c8f");
d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
d. navigate(). back();
d. navigate(). back();
d.get("https://license.ntheye.com/admin/company/block_company_admin?c_a_id=73&c_uniqueid=6325d0d057c8f");
d.get("https://license.ntheye.com/admin/company/unblock_company_admin?c_a_id=73&c_uniqueid=6325d0d057c8f");
d.get("https://license.ntheye.com/admin/activity/list_activity?usertype=3&user_id=73");

d.close();      
	}
}
