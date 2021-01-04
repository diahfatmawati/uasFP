package com.example.uas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

// membuat class dengan nama MainActivity untuk Bangun Ruang
class MainActivity2 : AppCompatActivity() {

    // menggunakan konten view file activity_main2.xml dari folder layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // memberi judul BANGUN RUANG pada actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "BANGUN RUANG"
        // untuk menampilkan tanda panah (untuk kembali kehalaman sebelumnya) pada actionBar
        actionBar.setDisplayHomeAsUpEnabled(true)

        // memanggil id recycler view activity_main2 untuk menghubungkan data dengan widget view
        val testData = createBangun()
        rv_bangun.layoutManager = LinearLayoutManager(this)
        rv_bangun.setHasFixedSize(true)
        // AdapterBangun sebagai penghubung antara data dengan view
        rv_bangun.adapter = AdapterBangun(testData, { itemBangun : Bangun -> itemBangunClicked(itemBangun) })
    }

    // untuk membuat nilai yang akan ditampilkan pada activity detail bangun ruang
    // menampilkan data saat aplikasi berhasil di run
    private fun itemBangunClicked(itemBangun : Bangun) {
        val showDetailActivityIntent = Intent(this, DetailBangunRuang::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, itemBangun.imageBangun)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, itemBangun.listBangun)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, itemBangun.nameBangun)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, itemBangun.allAboutBangun)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, itemBangun.soalBangun)
        startActivity(showDetailActivityIntent)
    }

    private fun createBangun() : List<Bangun> {
        // menampilkan list dan detail data
        val partList = ArrayList<Bangun>()
        partList.add(
            // data dari bangun ruang
            Bangun(
                R.drawable.kubus,
                "Archimedes adalah seorang ilmuwan penemu bangun ruang kubus.",
                "KUBUS - CUBE",
                "Apa itu Kubus ?.. \n"+
                            "\t\t Kubus atau Cube merupakan suatu bangun ruang tiga dimensi yang dibatasi oleh enam sisi serupa yang berwujud bujur sangkar. Kubus juga dikenal dengan nama lain yaitu bidang enam beraturan. Kubus sebetulnya adalah bentuk khusus dari prisma segiempat, sebab tingginya sama dengan sisi alas." +
                            "\n\nSifat-Sifat Kubus\n" + "1. Memiliki 6 sisi \n" + "2. Memiliki 12 rusuk \n" + "3. Memiliki 8 titik sudut\n" + "4. Memiliki 4 diagonal ruang\n" + "5. Memiliki 12 bidang diagonal\n" +
                            "\nRumus Kubus\n" + "V = r x r x r\n" + "LP = 6 (s x s)\n" + "PD bidang = s√2\n" + "PD ruang = s√3\n" + "LB diagonal = s²√2\n" +
                            "\nKeterangan\n" + "r = Panjang rusuk kubus\n" + "V = Volume kubus\n" + "LP = Luas permukaan kubus\n" + "PD = Panjang diagonal\n" + "LB = Luas bidang",
                "Latihan Soal dan Cara Mengerjakannya\n" +
                        "\nSoal No 1" + "\nDiketahui sebuah kubus memiliki rusuk dengan panjang 3cm. Berapakah volume kubus tersebut?\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "r = 5cm\n" + "Ditanya :\n" + "volume kubus?\n" + "Penyelesaian :\n" + "V = r x r x r\n" + "V = 3 x 3 x 3\n" + "V = 27cm3\n" + "jadi, volume kubus adalah 27cm3.\n" +
                        "\n\nSoal No 2" + "\nDiketahui sebuah kubus memiliki rusuk dengan panjang 10cm. Berapakah volume kubus tersebut?\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "r = 9cm\n" + "Ditanya :\n" + "volume kubus?\n" + "Penyelesaian :\n" + "V = r x r x r\n" + "V = 10 x 10 x 10\n" + "V = 1000cm3\n" + "jadi, volume kubus adalah 1000cm3."
            )
        )
        partList.add(
            Bangun(
                R.drawable.balok,
                "Archimedes adalah seorang ilmuwan penemu bangun ruang balok.",
                "BALOK - CUBOID ",
                "Apa itu Balok ?..\n" + "\t\t Balok atau Cuboid adalah suatu bangun ruang yang mempunyai tiga pasang sisi segi empat. Di mana pada masing-masing sisinya yang berhadapan mempunyai bentuk serta ukuran yang sama. Berbeda halnya dengan kubus di mana seluruh sisinya kongruen berbentuk persegii, dan pada balok hanya sisi yang berhadapan yang sama besar. Serta tidak seluruhnya berbentuk persegii, kebanyakan berbentuk persegii panjang. Contoh balok dalam kehidupan sehari-hari antara lain lemari, tempat pensil, kotak P3K, novel, buku tebal, penghapus, dan lain-lain.\n" +
                        "\nSifat-Sifat Balok\n" + "1. Memiliki 2 dua pasang sisi yang berbentuk persegii panjang\n" + "2. Memiliki 12 rusuk \n" + "3. Memiliki 8 titik sudut\n" + "4. Bidang diagonalnya berbentuk persegii panjang\n" + "5. Rusuk-rusuk yang sejajar memiliki ukuran yang sama panjang, yaitu AB = CD = EF = GH, dan AE = BF = CG = DH\n" +
                        "\nRumus Kubus\n" + "V = p x l x t\n" + "LP = 2 (pl + pt + lt)\n" + "PD Bidang = √(p²+l²)\n" + "PD Ruang = √(p²+l²+t²)\n" +
                        "\nKeterangan\n" + "p = panjang\n" + "l = lebar\n" + "t = tinggi\n" + "V = volume kubus\n" + "LP = luas permukaan kubus\n" + "PD = panjang diagonal",
                "Latihan Soal dan Cara Mengerjakannya\n" +
                        "\nSoal no \n" + "Diketahui sebuah balok memiliki panjang, lebar, dan tinggi 8cm, 2cm, dan 5cm. Berapakah volume balok tersebut?\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "panjang = 8cm\n" + "lebar = 2cm\n" + "tinggi = 5cm\n" + "Ditanya :\n" + "volume balok?\n" + "Penyelesaian :\n" + "V = p x l x t\n" + "V = 8 x 2 x 5\n" + "V = 80cm³\n" + "jadi, volume balok adalah 80cm³.\n" +
                        "\nSoal no 2 \n" + "Diketahui sebuah balok memiliki panjang, lebar, dan tinggi 8cm, 2cm, dan 5cm. Berapakah luas permukaan balok tersebut?\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "panjang = 8cm\n" + "lebar = 2cm\n" + "tinggi = 5cm\n" + "Ditanya :\n" + "luas permukaan balok?\n" + "Penyelesaian :\n" + "LP = 2 (pl + pt + lt)\n" + "LP = 2 (8 + 2 + 5)\n" + "LP = 30cm²\n" + "jadi, luas permukaan balok adalah 30cm²."
            )
        )
        partList.add(
            Bangun(
                R.drawable.limas,
                "Plato adalah seorang ilmuwan penemu bangun ruang limas.",
                "LIMAS - PYRAMID",
                "Apa itu Limas ?..\n" + "\t\t Limas atau Pyramid adalah bangun ruang yang memiliki alas segi banyak dengan sisi-sisi tegaknya berbentuk segitiga dengan puncak dibagian atasnya. Terdapat banyak jenis limas yang dikategorikan dengan dilandasi bentuk alasnya, antara lain limas segitiga, limas segi empat, limas segi lima, dan yang lainnya. Contoh limas dalam kehidupan sehari-hari antara lain topi kerucut, corong, gunung, dan lain-lain.\n" +
                        "\nJenis-Jenis Limas\n" + "Limas mempunyai beberapa bentuk bangun ruang berdasarkan bentuk bangun alasnya.\n" +
                        "\n1. Limas Segitiga\n" + "\t\t Merupakan jenis limas yang alasnya berbentuk segitiga, baik segitiga sama sisi, sama kaki, maupun segitiga sembarang.\n" +
                        "\nUnsur limas segitiga\n" + "1. 4 buah titik sudut\n" + "2. 4 buah bidang sisi\n" + "3. 6 buah rusuk\n" +
                        "\n2. Limas Segi Empat\n" + "\t\t Merupakan jenis limas yang alasnya berbentuk segi empat (persegii, persegii panjang, layang-layang, belah ketupat, jajar genjang, trapesium, dan bentuk bangun datar segi empat lainnya).\n" +
                        "\nUnsur limas segi empat\n" + "1. 5 buah titik sudut\n" + "2. 5 buah bidang sisi\n" + "3. 8 buah rusuk\n" +
                        "\n3. Lias Segi Lima\n" + "\t\t Merupakan jenis limas yang mempunyai bentuk alas bangun datar segi lima baik itu segi lima teratur maupun segi lima sembarang.\n" +
                        "\nUnsur limas segi lima\n" + "1. 6 buah titik sudut\n" + "2. 6 buah bidang sisi\n" + "3. 10 buah rusuk\n" +
                        "\n4. Limas Segi Enam\n" + "\t\t Merupakan jenis limas yang mempunyai bentuk alas segi enam, baik segi enam teratur maupun segi enam sembarang.\n" +
                        "\nUnsur limas segi enam\n" + "1. 7 buah titik sudut\n" + "2. 7 buah bidang sisi\n" + "3. 12 buah rusuk\n" +
                        "\nSifat-Sifat Limas\n" + "1. Bidang atas limas merupakan sebuah titik yang lancip\n" + "2. Bidang bawah limas berupa bangun datar\n" + "3. Bidang sisi tegak limas berbentuk segitiga\n" +
                        "\nRumus Limas\n" + "V = 1/3 LA x t\n" + "LP = luas sisi alas + luas seluruh sisi tegak\n" +
                        "\nKeterangan\n" + "t = tinggi\n" + "V = volume kubus\n" + "LA = luas alas limas\n" + "LP = luas permukaan limas",
                "Latihan Soal dan Cara Mengerjakannya\n" +
                        "\nSoal no 1\n" + "Limas segi enam beraturan memiliki luas alas 120cm² dan luas segitiga tegak 30cm². Tentukan luas permukaan limas segi enam tersebut.\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "LA = 120cm²\n" + "luas segitiga tegak = 30cm²\n" + "Ditanya : \n" + "luas permukaan limas?\n" + "Penyelesaian:\n" + "luas permukaan = luas alas + jumlah luas sisi tegak\n" + "luas alas = 120cm²\n" + "jumlah luas sisi tegak = 6 x luas segitiga tegak = 6 x 30cm² = 180cm²\n" + "jadi, luas permukaan limas segi enam = 120 + 180 = 300cm²\n" +
                        "\nSoal no 2\n" + "Diketahui luas alas limas segiempat 16cm², dengan tinggi segitiga tegak senilai 3cm. Tentukan luas permukaan limas segitiga tersebut.\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "LA = 16cm²\n" + "t = 3cm\n" + "Ditanya : \n" + "Luas permukaan limas?\n" + "Penyelesaian :\n" + "LP = LA + jumlah luas sisi tegak\n" + "LA = 16cm²\n" + "jumlah luas sisi tegak = 4 x luas segitiga = 4 x (½ x 4 x 3) = 24cm²\n" + "jadi, luas permukaan limas = 16 + 24 = 40cm²."
            )
        )
        partList.add(
            Bangun(
                R.drawable.prisma,
                "Plato adalah seorang ilmuwan penemu bangun ruang prisma.",
                "PRISMA - PRISM",
                "Apa itu Prisma ?..\n" + "\t\t Prisma atau prism adalah bangun ruang yang dibatasi oleh dua bidang segi-n beraturan sebagai sisi alas dan sisi tutup, serta n bidang persegii panjang sebagai sisi tegak. Penamaan sebuah prisma ditentukan sesuai banyaknya n sisi alas, yaitu prisma segi n beraturan. Contoh prisma dalam kehidupan sehari-hari antara lain tenda perkemahan, kotak tisu, teropong binokuler, dan lain-lain.\n" +
                        "\nSifat-Sifat Prisma\n" + "1. Memiliki bidang alas yang berupa segitiga kongruen \n" + "2. Memiliki bidang atas yang berupa segitiga kongruen\n" + "3. Memiliki 5 sisi (2 sisi yang berupa alas atas serta bawah, 3 sisi lainnya adalah sisi tegak yang seluruhnya berbentuk segitiga)\n" + "4. Memiliki 9 rusuk\n" + "5. Memiliki 6 titik sudut\n" +
                        "\nRumus Prisma\n" + "L = (2 x luas alas) + (luas seluruh bidang tegak)\n" + "K = 3s (s + s + s)\n" + "V = Luas segitiga x tinggi\n" + "atau juga bisa\n" + "V = ½ x a.s x t.s x t\n" +
                        "\nKeterangan\n" + "L = luas\n" + "K = keliling\n" + "V = volume",
                "Latihan Soal dan Cara Mengerjakannya\n" +
                        "\nSoal no 1\n" + "Sebuah prisma segitiga mempunyai panjang alas 25 cm, tinggi 14 cm. Jika tinggi prisma 22 cm, maka volumenya .... cm³\n" +
                        "\nJawaban \n" + "\nDiketahui :\n" + "a = 25cm\n" + "t = 14cm\n" + "tp = 22cm\n" + "Ditanya :\n" + "volume prisma?\n" + "Penyelesaian :\n" + "V = ½ x alas x tinggi x tinggi prisma\n" + "V = ½ x 25 x 14 x 22\n" + "V = 3.850cm³\n" + "jadi, volume prisma adalah 3.850cm³.\n" +
                        "\nSoal no 2\n" + "Sebuah prisma memiliki volume 4.224cm³, alas 24cm dan tinggi 16cm. Hitunglah tinggi prisma tersebut!\n" +
                        "\nJawaban\n" + "\nDiketahui : \n" + "V = 4.224cm³\n" + "a = 24cm\n" + "t = 16cm\n" + "Ditanya : \n" + "tinggi prisma ?\n" + "Penyelesaian :\n" + "V = ½ x alas x tinggi x tinggi prisma\n" + "4.224 = ½ x 24 x 16 x tp\n" + "4.224 = 192 tp\n" + "tp = 4.224 : 192 = 22cm\n" + "jadi, tinggi prisma adalah 22cm."
            )
        )
        partList.add(
            Bangun(
                R.drawable.tabung,
                "Archimedes adalah seorang ilmuwan penemu bangun ruang tabung.",
                "TABUNG - CYLINDER",
                "Apa itu Tabung ?..\n" + "\t\t Tabung atau cylinder adalah  suatu bangun ruang tiga dimensi yang mempunyai tutup dan alas yang berbentuk sebuah ingkaran dengan memiliki ukuran yang sama dan diselimuti oleh persegii panjang. Contoh tabung dalam kehidupan sehari-hari antara lain bulpoin, selang air, batang bambu, tong sampah, tempat pencil, lampu neon, guling, gelas ukur, dan lain-lain.\n" +
                        "\nSifat-Sifat Tabung\n" + "1. Tabung memiliki 3 sisi, 1 persegii panjang, 2 lingkaran\n" + "2. Tidak memiliki rusuk\n" + "3. Tidak memiliki titik sudut\n" + "4. Tidak memiliki bidang diagonal\n" + "5. Tidak memiliki diagonal bidang\n" + "6. Tabung memiliki sisi alas serta sisi atas berhadapan yang kongruen\n" + "7. Tinggi tabung merupakan jarak titik pusat bidang lingkaran alas dengan titik pusat lingkaran atas\n" + "8. Bidang tegak tabung berwujud lengkungan yang disebut sebagai selimut tabung\n" + "9. Jaring-jaring tabung berwujud 2 buah lingkaran serta 1 persegii panjang\n" +
                        "\nRumus Tabung\n" + "V = π x r² x t\n" + "LA = π x r²\n" + "KA = 2 x π x r\n" + "LS = 2 x π x r x t\n" + "LP = 2 x LA + LS\n" +
                        "\nKeterangan\n" + "V = volume tabung\n" + "π = 22/7 atau 3,14\n" + "r = jari–jari /setengah diameter\n" + "t = tinggi tabung\n" + "LA = luas alas\n" + "KA = keliling alas\n" + "LS = luas selimut\n" + "LP = luas permukaan",
                "Latihan Soal dan Cara Mengerjakannya\n" +
                        "\nSoal no 1\n" + "Sebuah prisma segitiga mempunyai panjang alas 25 cm, tinggi 14 cm. Jika tinggi prisma 22 cm, maka volumenya .... cm³\n" +
                        "\nJawaban \n" + "\nDiketahui :\n" + "a = 25cm\n" + "t = 14cm\n" + "tp = 22cm\n" + "Ditanya :\n" + "volume prisma?\n" + "Penyelesaian :\n" + "V = ½ x alas x tinggi x tinggi prisma\n" + "V = ½ x 25 x 14 x 22\n" + "V = 3.850cm³\n" + "jadi, volume prisma adalah 3.850cm³.\n" +
                        "\nSoal no 2\n" + "Sebuah tabung memiliki panjang jari-jari alas 10,5cm dengan tinggi 20cm dan π 22/7. Hitunglah luas selimut tabung !\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "r = 10,5cm\n" + "t = 20cm\n" + "π = 22/7\n" + "Ditanya :\n" + "luas selimut tabung?\n" + "Penyelesaian :\n" + "Luas selimut = 2 x π x r x t\n" + "Luas selimut = 2 × 22/7 × 10,5 × 20\n" + "Luas selimut = 1.320cm²\n" + "jadi, luas selimut tabung adalah 1.320cm²."
            )
        )
        partList.add(
            Bangun(
                R.drawable.bola,
                "Archimedes adalah seorang ilmuwan penemu bangun ruang bola.",
                "BOLA - SPHERE",
                "Apa itu Bola ?..\n" + "\t\t Bola atau Sphere adalah bangun ruang tiga dimensi yang dibentuk oleh tak hingga lingkaran berjari-jari sama panjang dan berpusat pada satu titik yang sama. Bola hanya memiliki 1 sisi. Contoh bola dalam kehidupan sehari-hari antara lain bola sepak, bola tenis, kue onde0onde, pentol bakso, kelereng, dan lain-lain.\n" +
                        "\nSifat-Sifat Bola\n" + "1. Memiliki 1 sisi \n" + "2. Memiliki 1 titik pusat\n" + "3. Tidak memiliki rusuk\n" + "4. Tidak memiliki titik sudut\n" + "5. Tidak memiliki bidang diagonal\n" + "6. Tidak memiliki diagonal bidang\n" + "7. Sisi bola disebut sebagai dinding bola\n" + "8. Jarak dinding ke titik pusat bola disebut sebagai jari-jari\n" + "9. Jarak dinding ke dinding serta melewati titik pusat disebut sebagai diameter\n" +
                        "\nRumus Bola\nV = 4/3 x π x r³\nL = 4 x π x r²\n" +
                        "\nKeterangan\nV = volume bola\nL = luas permukaan bola\nr = jari–jari bola\nd = diameter bola\nπ = 22/7 atau 3,14",
                "Latihan Soal dan Cara Mengerjakannya\n" +
                        "\nSoal no 1\n" + "Edo di beri sebuah bola oleh ayah nya yang memiliki jari–jari sebesar 30cm. Hitunglah volume bola milik Edo.\n" +
                        "\nJawaban \n" + "\nDiketahui :\n" + "r = 30cm\n" + "Ditanya :\n" + "volume bola milik Edo?\n" + "Penyelesaian :\n" + "V = 4/3 x π x r³\n" + "V = 4/3 x 3,14 x 30cm x 30cm x 30cm\n" + "V = 113.040cm³\n" + "jadi, volume bola milik Edo adalah 113.040cm³.\n" +
                        "\nSoal no 2\n" + "Edo di beri sebuah bola oleh ayah nya yang memiliki jari–jari sebesar 30cm. Hitunglah luas permukaan bola milik Edo.\n" +
                        "\nJawaban\n" + "\nDiketahui : \n" + "r = 30cm\n" + "Ditanya : \n" + "luas permukaan bola milik Edo?\n" + "Penyelesaian :\n" + "L = 4π x r²\n" + "L = 4 x 3,14 x 30cm x 30cm\n" + "L = 11.304cm²\n" + "jadi, luas permukaan bola milik Edo adalah 11.304cm²."
            )
        )
        partList.add(
            Bangun(
                R.drawable.kerucut,
                "Portland adalah seorang ilmuwan penemu bangun ruang kerucut.",
                "KERUCUT - CONE",
                "Apa itu Kerucut?\n" + "\t\t Kerucut atau cone adalah  sebuah bangun ruang yang sisi lengkung yang menyerupai limas segi-n beraturan yang bidang alasnya berbentuk lingkaran, kerucut juga berarti gulungan meruncing dari kertas atau daun. Contoh kerucut dalam kehidupan sehari-hari antara lain nasi tumpeng, topi ulang tahun, cone es krim, dan lain-lain.\n" +
                        "\nSifat-Sifat Kerucut\n" + "1. Memiliki 1 sisi alas berbentuk lingkaran\n" + "2. Memiliki 1 sisi berbentuk bidang lengkung (selimut kerucut)\n" + "3. Memiliki 1 rusuk lengkung \n" + "4. Memiliki 1 titik puncak\n" + "5. Tidak memiliki titik sudut \n" +
                        "\nRumus Kerucut\n" + "L = π x r (r + s)\n" + "V = 1/3 πr² .t\n" +
                        "\nKeterangan\n" + "V = volume kerucut\n" + "π = 22/7 atau 3,14\n" + "r = jari–jari\n" + "d = diameter",
                "Latihan Soal dan Cara Mengerjakannya\n" +
                        "\nSoal no 1\n" + "Sebuah kerucut memiliki jari–jari 10cm dan panjang garis pelukisnya 26cm. Hitunglah luas kerucut tersebut !\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "r = 10cm\n" + "s = 26cm\n" + "Ditanya : \n" + "luas kerucut?\n" + "Penyelesaian :\n" + "L = πr (r + s)\n" + "L = 3,14 x 10 (10 + 26)\n" + "L = 3,14 x 10 x 36\n" + "L = 1.130,4cm²\n" + "jadi, luas Kerucut adalah 1.130,4cm².\n" +
                        "\nSoal no 2\n" + "Sebuah kerucut memiliki jari–jari 45cm dan panjang garis pelukisnya 35cm. Hitunglah luas kerucut tersebut !\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "r = 45cm\n" + "s = 35cm\n" + "Ditanya :\n" + "luas kerucut?\n" + "Penyelesaian :\n" + "L = πr (r + s)\n" + "L = 3,14 x 45 (45 + 35)\n" + "L = 3,15 x 45 x 80\n" + "L = 11.340cm²\n" + "jadi, luas Kerucut adalah 11.340cm²."
            )
        )
        return partList
    }
}