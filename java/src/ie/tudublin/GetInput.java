package ie.tudublin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("This is Scanner taking input using nextLine(): ");
		String input = sc.nextLine();
		System.out.println("\nThis is the scanned input: " + input);
		System.out.print("\nThis is Scanner taking input using next(): ");
		input = sc.next();
		System.out.println("\nThis is the scanned input: "+ input);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nThis is BufferedReader taking input: ");
		try {
			input = br.readLine();
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nThis is the input read from BufferReader:" + input);
		
		
		sc.close();
		try {
			br.close();
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}