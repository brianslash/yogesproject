/**
 * 
 */
package KD_Eassignment.Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

/**
 * @author Yogiiii
 *""
 */
public class ReadExcel
{
	public static void readexcels(WebDriver driver) throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\yogesh_keydriven\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		int row=sh.getLastRowNum();
		
		
		
		for(int i=1;i<=row;i++)
		{
			String data1=sh.getRow(i).getCell(2).toString();
			String data11=sh.getRow(i).getCell(1).toString();
			System.out.println("WHAT IS UP"+data11);
			if(data11.equalsIgnoreCase("Registration")&&data1.equalsIgnoreCase("Yes"))
			{
				Employer_Reg.employer_reg(driver);
			}
			else if(data11.equalsIgnoreCase("Registration")&&data1.equalsIgnoreCase("No"))
			{
				//driver.close();
			}
			
			else if(data11.equalsIgnoreCase("Login")&&data1.equalsIgnoreCase("Yes"))
			{
				loginpage.logpage(driver);
			}
			else if(data11.equalsIgnoreCase("Login")&&data1.equalsIgnoreCase("No"))
			{
				driver.close();
			}
			
			if(data1.equalsIgnoreCase("Yes"))
			{
			sh.getRow(i).createCell(3).setCellValue("Pass");
			System.out.println("hello"+data11);
			FileOutputStream fos=new FileOutputStream("D:\\yogesh_keydriven\\data1.xlsx");
			wb.write(fos);
			}
			else if(data1.equalsIgnoreCase("No"))
				// check this line
			{
				sh.getRow(i).createCell(3).setCellValue("Failed");
				System.out.println(data1);
				FileOutputStream fos=new FileOutputStream("D:\\yogesh_keydriven\\data1.xlsx");
				wb.write(fos);
			}
		
		}
		
		
	}
}
