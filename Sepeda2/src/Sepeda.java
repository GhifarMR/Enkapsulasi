
public class Sepeda {
    public String kode;
    protected String merek;
    String jenis;
    private float kecepatan;
    private int gigi;
    
    public Sepeda(){
        System.out.println("Objek terbentuk menggunakan konstruktor default");
        kode = merek = jenis = "KOSONG";
        kecepatan = gigi = 0;
    }
    
    public Sepeda(int g){
        System.out.println("Objek terbentuk menggunakan konstruktor berparameter 1");
        kode = merek = jenis = "KOSONG";
        kecepatan = 0;
        gigi = g;
    }
    
    public Sepeda(int g, float v){
        System.out.println("Objek terbentuk menggunakan konstruktor berparameter 2");
        kode = merek = jenis = "KOSONG";
        kecepatan = v;
        gigi = g;
    }
    
    public void start(){
        gigi = 1; kecepatan = 0;
    }

    private void kurangiGigi(){
        gigi--;
    }

    private void tambahGigi(){
        gigi++;
    }

    public void tambahKecepatan(float v){
        kecepatan += v;
        if(v > 10)
            tambahGigi();
    }

    public void kurangiKecepatan(float v){
        kecepatan -= v;
        if(v > 5.5)
            kurangiGigi();
    }

    public void stop(){
        kecepatan = 0; gigi = 0;
    }

    public void tampilData(){
        System.out.println("KODE = " + kode);
        System.out.println("MEREK = " + merek);
        System.out.println("JENIS = " + jenis);
        System.out.println("KECEPATAN = " + kecepatan);
        System.out.println("GIGI = " + gigi);
    }

    public static void main(String[] args) {
        Sepeda s1 = new Sepeda();
        s1.kode = "S001"; s1.merek = "Polygon"; s1.jenis = "XC"; s1.kecepatan = 0; s1.gigi = 0;
        s1.start();
        s1.tambahKecepatan(15); s1.kurangiKecepatan(3);
        s1.tampilData();
        System.out.println();
        
        Sepeda s2 = new Sepeda(2);
        s2.tampilData();
        System.out.println();
        
        Sepeda s3 = new Sepeda(4, 25);
        s3.tampilData();
    }
}
