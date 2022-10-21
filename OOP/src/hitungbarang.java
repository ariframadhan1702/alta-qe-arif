public class hitungbarang extends volumebarang {

    public static void main(String[] args) {
        double beratbarang = 1 ;
        volumebarang volume = new volumebarang ();

        double dimensi = (Math.ceil(volume.volpanjang)*Math.ceil(volume.vollebar)*Math.ceil(volume.voltinggi)*beratbarang*5000);

        System.out.println(dimensi);





    }

}
