import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.setProperty( "webdriver.chrome.driver","src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();

        navegar.get("https://google.com");

        //Clica na pesquisa e escreve "whatsapp web e ja da enter"
        navegar.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("whatsapp web", Keys.ENTER);

        //clica no link e nextline é utilizado para realizar leitura de QRCode
        navegar.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
        String continua = sc.nextLine();

        navegar.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div[2]/div[2]/div/div/div[11]/div/div/div/div[2]/div[1]/div[1]/span")).click();
        navegar.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).click();
        navegar.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Boa noite meu amor <3", Keys.ENTER);
    }
}
