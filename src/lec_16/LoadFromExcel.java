package lec_16;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoadFromExcel extends LoadUsers {

    public LoadFromExcel() throws IOException {
        loadAll();
    }

    @Override
    public List<User> loadAll() throws IOException {
        FileInputStream excelFile = new FileInputStream(new File("/Users/stanton/IdeaProjects/Homework/src/users.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            int id = 0;
            String email = null;
            String name = null;
            int age = 0;
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getColumnIndex()) {
                    case 0:
                        id = (int) cell.getNumericCellValue();
                        break;
                    case 1:
                        email = cell.getStringCellValue();
                        break;
                    case 2:
                        name = cell.getStringCellValue();
                        break;
                    case 3:
                        age = (int) cell.getNumericCellValue();
                        break;
                }
            }
            User user = new User(id, email, name, age);
            userList.add(user);
        }
        return userList;
    }
}