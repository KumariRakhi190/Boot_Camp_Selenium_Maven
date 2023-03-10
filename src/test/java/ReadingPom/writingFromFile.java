package ReadingPom;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingFromFile {
	public static void main(String args[]) throws IOException{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\Test_Data\\writefile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet(); 
		
//		XSSFRow row1 = sheet.createRow(0);
//		row1.createCell(0).setCellValue("Welcome");
//		row1.createCell(1).setCellValue("Wel");
//		row1.createCell(2).setCellValue("come");
//		
//		XSSFRow row2 = sheet.createRow(1);
//		row2.createCell(0).setCellValue("Welcome");
//		row2.createCell(1).setCellValue("Wel");
//		row2.createCell(2).setCellValue("come");
		
		Scanner sc = new Scanner(System.in);
		for(int r=0;r<=3;r++) {
			XSSFRow Currentrow = sheet.createRow(r);
			for(int c=0;c<2;c++) {
//				Currentrow.createCell(c).setCallValue("welcome");
				System.out.println("Enter a value");
				String value =sc.next();
				Currentrow.createCell(c).setCellValue(value);
			}
		}			
		workbook.write(file);
		workbook.close();
		sc.close();
		file.close();
		System.out.println("Done");
}
}