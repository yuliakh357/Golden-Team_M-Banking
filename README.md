# Golden-Team_M-Banking
Judul              : Projek Lab PBO berbasis Java GUI
Anggota Kelompok   : 1. Ainal Fajri Malahayati(2008107010053)
		     2. Maghfirah ZA          (npm)
		     3. Rahmi Susanti         (npm)
		     4. Yulia Khairunnisa     (2008107010010)

Projek yang dibuat : Mbanking sederhana 

Penjelasan program 

Pada projek ini kami membuat mbanking sederhana berbasis Java GUI. Program kami memiliki 5 tampilan, yang terdiri dari Register, Login, pertaturan, data nasabah, dan yang terakhir adalah Home. Untuk tambahan, kami membuat 1 file yang berfungsi menyimpan data nasabah yang telah diisi oleh user seperti saldo. 

1. Untuk tampilan awal, user akan diarahkan pada laman register untuk melakukan registrasi terlebih dahulu. Pada register, terdapat username dan password yang harus diisi oleh user, untuk memastikan password yang telah dibuat oleh user, kami menggunakan retype password, jdi jika user mengisi password yang berbeda, maka akan muncul perintah warning. Masing2 inputan akan disimpan dalam sebuah variabel baru.
2. Jika berhasil, user akan diarahkan menuju laman peraturan, untuk itu user diminta untuk membaca peraturannya terlebih dahulu. Dengan menekan oke user akan dialihkan menuju data nasabah. 
3. Pada data nasabah ini user wajib mengisi PIN serta saldo awal(minimal 100k). Kemudian data nasabah seperti saldo akan disimpan dalam sebuah file. Dengan adanya file ini, maka data nasabah tadi akan disimpan lalu akan dilakukan operasi untuk membaca dan menulis file. Pada kelas file, terdapat method getter dan setter agar kita dapat memperoleh data saldo yang terbaru. Untuk saldo, akan dilakukan casting dari string ke integer agar memudahkan dalam membuat kondisi untuk melakuka transaksi.
4. Kemudian setelah itu, user akan dialihkan menuju laman login. Pada login juga terdapat kondisi untuk pengecekan apakah username ataupun password yang diinput oleh user sama pada saat registrasi tadi. Jika iya, maka user berhasil menuju home. 
5. Pada home terdapat 3 menu yaitu penarikan, penyetoran, dan informasi saldo. Pada penarikan dan penyetoran, kami menggunakan jradiobutton yang dikombinasikan dengan buttongroup untuk memilih nominal uang yang akan disetor ataupun ditarik. Pada button setor dan tarik kami menggunakan joptionpane, jika berhasil melakukan penarikan ataupun penyetoran maka akan muncul dialog message berhasil melakukan penarikan/penyetoran. Pada informasi saldo, akan ditampilkan dengan joptionpane sisa saldo user terkini. Dan yang terakhir terdapat button keluar, maka user akan terkeluar dari tampilan dan transaksipun selesai.  
