package com.guru99.gurubank.pruebas.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilidadesExcel {
	static Workbook workbook;
	static Sheet sheet;

	static List<String> listaSku = new ArrayList<String>();
	static List<String> listaError = new ArrayList<String>();
	static List<String> listaLink = new ArrayList<String>();

	private static int obtenerIndiceDeCeldaVacia(Sheet sheet) {
		int i = 0;
		Iterator<Row> iterator = sheet.iterator();

		while (iterator.hasNext()) {
			i++;
			iterator.next();
		}
		return i;
	}

	public static void sobreescribirExcel(String excelFilePath, String hojaExcel) {

		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(new File(excelFilePath));
			workbook = new XSSFWorkbook(inputStream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		sheet = workbook.getSheet(hojaExcel);
		createHeaderRow(excelFilePath, sheet);
	}

	public static void agregarNuevaFilaDeDatos(String sku, String error, String link, String excelFilePath, String hojaExcel) {
		Sheet sheet=workbook.getSheet(hojaExcel);
		int rowCount = obtenerIndiceDeCeldaVacia(sheet);
		
		Row row = sheet.createRow(rowCount);
		Cell cell = row.createCell(0);
		cell.setCellValue(sku);

		cell = row.createCell(1);
		cell.setCellValue(error);

		cell = row.createCell(2);
		cell.setCellValue(link);

		try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
			workbook.write(outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createHeaderRow(String excelFilePath, Sheet sheet) {

		CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
		Font font = sheet.getWorkbook().createFont();
		font.setBold(true);
		font.setFontHeightInPoints((short) 16);
		cellStyle.setFont(font);

		Row row = sheet.createRow(0);
		Cell cellTitle = row.createCell(0);

		cellTitle.setCellStyle(cellStyle);
		cellTitle.setCellValue("Sku");

		Cell cellAuthor = row.createCell(1);
		cellAuthor.setCellStyle(cellStyle);
		cellAuthor.setCellValue("Error");

		Cell cellPrice = row.createCell(2);
		cellPrice.setCellStyle(cellStyle);
		cellPrice.setCellValue("Link");

	}

}
