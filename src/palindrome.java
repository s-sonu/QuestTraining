 import java.util.Scanner;
 public class palindrome
 {
     public static void main(String[] args) {
        System.out.println("Enter a number: ");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int reversedNum = 0, remainder, originalNum;
     originalNum = num;
     while (num != 0) {
         remainder = num % 10;
         reversedNum = reversedNum * 10 + remainder;
         num = num/10;
     }

     if (originalNum == reversedNum) {
         System.out.println(originalNum + " is a Palindrome.");
     } else {
         System.out.println(originalNum + " is not a Palindrome.");
     }
 }
 }


