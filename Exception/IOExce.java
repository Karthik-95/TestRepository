package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExce {
	public static void main(String[] args) throws IOException {
		File a=new File("D:\\movie\\karthik.txt");
		FileInputStream b=null;
		try {
		b=new FileInputStream(a);
		int c=0;
		while((c=b.read())!=-1) {
			System.out.println((char)c);
			//System.out.println(c);
		}
		}catch(IOException a1) {
			System.out.println(a1);
		}
		finally {
			b.close();
		}
	}

}
