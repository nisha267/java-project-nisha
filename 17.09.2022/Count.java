import java.io.FileInputStream;
import java.io.IOException;

public class Count {
	public static void main(String[]args)throws IOException {
		FileInputStream fin=new FileInputStream("Test.txt");
		int i,count=0;
		while((i=fin.read())!=-1) {
			if(i!=' ') {
			count=count+1;
			}
		}
		System.out.println(count);
	}
		
	}


