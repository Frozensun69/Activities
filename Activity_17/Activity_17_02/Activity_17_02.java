
import java.io.*;

public class Activity_17_02 {
	public static void main(String[] args) throws IOException {
		try (
			
			FileOutputStream output = 
				new FileOutputStream("Activity17_02.dat", true);
		) {
			
			for (int i = 0; i < 100; i++)
				output.write((int)(1 + Math.random() * 100));
		}
	}
}