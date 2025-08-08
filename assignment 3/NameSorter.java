

import java.util.Arrays;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number of names");
            int n = scanner.nextInt();
            scanner.nextLine();
            
            String names[] = new String[n];
            System.out.println("Enter the names");
            for(int i=0;i<n;i++){
                names[i] = scanner.nextLine();
            }
            Arrays.sort(names);
            
            System.out.println("Sorted list");
            for(String name : names){
                System.out.println(name);
            }
        }
    }
}
