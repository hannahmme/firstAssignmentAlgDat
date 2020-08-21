package ukesoppgaver;

import java.util.Arrays;

public class Oppgave113_5 {
    private static int[] minmaks(int[] a){
        int bigposition = 0;
        int minposition = 0;

        for(int i = 1; i < a.length; i++ ){
            if(a[i] > a[bigposition]){
                bigposition = i;
            }
            if(a[i] < a[minposition]){
                minposition = i;
            }
        }
        return new int[]{bigposition, minposition};
    }

    public static void main(String[] args) {
    int[] list = {20,1000};
        System.out.println(("Det største tallet står på indeks: " + Arrays.toString(Oppgave113_5.minmaks(list))));
        System.out.println("Det bakerste tallet sier hvilken indeks det minste tallet står på");
    }
}

