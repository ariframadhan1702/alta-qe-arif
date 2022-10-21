public class inputangka {




    public static void main(String[] args) {


        Operasi operasipenjumlahan = new Operasi();
        Operasi operasipengurangan = new Operasi();
        Operasi operasiperkalian = new Operasi();
        Operasi operasipembagian = new Operasi();
        operasipenjumlahan.a= 3;
        operasipenjumlahan.b=4;
        operasipengurangan.c=15;
        operasipengurangan.d=4;
        operasiperkalian.e=10;
        operasiperkalian.f=10;
        operasipembagian.g=12;
        operasipembagian.h=3;



        operasipenjumlahan.penjumlahan();
        operasipengurangan.pengurangan();
        operasiperkalian.perkalian();
        operasipembagian.pembagian();



    }

}
