package LuasDanKeliling;

public class luasdankeliling {

    public static void main(String[] args) {
        persegi cetakpersegi = new persegi();
        Segitiga cetaksegitiga = new Segitiga();
        persegipanjang cetakpersegipanjang = new persegipanjang();

        System.out.println(" LUAS   ");

        cetakpersegi.LuasPersegi();
        cetaksegitiga.LuasSegitiga();
        cetakpersegipanjang.LuasPersegipanjang();

        System.out.println("----------------------------------------");
        System.out.println(" KELILING ");
        cetakpersegi.kelilingPersegi();
        cetaksegitiga.kelilingSegitiga();
        cetakpersegipanjang.kelilingPersegipanjang();




    }


}
