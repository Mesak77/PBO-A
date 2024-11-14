Berikut fitur fitur ATM di dalam kodingan:
- Penarikan adalah fitur untuk menarik uang dari saldo akun. 
- Deposit adalah fitur untuk menyetorkan uang ke dalam akun. 
- Transfer adalah fitur untuk mentransfer sejumlah uang ke akun lain. 
- Cek Saldo adalah fitur untuk memeriksa saldo yang tersedia dalam akun. 
- Ubah PIN adalah fitur untuk mengubah PIN akun. 
- Keluar adalah fitur untuk meninggalkan aplikasi.

1. Ubah pin :

![image](https://github.com/user-attachments/assets/1ff2ab8b-4c33-4a72-9f04-bd1e320aea20)

- Login:
Pengguna memasukkan nomor akun (123456) dan PIN (1234) untuk masuk ke dalam sistem.
- Menu Pilihan:
Setelah login berhasil, program menampilkan menu utama dengan beberapa pilihan, di antaranya penarikan, deposit, transfer, cek saldo, ubah PIN, dan keluar.
- Mengubah PIN:
Pengguna memilih opsi 5 (Ubah PIN).
Program meminta PIN lama (1234) untuk verifikasi.
Pengguna memasukkan PIN baru (6789) dua kali untuk memastikan kesamaan.
Jika PIN berhasil diubah, sistem menampilkan pesan konfirmasi: "PIN berhasil diubah."

2. Saldo Minimal:

<img width="960" alt="image" src="https://github.com/user-attachments/assets/46d2dc0e-35f8-4a1d-b066-87100616b673">

Ketika pengguna memilih opsi 1 (Penarikan), mereka memasukkan jumlah penarikan yang besar, yaitu 20000000 atau Rp20 juta. Program menampilkan pesan error, "Saldo tidak mencukupi. Anda harus menyisakan saldo minimal Rp50.000." Ini menunjukkan bahwa program memiliki aturan bahwa seseorang tidak boleh melanggar saldo minimal (Rp50.000) selama proses penarikan. Transaksi akan dibatalkan jika jumlah penarikan mengurangi saldo di bawah batas minimum ini.
