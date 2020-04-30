package HW_Group_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelFileData {

	public static void main(String[] args) throws IOException {
		
		
		String filePath= System.getProperty("user.dir")+"/testdata/Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		
		
		
		 Workbook book = new XSSFWorkbook(fis); 
		 Sheet sheet = book.getSheet("Sheet1");
		 
		
		
		int rows= sheet.getPhysicalNumberOfRows();
		
		int cools = sheet.getRow(0).getLastCellNum();
		
		for(int r=0; r<rows; r++) {
			for(int c=0; c<cools; c++) {
				String cellData=sheet.getRow(r).getCell(c).toString();
				
				System.out.print(cellData+"  ");
			}
			System.out.println();
		}
		
		
		
	

	}

}
