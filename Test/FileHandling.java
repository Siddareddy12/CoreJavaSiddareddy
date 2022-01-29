package Test;

import java.io.FileOutputStream;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		String s1="Clean india green india";
		FileOutputStream file;
		
		file=new FileOutputStream("result.txt");
		file.write(s1.getBytes());


}
}
