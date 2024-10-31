import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        String user = System.getProperty("user.dir");

        String arq_aleatorio100 = "/Dados/aleatorio_100.csv";
        String arq_aleatorio1000 = "/Dados/aleatorio_1000.csv";
        String arq_aleatorio10000 = "/Dados/aleatorio_10000.csv";

        String arq_crescente100 = "/Dados/crescente_100.csv";
        String arq_crescente1000 = "/Dados/crescente_1000.csv";
        String arq_crescente10000 = "/Dados/crescente_10000.csv";

        String arq_decrescente100 = "/Dados/decrescente_100.csv";
        String arq_decrescente1000 = "/Dados/decrescente_1000.csv";
        String arq_decrescente10000 = "/Dados/decrescente_10000.csv";


        ArrayList<Integer> aleat100 = new ArrayList<>();
        ArrayList<Integer> aleat1000 = new ArrayList<>();
        ArrayList<Integer> aleat10000 = new ArrayList<>();

        ArrayList<Integer> cresc100 = new ArrayList<>();
        ArrayList<Integer> cresc1000 = new ArrayList<>();
        ArrayList<Integer> cresc10000  = new ArrayList<>();

        ArrayList<Integer> desc100 = new ArrayList<>();
        ArrayList<Integer> desc1000 = new ArrayList<>();
        ArrayList<Integer> desc10000 = new ArrayList<>();

        Reader reader = new Reader();

        reader.insertInVector(aleat100, user + arq_aleatorio100);
        reader.insertInVector(aleat1000, user + arq_aleatorio1000);
        reader.insertInVector(aleat10000, user + arq_aleatorio10000);

        reader.insertInVector(cresc100, user + arq_crescente100);
        reader.insertInVector(cresc1000, user + arq_crescente1000);
        reader.insertInVector(cresc10000, user + arq_crescente10000);

        reader.insertInVector(desc100, user + arq_decrescente100);
        reader.insertInVector(desc1000, user + arq_decrescente1000);
        reader.insertInVector(desc10000, user + arq_decrescente10000);

        SortingAlgorithm insertion = new InsertionSort();
        //mafe SortingAlgorithm bubble = new ;
        //juh SortingAlgorithm quick = new ;


        long time_insertion_aleat100 = insertion.sort(aleat100);
        long time_insertion_aleat1000 = insertion.sort(aleat1000);
        long time_insertion_aleat10000 = insertion.sort(aleat10000);

        long time_insertion_cresc100 = insertion.sort(cresc100);
        long time_insertion_cresc1000 = insertion.sort(cresc1000);
        long time_insertion_cresc10000 = insertion.sort(cresc10000);

        long time_insertion_desc100 = insertion.sort(desc100);
        long time_insertion_desc1000 = insertion.sort(desc1000);
        long time_insertion_desc10000 = insertion.sort(desc10000);


        System.out.println("Tempo do Algoritmo Insertion Sort");
        System.out.println("Aleatório de 100 dados: " + time_insertion_aleat100 + " nano segundos");
        System.out.println("Aleatório de 1000 dados: " + time_insertion_aleat1000 + " nano segundos");
        System.out.println("Aleatório de 10000 dados: " + time_insertion_aleat10000 + " nano segundos\n");
        System.out.println("Crescente de 100 dados: " + time_insertion_cresc100 + " nano segundos");
        System.out.println("Crescente de 1000 dados: " + time_insertion_cresc1000 + " nano segundos");
        System.out.println("Crescente de 1000 dados: " + time_insertion_cresc10000 + " nano segundos\n");
        System.out.println("Decrescente de 100 dados: " + time_insertion_desc100 + " nano segundos");
        System.out.println("Decrescente de 1000 dados: " + time_insertion_desc1000 + " nano segundos");
        System.out.println("Decrescente de 10000 dados: " + time_insertion_desc10000 + " nano segundos\n");

//        System.out.println(ver(aleat100));
//        System.out.println(ver(aleat1000));
//        System.out.println(ver(aleat10000));
//        System.out.println(ver(cresc100));
//        System.out.println(ver(cresc1000));
//        System.out.println(ver(cresc10000));
//        System.out.println(ver(desc100));
//        System.out.println(ver(desc1000));
//        System.out.println(ver(desc10000));

    }

    public static boolean ver(ArrayList<Integer> v) {
        int i = 0;
        while(v.get(i) < v.size()-1) {
            if (v.get(i) > v.get(i+1)){
                return false;
            }
            i++;
        }
        return true;
    }
}