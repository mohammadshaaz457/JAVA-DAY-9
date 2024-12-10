import java.util.HashMap;
import java.util.Map;

public class repchar {

    public static void main(String[] args) {
        String input = "abcaabbccccd";
        char result = findMostRepeatedCharacter(input);
        System.out.println("Most repeated character: " + result);
    }

    public static char findMostRepeatedCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostRepeatedChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostRepeatedChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostRepeatedChar;
    }
}
