package ukesoppgaver;

//metode som returnerer den minste verdien i en liste
public class Oppgave112_1 {
    private static int minValue(int[] a){
        int minst = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < minst){
                minst = a[i];
            }
        }
        return minst;
    }


    //metode som returnerer indeksen til den minste verdien
    private static int minValuePosition(int[] b){
        int position = 0;
        for(int i = 1; i < b.length; i++){
            if(b[i] < b[position]){
                position = i;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] heltallsliste = {28,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        System.out.println("Minste verdien i tabellen: " + Oppgave112_1.minValue(heltallsliste));

        System.out.println("Indeks i tabellen: " + Oppgave112_1.minValuePosition(heltallsliste));

    }
}
