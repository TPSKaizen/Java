package SectionFive;

import java.util.Arrays;

public class SentimentAnalyzer {
    // Tip: labeled continue can be used when iterating featureSet + convert review
    // to lower-case
    public static int[] detectProsAndCons(String review, String[][] featureSet, String[] posOpinionWords,
            String[] negOpinionWords) {
        int[] featureOpinions = new int[featureSet.length]; // output

        // your code ~ you will be invoking getOpinionOnFeature
        backToTop: for (int i = 0; i < featureSet.length; i++) {
            for (int j = 0; j < featureSet[i].length; j++) {
                if (review.contains(featureSet[i][j])) {
                    featureOpinions[i] = getOpinionOnFeature(review, featureSet[i][j], posOpinionWords,
                            negOpinionWords);
                    continue backToTop;
                }
            }
        }

        return featureOpinions;
    }

    // First invoke checkForWasPhrasePattern and
    // if it cannot find an opinion only then invoke checkForOpinionFirstPattern
    private static int getOpinionOnFeature(String review, String feature, String[] posOpinionWords,
            String[] negOpinionWords) {

        // your code
        if (checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords) == 0)
            return checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords);
        else
            return checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords);
    }

    // Tip: Look at String API doc. Methods like indexOf, length,
    // substring(beginIndex), startsWith can come into play
    // Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
    // You can first look for positive opinion. If not found, only then you can look
    // for negative opinion
    private static int checkForWasPhrasePattern(String review, String feature, String[] posOpinionWords,
            String[] negOpinionWords) {
        int opinion = 0;
        String pattern = feature + " was ";

        // your code
        StringBuilder str = new StringBuilder(pattern);
        for (String k : posOpinionWords) {
            if (review.toLowerCase().contains(str.append(k).toString())) {
                opinion++;
            }
            str.delete(pattern.length(), str.length());
        }

        if (opinion == 0) {
            for (String k : negOpinionWords) {
                if (review.toLowerCase().contains(str.append(k).toString())) {
                    opinion--;
                }
                str.delete(pattern.length(), str.length());
            }
        }
        return opinion;
    }

    // You can first look for positive opinion. If not found, only then you can look
    // for negative opinion
    private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords,
            String[] negOpinionWords) {
        // Extract sentences as feature might appear multiple times.
        // split() takes a regular expression and "." is a special character
        // for regular expression. So, escape it to make it work!!
        String[] sentences = review.toLowerCase().split("\\.");
        int opinion = 0;
        StringBuilder sb = new StringBuilder();

        // your code for processing each sentence. You can return if opinion is found in
        // a sentence (no need to process subsequent ones)
        for (String k : posOpinionWords) {
            for (int i = 0; i < sentences.length; i++) {
                if (sentences[i].contains(sb.append(k).append(" ").append(feature))) {
                    opinion++;
                }
                sb.delete(0, sb.length());
            }
        }

        if (opinion == 0) {
            for (String k : negOpinionWords) {
                for (int i = 0; i < sentences.length; i++) {
                    if (sentences[i].contains(sb.append(k).append(" ").append(feature))) {
                        opinion--;
                    }
                    sb.delete(0, sb.length());
                }
            }
        }
        return opinion;
    }

    public static void main(String[] args) {
        String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive.";

        // String review = "Sorry OG, but you just lost some loyal customers. Horrible
        // service, no smile or greeting just attitude. The breadsticks were stale and
        // burnt, appetizer was cold and the food came out before the salad.";

        String[][] featureSet = { { "ambiance", "ambience", "atmosphere", "decor" },
                { "dessert", "ice cream", "desert" }, { "food" }, { "soup" },
                { "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };
        String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
                "delicious" };
        String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor" };

        int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);
        System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
    }
}
