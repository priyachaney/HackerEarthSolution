/* Solution to Hacker earth Number of Steps : You are given two arrays and a1,a2...an and b1,b2...bn. In each step, you can set if ai = ai - bi, if ai>= bi.
Determine the minimum number of steps that are required to make all a's equal.
Input format:
First line: n
Second line: a1,a2..an 
Third line: b1,b2..bn

Output format:
Print the minimum number of steps that are required to make all 
's equal. If it is not possible, then print -1. */

import java.util.*;
import java.io.*;
public class Testclass{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++){
            arr1[i] = scanner.nextInt();
        }
         for (int i = 0; i < n; i++){
            arr2[i] = scanner.nextInt();
        }
        
        
        //find smallest number
        int smallestNumber = arr1[0];
        int steps = 0;
        for (int i=1; i < n; i++){
            if (smallestNumber > arr1[i]) {
                smallestNumber = arr1[i] - arr2[i];
            }
        }
        
        for (int i=0; i<n; i++){
            if ((arr2[i] > arr1[i]) || (arr1[i] < 0)) {
                System.out.println("-1");
                return;
            }
            
            else if (arr1[i] == smallestNumber) {continue;}
            else {
                double eachStep = 0;
                eachStep = ((arr1[i] - smallestNumber)/(double) arr2[i]);
                if (Math.floor(eachStep) != eachStep){
                    //System.out.println(smallestNumber + " " + eachStep + " " + arr1[i] + " " + arr2[i]);
                    System.out.println("-1");
                    return;
                }
                steps += Math.round(eachStep);
            }
            
            
        }
        System.out.println(steps);
        
        
        
        
    }

    
}
