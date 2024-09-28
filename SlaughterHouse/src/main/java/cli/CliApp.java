package cli;

import java.util.Scanner;

public class CliApp {

	private Actions actions;

	public CliApp() {
		actions = new Actions();
	}

	public void start() {
		String input = "";
		while (!input.equals("10")) {
			renderMenu();
			Scanner scanner = new Scanner(System.in);
			handleInput(scanner.nextLine());
		}
	}

	public boolean validateInput(String input) {
		try {
			int inputAsInt = Integer.parseInt(input);
			if (inputAsInt > 0 && inputAsInt <= 10) {
				return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}
		return false;
	}

	public void renderMenu() {
		System.out.println("Welcome to the Slaughter House CLI!");
		System.out.println("1. Add register");
		System.out.println("2. Add part");
		System.out.println("3. Add tray");
		System.out.println("4. Get part");
		System.out.println("5. Get register");
		System.out.println("6. Get registers");
		System.out.println("7. Get tray");
		System.out.println("8. Get parts from register");
		System.out.println("9. Get parts from tray");
		System.out.println("10. Exit");
		System.out.println("Choose an option:");
	}

	public void handleInput(String input) {
		if (!validateInput(input)) System.out.println("Invalid input! Please enter a number between 1 and 9!");
		int inputAsInt = Integer.parseInt(input);
		String output = "";
		switch (inputAsInt) {
			case 1:
				output = this.actions.addRegister();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				output = this.actions.getRegisters();
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
		}
		System.out.println(output);
		System.out.println("Press enter to continue...");
		Scanner scanner = new Scanner(System.in);
	}
}
