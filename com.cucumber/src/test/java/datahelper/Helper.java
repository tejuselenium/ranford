package datahelper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Helper {
	public static List<HashMap<String, String>> exceldata(String filename, String sheetname) {

		List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();
		try {
			FileInputStream fis = new FileInputStream(filename);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row headderrow = sh.getRow(0);
			for (int r = 1; r < sh.getPhysicalNumberOfRows(); r++) 
			{

				HashMap<String, String> hashmap = new HashMap<String, String>();
				Row currentrow = sh.getRow(r);
				for (int c = 0; c < currentrow.getPhysicalNumberOfCells(); c++) 
				{
					Cell currentcell = currentrow.getCell(c);
					switch (currentcell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						hashmap.put(headderrow.getCell(c).getStringCellValue(), currentcell.getStringCellValue());

					}
				}
				mydata.add(hashmap);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mydata;
	}
}
