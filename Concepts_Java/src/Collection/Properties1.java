package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Properties1 {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("abc.txt");// file not found exception
		properties.load(fis);
		System.out.println(properties);
		System.out.println(properties.get("Neiv"));
		properties.setProperty("weid", "Dreil");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		properties.store(fos, "Coming Soon");
	}
}
