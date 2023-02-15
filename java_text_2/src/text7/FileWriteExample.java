package text7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
	public static void main(String[] args) {
		try {
			File file = new File("C:/java/test.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i < 5; i++) {
				bw.write("[" + i + "]");
				bw.newLine();
			}
			bw.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
