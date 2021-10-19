import java.util.*;

// * Le {} non servono se ho una sola istruzione *

public class InsertSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Inizializzazione array
        System.out.print("Array length: ");
        int[] array = new int[scanner.nextInt()];
        for(int i = 0; i < array.length; i++)
            array[i] = 0;   // *
        
        // Creazione array + Insert sort
        for(int i = 0; i < array.length; i++){
            
            // Random input (Può essere sostituito con user input [ scanner.nextInt(); ])
            int input = random.nextInt(100);
            int k = 0;
            
            // Trovo la cella destinazione del mio input
            while(input > array[k] && array[k] != 0)
                k++;   // *
            
            // Shift valori verso destra
            for(int j = array.length - 1; j > k; j--)
                array[j] = array[j - 1];   // *
            
            // Do il valore input alla mia cella destinazione
            array[k] = input;
        }
        
        // Print
        for(int p : array)
            System.out.print(p + " ");   // *
        System.out.println();
    }
}
