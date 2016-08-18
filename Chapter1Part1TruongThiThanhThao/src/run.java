import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class run {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Equation e = new Equation();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter a: ");
		int a = Integer.parseInt(input.readLine());
		System.out.println("Enter b: ");
		int b = Integer.parseInt(input.readLine());
		e.calculate(a, b);
		}catch(NumberFormatException | IOException ex){
			System.out.println("Error: "+ex.toString());
			
		}
		
	}

}
