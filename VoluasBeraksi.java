public class VoluasBeraksi {
    public static void main(String[] args) {
        VolumeLuas vl = new VolumeLuas(2, 3, 5);
        VolumeLuas vls = new VolumeLuas(2);
        
        System.out.println("Lingkaran Konstruktor Balok");
        System.out.println("Keliling Lingkaran : "+vl.volume());
       	System.out.println("Luas Lingkaran     : "+vl.luas());
        
        System.out.println("Lingkaran Konstruktor Kubus");
        System.out.println("Keliling Lingkaran : "+vls.volume_k());
        System.out.println("Luas Lingkaran     : "+vls.luas_k());
    }
}
