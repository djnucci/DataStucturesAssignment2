import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class myProgam {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		String inputFilePath = "";
		System.out.println("Please enter the file path:");
		inputFilePath = scan.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
		
		
	}

}
