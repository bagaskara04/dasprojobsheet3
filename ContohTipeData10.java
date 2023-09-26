public class ContohTipeData10 {
    public static void main(String[] args) {
        char golDarah= 'O';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamsatuDusun= 1025;
        float suhu= 60.50F;
        double berat= 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t\t\t\t\t\t: " + (byte) golDarah);
        System.out.println("Jarak\t\t\t\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah Penduduk dalam satu dusun\t: " + jumlahPendudukDalamsatuDusun);
        System.out.println("Suhu\t\t\t\t\t\t\t\t: " +suhu);
        System.out.println("Berat\t\t\t\t\t\t\t\t: " + (float) berat);
        System.out.println("Saldo\t\t\t\t\t\t\t\t: " + saldo);
        System.out.println("Angka Desimal\t\t\t\t\t\t: " +angkaDesimal);
    }
}