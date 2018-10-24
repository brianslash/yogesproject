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
 *
 */
public class Run_Mode
{
	public static void run_mode(WebDriver driver) throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\yogesh_keydriven\\data1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		int row=sh.getLastRowNum();
		


		for(int i=1;i<=row;i++)
		{
			String data1=sh.getRow(i).getCell(2).toString();
			System.out.println("my data="+data1);

			if(data1.equalsIgnoreCase("Yes"))
			{System.out.println("read excel");
				ReadExcel.readexcels(driver);
			}

			else if(data1.equalsIgnoreCase("No"))
			{System.out.println("Close Successfully123");
				//driver.close();
				System.out.println("Close Successfully");
			}
			
			if(data1.equalsIgnoreCase("Yes"))//contains here
			{
				sh.getRow(i).createCell(3).setCellValue("Pass");
				System.out.println("i can run"+data1);
				FileOutputStream fos=new FileOutputStream("D:\\yogesh_keydriven\\data.xlsx");
				wb.write(fos);
			}
			else
			{
				sh.getRow(i).createCell(3).setCellValue("Failed");
				System.out.println("is it me"+data1);
				FileOutputStream fos=new FileOutputStream("D:\\yogesh_keydriven\\data.xlsx");
				wb.write(fos);
			}}}


		
	}

