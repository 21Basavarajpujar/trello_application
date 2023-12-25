package com.trello.qspiders.genericutility;

/**
 * The Excel utility class will be used to manage the test case specific from
 * the excel workbook.
 * 
 * @author BSP
 */
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * This method will be used to read the string data from the excel sheet
	 * 
	 * @author QCSA18
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return stringData
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readStringData(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/excelsampledata.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		String data = workBook.getSheet(sheetName).getRow(cellIndex).getCell(cellIndex).getStringCellValue();
		workBook.close();
		return data;
	}

	/**
	 * This method will be used to read the numeric data from excel workbook.
	 * 
	 * @author QCSA18
	 * @author sheetName
	 * @author rowIndex
	 * @author cellIndex
	 * @author numericData
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double readNumericData(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/excelsampledata.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		double data = workBook.getSheet(sheetName).getRow(cellIndex).getCell(cellIndex).getNumericCellValue();
		workBook.close();
		return data;
	}
}
