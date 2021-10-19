import java.util.*;


public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Inizializzazione array con length data da user input
        System.out.print("Array lenght: ");
        int[] array = new int[scanner.nextInt()];
        
        // Popolamento array con valori random tra 0 e 100
        for(int i = 0; i < array.length; i++) 
            array[i] = random.nextInt(100);
        
        // Print array
        System.out.println("\n- array non ordinato -");
        for(int x : array) 
            System.out.print(x + " ");
        System.out.println("\n");
        
        // Bubble sort - optimized
        boolean done;
        int i = 0;        
        do{
            done = true;
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]){  
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    done = false;                                    
                }
            }
            i++;
        }while(done == false);
        
        // Print array
        System.out.println("- array ordinato -");
        for(int x : array) 
            System.out.print(x + " ");
        System.out.println();
    }   
}
