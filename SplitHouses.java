import java.util.*;

public class TestClass {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Read the number of characters
        String line = scanner.next(); // Read the second line containing characters as a string
        String modifiedLine = line.replace('.', 'B');
        
        //Check if any houses are together, in this case, eliminate it first as borders wont be built.
        if (line.contains("HH")){
           System.out.println("NO");
       } else {
           System.out.println("YES");
           System.out.println(modifiedLine);
       }

    }
}
