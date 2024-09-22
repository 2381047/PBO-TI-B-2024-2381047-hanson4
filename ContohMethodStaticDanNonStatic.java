public class ContohMethodStaticDanNonStatic {

    // Method static untuk menghitung luas persegi

    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    // Method non-static untuk menampilkan pesan selamat datang

    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("Selamat datang, " + nama + "!");
    }


    public static void main(String[] args) {
        // Memanggil method static langsung melalui nama kelas
        double luaspersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi(5);
        System.out.println("Luas persegi dengan sisi 5: " + luaspersegi);
    }
}
