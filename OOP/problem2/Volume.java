package MenghitungVolume;

public class Volume {

    public static void main(String[] args) {
        Kubus volumekubus = new Kubus();
        Balok volumebalok = new Balok();
        Tabung volumetabung = new Tabung();

        System.out.println("Volume ");
        volumekubus.volumeKubus();
        volumebalok.volumeBalok();
        volumetabung.volumetabung();




    }

}
