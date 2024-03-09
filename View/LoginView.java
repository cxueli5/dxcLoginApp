package View;

import java.util.Scanner;

public class LoginView {
    private Scanner scanner;

    public LoginView() {
        scanner = new Scanner(System.in);
    }
    
    public String usernameInput() {
        System.out.println("Enter username: ");
        return scanner.nextLine();
    }

    public String passwordInput() {
        System.out.println("Enter password: ");
        return scanner.nextLine();
    }

    public String nameInput() {
        System.out.println("Enter name: ");
        return scanner.nextLine();
    }

    public String roleInput() {
        System.out.println("Enter role: ");
        return scanner.nextLine();
    }

    public void displayErrorMsg() {
        System.out.println("Invalid username or password. Please try again.");
    }
}
