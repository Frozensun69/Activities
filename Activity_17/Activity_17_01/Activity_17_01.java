
import java.io.*;
import java.util.*;

public class Activity_17_01 {
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> list = new ArrayList<>();

	
		File file = new File("Activity_17_01.txt");
		if (file.exists()) {
			try (
				
				Scanner input = new Scanner(file);
			) {
				while (input.hasNext()) {
					list.add(input.nextLine());
				}
			}
		}
		
		for (int i = 0; i < 100; i++) {
			list.add(((int)(Math.random() * 100)) + " ");
		}

		try (
			
			PrintWriter output = new PrintWriter(file);
		) {
			
			for (String l: list) {
				output.print(l);
			}
		}
	}
}