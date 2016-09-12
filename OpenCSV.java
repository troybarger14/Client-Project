import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

import com.opencsv.CSVReader;

public class OpenCSV {

	public static void main(String[] args) throws IOException{
		Scanner console = new Scanner(System.in);
		System.out.println("Which file would you like to read?");
		System.out.println("Edges and names) 1");
		System.out.println("Edges) 2");
		System.out.println("Nodes) 3 ");
		int choice = console.nextInt();
		if (choice == 1) {
			CSVReader reader = new CSVReader(new FileReader("Sample Network - Goncourt - Journals - Edges Names.csv"), '\t', '\'', 1);
		     String [] lineReader1;
		     while ((lineReader1 = reader.readNext()) != null) {
		        // nextLine[] is an array of values from the line
		        System.out.println(lineReader1[0]);
		     }
		}
		if (choice == 2) {  
	     CSVReader reader2 = new CSVReader(new FileReader("Sample Network - Goncourt - Journals - Edges.csv"), '\t', '\'', 1);
	     String [] lineReader2;
	     while ((lineReader2 = reader2.readNext()) != null) {
	        // nextLine[] is an array of values from the line
	        System.out.println(lineReader2[0]);
	     }
		}
		if (choice == 3) {
			CSVReader reader3 = new CSVReader(new FileReader("Sample Network - Goncourt - Journals - Nodes.csv"), '\t', '\'', 1);
		     String [] lineReader3;
		     while ((lineReader3 = reader3.readNext()) != null) {
		        // nextLine[] is an array of values from the line
		        System.out.println(lineReader3[0]);
		}
		}
	}

}
