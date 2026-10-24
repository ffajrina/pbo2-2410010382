# P04 --- Layout Manager dan Desain Form

## G. Pertanyaan Refleksi

### 1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?

Null Layout dan Absolute Layout mengandalkan posisi serta ukuran
komponen yang ditentukan secara tetap. Akibatnya, tampilan dapat
berantakan atau terpotong ketika ukuran jendela, resolusi layar, atau
skala font berubah. Absolute Layout juga memerlukan dukungan tambahan di
NetBeans sehingga aplikasi lebih sulit dipindahkan ke komputer lain.
Layout manager lebih disarankan karena mengatur posisi dan ukuran
komponen secara otomatis.

### 2. Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.

FlowLayout menempatkan komponen secara berderet dengan ukuran asli
komponen. Jika ruang tidak cukup, komponen akan berpindah ke baris
berikutnya. Saat jendela dilebarkan, lebih banyak komponen dapat berada
dalam satu baris dan posisi deretnya mengikuti pengaturan alignment.

GridLayout membagi area menjadi baris dan kolom dengan ukuran sel yang
sama. Komponen mengisi sel tersebut dan ukurannya menyesuaikan area.
Ketika jendela dilebarkan, sel dan komponen ikut melebar; akibatnya,
kolom yang berisi label dan isian pada form bisa menjadi sama lebar dan
kurang nyaman dibaca.

### 3. Apa fungsi Weight X dan Fill pada constraint GridBagLayout?

`Weight X` menentukan bagaimana sisa ruang horizontal dibagikan kepada
kolom atau komponen. Nilai `1.0` pada kolom isian membuat kolom tersebut
menerima ruang tambahan, sedangkan label biasanya menggunakan `0.0`.
`Fill` menentukan apakah komponen mengisi ruang selnya. Untuk kolom
isian, `Horizontal` membuat isian melebar mengikuti sel.

### 4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?

`isiPanel` menggunakan BorderLayout sebagai pembungkus, sedangkan
`formPanel` ditempatkan pada bagian North. Dengan susunan ini,
baris-baris form tetap berada di bagian atas ketika jendela ditinggikan,
sehingga ruang kosong tambahan tidak dibagikan secara vertikal ke
seluruh form. Susunan panel bertingkat juga memudahkan setiap bagian
menggunakan layout yang sesuai.

### 5. Sebutkan dua prinsip desain yang diterapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya.

-   **Keselarasan:** Label seperti NPM, nama lengkap, program studi,
    email, nomor HP, dan alamat disusun sejajar dengan komponen
    inputnya. Pada GridBagLayout, label berada di kolom 0 dan isian di
    kolom 1.
-   **Kedekatan:** Komponen yang berkaitan dikelompokkan dalam bagian
    Data Anggota, Kontak, dan Persetujuan. Pengelompokan ini membantu
    pengguna memahami bagian form yang sedang diisi.

Prinsip tambahan yang juga dapat diterapkan adalah konsistensi jarak,
ukuran tombol yang seragam, dan penempatan tombol utama **Daftar** di
kanan bawah.

## Tabel Rancangan FormAnggotaPerpustakaan

  Bagian                           Panel                                Layout
  -------------------------------- ------------------------------------ -------------------------------
  Jendela                          `FormAnggotaPerpustakaan` (JFrame)   `BorderLayout`
  Header                           `headerPanel`                        `BoxLayout`, Axis Y
  Isi form                         `isiPanel`                           `BorderLayout`
  Isi form (di dalam `isiPanel`)   `formPanel`                          `GridBagLayout`
  Tombol                           `tombolPanel`                        `FlowLayout`, Alignment Right

**Rancangan susunan panel:**

``` text
FormAnggotaPerpustakaan (JFrame - BorderLayout)
├── NORTH  : headerPanel (BoxLayout, Y_AXIS)
├── CENTER : isiPanel (BorderLayout)
│           └── NORTH : formPanel (GridBagLayout)
└── SOUTH  : tombolPanel (FlowLayout, RIGHT)
             ├── Batal
             └── Daftar
```

Disarankan memberi Empty Border agar komponen tidak menempel pada tepi
panel. Pada `formPanel`, letakkan label di kolom 0 dan input di kolom 1.
Atur `Weight X = 1.0` dan `Fill = Horizontal` untuk komponen isian agar
kolom input melebar saat jendela diperbesar.

## Jawaban Eksperimen Praktikum 2 --- Galeri Layout Manager

### 1. FlowLayout diubah menjadi Center, lalu jendela diperkecil. Apa yang berubah? Baris `initComponents()` mana yang ikut berubah?

Tombol-tombol menjadi rata tengah pada setiap baris. Ketika jendela
diperkecil dan semua tombol tidak lagi muat dalam satu baris, sebagian
tombol berpindah ke baris berikutnya. Pengaturan alignment yang
dihasilkan NetBeans berubah pada pembuatan FlowLayout di
`initComponents()`, misalnya dari `FlowLayout.LEFT` menjadi
`FlowLayout.CENTER`. Nama variabel dan bentuk kode tepatnya mengikuti
kode yang dihasilkan proyek.

### 2. Pada gridPanel, Rows diubah menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa?

Dengan 9 tombol dan 2 kolom, GridLayout membentuk **5 baris**: empat
baris berisi dua tombol dan baris terakhir berisi satu tombol. Pada
GridLayout, jika jumlah baris ditetapkan 0, jumlah baris dihitung
berdasarkan jumlah komponen dan jumlah kolom yang ditentukan.

### 3. maximumSize keempat tombol pada boxPanel diatur ke lebar 32767 dan tinggi sesuai tinggi tombol. Bagaimana lebar tombol berubah? Apa efek Vertical Strut?

Dengan maximum width yang besar, tombol dapat melebar mengikuti ruang
horizontal yang tersedia sesuai perilaku BoxLayout dan ukuran maksimum
yang ditentukan. Vertical Strut menambahkan jarak vertikal tetap di
antara tombol sehingga tombol tidak terlihat berhimpitan. Hasil akhirnya
tetap dipengaruhi ukuran panel dan properti komponen lainnya.

## Jawaban Eksperimen Praktikum 4 --- Form Biodata

### 1. Weight X pada namaField diubah menjadi 0.0, lalu jendela dilebarkan. Apa yang terjadi pada isian?

`namaField` tidak lagi menerima pembagian sisa ruang horizontal dari
GridBagLayout. Karena itu, saat jendela dilebarkan, lebar isian
cenderung tetap pada ukuran yang dibutuhkan dan tidak melebar seperti
ketika `Weight X = 1.0`. Ruang tambahan lebih banyak tersisa di area
form.

### 2. Direction formPanel di dalam isiPanel diubah dari North menjadi Center, lalu jendela ditinggikan. Apa perbedaannya?

Ketika `formPanel` diletakkan pada North, form tetap berada di bagian
atas dan ruang tambahan cenderung berada di bawahnya. Jika dipindahkan
ke Center, `formPanel` ditempatkan di area tengah yang tersedia pada
`isiPanel`, sehingga posisi form dapat bergeser ke tengah secara
vertikal ketika jendela ditinggikan.

### 3. Baris `setMinimumSize(getSize())` dihapus, lalu jendela dikecilkan sekecil mungkin. Bagian mana yang rusak lebih dulu?

Tanpa ukuran minimum, jendela dapat dikecilkan melewati ukuran yang
nyaman untuk form. Bagian yang paling mungkin terdampak lebih dahulu
adalah kolom isian yang menyempit, kemudian teks atau komponen dapat
terpotong dan jarak antarbagian terlihat terlalu rapat. Bagian tepat
yang tampak rusak bergantung pada ukuran komponen dan tampilan saat
dijalankan.

## Saran Teman --- Tahap 4

> **Lengkapi setelah pemeriksaan bersama teman.** Contoh saran yang
> dapat digunakan jika sesuai dengan hasil pemeriksaan: "Jarak antara
> kelompok Data Anggota dan Kontak sebaiknya dibuat konsisten, serta
> pastikan kolom input melebar tanpa membuat label ikut melebar ketika
> jendela diperbesar."

Checklist pemeriksaan:

-   [ ] Label singkat, jelas, dan sejajar
-   [ ] Isian dikelompokkan dengan judul bagian
-   [ ] Placeholder digunakan untuk isian yang memiliki format
-   [ ] Komponen sesuai dengan jenis data
-   [ ] Tombol utama menonjol dan berada di kanan bawah
-   [ ] Jarak antar-komponen konsisten
-   [ ] Form tetap rapi saat jendela dilebarkan dan ditinggikan
-   [ ] Form dibuat menggunakan JFrame Form dan layout manager, bukan
    Null Layout atau Absolute Layout

## Deklarasi Penggunaan AI

Saya menggunakan ChatGPT untuk membantu menyusun draf README, merangkum
materi modul, dan merumuskan jawaban refleksi serta eksperimen. Saya
perlu mencocokkan jawaban dengan hasil pengamatan pada aplikasi NetBeans
yang saya jalankan sendiri dan merevisi bagian yang tidak sesuai dengan
hasil praktik.

------------------------------------------------------------------------

**Catatan:** Jawaban eksperimen di atas menjelaskan perilaku layout
manager yang diharapkan berdasarkan modul. Sesuaikan jika hasil
pengamatan langsung pada proyek berbeda. Tambahkan foto sketsa form,
tangkapan layar `FormAnggotaPerpustakaan` pada ukuran awal dan saat
dilebarkan, serta tangkapan layar tab Design yang menampilkan susunan
panel pada Navigator sebelum dikumpulkan.
