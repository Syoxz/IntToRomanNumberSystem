import java.util.HashMap;
import java.util.Scanner;

public class RomanNumberSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean end  = false;
			System.out.println("Type \"quit\" for quitting the program.");
			System.out.println("Enter your roman numbers!");
			while (end == false) {
				String s = scan.nextLine();
				if (s.equals("quit")) {
					System.out.println("Bye");
					break;
				}
					int conv = converter(s);
					if (conv == -1) {
						System.out.println("Your input doesn't fit the roman number system!");
						System.out.println("Enter your roman numbers!");
					}
					else {
						System.out.println(conv);
						System.out.println("Enter your roman numbers!");
					}
			}
			scan.close();
		} 
public static int converter (String s) {
	HashMap <Character, Integer> map = new HashMap <>();
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C', 100);
	map.put('D', 500);
	map.put('M', 1000);
	try {
	int number = map.get(s.charAt(s.length()-1));
	for (int i = 0; i < s.length()-1; i++) {
		if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
			number -= map.get(s.charAt(i));
		}
		else {
			number += map.get(s.charAt(i));
		}
	}
	return number;
	}
	catch (Exception E){
		return -1;
		
	}
	
}
	
	
}
