import java.util.Scanner;

    public class Soal7Mean {

        public static void main(String[] args){
            int array[], i, n;
            array = new int[100];
            float rata, total=0;
            Scanner scan = new Scanner(System.in);
            System.out.print("Jumlah masukan : ");
            n = scan.nextInt();
            for(i = 1; i <= n; i++){
                System.out.print("Nilai Ke-"+ i +" : ");
                array[i] = scan.nextInt();
                total = total + array[i];
            }
            rata = total/n;

            System.out.println("Hasil Mean : " + rata);
        }


    }


