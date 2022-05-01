
import java.util.*;
import java.io.*;

public class Activity_20_01 {
	public static void main(String[] args) throws Exception {
		
		if (args.length != 1) {
			System.out.println("Usage: java Activity_20_01 TextFile");
			System.exit(1);
		}

		
		File textFile = new File(args[0]);
		if (!textFile.exists()) {
			System.out.println("The file " + args[0] + " does not exist.");
			System.exit(2);
		}

		
		List<String> list = new ArrayList<>();

		try (
			
			Scanner input = new Scanner(textFile);
		) {
			while (input.hasNext()) {
				String[] array = input.nextLine().split(" ");
				for (int i = 0; i < array.length; i++) {
					if (array[i].length() > 0 && 
						 Character.isLetter(array[i].charAt(0))) {
						list.add(array[i]);
					}
				}
			}
		}
	
		Collections.sort(list);

		
		System.out.println(list);
	}
}