import java.util.Scanner;

class TestClass {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int countz = 0;
        int counto = 0;

        if (name.length() > 20) {
            System.out.println("Name should not exceed 20 characters.");
            return; // Exit the program
        }

        for (int i = 0; i< name.length(); i++){
            char ch = name.charAt(i);
            if (ch == 'z') {
                countz++;
                
            }
            if (ch == 'o') {
                counto++;
            }

        }

        if (2 * countz == counto) {
            System.out.println("Yes");
        }
            else{
                System.out.println("No");
                
            }

        countz = 0;
        counto = 0;

    }
}
