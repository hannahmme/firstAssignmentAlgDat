package ukesoppgaver;

import java.util.Arrays;

public class Oppgave115_1 {
    public static int maks(int[] inlist){
        int last = inlist.length - 1; 
        int maxIndex = 0;
        int maxValue = inlist[0];
        int temporary = inlist[last];
        inlist[last] = 0x7fffffff;

        for(int i = 0; ; i++){
            if(inlist[i] >= maxValue){
                if(i == last){
                    inlist[last] = temporary;
                    return temporary >= maxValue ? last : maxValue;
                }else{
                    maxValue = inlist[i];
                    maxIndex = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {0};
        System.out.println("Nå er vi i Oppgave 115_1: " + Oppgave115_1.maks(list));
    }
}
