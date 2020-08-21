package ukesoppgaver;

//kilder: https://no.wikipedia.org/wiki/Sorteringsalgoritme

public class Oppgave113_1 {

    //1. Et eksempel på en oppgave som kan løses på mange
    // forskjellige måter er det å sortere verdiene i en tabell.
    // Hvor mange sorteringsalgoritmer kjenner du til?
    // På Wikipedia finner du en oversikt over sorteringsalgoritmer.


    //BubbleSort / Boblesortering
    //Denne sorteringsalgoritmen brukes i pedagogisk sammenheng.
    //Algoritmen begynner først i datasettet og sammenlikner de to første elementene,
    //og dersom det første er større enn det andre, bytter de plass.
    //Svært effektiv algoritme, og kvadratisk økende datamengde.



    //Insertion sort / Innstikksortering
    //Den går gjennom datasettet fra begynnelsen og år den finner et tall
    //som ikke står i rekefølge, tas det ut, de sorterte elementene som skal stå
    //etter forskyves ett trinn til høyre og tallet settes inn på riktig plass.
    //Kvadratisk tidsbruk, men effektiv på små datamengder.



    //Shell-sortering er en forbedret variant av innstikksortering. Denne
    //algoritmen tar utgangspunkt i å sortere fra den ene siden i "gap".
    //Den kan begynne med gap like store som halve datasettet, som gir to operasjoner i
    //første runde. Deretter deler den det inn i fire operasjoner. Den fortsetter slik med å
    //dele opp helt til gapene blir mindre og mindre. Til slutt går den gjennom
    //alle tallene.



    //Flettesortering / Merge sort
    //I denne sorteringsalgoritmen deles datasettet opp helt til det bare er ett tall i hver del.
    //Deretter tar den to og to deler, sammenlikner de laveste ubrukte tallene og henter det tallet som er lavest.
    //Tallene lastes over i nye delsett, og disse flettes også helt til man bare har ett datasett.



    //Haugsortering / Heap sort
    //Denne metoden bruker datastrukturen "heap" til å organisere elementene som skal sorteres.
    //Algoritmen setter elemetene inn i et komplett binært tre. Første fase av algoritmen
    //ordner treet slik at alle nodene er større enn eller lik nodene under. Deretter hentes
    //største element ut og slettes og treet rettes opp. Det viktigste fortrinnet til
    //heapsort er at den har en konstant kjøretid på O(n log n), også i dårlige tilfeller.
    //Derfor er den egnet i datasystemer der en kan risikere forsinkelser. Det er vanskelig
    //å kjøre flere prosesser parallelt, der man ikke får noen fordel av å bruke mange prosesser.

    //Quick sort
    //Splitt og hersk-teknikk, der den velger en pivot, et tilfeldig tall x, i datasettet og sortere
    //settet i tre deler. En del av tallene som er mindre enn x, en del for de som er like store,
    //og en del for dem som er større. Deretter gjentas operasjonen på de tallene som var
    //større og de tallene som var mindre, helt til alt er sortert og de ka settes opp i
    //rekkefølge. Bygger på rekursjon, og har gjennomsnittlig tidsbruk på O(n log n), kan i verste fall
    //bruke O(n^2). Ikke spesielt effektiv på små datasett, men er ellers nyttig.

    //Bøttesortering / Bucket sort
    //
}
