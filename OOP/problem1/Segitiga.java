package LuasDanKeliling;

public class Segitiga {
    float alas = 3;
    float tinggi = 4;

    void LuasSegitiga() {

        double luas = 0.5 * alas*tinggi ;

        System.out.println("Segitiga "+ luas);
    }

    void  kelilingSegitiga(){
        double c = Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2) );

        double keliling = tinggi+alas+c;
        System.out.println("Segitiga  "+keliling);

    }


}
