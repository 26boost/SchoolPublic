import java.util.*;


public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Inizializzazione array con length data da user input
        System.out.print("Array lenght: ");
        int[] array = new int[scanner.nextInt()];
        
        // Popolamento array con valori random tra 0 e 100
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        
        // Print array
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Bubble sort
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                  
                    // Swap valori
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        // Print array
        for(int i : array){
            System.out.print(i + " ");
        }
    }   
}
