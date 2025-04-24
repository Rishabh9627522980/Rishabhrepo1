package Utility;

import java.util.Random;
import java.util.UUID;

public class Utilityclass {

    public static String generateRandomEmail() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10); // 10-char unique string
        String email = "user" + uuid + "@example.com";
        return email;

    }

    public static String generatePassword(int len) {
        String lc = "abcdefghijklmnopqrstuvwxyz", uc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", d = "0123456789", sc = "!@#$%^&*";
        String all = lc + uc + d + sc;
        Random r = new Random();
        char[] pwd = new char[len];
        pwd[0] = lc.charAt(r.nextInt(lc.length()));
        pwd[1] = uc.charAt(r.nextInt(uc.length()));
        pwd[2] = d.charAt(r.nextInt(d.length()));
        pwd[3] = sc.charAt(r.nextInt(sc.length()));
        for (int i = 4; i < len; i++)
            pwd[i] = all.charAt(r.nextInt(all.length()));
        for (int i = 0; i < len; i++) { // shuffle
            int j = r.nextInt(len);
            char temp = pwd[i]; pwd[i] = pwd[j]; pwd[j] = temp;
        }
        String pass = new String(pwd);
        return pass;
    }
}
