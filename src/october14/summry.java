package com.october14;

import java.util.*;

public class summry {

    // Method to calculate word frequencies
    public static Map<String, Integer> calculateWordFrequencies(String[] words) {
        Map<String, Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); // Ignore case
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove punctuation
            if (!word.isEmpty()) {
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }
        return wordFreq;
    }

    // Method to score sentences based on word frequencies
    public static Map<String, Double> scoreSentences(String[] sentences, Map<String, Integer> wordFreq) {
        Map<String, Double> sentenceScores = new HashMap<>();
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            double score = 0.0;

            for (String word : words) {
                word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                if (wordFreq.containsKey(word)) {
                    score += wordFreq.get(word);
                }
            }
            sentenceScores.put(sentence, score / words.length); // Normalize by sentence length
        }
        return sentenceScores;
    }

    // Method to generate summary from the top-scoring sentences
    public static String generateSummary(Map<String, Double> sentenceScores, int numSentences) {
        List<Map.Entry<String, Double>> sortedSentences = new ArrayList<>(sentenceScores.entrySet());
        
        // Sort sentences by score in descending order
        sortedSentences.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        StringBuilder summary = new StringBuilder();
        for (int i = 0; i < Math.min(numSentences, sortedSentences.size()); i++) {
            summary.append(sortedSentences.get(i).getKey()).append(". ");
        }
        return summary.toString();
    }

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text you want to summarize:");
        String inputText = scanner.useDelimiter("\\A").next(); // Take full text as input
        
        // Close the scanner after reading input
        scanner.close();

        // Step 1: Tokenize the text into sentences
        String[] sentences = inputText.split("\\. "); // Splitting sentences by period
        
        // Step 2: Tokenize the text into words
        String[] words = inputText.split("\\s+"); // Splitting by spaces

        // Step 3: Calculate word frequencies
        Map<String, Integer> wordFreq = calculateWordFrequencies(words);

        // Step 4: Score sentences based on word frequencies
        Map<String, Double> sentenceScores = scoreSentences(sentences, wordFreq);

        // Step 5: Generate summary (e.g., 2 sentences)
        String summary = generateSummary(sentenceScores, 2);

        // Output the summary
        System.out.println("\nSummary:");
        System.out.println(summary);
    }
}

