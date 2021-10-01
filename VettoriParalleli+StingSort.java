
package test;
import java.util.Scanner;


// VETTORI PARALLELI
public class Test {

    // programma che permetta al docente di memorizzare cognome, voto di Informatica, voto di Matematica per ogni alunno
    // inserita una lettera si deve stampare il cognome degli alunni e la somma dei voti degli alunni con il cognome che inizia con quella lettera
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Numero studenti
        System.out.print("Numero studenti: ");
        int nStudenti = scanner.nextInt();
        
        // Dichiarazione dei 3 array
        String[] cognomi = new String[nStudenti];
        int[] votoInfo = new int[nStudenti];
        int[] votoMate = new int[nStudenti];
        
        // Raccolta dati
        for(int i = 0; i < nStudenti; i++){
            System.out.println("----------------------");
            System.out.print("Cognome studente " + (i + 1) + ": ");
            cognomi[i] = scanner.next();
            System.out.print("voto Info - " + cognomi[i] + ": ");
            votoInfo[i] = scanner.nextInt();
            System.out.print("voto Mate - " + cognomi[i] + ": ");
            votoMate[i] = scanner.nextInt();
        }        
        System.out.println("----------------------");
        
        // Sorting cognomi in ordine alfabetico
        for(int i = 0; i < nStudenti - 1; i++){                         // Considero il [i] della lista che rimane costante mentre il [j] aumenta partendo per ogni loop da j = i + 1
            for(int j = i + 1; j < nStudenti; j++){                     // In questo modo il valore "minore" viene spostato ad index 0 già al primo loop,
                if(cognomi[i].compareToIgnoreCase(cognomi[j]) > 0){     // il secondo più "piccolo" ad index 1 al secondo loop etc..
                    
                    // Valori temporanei
                    String tempCognomi = cognomi[i];
                    int tempInfo = votoInfo[i];
                    int tempMate = votoMate[i];
                    
                    // Sostituzione [i] con [j]
                    cognomi[i] = cognomi[j];
                    votoInfo[i] = votoInfo[j];
                    votoMate[i] = votoMate[j];
                    
                    // Sostituzione [j] con temp
                    cognomi[j] = tempCognomi;
                    votoInfo[j] = tempInfo;
                    votoMate[j] = tempMate;
                }
            }
        }
        
        // Print dati inseriti in ordine
        for(int i = 0; i < nStudenti; i++){
            System.out.println(cognomi[i] + ": " + "votoInfo = " + votoInfo[i] + ", votoMate = " + votoMate[i]);
        }
        System.out.println();
        
        // Raccolta iniziale cognome etc.
        System.out.print("Iniziale nome studente: ");
        char L = scanner.next().charAt(0);
        for(int i = 0; i < nStudenti; i++){
            if(cognomi[i].charAt(0) == L){
                System.out.println("Studente: " + cognomi[i] + " - Somma voto mate e info: " + (votoInfo[i] + votoMate[i]) + " (" + votoInfo[i] + ", " + votoMate[i] + ")");
            }
        }
    }
}
