package ReadingPom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingFile {
	public static void main(String args[]) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test_Data\\read1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<=rowCount;r++) {
			XSSFRow row= sheet.getRow(r);
			for(int c=0; c<cellcount;c++) {
				XSSFCell cell = row.getCell(c);
				String value = row.getCell(c).toString();
				
				System.out.print(value+"             ");
				
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
	}

}
