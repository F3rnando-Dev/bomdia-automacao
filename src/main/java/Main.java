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

        //clica no link do whatsapp web e o nextline é utilizado para após realizar leitura de QRCode
        navegar.findElement(By.xpath("/html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")).click();
        System.out.println("-=-QUANDO JÁ CONECTADO NO WHATSAPP,PRESSIONE ENTER-=-");
        String continua = sc.nextLine();

        //Carrega conversas do whatsapp, clica no campo pesquisar e procura por "Ariane"
        navegar.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div[1]/div/div/div[2]/div/div[1]/p")).click();
        navegar.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div[1]/div/div/div[2]/div/div[1]/p")).sendKeys("Ariane", Keys.ENTER);

        //Clica na conversa "Ariane" e escreve
        navegar.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Bom dia meu amor <3", Keys.ENTER);
    }
}
