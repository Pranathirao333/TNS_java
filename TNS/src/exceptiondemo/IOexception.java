package exceptiondemo;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class IOexception {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\gagan\\OneDrive\\Documents\\1t.txt"));
			String data = " ";
			while((data = br.readLine())!= null) {
				System.out.println(data);
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
