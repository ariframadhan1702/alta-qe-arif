import java.util.Scanner;

public class Soal6DrawXYZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai  : ");
        int num = input.nextInt();



        int count =0;
        for (int i= 0; i < num;i++){
            for (int j= 0; j< num;j++){
                count ++;
                if (count % 3==0){
                    System.out.print("X ");
                } else {
                    if (count %2 == 0){
                        System.out.print("z ");
                    } else{
                        System.out.print("Y ");
                    }

                }


            }
            System.out.print("\n");

        }


    }
}
