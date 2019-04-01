import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class myProgam {

	public static void main(String[] args) throws IOException, NullPointerException {
		Scanner scan = new Scanner(System.in);
		String inputFilePath = "";
		System.out.println("Please enter the file path:");
		inputFilePath = scan.nextLine();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(inputFilePath));
			System.out.println("File found");
		} catch (FileNotFoundException e) {
			System.out.println("No such file exists at that path.");
		}

		String allText = "";
		String currLine;
		while ((currLine = br.readLine()) != null) {
			allText += currLine + "\n";
		}

		DirectedGraph dg = new DirectedGraph(new NodePairSet(allText));

		System.out.println("PLease enter a search type");
		SearchType searchType = SearchType.stringToEnum(scan.nextLine());
		if (searchType != SearchType.INVALID) {

			int startValue = 0;
			int endValue = 0;

			System.out.println("Please enter a start value");
			startValue = Integer.parseInt(scan.nextLine());
			if (searchType == SearchType.PATH) {
				System.out.println("Please enter an end value");
				endValue = Integer.parseInt(scan.nextLine());
			}

			ArrayList<Integer> order = dg.traverse(searchType, startValue, endValue);

			if (order != null) {
				System.out.println("Here's the order:");
				for (int i = 0; i < order.size(); i++) {
					System.out.print(order.get(i) + (i == order.size() - 1 ? "" : ", "));
				}
			}
			else {
				System.out.println("No such traversal exists");
			}
		}
		else {
			System.out.println("PLease enter a valid search type.");
		}
	}

}
