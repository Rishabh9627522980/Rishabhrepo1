package XaltsAssignment;

import Pages.xaltspages;
import Utility.Utilityclass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.Dataprovider;

public class xalts_new_user_flow {
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
            System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://xaltsocnportal.web.app/");
            xaltspages.start(driver).click();
            Thread.sleep(1000);
            xaltspages.username(driver).sendKeys(emailFromExcel);
            xaltspages.password(driver).sendKeys(passwordFromExcel);
            xaltspages.confirmpassword(driver).sendKeys(passwordFromExcel);
            xaltspages.login(driver).click();

            Thread.sleep(2000);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(1000);
            xaltspages.username(driver).clear();
            xaltspages.password(driver).clear();
            xaltspages.confirmpassword(driver).clear();
            Thread.sleep(1000);
            driver.navigate().refresh();
            Thread.sleep(1000);


            String emailx=Utilityclass.generateRandomEmail();
            String passx=Utilityclass.generatePassword(8);
            xaltspages.username(driver).sendKeys(emailx);
            xaltspages.password(driver).sendKeys(passx);
            xaltspages.confirmpassword(driver).sendKeys(passx);
            xaltspages.login(driver).click();
            Thread.sleep(2000);
            xaltspages.getstarted(driver).click();
            xaltspages.newchain(driver).click();
            String passxx=Utilityclass.generatePassword(8);
            xaltspages.networkname(driver).sendKeys(passxx);
            xaltspages.wallet(driver).sendKeys(wallet1);
            xaltspages.newchainnext(driver).click();

            String[][] nodes = {
                    {nodeid1, publicid1},
                    {nodeid2, publicid2},
                    {nodeid3, publicid3}
            };

            for (String[] node : nodes) {
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
                    {nodeid2, publicid2},
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

            xaltspages.newchainnextlast(driver).click();
            Thread.sleep(1000);
            xaltspages.logout(driver).click();

        } catch (Exception e) {
            System.out.println("An error occurred during execution: " + e.getMessage());
            e.printStackTrace();
        } finally {driver.quit();}
    }
}
