## janji
### Saya Muhammad Alfi faiz NIM 2207045 mengerjakan
### soal Latihan 5 dalam mata kuliah Desain Pemograman Berorientasi Objek
### untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Pengelola Data Mahasiswa

## Desain Program

sebuah program sederhana untuk mengelola data mahasiswa. Berikut adalah desain programnya:

### Kelas Mahasiswa

Kelas  Mahasiswa  digunakan untuk merepresentasikan objek mahasiswa. Setiap mahasiswa memiliki atribut seperti NIM, nama, jenis kelamin, dan alamat. Kelas ini memiliki constructor untuk inisialisasi objek mahasiswa, getter dan setter untuk mengakses dan mengubah nilai atribut, serta metode  populateList()  untuk mengisi daftar mahasiswa awal.

### Kelas Menu

Kelas  Menu  adalah kelas utama yang menampilkan GUI (Graphical User Interface) dari aplikasi. GUI terdiri dari beberapa elemen seperti text field, combo box, tombol, dan tabel. Pengguna dapat menambahkan, mengubah, dan menghapus data mahasiswa melalui GUI ini. Kelas  Menu  juga mengatur interaksi antara elemen GUI dengan operasi-operasi yang terkait dengan data mahasiswa seperti insert, update, delete, dan clear form.

### Kelas Database

Kelas  database adalah kelas untuk mengkonekan code program dengan database yang ada di localhost

## Alur Program

1. Saat program dijalankan, sebuah GUI akan ditampilkan.
2. GUI akan menampilkan daftar mahasiswa yang sudah ada dalam tabel.
3. Pengguna dapat menambahkan data mahasiswa baru dengan mengisi formulir pada bagian input data dan menekan tombol "Add".
4. Pengguna juga dapat mengubah atau menghapus data mahasiswa yang sudah ada dengan memilih baris yang sesuai dalam tabel, mengedit formulir pada bagian input data, dan menekan tombol "Update" atau "Delete".
5. Saat tombol "Add" atau "Update" ditekan, data yang dimasukkan akan disimpan dalam daftar mahasiswa dan tabel akan diperbarui.
6. Saat tombol "Delete" ditekan, data mahasiswa yang dipilih akan dihapus dari daftar dan tabel akan diperbarui.
7. Saat tombol "Cancel" ditekan, formulir pada bagian input data akan dibersihkan.
8. Setiap operasi yang berhasil akan menampilkan pesan sukses dan mengeluarkan feedback ke konsol.
9. terdapat waning ketika saat pengisian data terdapat isi yang kosong
10. Terdapat warning ketika nim yang ditambahka saat tambah data sudah ada sebelumnya di dalam database

Atribut yang ditambahkan adalah alamat

### dokumentasi
![Screenshot 2024-03-16 222657](https://github.com/AlfiFaiz/LP5DPBO2024C1/assets/134774589/2a41e337-8e14-45d5-9e25-ed61b4aae53c)
