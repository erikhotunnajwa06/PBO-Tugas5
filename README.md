# Deskripsi
Secara keseluruhan, praktikum ini memberikan pemahaman menyeluruh tentang integrasi database dengan aplikasi Java, pembuatan antarmuka pengguna menggunakan JFrame, pengelolaan data dengan operasi CRUD, serta penanganan error melalui custom exception.
# Koneksi NetBeans dengan PostgreSQL
Koneksi antara NetBeans dan PostgreSQL merupakan langkah penting dalam pengembangan program berbasis database. PostgreSQL adalah sistem manajemen basis data relasional open-source yang handal dan banyak digunakan. NetBeans sebagai Integrated Development Environment (IDE) menyediakan kemudahan dalam mengelola proyek Java yang terintegrasi dengan database PostgreSQL melalui JDBC (Java Database Connectivity). Dengan koneksi ini, pengembang dapat melakukan operasi CRUD (Create, Read, Update, Delete) secara langsung dari aplikasi Java yang dibuat di NetBeans.
# JFrame Form
JFrame adalah salah satu class utama di Java Swing yang dipakai untuk membuat window (jendela GUI).
Bisa diibaratkan sebagai kanvas utama tempat kamu menempelkan komponen lain seperti:

JLabel → menampilkan teks

JTextField → input teks

JButton → tombol

JTable → tabel data

JPanel → panel sebagai wadah tata letak

Jadi kalau di dunia nyata, JFrame itu kerangka jendela, sedangkan komponen Swing lain itu isinya.

# Insert, Update, Delete, dan Select Table
Dalam source code di JFrame Form Data Sembako ada beberapa code untuk diimplementasikan dengan designnya.

Insert: Menambahkan data baru ke dalam tabel.

Update: Memperbarui data yang sudah ada di tabel.

Delete: Menghapus data dari tabel.

Select Table: Mengambil dan menampilkan data dari tabel.

# Custom Exception 
Custom Exception adalah class buatan kita sendiri yang mewarisi (extends) kelas Exception atau RuntimeException.

•	Checked Exception → extends Exception → wajib ditangani dengan try-catch atau throws.

•	Unchecked Exception → extends RuntimeException → opsional ditangani.

