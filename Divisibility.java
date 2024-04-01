/*You are provided an array of size N that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by 
Sample Input Format: 
5 
85 25 65 21 84


Output 
No */ 



import java.util.*;

public class TestClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array_num = new int[n];
        
        for (int i = 0; i < n; i++){
            array_num[i] = scanner.nextInt();
        }
        
        for(int i =0; i<n ; i++){
            if (array_num[i] < 0){
                System.out.println("Number should be positive");
            }
        }
        
        if ((array_num[n-1] < 10) && (array_num[n-1] == 0)) {
            System.out.println("Yes");
            return;
        }
        
        else if ((array_num[n-1] >= 10) && (array_num[n-1] % 10 == 0)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
