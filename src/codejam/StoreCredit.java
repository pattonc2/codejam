package codejam;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoreCredit {

public static void main(String[] args) throws IOException {
		
		//Get file
		FileReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new FileReader("C:/Users/Charlie/Desktop/A-large-practice.in");
			 writer = new BufferedWriter(new FileWriter("C:/Users/Charlie/Desktop/output.txt"));
		} 
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Setup Scanner
		Scanner in = new Scanner(reader);
		int index1 = 0, index2 = 0;
		
		int numberOfCases = in.nextInt();
		
		for(int i = 0; i < numberOfCases; i++){
			int credit = in.nextInt();
			int numberOfItems = in.nextInt();
			
			int [] items = new int[numberOfItems];
			
			for(int j = 0; j < numberOfItems; j++){
				items[j] = in.nextInt();
			}
			
			for(int x = 0; x < items.length; x++){
				for(int y = x+1; y < items.length; y++){
					
					if(items[x] + items[y] == credit){
						index1 = x + 1;
						index2 = y + 1;
					}
				}
			}
			
			String eol = System.getProperty("line.separator"); 
			writer.write("Case #"+ (i+1) + ": " + index1 + " " + index2 + eol);
		}
		
		writer.close();
		reader.close();
		
		
	}
}
