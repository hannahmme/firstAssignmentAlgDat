package ukesoppgaver;

public class Oppgave114_i {

    public static int maks(int[] liste){
        int largestIndex = 0;   // 1
        int largestValue = liste[0];  //1 + 1

        for(int i = 1; i < liste.length; i++){  //1 + n  + (n-1)
            if(liste[i] > largestValue){ // 1 * (n-1)
                largestValue = liste[i]; // x Dataavhengig
                largestIndex = i; // x Avhenger av den over
            }
        }
        return largestIndex;
    }

    //blir en likning på: 2 + 3n + 2x = 2 + (3 * 10) + (2 * 1) = 34

    public static void main(String[] args) {
        int[] heltallsliste = {10,5,7,2,9,1,3,8,4,6};
        System.out.println("Dette er indeksen til det største tallet: " +
                Oppgave114_i.maks(heltallsliste));
    }
}
