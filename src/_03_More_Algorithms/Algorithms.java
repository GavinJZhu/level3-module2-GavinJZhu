package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        int product = num1 * num2;
        return num1+" x "+num2+" = "+product;
    }
    public static Boolean isPrime(int num) {
        for (int i = 2; i<num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static Boolean isSquare(double num) {
        if (num == 1){
            return true;
        }
        for (int i = 1; i<num; i++){
            if (num/i == i){
                return true;
            }
        }
        return false;
    }
    public static Boolean isCube(double num) {
        if (num == 1){
            return true;
        }
        for (int i = 1; i<num; i++){
            if ((num/i)/i == i){
                System.out.println(num+", "+i);
                return true;
            }
        }
        return false;
    }

    public static int findBrokenEgg(List<String> eggs) {
        for (int i=0; i<eggs.size(); i++){
            if (eggs.get(i) == "cracked"){
                return i;
            }
        }
        return -1;
    }
    public static int countPearls(List<Boolean> oysters) {
        int hasPearl = 0;
        for (int i=0; i<oysters.size(); i++){
            if (oysters.get(i)){
                hasPearl+=1;
            }
        }
        return hasPearl;
    }
    public static double findTallest(List<Double> people) {
        Double tallestHeight = 0.0;
        for (int i=0; i<people.size(); i++){
            if (people.get(i)>tallestHeight){
                tallestHeight = people.get(i);
            }
        }
        return tallestHeight;
    }
    public static String findLongestWord(List<String> words) {
        String longestWord = "hi";
        for (int i=0; i<words.size(); i++){
            if (words.get(i).length()>longestWord.length()){
                longestWord = words.get(i);
            }
        }
        return longestWord;
    }
    public static Boolean containsSOS(List<String> morseMessage) {
        for (int i=0; i<morseMessage.size(); i++){
            if (morseMessage.get(i) == "... --- ..."){
                return true;
            }
        }
        return false;
    }
    public static List<Double> sortScores(List<Double> unsortedScores) {
        for (int i = 0; i < unsortedScores.size(); i++) {
            for (int j = 0; j < unsortedScores.size()-1; j++) {
                if (unsortedScores.get(j) > unsortedScores.get(i)){
                    double temp = unsortedScores.get(j);
                    unsortedScores.set(j, unsortedScores.get(i));
                    unsortedScores.set(i, temp);
                }
            }
        }
        return unsortedScores;
    }













    public static List<String> sortDNA(List<String> strands){
        for (int i = 0; i < strands.size(); i++) {
            for (int j = 0; j < strands.size()-1; j++) {
                if (strands.get(i).length()>strands.get(j).length()){

                }
            }
        }

        return strands;
    }
}
