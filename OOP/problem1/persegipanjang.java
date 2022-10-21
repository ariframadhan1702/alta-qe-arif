package LuasDanKeliling;

public class persegipanjang {
    int panjang = 7;
    int lebar = 8;

    void LuasPersegipanjang() {

        int luas = panjang * lebar;
        System.out.println("Persegi Panjang "+luas);

    }

    void  kelilingPersegipanjang(){

        int keliling = panjang + lebar + panjang + lebar;
        System.out.println("Persegi panjang "+keliling);

    }


}
