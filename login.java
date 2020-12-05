package pk1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\my workspace\\chromedriver.exe");
		//commented String nm[]={"tester1","tester2","tester3"};
				WebDriver driver=new ChromeDriver();
				driver.get("file:///D:/prax%2010/data.html");
				
				driver.findElement(By.name("username")).sendKeys("tester1");
				driver.findElement(By.name("password")).sendKeys("tester1");
				driver.findElement(By.id("submit")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.linkText("Logout")).click();
				
				System.out.println("done");
	}

}
