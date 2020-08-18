package ukesoppgaver;

public class Oppgave112_3 {

    private static int highestNumb(int[] liste){
        int highest = 0;
        for(int i = 0; i < liste.length; i++){
            if(liste[i] >= liste[highest]){
                highest = i;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        int[] heltallsliste = {28,4,17,10,6,30,1,11,15,3,18,9,2,7,19};
        System.out.println("Posisjon til høyeste tall i listen: " + Oppgave112_3.highestNumb(heltallsliste));
    }
}
