Penggunaan AI
Identitas AI
Google Gemini

Pada pengerjaan proyek FormTiketTravel, Google Gemini dimanfaatkan sebagai asisten teknis untuk memperdalam pemahaman pustaka antarmuka Java Swing. Bantuan yang diperoleh berfokus pada logika pemeriksaan formulir, pembacaan status elemen interaktif, penanganan aksi pengguna (action listener), serta pengalihan tema tampilan antarmuka.

AI ini diposisikan murni sebagai referensi pembelajaran. Seluruh potongan kode yang dihasilkan melalui interaksi telah ditelaah, disaring, serta diintegrasikan secara manual agar selaras dengan rancangan kode utama program.

Prompt 1 – Pemeriksaan Kelengkapan Input Form
Prompt
"Saya sedang merancang aplikasi Java Swing untuk pemesanan tiket travel. Saya butuh cara untuk memvalidasi input saat tombol 'Pesan' diklik, yaitu memastikan field nama pemesan dan nomor telepon tidak kosong atau hanya berisi spasi. Jika ada yang belum diisi, munculkan pesan peringatan. Jika semua valid, tampilkan pesan konfirmasi. Tolong berikan contoh implementasinya."

Hasil Bantuan AI
Google Gemini memberikan solusi dengan membaca nilai teks dari komponen JTextField lalu memanggil method trim() untuk menyingkirkan spasi yang tidak relevan. Pengecekan dilakukan menggunakan kondisi logika sederhana sebelum alur transaksi dijalankan.

Contoh struktur kode yang disarankan:

Java
private void validasiDanPesan() {

    String inputNama = txtNamaPemesan.getText().trim();
    String inputTelepon = txtNomorHp.getText().trim();

    if (inputNama.isEmpty() || inputTelepon.isEmpty()) {
        JOptionPane.showMessageDialog(
                this,
                "Nama pemesan dan nomor HP wajib diisi!",
                "Peringatan Validasi",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    JOptionPane.showMessageDialog(
            this,
            "Seluruh data pemesan telah lengkap dan siap diproses.",
            "Validasi Berhasil",
            JOptionPane.INFORMATION_MESSAGE
    );
}
Implementasi tersebut diadaptasi ke dalam listener tombol pesan pada proyek untuk mencegah masuknya data kosong ke sistem pemesanan.

Prompt 2 – Pembacaan Pilihan Radio Button Kelas Layanan
Prompt
"Pada form aplikasi tiket travel saya, ada pilihan kelas kursi: Ekonomi, Bisnis, dan Eksekutif menggunakan JRadioButton. Bagaimana cara memeriksa tombol mana yang sedang dicentang pengguna saat aksi tombol submit dijalankan, lalu menampilkan nama kelas tersebut pada pop-up dialog?"

Hasil Bantuan AI
Google Gemini memaparkan bahwa status pemilihan komponen JRadioButton dievaluasi lewat pemanggilan method isSelected(). Hasil evaluasi beruntun kemudian disimpan ke dalam variabel teks penampung.

Contoh kode yang diberikan:

Java
private void periksaPilihanKelas() {

    String kelasTerpilih = "Tidak dipilih";

    if (rbEkonomi.isSelected()) {
        kelasTerpilih = "Ekonomi";
    } else if (rbBisnis.isSelected()) {
        kelasTerpilih = "Bisnis";
    } else if (rbEksekutif.isSelected()) {
        kelasTerpilih = "Eksekutif";
    }

    JOptionPane.showMessageDialog(
            this,
            "Kelas layanan yang Anda pilih: " + kelasTerpilih,
            "Status Pilihan",
            JOptionPane.INFORMATION_MESSAGE
    );
}
AI juga mengingatkan pentingnya pengelompokan komponen menggunakan ButtonGroup agar sifat eksklusivitas pilihan terjaga (hanya satu radio button yang bisa aktif sekaligus).

Prompt 3 – Penanganan Logika Sakelar Tampilan Menggunakan JToggleButton
Prompt
"Saya menambahkan sebuah JToggleButton untuk beralih mode tampilan pada form Java Swing. Saya ingin label tombol otomatis berganti tulisan antara 'Mode Terang' dan 'Mode Gelap' mengikuti kondisi tombol yang ditekan. Bagaimana cara menuliskan kodenya pada event handler?"

Hasil Bantuan AI
Google Gemini merekomendasikan penanganan status sakelar dengan memanfaatkan isSelected() di dalam event handler ActionPerformed. Kondisi boolean tersebut menjadi dasar penentuan teks baru melalui method setText().

Contoh implementasi:

Java
private void btnModeToggleActionPerformed(
        java.awt.event.ActionEvent evt) {

    if (btnModeToggle.isSelected()) {
        btnModeToggle.setText("Mode Gelap");
    } else {
        btnModeToggle.setText("Mode Terang");
    }
}
Logika ini menjadi acuan dasar dalam program untuk menyinkronkan label tombol sekaligus memicu perubahan look and feel tema jendela aplikasi.

Alasan Penggunaan AI
Integrasi Google Gemini selama pengembangan FormTiketTravel bertujuan mempercepat penyelesaian hambatan teknis dan mempermudah pemahaman dokumentasi Java Swing secara interaktif.

Pemanfaatan AI difokuskan pada perancangan alur logika pemrograman (business logic), seperti:

Penanganan validasi string input pada JTextField

Penentuan alur seleksi kondisi dari JRadioButton dan ButtonGroup

Pengolahan aksi interaktif pada JToggleButton

Penyampaian umpan balik kepada pengguna via JOptionPane

Perancangan tata letak visual (layout UI) tetap dikerjakan secara mandiri menggunakan GUI Builder NetBeans dengan menyusun komponen visual secara terstruktur. Kode yang disediakan oleh AI tidak disalin secara mentah, melainkan disesuaikan kembali dengan standar penamaan variabel dan struktur modular program yang sedang dibangun.

Pendekatan ini memastikan bahwa peran AI tetap berada pada koridor alat bantu eksplorasi logika dan sarana belajar, sementara kendali perancangan arsitektur dan penulisan kode akhir tetap berada di tangan pengembang.