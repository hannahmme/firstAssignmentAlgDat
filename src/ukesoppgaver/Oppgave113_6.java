package ukesoppgaver;

public class Oppgave113_6 {
    private static long faculty(int number){
        long total = 1;
        long facultynumber;

        for(int i = number; i > 0; i--) {
            if (i % 2 != 0) {
                for (int j = number; j > 2; j--) {
                    facultynumber = j * (j - 1);
                    j--;

                    total = total * facultynumber;
                }
            } else {
                facultynumber = i * (i - 1);
                i--;

                total = total * facultynumber;
            }
        }
        return total;
    }

    // 4*3*2*1

    private static long test(int number){
        long facultynumber;
        long total = 1;
        if(number % 2 == 0) {
            for (int i = number; i > 0; i--) {
                facultynumber = i * (i - 1);
                total = total * facultynumber;
                i--;
            }
        }else{
            for(int j = number; j > 1; j--){
                facultynumber = j * (j - 1);
                total = total * facultynumber;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(Oppgave113_6.faculty(4));
        System.out.println("Dette er oppgave test: " + Oppgave113_6.test(5));
    }
}
