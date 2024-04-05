// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class TestClass {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int numCases = Integer.parseInt(scanner.nextLine());
        for (int t = 0; t < numCases; t++) {
        String[] cost = scanner.nextLine().split(" ");
        int cost_green = Integer.parseInt(cost[0]);
        int cost_purple = Integer.parseInt(cost[1]);
        
        
        int num = Integer.parseInt(scanner.nextLine());
        int [][] arr2 = new int[num][2];
        for (int i =0; i<num; i++ ) {
            String[] scoreStr = scanner.nextLine().split(" ");
            arr2[i][0] = Integer.parseInt(scoreStr[0]);
            arr2[i][1] = Integer.parseInt(scoreStr[1]);
        }

        //System.out.println(cost_green);
        //System.out.println(cost_purple);
        //System.out.println(num);
        
        
        //execution , (a) finding the lesser cost
        int min_cost = 0;
        int max_cost = 0;
        int score_first = 0;
        int score_sec = 0;
        int total_cost = 0;
        if (cost_green >= cost_purple){
            min_cost = cost_purple;
            max_cost = cost_green;
        } else {
            min_cost = cost_green;
            max_cost = cost_purple;
        }
        
        //execution, (b) finding the lesser score between 2 question
        for (int i = 0; i<num; i++){
            if ((arr2[i][0]) == 1) {
                score_first++;
            }
            if (arr2[i][1] == 1){
                score_sec++;
            }
        //System.out.println(arr2[i][0] + " " + arr2[i][1]);
        }
        
        if (score_first >= score_sec){
            total_cost = ((score_first * min_cost) + (score_sec * max_cost));
             System.out.println(total_cost);
        } else {
            total_cost = ((score_sec * min_cost) + (score_first * max_cost));
             System.out.println(total_cost);
        }
        
        
        }

    }
}
