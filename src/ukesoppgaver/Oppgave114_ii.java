package ukesoppgaver;

public class Oppgave114_ii {
    private static int maks(int[] liste){
        int indeks = 0;   // 1
        int maxValue = liste[0];  //1 + 1

        for(int i = 1; i < liste.length; i++){  // 1 + n + (n-1)
            if(liste[i] > maxValue){ // 1 + (n-1)
                maxValue = liste[i]; // x denne er dataavhengig
                indeks   = i; //x denne er avhengig av den over
            }
        }
        return indeks;
    }

    //51

    //blir en likning: 2 + 3n + 2x = 2 + (3 * 10) + (2 * 9) = 50 ???

    public static void main(String[] args) {
        int[] liste = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Dette er indeksen til det største tallet: " +
                Oppgave114_ii.maks(liste));
    }
}
