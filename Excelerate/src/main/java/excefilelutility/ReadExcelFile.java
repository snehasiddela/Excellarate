package excefilelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericrepository.FrameworkConstant;

/**
 * this class is used to provide the utility methods to Handle Excel file
 * 
 * 
 * @author DELL
 **/
public class ReadExcelFile implements FrameworkConstant {
	public static  FileInputStream fis=null;
	public FileOutputStream fos=null;
	public static  Workbook wb=null;
	 private static Sheet sheet;
	
	public String readData(String sheet,int row,int column)
	{
		//step1: convert physical file into java readable object by using 
		//fileinputStream class 
		try {
			fis = new  FileInputStream(excelpath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		//step2:open the workbook by creating WB-factory
		try {
			wb= WorkbookFactory.create(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		//step3:fetch the data
		String data =wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		
		//step4:close the workbook
		try {
			wb.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		return data;
	}
		
	public static void writeData(int rowNum, int colNum, String data) {
			//step1: convert physical file into java readable object by using 
				//fileinputStream class 
				try {
					fis = new  FileInputStream(excelpath);
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				//step2:open the workbook by creating WB-factory
				try {
					wb= WorkbookFactory.create(fis);
				}
				catch(IOException e) {
					e.printStackTrace();
				}
		         wb.createSheet("sheetName").createRow(rowNum).createCell(colNum).setCellValue(data);

		        try (FileOutputStream outputStream = new FileOutputStream(excelpath)) {
		            wb.write(outputStream);
		            wb.close();
		            System.out.println("Excel file written successfully.");
		        } catch (IOException e) {
		            e.printStackTrace();

		        }
			
	}
	
	   public void updateData(String data,int rowNum,int colNum,String data1) {	
		 //step1: convert physical file into java readable object by using 
			//fileinputStream class 
			try {
				fis = new  FileInputStream(excelpath);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			//step2:open the workbook by creating WB-factory
			try {
				wb= WorkbookFactory.create(fis);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			wb.createSheet("sheetName").getRow(rowNum).getCell(colNum).setCellValue(data1);
			try (FileOutputStream outputStream = new FileOutputStream(excelpath)) {
	            wb.write(outputStream);
	            wb.close();
	            System.out.println("Excel file updated successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();

	        }

		   
		}
	}

