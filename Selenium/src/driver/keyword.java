package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import functions.orgMaster;

public class keyword 
{
	@Test
	public void driverscript() throws IOException
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
		String res=null;
		String xlpath="F:\\Morning830AM\\Selenium\\src\\com\\orgHRM\\Testdata\\Keyword.xlsx";
		String xlout="F:\\Morning830AM\\Selenium\\src\\com\\orgHRM\\Results\\keyres"+d3+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		int rc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		for (int i = 1; i <= rc ; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				for (int  j = 1;  j <= tsRc;  j++)
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://orangehrm.qedgetech.com");
							break;
						case "login":	
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							res=om.org_Empreg("QEdge12", "Tech21", "5115");
							break;
						case "Usereg":
							res=om.org_Userreg("QEdge12 Tech21", "QEdge654321", "QEdge654321", "QEdge654321");
							break;
						case "Ulogin":	
							res=om.org_Login("QEdge654321","QEdge654321");
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//result updation in test steeps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						//result updation in test case sheet
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
				
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
