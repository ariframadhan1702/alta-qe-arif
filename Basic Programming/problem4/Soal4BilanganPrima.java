import java.util.Scanner;
public class Soal4BilanganPrima {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, cek=0;

        System.out.println("Menentukan Bilanga Prima Atau Tidak");
        System.out.print("Masukan Angka: ");
        bil=input.nextInt();

        System.out.println("----------");
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}