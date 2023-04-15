import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {

    @Test
    public void pesquisarGoogle(){
        System.setProperty( "webdriver.chrome.driver","src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();

        navegar.get("https://google.com");

        navegar.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("whatsapp web", Keys.ENTER);

        navegar.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
        navegar.findElement(By.xpath("//*[@id=\"pane-side\"]/div[2]/div/div/div[14]/div/div/div/div[2]/div[2]/div[1]/span/span")).click();
        //navegar.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).click();
       // navegar.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Boa noite meu amor <3", Keys.ENTER);

    }
}
