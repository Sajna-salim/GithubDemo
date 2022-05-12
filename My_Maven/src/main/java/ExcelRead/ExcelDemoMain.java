package ExcelRead;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemoMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ExcelDemo obj=new ExcelDemo();
		obj.inputExcelDemo();
		String str=obj.getData(0, 0);
		System.out.println(str);
		
		String str2=obj.getData(0,1);
		System.out.println(str2);

		String str3=obj.getData(1,0);
		System.out.println(str3);
		
		String str4=obj.getData(1,1);
		System.out.println(str4);
	}

}
