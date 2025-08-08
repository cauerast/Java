package studies.FLX.Main;

import java.util.Scanner;

public class SubdstringsMthod {
    public static void main(String[] args) {

        // .subdstring() = A method usd to extract a portion of a string
        // .substring(start, end);

        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your email: "); // ex: caue123@FLX.com
            String email = scanner.nextLine();
        scanner.close();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("\n" + email + "\n");
            System.out.println("username: " + username);
            System.out.println("domain: " + domain);
        }
        else {
            System.out.println("Please enter a valid email!");
        }

    }
}
