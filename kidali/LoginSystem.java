import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "12345";
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        boolean success = false;

        while(attempts < 3) {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();  // simulate * manually

            // Display password as stars
            String hidden = "*".repeat(password.length());
            System.out.println("You entered password: " + hidden);

            if(username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful!");
                success = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect credentials. Attempts left: " + (3 - attempts));
            }
        }

        if(!success) {
            System.out.println("Account locked. Too many failed attempts.");
        }

        sc.close();
    }
}

    

