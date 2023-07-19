package Test.Kannaa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
	
String filePath = "C:\\Users\\manikandan\\eclipse-workspace\\Kannaa\\Amount.properties";

public void readProperty() throws IOException {
	File f =new File(filePath);
	FileInputStream FS =new FileInputStream(f);
	Properties P = new Properties();
	P.load(FS);
	String a1=P.getProperty("Amount1");
	int amount1 =Integer.parseInt(a1);
	String a2=P.getProperty("Amount2");
	int amount2=Integer.parseInt(a2);
	int sum=amount1+amount2;
	P.setProperty("sum",String.valueOf(sum));
	
	
	
	
	
	
	
	
	
	
}

	public static void main(String[] args)throws IOException {
		properties Obj=new properties();
		Obj.readProperty();
		
		

		

	}

}
