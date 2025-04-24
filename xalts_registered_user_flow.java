package XaltsAssignment;

import Pages.xaltspages;
import Utility.Utilityclass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.Dataprovider;

public class xalts_registered_user_flow {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            String[] credentials = Dataprovider.getCredentialsFromExcel();
            String emailFromExcel = credentials[0];
            String passwordFromExcel = credentials[1];
            String nodeid1 = credentials[2];
            String publicid1 = credentials[3];
            String nodeid2 = credentials[4];
            String publicid2 = credentials[5];
            String nodeid3 = credentials[6];
            String publicid3 = credentials[7];
            String wallet1 = credentials[8];
            String wallet2 = credentials[9];
            String wallet3 = credentials[10];
            String wallet4 = credentials[11];
            System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://xaltsocnportal.web.app/");
            xaltspages.start(driver).click();
            Thread.sleep(1000);
            xaltspages.registered(driver).click();
            Thread.sleep(1000);

            String emailx= Utilityclass.generateRandomEmail();
            String passx= Utilityclass.generatePassword(8);
            xaltspages.username(driver).sendKeys(emailx);
            xaltspages.password(driver).sendKeys(passx);
            xaltspages.login(driver).click();
            Thread.sleep(1000);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(1000);
            driver.navigate().refresh();
            Thread.sleep(1000);
            xaltspages.registered(driver).click();


            xaltspages.username(driver).sendKeys(emailFromExcel);
            xaltspages.password(driver).sendKeys(passwordFromExcel);
            xaltspages.login(driver).click();
            Thread.sleep(2000);
            xaltspages.getstarted(driver).click();
            xaltspages.existingnode(driver).click();

            String[][] nodes1 = {
                    {nodeid1, publicid1},
                    {nodeid2, publicid2},
            };

            for (String[] node : nodes1) {
                xaltspages.nodeid(driver).clear();
                xaltspages.nodeid(driver).sendKeys(node[0]);
                xaltspages.publicid(driver).clear();
                xaltspages.publicid(driver).sendKeys(node[1]);
                xaltspages.addnode(driver).click();
                Thread.sleep(1000);
            }
            xaltspages.nodetypeselect(driver).click();
            xaltspages.nodetyperpc(driver).click();
            String[][] nodes2 = {
                    {nodeid3, publicid3},
                    {nodeid1, publicid1},
            };

            for (String[] node : nodes2) {
                xaltspages.nodeid(driver).clear();
                xaltspages.nodeid(driver).sendKeys(node[0]);
                xaltspages.publicid(driver).clear();
                xaltspages.publicid(driver).sendKeys(node[1]);
                xaltspages.addnode(driver).click();
                Thread.sleep(1000);
            }
            xaltspages.nodedelete(driver).click();
            xaltspages.nodedeletebutton(driver).click();
            Thread.sleep(1000);

            xaltspages.next(driver).click();

            String[] wallets1 = {
                    wallet1,
                    wallet2
            };

            for (String wallet : wallets1) {
                xaltspages.wallet(driver).clear();
                xaltspages.wallet(driver).sendKeys(wallet);
                xaltspages.addwallet(driver).click();
                Thread.sleep(1000);
            }
            xaltspages.transactionselect(driver).click();
            xaltspages.transactionchange(driver).click();
            String[] wallets2 = {
                    wallet3,
                    wallet4
            };

            for (String wallet : wallets2) {
                xaltspages.wallet(driver).clear();
                xaltspages.wallet(driver).sendKeys(wallet);
                xaltspages.addwallet(driver).click();
                Thread.sleep(1000);
            }
            xaltspages.transactiondelete(driver).click();
            xaltspages.transactiondelete(driver).click();
            Thread.sleep(1000);
            xaltspages.lastnext(driver).click();
            Thread.sleep(1000);
            xaltspages.logout(driver).click();

        } catch (Exception e) {
            System.out.println("An error occurred during execution: " + e.getMessage());
            e.printStackTrace();
        } finally {driver.quit();}
    }
}
