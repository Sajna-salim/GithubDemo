package ExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCode {
	Sheet sh;
	public ExcelCode() throws FileNotFoundException,IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\sajna sameer\\eclipse-workspace\\My_Maven\\src\\main\\resources\\Book.xlsx.xlsx");
														//file open excel sheet path 																			
															//select and copy the path in the fileinputstream
		XSSFWorkbook w= new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
	}
	public String readData(int row,int col)
	{
		Row r=sh.getRow(row);
		Cell c=r.getCell(col);
		int celltype=c.getCellType();
		switch(celltype)
		{
		case Cell.CELL_TYPE_NUMERIC:
		{
			double val=c.getNumericCellValue();
			return String.valueOf(val);
			}
		case Cell.CELL_TYPE_STRING:
		{
			return c.getStringCellValue();
		}
		}
		return null;
		}
}
