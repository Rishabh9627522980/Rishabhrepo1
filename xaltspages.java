package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xaltspages {
    public static WebElement start(WebDriver driver){
        WebElement start1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/button"));
        return start1;
    }
    public static WebElement registered(WebDriver driver){
        WebElement registered = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/button[2]"));
        return registered;
    }
    public static WebElement username(WebDriver driver){
        WebElement username = driver.findElement(By.xpath("//*[@id=\"outlined-basic\"]"));
        return username;
    }
    public static WebElement password(WebDriver driver){
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        return password;
    }
    public static WebElement login(WebDriver driver){
        WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/button[1]"));
        return login;
    }
    public static WebElement getstarted(WebDriver driver){
        WebElement getstarted = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/button"));
        return getstarted;
    }
    public static WebElement existingnode(WebDriver driver){
        WebElement existingnode = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[2]/div/div[1]/h2"));
        return existingnode;
    }
    public static WebElement nodeid(WebDriver driver){
        WebElement nodeid = driver.findElement(By.xpath("//input[@id='outlined-basic'][@type='text'][@aria-invalid='true'][1]"));
        return nodeid;
    }
    public static WebElement publicid(WebDriver driver){
        WebElement publicid = driver.findElement(By.xpath("//label[contains(text(), 'Public IP')]/following::input[1]"));
        return publicid;
    }
    public static WebElement addnode(WebDriver driver){
        WebElement addnode = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[1]/div[3]/button"));
        return addnode;
    }
    public static WebElement next(WebDriver driver){
        WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[1]/button"));
        return next;
    }
    public static WebElement wallet(WebDriver driver){
        WebElement wallet = driver.findElement(By.xpath("//label[text()='Wallet Address']/following::input[1]"));
        return wallet;
    }
    public static WebElement addwallet(WebDriver driver){
        WebElement addwallet = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[1]/div[2]/button"));
        return addwallet;
    }
    public static WebElement lastnext(WebDriver driver){
        WebElement lastnext = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[1]/div[3]/button[2]"));
        return lastnext;
    }
    public static WebElement logout(WebDriver driver){
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/button"));
        return logout;
    }
    public static WebElement confirmpassword(WebDriver driver){
        WebElement confirmpassword = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]"));
        return confirmpassword;
    }
    public static WebElement newchain(WebDriver driver){
        WebElement newchain = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[2]/div/div[2]/h2"));
        return newchain;
    }
    public static WebElement networkname(WebDriver driver){
        WebElement networkname = driver.findElement(By.xpath("//label[text()='Network Name']/following::input[1]"));
        return networkname;
    }
    public static WebElement newchainnext(WebDriver driver){
        WebElement newchainnext = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[1]/button"));
        return newchainnext;
    }
    public static WebElement newchainnextlast(WebDriver driver){
        WebElement newchainnextlast = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[1]/div[4]/button[2]"));
        return newchainnextlast;
    }
    public static WebElement nodetypeselect(WebDriver driver){
        WebElement nodetypeselect = driver.findElement(By.xpath("//*[@id=\"node-type-select\"]"));
        return nodetypeselect;
    }
    public static WebElement nodetyperpc(WebDriver driver){
        WebElement nodetyperpc = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
        return nodetyperpc;
    }
    public static WebElement nodedelete(WebDriver driver){
        WebElement nodedelete = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/span/input"));
        return nodedelete;
    }
    public static WebElement nodedeletebutton(WebDriver driver){
        WebElement nodedeletebutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[2]/button"));
        return nodedeletebutton;
    }
    public static WebElement transactionselect(WebDriver driver){
        WebElement transactionselect = driver.findElement(By.xpath("//*[@id=\"node-type-select\"]"));
        return transactionselect;
    }
    public static WebElement transactionchange(WebDriver driver){
        WebElement transactionchange = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
        return transactionchange;
    }
    public static WebElement transactiondelete(WebDriver driver){
        WebElement transactiondelete = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/span/input"));
        return transactiondelete;
    }
    public static WebElement transactiondeletebutton(WebDriver driver){
        WebElement transactiondeletebutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/section[3]/div/div/div[2]/button"));
        return transactiondeletebutton;
    }


}











