package excelops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functions.orgMaster;

public class xlops {

	public static void main(String[] args) throws IOException
	{
		DateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		String d=format.format(date);
		System.out.println(d);
		
		String d1=d.replace("/", "");
		String d2=d1.replace(" ", "");
		String d3=d2.replace(":", "");
		System.out.println(d3);
		
		orgMaster om=new orgMaster();
		String xlpath="F:\\Morning830AM\\Selenium\\src\\com\\orgHRM\\Testdata\\Testdata.xlsx";
		String xlout="F:\\Morning830AM\\Selenium\\src\\com\\orgHRM\\Results\\TestRes"+d3+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Empreg");
		XSSFSheet ws1=wb.getSheet("Sheet2");
//		XSSFRow r=ws.getRow(3);
//		XSSFCell c=r.getCell(0);
//		
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		
		System.out.println(rc);
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		
		om.org_Launch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c3=r.getCell(2);
			XSSFCell c2=r.createCell(3);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String empId=c3.getStringCellValue();
			
			System.out.println(f+"---------"+l+"---------"+empId);
			
			String res=om.org_Empreg(f,l, empId);
			System.out.println(res);
			c2.setCellValue(res);
			if (res.equalsIgnoreCase("Pass"))
			{
				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				
			}
			else if (res.equalsIgnoreCase("Fail"))			
			{
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
				
			}
			
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//			font.setColor(IndexedColors.GREEN.getIndex());
//			style.setFont(font);
			
			c2.setCellStyle(style);
			
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
		
	}

}
