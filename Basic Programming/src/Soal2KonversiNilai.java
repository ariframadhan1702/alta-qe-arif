import java.util.Scanner;

public class Soal2KonversiNilai {
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
            System.out.println("Konversi Nilai Ujian Ke Huruf Untuk Mahasiswa");
            System.out.println("Masukkan Sebuah Nilai Ujian = ");
            int a = x.nextInt();
            if (a>=80&&a<=100){
                System.out.println("A");
            }
            else if (a>=65&&a<=79){
                System.out.println("B+");
            }
            else if (a>=50&&a<=64){
                System.out.println("B");
                      }
            else if (a>=35&&a<=49){
                System.out.println("C");
                  }
            else if (a>=0&a<=34){
                System.out.println("D");

            }else {
                System.out.println("Invalid"); }
        }

    }
