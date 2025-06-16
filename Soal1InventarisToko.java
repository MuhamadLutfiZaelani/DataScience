
public class Soal1InventarisToko {
    public static void main(String[] args) {
        // Membuat array dengan kapasitas 10 untuk menyimpan objek Barang
        Barang[] daftarBarang = new Barang[10];
        
        // Menambahkan 3 barang ke dalam array sesuai contoh output soal
        daftarBarang[0] = new Barang("Pensil", 50, 200);
        daftarBarang[1] = new Barang("Buku", 30, 15000);
        daftarBarang[2] = new Barang("Penghapus", 20, 500);

        // Menampilkan semua barang dalam format yang sesuai soal
        System.out.println("Inventaris Toko:");
        for (int i = 0; i < daftarBarang.length; i++) {
            if (daftarBarang[i] != null) {
                System.out.println((i + 1) + ". Nama: " + daftarBarang[i].nama +
                                   ", Jumlah Stok: " + daftarBarang[i].jumlahStok +
                                   ", Harga: " + daftarBarang[i].harga);
            }
        }
    }
}

// Kelas Barang merepresentasikan barang di toko
class Barang {
    String nama;       // Nama barang
    int jumlahStok;    // Jumlah stok barang
    int harga;         // Harga barang (menggunakan int agar sesuai contoh output)

    // Konstruktor untuk inisialisasi atribut barang
    public Barang(String nama, int jumlahStok, int harga) {
        this.nama = nama;
        this.jumlahStok = jumlahStok;
        this.harga = harga;
    }
}
