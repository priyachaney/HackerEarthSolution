import java.util.Scanner;
public class FavoriteSinger {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // Read the number of songs in the playlist
       int n = scanner.nextInt();
       // Create an array to store the singers of each song
       int[] singers = new int[n];
       // Read the singers of each song
       for (int i = 0; i < n; i++) {
           singers[i] = scanner.nextInt();
       }
       // Find the most popular singer
       int mostPopularSingerCount = 0;
       for (int i = 0; i < n; i++) {
           int singerCount = 0;
           for (int j = 0; j < n; j++) {
               if (singers[i] == singers[j]) {
                   singerCount++;
               }
           }
           if (singerCount > mostPopularSingerCount) {
               mostPopularSingerCount = singerCount;
           }
       }
       // Print the most popular singer count
       System.out.println(mostPopularSingerCount);
   }
}
