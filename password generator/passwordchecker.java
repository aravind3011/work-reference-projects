import java.util.*;

public class z {

    static String password_strength(String password) {
        int strength = 0;
        if (password.length() >= 8) {
            strength += 1;
        }
        if (password.matches(".*[A-Z].*")) {
            strength += 1;
        }
        if (password.matches(".*[a-z].*")) {
            strength += 1;
        }
        if (password.matches(".*[0-9].*")) {
            strength += 1;
        }
        if (password.matches(".*[!@#$%^&*()_+-/.,<>?;':\"{}\\|`~].*")) {
            strength += 1;
        }
        if (strength == 1) {
            return "Very Weak";
        } else if (strength == 2) {
            return "Weak";
        } else if (strength == 3) {
            return "Medium";
        } else if (strength == 4) {
            return "Strong";
        } else if (strength == 5) {
            return "Very Strong";
        }
        return "Very Weak";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your password: ");
        String password = sc.nextLine();
        sc.close();

        // calling the function to check password strength
        System.out.println("Password Strength: " + password_strength(password));
    }
}