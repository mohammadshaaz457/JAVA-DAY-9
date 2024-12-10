import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        
        // Check for the required character types
        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if ("!@#$%^&*()-+".indexOf(c) >= 0) {
                hasSpecial = true;
            }
        }
        
        // Count how many character types are missing
        int missingTypes = 0;
        if (!hasDigit) missingTypes++;
        if (!hasLower) missingTypes++;
        if (!hasUpper) missingTypes++;
        if (!hasSpecial) missingTypes++;
        
        // Ensure the password has at least 6 characters
        int requiredLength = Math.max(6 - n, missingTypes);
        
        return requiredLength;
    }

    public static void main(String[] args) {
        // Sample inputs
        System.out.println(minimumNumber(3, "Ab1"));       // Output: 3
        System.out.println(minimumNumber(11, "#HackerRank")); // Output: 1
    }
}
    // Return the minimum number of characters to make the password strong

    



public class password {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
