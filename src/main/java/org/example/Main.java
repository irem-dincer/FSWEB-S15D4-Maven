package org.example;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1: " + checkForPalindrome("I did , did I?"));
        System.out.println("Test 2: " + checkForPalindrome("Racecar"));
        System.out.println("Test 3: " + checkForPalindrome("Say my name!"));

        System.out.println("**************************");

        System.out.println(convertDecimalToBinary(29));
        System.out.println(convertDecimalToBinary(10));


    }
    public static boolean checkForPalindrome(String text) {
        System.out.println("Input: " + text); // Debug

        String cleanText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println("Cleaned: " + cleanText); // Debug

        LinkedList<Character> charList = new LinkedList<>();

        for(char c : cleanText.toCharArray()) {
            charList.add(c);
        }

        System.out.println("CharList: " + charList); // Debug

        while(charList.size() > 1) {
            Character first = charList.pollFirst();
            Character last = charList.pollLast();
            System.out.println("Comparing: " + first + " vs " + last); // Debug

            if(!first.equals(last)) {
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int number){
        LinkedList<Integer> binaryList= new LinkedList<>();

        while (number>0){
int remainder=number%2;
binaryList.addFirst(remainder);
number=number/2;

        }
        StringBuilder binaryString=new StringBuilder();
        for(int digit:binaryList){
           binaryString.append(digit);
        }
        return  binaryString.toString();

    }



}