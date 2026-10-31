# Praktikum PBO 2 -- Pertemuan 5: Event Handling

## Identitas

  Keterangan    Data
  ------------- ------------------------------
  Nama          Fajrina Bada
  NPM           2410010382
  Mata Kuliah   Pemrograman Berbasis Objek 2
  Pertemuan     5 -- Event Handling
  Package       `id.ac.uniska.pbo2.p05`

------------------------------------------------------------------------

## 1. Tabel Pengamatan Praktikum 2 -- Mengamati Event

Tabel berikut merangkum event yang muncul ketika setiap tindakan
dilakukan pada form `PengamatEvent`. Urutan event dapat sedikit berbeda
bergantung pada posisi kursor dan cara pengguna berpindah antarkomponen.

  --------------------------------------------------------------------------
                           No. Tindakan              Event yang tercatat
  ---------------------------- --------------------- -----------------------
                             1 Arahkan kursor ke     `MouseEvent` --
                               tombol, lalu jauhkan  `mouseEntered` ketika
                                                     kursor masuk dan
                                                     `mouseExited` ketika
                                                     kursor keluar dari
                                                     tombol.

                             2 Klik tombol **Klik    `ActionEvent` --
                               saya**                `actionPerformed`
                                                     ketika tombol diklik.

                             3 Centang lalu hapus    `ItemEvent` --
                               centang **Aktifkan    `itemStateChanged`
                               fitur**               ketika status centang
                                                     berubah, baik dipilih
                                                     maupun dilepas.

                             4 Ganti pilihan dari    `ItemEvent` --
                               **Pagi** menjadi      `itemStateChanged`
                               **Malam**             dipanggil untuk pilihan
                                                     lama (`DESELECTED`) dan
                                                     pilihan baru
                                                     (`SELECTED`). Dengan
                                                     pemeriksaan
                                                     `ItemEvent.SELECTED`,
                                                     catatan pemilihan hanya
                                                     dibuat untuk pilihan
                                                     baru, yaitu **Malam**.

                             5 Klik isian, lalu      `FocusEvent` --
                               ketik kata `abc`      `focusGained` ketika
                                                     isian mendapat fokus,
                                                     kemudian `KeyEvent` --
                                                     `keyTyped` untuk setiap
                                                     karakter `a`, `b`, dan
                                                     `c`.

                             6 Klik tombol setelah   `FocusEvent` --
                               mengetik di isian     `focusLost` ketika
                                                     isian kehilangan fokus.
                                                     Tombol yang diklik juga
                                                     menerima `ActionEvent`
                                                     -- `actionPerformed`.
  --------------------------------------------------------------------------

**Catatan:** Pada contoh keluaran modul, event `keyTyped` tercatat satu
kali untuk setiap karakter yang diketik. Event fokus muncul ketika fokus
berpindah dari atau menuju komponen.

------------------------------------------------------------------------

## 2. Jawaban Eksperimen Praktikum 3 -- Konversi Suhu

### Eksperimen 1: Menghapus pemeriksaan `ItemEvent.SELECTED`

**Pertanyaan:** Berapa kali pesan `item berubah` tercetak setiap pilihan
Combo Box diganti?

**Jawaban:**

Pesan `item berubah` tercetak sebanyak **dua kali** setiap pilihan Combo
Box diganti. Hal ini terjadi karena `itemStateChanged` dipanggil dua
kali, yaitu ketika pilihan lama berubah menjadi `DESELECTED` dan ketika
pilihan baru menjadi `SELECTED`.

Pemeriksaan `evt.getStateChange() == ItemEvent.SELECTED` diperlukan agar
proses konversi hanya dijalankan ketika pilihan baru dipilih.

### Eksperimen 2: Mengganti `keyReleased` menjadi `keyPressed`

**Pertanyaan:** Mengapa hasil yang tampil terlambat satu karakter?

**Jawaban:**

Event `keyPressed` dijalankan ketika tombol keyboard ditekan, sebelum
karakter dimasukkan ke dalam `JTextField`. Akibatnya, method
`konversi()` membaca teks yang masih berisi nilai sebelumnya sehingga
hasil konversi tertinggal satu karakter.

Berbeda dengan `keyPressed`, event `keyReleased` dijalankan setelah
tombol dilepas dan karakter sudah masuk ke dalam isian. Oleh karena itu,
`keyReleased` lebih sesuai untuk memperbarui hasil secara langsung
setelah pengguna mengetik.

### Eksperimen 3: Menghapus blok `try-catch`

**Pertanyaan:** Apa yang muncul di jendela Output ketika huruf diketik
pada isian?

**Jawaban:**

Ketika huruf dimasukkan, `Double.parseDouble(teks)` tidak dapat mengubah
teks tersebut menjadi angka. Program menghasilkan exception
`NumberFormatException`.

Karena blok `try-catch` sudah dihapus, exception tidak ditangani oleh
method `konversi()` dan pesan kesalahan berupa stack trace akan muncul
pada jendela Output NetBeans. Pemeriksaan `try-catch` diperlukan agar
kesalahan input dapat ditangani dan ditampilkan dengan lebih baik kepada
pengguna.

------------------------------------------------------------------------

## 3. Jawaban Eksperimen Praktikum 4 -- Kalkulator Sederhana

### Eksperimen 1: Membuat event GUI Builder dan lambda pada tombol Kali

**Pertanyaan:** Berapa kali pesan `kali` tercetak? Mengapa satu tombol
sebaiknya hanya memakai satu cara?

**Jawaban:**

Pesan `kali` tercetak sebanyak **dua kali** ketika tombol Kali diklik.
Hal ini terjadi karena terdapat dua listener yang terhubung ke tombol
yang sama, yaitu event `actionPerformed` dari GUI Builder dan lambda
`kaliButton.addActionListener(e -> hitung('x'))` pada konstruktor.

Satu tombol sebaiknya hanya menggunakan satu cara penghubung event agar
aksi tidak dijalankan dua kali. Penggunaan listener ganda dapat
menyebabkan proses perhitungan atau tindakan lain berjalan berulang.

### Eksperimen 2: Menambahkan tombol modulus (%)

**Pertanyaan:** Apa saja yang diubah pada tab Design dan tab Source?

**Jawaban:**

Perubahan yang diperlukan adalah:

**Pada tab Design:** 1. Tambahkan satu `JButton` pada `operatorPanel`.
2. Ubah nama variabel menjadi `modulusButton`. 3. Ubah teks tombol
menjadi `%`. 4. Sesuaikan `GridLayout` pada `operatorPanel` menjadi satu
baris dan lima kolom agar tombol operasi dapat ditampilkan.

**Pada tab Source:** 1. Tambahkan event `actionPerformed` untuk
`modulusButton` melalui GUI Builder atau hubungkan dengan lambda di
konstruktor. Gunakan satu cara saja. 2. Tambahkan kondisi operator
modulus pada method `hitung(char operator)`. 3. Tambahkan pemeriksaan
pembagi nol untuk operasi `/` dan `%`.

Contoh perubahan logika:

``` java
if ((operator == '/' || operator == '%') && b == 0) {
    hasilLabel.setText("Tidak dapat membagi dengan nol");
    return;
}

double hasil = switch (operator) {
    case '+' -> a + b;
    case '-' -> a - b;
    case 'x' -> a * b;
    case '%' -> a % b;
    default -> a / b;
};
```

Dengan perubahan tersebut, tombol `%` dapat menghitung sisa hasil
pembagian dua angka.

### Eksperimen 3: Menekan tombol Hapus

**Pertanyaan:** Mengapa kursor langsung berada di isian pertama?

**Jawaban:**

Kursor langsung berada di isian pertama karena method `hapus()`
menjalankan perintah `angka1Field.requestFocusInWindow()` setelah
mengosongkan kedua isian dan mengatur ulang label hasil.

Perintah tersebut meminta agar komponen `angka1Field` mendapatkan fokus
kembali sehingga pengguna dapat langsung memasukkan angka baru tanpa
harus mengeklik isian pertama secara manual.

------------------------------------------------------------------------

## 4. Peta Event -- FormAnggotaPerpustakaan

Peta event berikut digunakan untuk mengaktifkan form pendaftaran anggota
perpustakaan sesuai instruksi Latihan Mandiri Modul PBO 2 Pertemuan 5.

  -------------------------------------------------------------------------------------------
                    No. Komponen                    Event                Fungsi
  --------------------- --------------------------- -------------------- --------------------
                      1 `persetujuanCheck`          `itemStateChanged`   Mengaktifkan tombol
                                                                         Daftar ketika kotak
                                                                         persetujuan
                                                                         dicentang dan
                                                                         menonaktifkannya
                                                                         ketika centang
                                                                         dihapus.

                      2 `batalButton`               `actionPerformed`    Mengosongkan seluruh
                                                                         isian, mengembalikan
                                                                         pilihan ke kondisi
                                                                         awal, menonaktifkan
                                                                         tombol Daftar, dan
                                                                         mengembalikan fokus
                                                                         ke NPM.

                      3 `daftarButton`              `actionPerformed`    Menampilkan
                                                                         ringkasan data
                                                                         anggota menggunakan
                                                                         `JOptionPane`.

                      4 `npmText`                   `keyReleased`        Memperbarui label
                                                                         jumlah digit NPM
                                                                         secara langsung,
                                                                         misalnya
                                                                         `8 dari 10 digit`.

                      5 JFrame                      `windowClosing`      Menampilkan dialog
                        `FormAnggotaPerpustakaan`                        konfirmasi sebelum
                                                                         aplikasi ditutup.
                                                                         Jika pengguna
                                                                         memilih No, form
                                                                         tetap terbuka; jika
                                                                         memilih Yes, form
                                                                         ditutup.
  -------------------------------------------------------------------------------------------

### Pengaturan Properties

Pengaturan yang harus diterapkan pada form:

-   `defaultCloseOperation` diatur menjadi `DO_NOTHING_ON_CLOSE`.
-   Properti `enabled` pada tombol `daftarButton` tidak dicentang pada
    kondisi awal.
-   Event dibuat melalui menu **Events** pada GUI Builder.
-   Event `itemStateChanged` digunakan pada kotak persetujuan, bukan
    `actionPerformed`.

------------------------------------------------------------------------

## 5. Dokumentasi Screenshot

Simpan screenshot pada folder `screenshots` di dalam repository. Gunakan
nama file sesuai referensi berikut agar gambar tampil di GitHub.

### 5.1 Properties -- Events Tombol Daftar

Screenshot harus memperlihatkan jendela **Properties**, bagian
**Events**, pada komponen `daftarButton`, khususnya event
`actionPerformed`.

![Properties Events Tombol
Daftar](screenshots/properties-events-daftar.png)

### 5.2 Dialog Ringkasan Pendaftaran

Screenshot harus memperlihatkan dialog ringkasan data anggota yang
muncul setelah tombol **Daftar** diklik.

![Dialog Ringkasan Pendaftaran](screenshots/dialog-ringkasan.png)

### 5.3 Dialog Konfirmasi Keluar

Screenshot harus memperlihatkan dialog konfirmasi ketika tombol X pada
jendela aplikasi diklik.

![Dialog Konfirmasi Keluar](screenshots/dialog-konfirmasi-keluar.png)

------------------------------------------------------------------------

## 6. Deklarasi Penggunaan AI

Dalam pengerjaan praktikum ini, saya menggunakan **Google Gemini**
sebagai alat bantu kecerdasan buatan (AI) untuk:

1.  Membantu memahami konsep event handling pada Java Swing.
2.  Membantu menyusun dan menjelaskan jawaban eksperimen Praktikum 3 dan
    Praktikum 4 berdasarkan modul.
3.  Membantu menyusun dokumentasi README dan peta event pada
    `FormAnggotaPerpustakaan`.
4.  Membantu memeriksa pemahaman terhadap fungsi event dan alur kerja
    program.

Penggunaan AI hanya sebagai alat bantu pembelajaran dan penyusunan
dokumentasi. Implementasi program, pengujian, serta verifikasi hasil
tetap perlu dilakukan oleh mahasiswa.

------------------------------------------------------------------------

## 7. Checklist Pengumpulan

-   [ ] Tabel pengamatan Praktikum 2 sudah disesuaikan dengan hasil
    pengujian aplikasi.
-   [ ] Jawaban eksperimen Praktikum 3 sudah dicantumkan.
-   [ ] Jawaban eksperimen Praktikum 4 sudah dicantumkan.
-   [ ] Peta event `FormAnggotaPerpustakaan` sudah sesuai dengan
    implementasi.
-   [ ] Screenshot Properties → Events tombol Daftar sudah dimasukkan.
-   [ ] Screenshot dialog ringkasan sudah dimasukkan.
-   [ ] Screenshot dialog konfirmasi keluar sudah dimasukkan.
-   [ ] Deklarasi penggunaan Google Gemini sudah dicantumkan.
-   [ ] File `.java` dan `.form` sudah disimpan di repository.
-   [ ] Perubahan sudah di-commit dan di-push ke GitHub.

------------------------------------------------------------------------

**Catatan:** Bagian dokumentasi screenshot di atas masih berupa tempat
gambar. Ganti dengan screenshot asli dari aplikasi Fajrina sebelum
dikumpulkan. Pastikan juga tabel pengamatan sesuai dengan hasil
pengujian yang benar-benar dilakukan.
