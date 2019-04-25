package array;

import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the number of employees ");
		int n = scan.nextInt();
		scan.nextLine();

		Emp[] e = new Emp[n];

		for (int i = 0; i < e.length; i++) {
			e[i] = new Emp();
			System.out.println("enter the id & name of employee " + (i + 1));
			e[i].setId(scan.nextInt());
			scan.nextLine();
			e[i].setName(scan.nextLine());
		}
/*
 *nested loop to save languages known by different employees and saving them using setter method
 * 
 */
		for (int j = 0; j < e.length; j++) {   											//outer loop for employee object
			
			System.out.println("enter the no. of languages for employee " + (j + 1));
			// System.out.println("Enter the no. of languages for employee ");
			String[] languages = new String[scan.nextInt()];
			scan.nextLine();
			for (int i = 0; i < languages.length; i++) {								//inner loop for languages values
				System.out.println("enter the language " + (i + 1));

				languages[i] = scan.nextLine();

			}
			e[j].setLanguages(languages);												//setting languages values for each employee
		}

		// for (int i = 0; i < e.length; i++) {
		// e[i].setLanguages(languages);
		// }
		// e.setLanguages(languages);
		
// RUN printVal() for each employee object		
		for (int i = 0; i < e.length; i++) {

			e[i].printVal();
		}

	}

}
