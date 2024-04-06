/*
1 - 2
2 - 5
3 - 5
4 - 4
5 - 5
6 - 6
7 - 3
8 - 7
9 - 6
0 - 6 */

import java.util.*;
public class TestClass {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int TC = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j<TC; j++){
        String Input = scanner.nextLine();
        char[] Characters = Input.toCharArray();
        
        //Calculate number of sticks
        int sticks = 0;
        for (int i = 0; i < Characters.length; i++){
            char c = Characters[i];
            //int numericValue = Character.getNumericValue(c);
            //System.out.println(c);
            
            if (c == '1'){
                sticks = 2 + sticks;
            } else if ((c == '2') || (c == '3') || (c == '5')) {
                sticks = 5 + sticks;
            } else if (c == '4') {
                sticks = 4 + sticks;
            } else if ((c == '6') || (c == '9') || (c == '0')){
                sticks = 6 + sticks;
            } else if (c == '7') {
                sticks = 3 + sticks;
            } else if (c == '8'){
                sticks = 7 + sticks;
            }
        }
        //System.out.println(sticks);
        
        
        if (sticks % 2 == 0){
            int quot = sticks / 2;
            for (int i = 0; i < quot ; i++){
                System.out.print("1");

            }
            System.out.println("");
        } else {
            int quot = sticks / 2;
            System.out.print("7");
            for (int i = 1; i<quot; i++){
                 System.out.print("1");
            }
            System.out.println("");
        }
        //System.out.println("");
    }
}
}
