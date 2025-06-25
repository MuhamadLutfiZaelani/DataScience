import java.util.Scanner;

class Node {
    String nama;
    Node next;

    public Node(String nama) {
        this.nama = nama;
        this.next = null;
    }
}

class AntrianRestoran {
    Node head, tail;

    public void push(String nama) {
        Node baru = new Node(nama);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println("✓ " + nama + " masuk ke antrian.");
    }

    public void pop() {
        if (head == null) {
            System.out.println("✘ Antrian kosong.");
        } else {
            System.out.println("✓ " + head.nama + " sedang dilayani dan keluar dari antrian.");
            head = head.next;
            if (head == null) tail = null;
        }
    }

    public void tampilkan() {
        Node sekarang = head;
        System.out.print("📋 Antrian saat ini: ");
        if (sekarang == null) {
            System.out.println("Kosong");
        } else {
            while (sekarang != null) {
                System.out.print(sekarang.nama + " → ");
                sekarang = sekarang.next;
            }
            System.out.println("END");
        }
    }
}

public class teamassigment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianRestoran antrian = new AntrianRestoran();
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Restoran ===");
            System.out.println("1. Tambah Pelanggan (Push)");
            System.out.println("2. Layani Pelanggan (Pop)");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    antrian.push(nama);
                    break;
                case 2:
                    antrian.pop();
                    break;
                case 3:
                    antrian.tampilkan();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("❗ Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);

        input.close();
    }
}

