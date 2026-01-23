package streams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCountTopFive {

    public static void main(String[] args) {

        String filePath = "input.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Step 1: Read file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase & remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word,
                                wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            return;
        }

        // Step 2: Sort words by frequency
        List<Map.Entry<String, Integer>> wordList =
                new ArrayList<>(wordCountMap.entrySet());

        wordList.sort((e1, e2) ->
                e2.getValue().compareTo(e1.getValue()));

        // Step 3: Display top 5 frequent words
        System.out.println("Top 5 most frequent words:");
        int count = 0;

        for (Map.Entry<String, Integer> entry : wordList) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
            count++;
            if (count == 5) break;
        }
    }
}
