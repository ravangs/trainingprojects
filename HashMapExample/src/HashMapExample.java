import java.util.HashMap;
import java.util.Scanner;


public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<String,String> employee = new HashMap<String,String>();
		
		employee.put("E1234", "Steve Job");
		employee.put("E2345", "Bill Gates");
		employee.put("E3456", "Larry Ellison");
		employee.put("E4567", "Jeff Bezos");
		employee.put("E8765", "Mark Zuckerberg");
		employee.put("E6789", "Larry Page");
		
		Scanner scanner = new Scanner(System.in);
		
		String employeeIdInput;
		
		while(true) {
			employeeIdInput = (String) scanner.next();
			if(Integer.parseInt(employeeIdInput) == 0) {
				scanner.close();
				System.exit(0);
			}
			System.out.println(employee.get(employeeIdInput));
		}
		
		
	}
	
}
