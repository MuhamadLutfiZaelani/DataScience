
import java.util.Scanner;

public class Soal2InventarisToko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan objek Barang
        Barang[] daftarBarang = new Barang[10];

        // Menambahkan data awal barang ke array
        daftarBarang[0] = new Barang("Pensil", 50, 200);
        daftarBarang[1] = new Barang("Buku", 30, 15000);
        daftarBarang[2] = new Barang("Penghapus", 20, 500);

        // ===== Update Stok =====
        System.out.print("Masukkan nama barang yang ingin diupdate: ");
        String namaUpdate = scanner.nextLine();

        System.out.print("Masukkan jumlah stok baru: ");
        int stokBaru = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        updateStok(daftarBarang, namaUpdate, stokBaru);

        // ===== Tampilkan Inventaris Setelah Diupdate =====
        System.out.println("\nInventaris setelah diupdate:");
        tampilkanInventaris(daftarBarang);

        // ===== Cari Barang =====
        System.out.print("\nMasukkan nama barang yang dicari: ");
        String namaCari = scanner.nextLine();

        System.out.println("\nHasil pencarian:");
        cariBarang(daftarBarang, namaCari);

        scanner.close();
    }

    // Metode untuk memperbarui stok barang berdasarkan nama
    public static void updateStok(Barang[] daftar, String namaBarang, int stokBaru) {
        for (Barang b : daftar) {
            if (b != null && b.nama.equalsIgnoreCase(namaBarang)) {
                b.jumlahStok = stokBaru;
                return;
            }
        }
        System.out.println("Barang dengan nama \"" + namaBarang + "\" tidak ditemukan.");
    }

    // Metode untuk menampilkan semua barang
    public static void tampilkanInventaris(Barang[] daftar) {
        int nomor = 1;
        for (Barang b : daftar) {
            if (b != null) {
                System.out.println(nomor + ". Nama: " + b.nama + ", Jumlah Stok: " + b.jumlahStok + ", Harga: " + b.harga);
                nomor++;
            }
        }
    }

    // Metode untuk mencari barang berdasarkan nama
    public static void cariBarang(Barang[] daftar, String namaBarang) {
        for (Barang b : daftar) {
            if (b != null && b.nama.equalsIgnoreCase(namaBarang)) {
                System.out.println("Nama: " + b.nama + ", Jumlah Stok: " + b.jumlahStok + ", Harga: " + b.harga);
                return;
            }
        }
        System.out.println("Barang dengan nama \"" + namaBarang + "\" tidak ditemukan.");
    }
}

// Kelas Barang dengan atribut dan konstruktor
class Barang {
    String nama;
    int jumlahStok;
    int harga;

    public Barang(String nama, int jumlahStok, int harga) {
        this.nama = nama;
        this.jumlahStok = jumlahStok;
        this.harga = harga;
    }
}
