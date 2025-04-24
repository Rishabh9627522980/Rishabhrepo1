package Utility;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Dataprovider {
    public static String[] getCredentialsFromExcel() {
        String[] credentials = new String[15];
        try {
            File file = new File("src/test/java/XaltsSheet.xlsx");
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet1 = wb.getSheet("Sheet1");
            XSSFSheet sheet2 = wb.getSheet("Sheet2");
            XSSFSheet sheet3 = wb.getSheet("Sheet3");

            DataFormatter formatter = new DataFormatter();
            credentials[0] = formatter.formatCellValue(sheet1.getRow(1).getCell(0));
            credentials[1] = formatter.formatCellValue(sheet1.getRow(1).getCell(1));
            credentials[2] = formatter.formatCellValue(sheet2.getRow(1).getCell(0));
            credentials[3] = formatter.formatCellValue(sheet2.getRow(1).getCell(1));
            credentials[4] = formatter.formatCellValue(sheet2.getRow(2).getCell(0));
            credentials[5] = formatter.formatCellValue(sheet2.getRow(2).getCell(1));
            credentials[6] = formatter.formatCellValue(sheet2.getRow(3).getCell(0));
            credentials[7] = formatter.formatCellValue(sheet2.getRow(3).getCell(1));
            credentials[8] = formatter.formatCellValue(sheet3.getRow(1).getCell(0));
            credentials[9] = formatter.formatCellValue(sheet3.getRow(2).getCell(0));
            credentials[10] = formatter.formatCellValue(sheet3.getRow(3).getCell(0));
            credentials[11] = formatter.formatCellValue(sheet3.getRow(4).getCell(0));

            wb.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Error reading Excel: " + e.getMessage());
        }
        return credentials;
    }
}

