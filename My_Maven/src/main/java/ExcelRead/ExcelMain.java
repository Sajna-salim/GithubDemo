package ExcelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException
	{
		ExcelCode obj=new ExcelCode();
		
	String str=obj.readData(0, 0);
	System.out.println(str);
	
	String str1=obj.readData(0, 1);
	System.out.println(str1);
	
	String str2=obj.readData(1,0);
	System.out.println(str2);
	
	String str3=obj.readData(1, 1);
	System.out.println(str3);
	
	}
	
}
