public class ContohVariabel10 {
    public static void main(String[] args) {
        String hobbysaya= "Bermain gobak sodor";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umursaya = 19;
        double $ipk =3.24, tinggi = 1.78;

        System.out.println(hobbysaya);
        System.out.println("Apakah Pandai? "+ isPandai);
        System.out.println("Jenis Kelamin: "+jenisKelamin);
        System.out.println("Umurku saat ini: "+ umursaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}