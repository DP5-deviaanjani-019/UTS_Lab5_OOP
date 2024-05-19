package Soal1;
import java.util.ArrayList; //Mengimpor kelas ArrayList dari paket java.util untuk membuat daftar dinamis
class Buku { //Deklarasi kelas Buku yang mewakili sebuah buku
    private String judul;//Deklarasi atribut judul dengan tipe data String
    private String pengarang;//Deklarasi atribut pengarang dengan tipe data String
    private int tahunTerbit;//Deklarasi atribut tahunTerbit dengan tipe data int

    // Constructor untuk menginisialisasi objek Buku dengan judul, pengarang, dan tahun terbit
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul; //Menginisialisasi atribut judul dengan nilai parameter judul
        this.pengarang = pengarang; //Menginisialisasi atribut pengarang dengan nilai parameter pengarang
        this.tahunTerbit = tahunTerbit; //Menginisialisasi atribut tahunTerbit dengan nilai parameter tahunTerbit
    }
    //Getter untuk mendapatkan judul buku
    public String getJudul() { // Metode getter untuk mendapatkan nilai atribut judul
        return judul;//Mengembalikan nilai dari atribut judul
    }
    // Setter untuk mengatur judul buku
    public void setJudul(String judul) { // Metode setter untuk mengatur nilai atribut judul
        this.judul = judul; // Menetapkan nilai parameter judul ke atribut judul dari objek ini
    }
    // Getter untuk mendapatkan pengarang buku
    public String getPengarang() { // Metode getter untuk mendapatkan nilai atribut pengarang
        return pengarang; //Mengembalikan nilai dari atribut pengarang
    }
    // Setter untuk mengatur pengarang buku
    public void setPengarang(String pengarang) { // Metode setter untuk mengatur nilai atribut pengarang
        this.pengarang = pengarang; // Menetapkan nilai parameter pengarang ke atribut pengarang dari objek saat ini
    }

    // Getter untuk mendapatkan tahun terbit buku
    public int getTahunTerbit() { // Metode getter untuk mendapatkan nilai atribut tahunTerbit
        return tahunTerbit;  //Mengembalikan nilai dari atribut tahunterbit
    }

    // Setter untuk mengatur tahun terbit buku
    public void setTahunTerbit(int tahunTerbit) { // Metode setter untuk mengatur nilai atribut tahunterbit
        this.tahunTerbit = tahunTerbit; // Menetapkan nilai parameter tahunterbit ke atribut tahunterbit dari objek saat ini
    }
    // Method untuk menampilkan informasi buku
    public void displayInfo() { // Metode untuk menampilkan informasi buku
        // Mencetak informasi buku ke konsol dengan format "Judul: [judul], Pengarang: [pengarang], Tahun Terbit: [tahunTerbit]"
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
    }

    // Overloaded method untuk menampilkan informasi buku dengan format singkat
    public void displayInfo(String format) { // Metode untuk menampilkan informasi buku dengan format tertentu
        if ("singkat".equalsIgnoreCase(format)) { // Jika format adalah "singkat" (case-insensitive)
            System.out.println(judul + " oleh " + pengarang); // Mencetak informasi buku dalam format singkat "judul oleh pengarang"
        } else {
            displayInfo(); // Memanggil metode displayInfo() tanpa parameter untuk menampilkan informasi lengkap
        }
    }
}
// Kelas Majalah yang mewarisi kelas Buku
class Majalah extends Buku { //kelas majalah
    private int edisi; // Atribut edisi majalah

    // Konstruktor untuk menginisialisasi objek Majalah
    public Majalah(String judul, String pengarang, int tahunTerbit, int edisi) { // Konstruktor untuk kelas Majalah
        super(judul, pengarang, tahunTerbit); // Memanggil konstruktor superclass (Buku) untuk menginisialisasi judul, pengarang, dan tahunTerbit
        this.edisi = edisi; // Menginisialisasi atribut edisi dengan nilai yang diberikan
    }
    // Getter untuk mendapatkan edisi majalah
    public int getEdisi() { // Getter untuk mendapatkan edisi majalah
        return edisi; // Mengembalikan nilai edisi dari majalah
    }

    // Setter untuk mengatur edisi majalah
    public void setEdisi(int edisi) { // Setter untuk mengatur edisi majalah
        this.edisi = edisi;  // Mengatur nilai edisi majalah dengan nilai yang diberikan sebagai parameter
    }
    // Overridden method untuk menampilkan informasi majalah
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method displayInfo dari superclass (Buku) untuk menampilkan judul, pengarang, dan tahun terbit
        System.out.println("Edisi: " + edisi); // Menambahkan informasi edisi ke output
    }
}
// Kelas Perpustakaan untuk mengelola koleksi buku dan majalah
class Perpustakaan {
    private ArrayList<Buku> koleksiBuku; // Koleksi buku yang disimpan dalam ArrayList

    // Konstruktor untuk menginisialisasi koleksi buku
    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
    }

    // Method untuk menambahkan buku ke koleksi
    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku); // Menambahkan objek buku ke dalam koleksi
    }
    // Method untuk menampilkan seluruh koleksi buku dan majalah
    public void tampilkanKoleksi() {
        if (koleksiBuku.isEmpty()) { // Mengecek apakah koleksi buku kosong
            System.out.println("Koleksi perpustakaan kosong."); // Menampilkan pesan jika koleksi kosong
            return;
        }

        int jumlahBuku = 0; // Variabel untuk menghitung jumlah buku
        int jumlahMajalah = 0; // Variabel untuk menghitung jumlah majalah

        // Menghitung jumlah buku dan majalah
        for (Buku buku : koleksiBuku) {
            if (buku instanceof Majalah) { // Mengecek apakah objek buku adalah instance dari Majalah
                jumlahMajalah++;//menambahkan ke jumlah majalah
            } else {
                jumlahBuku++; //menambahkan ke jumlah buku
            }
        }
        // Menampilkan jumlah buku dan majalah
        System.out.println("Jumlah Buku: " + jumlahBuku); //menam[ilkan jumlah buku
        System.out.println("Jumlah Majalah: " + jumlahMajalah);//menampilkan jumlah majalah

        // Menampilkan koleksi buku
        System.out.println("=== Koleksi Buku ===");
        for (Buku buku : koleksiBuku) {
            if (!(buku instanceof Majalah)) { // Mengecek apakah objek buku bukan instance dari Majalah
                buku.displayInfo(); // Menampilkan informasi buku
            }
        }

        // Menampilkan koleksi majalah
        System.out.println("=== Koleksi Majalah ===");
        for (Buku buku : koleksiBuku) {
            if (buku instanceof Majalah) { // Mengecek apakah objek buku adalah instance dari Majalah
                buku.displayInfo(); // Menampilkan informasi majalah
            }
        }
    }
}