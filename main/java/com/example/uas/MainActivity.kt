package com.example.uas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

// membuat class dengan nama MainActivity untuk Bangun Datar
class MainActivity : AppCompatActivity() {

    // menggunakan konten view file activity_main.xml dari folder layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // memberi judul BANGUN DATAR pada actionBar
        val actionBar = supportActionBar
        actionBar!!.title = "BANGUN DATAR"
        // untuk menampilkan tanda panah (untuk kembali kehalaman sebelumnya) pada actionBar
        actionBar.setDisplayHomeAsUpEnabled(true)

        // memanggil id recycler view activity_main2 untuk menghubungkan data dengan widget view
        val testData = createBangun()
        rv_bangun.layoutManager = LinearLayoutManager(this)
        rv_bangun.setHasFixedSize(true)
        // AdapterBangun sebagai penghubung antara data dengan view
        rv_bangun.adapter = AdapterBangun(testData, { itemFood : Bangun -> itemBangunClicked(itemFood) })
    }

    // untuk membuat nilai yang akan ditampilkan pada activity detail bangun datar
    // menampilkan data saat aplikasi berhasil di run
    private fun itemBangunClicked(itemBangun : Bangun) {
        val showDetailActivityIntent = Intent(this, DetailBangunDatar::class.java)
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
            // data dari bangun datar
            Bangun(
                R.drawable.persegii,
                "Patrik Geometrin adalah seorang ilmuwan penemu bangun datar persegii.",
                "PERSEGI - SQUARE",
                "Apa itu Persegi ?.. \n" + "\t\t Persegi atau Square adalah bangun datar yang mempunyai 4 sisi, keempat sisinya sama panjang dan keempat sudutnya siku-siku. Contoh persegii dalam kehidupan sehari-hari, antara lain ubin lantai keramik, kertas origami, sisi dadu, sisi rubik, papan catur, papan karambol, ular tangga, dan lain-lain."+
                        "\n\nSifat-Sifat Persegi\n" + "1. Memiliki 4 buah simetri lipat\n" + "2. Memiliki 4 buah simetri putar\n" + "3. Memiliki 4 sisi yang sama panjang\n" + "4. Mempunyai 4 sudut berbentuk siku-siku (90°)\n" + "5. Kedua diagonal berpotongan tegak lurus\n" + "6. Memiliki 2 diagonal sama panjang\n" +
                        "\nRumus Persegi\n" + "s = K : 4\n" + "L = s x s atau L = s²\n" + "K = 4 x s atau K = s + s + s + s\n" +
                        "\nKeterangan\n" + "s = panjang sisi persegii\n" + "L = luas\n" + "K = keliling",
                "Latihan Soal dan Cara Mengerjakan \n" +
                        "\n Soal No 1" + "\nBani memiliki kertas origami berbentuk persegii dengan panjang sisi 6cm. Hitunglah keliling kertas origami milik Bani.\n" +
                        "\nJawaban\n" + "\nDiketahui : \n" + "panjang sisi = 6cm\n" + "Ditanya : \n" + "keliling kertas origami?\n" + "Penyelesaian :\n" + "L = 4 x s \n" + "L = 4 x 6 \n" + "L = 24cm²\n" + "jadi, keliling kertas origami milik Bani adalah 24cm².\n" +
                        "\n\n Soal no 2" + "\nAyah membeli sebidangan tanah berbentuk persegii untuk dijadikan gudang dengan panjang sisi tanah sebesar 15m. Hitunglah luas tanah yang akan dijadikan gudang oleh ayah.\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "panjang sisi tanah = 15m\n" + "Ditanya :\n" + "luas tanah yang akan dijadikan gudang oleh ayah?\n" + "Penyelesaian :\n" + "L = s x s \n" + "L = 15 x 15 \n" + "L = 225m\n" + "jadi, luas tanah yang akan dijadikan gudang oleh ayah adalah 225m."
            )
        )
        partList.add(
            Bangun(
                R.drawable.persegipanjang,
                "Patrik Geometrin adalah seorang ilmuwan penemu bangun datar persegii panjang.",
                "PERSEGI PANJANG - RECTANGULAR",
                "Apa itu Persegi Panjang ?.. \n" + "\t\t Persegi Panjang atau Rectangular adalah bangun datar yang berupa segiempat yang mempunyai 2 pasang sisi yang sejajar dan sama panjang serta keempat sudutnya siku-siku. Contoh Persegi Panjang dalam kehidupan sehari-hari, antara lain papan tulis, papan meja, layar komputer, uang kertas, kertas HVS, penggaris, dan lain-lain." +
                        "\n\nSifat-Sifat Persegi Panjang\n" + "1. Memiliki empat sisi\n" + "2. Memliki dua pasang sisi sejajar yang berhadapan dan sama panjang\n" + "3. Memiliki dua buah simetri lipat\n" + "4. Memliki dua garis diagonal yang sama panjang\n" + "5. Memiliki empat titik sudut berbentuk sudut siku-siku (90°)\n" + "6. Memliki dua garis diagonal yang sama panjang\n" +
                        "\nRumus Persegi Panjang\n" + "p = (K : 2) - l atau p = L : l\n" + "l = (K : 2) - p atau l = L : p\n" + "L = p x l\n" + "K = 2 x (p + l)\n" +
                        "\nKeterangan\n" + "p = panjang persegii panjang\n" + "l = lebar persegii panjang\n" + "L = luas\n" + "K = keliling",
                "Latihan Soal dan Cara Mengerjakan\n" +
                        "\nSoal no 1\n" + "Ibu membuat kue coklat berbentuk persegii panjang. Panjang dan lebar cetakan kue coklat milik ibu adalah 15cm dan 10cm. Hitunglah luas kue coklat yang dibuat ibu.\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "panjang cetakan = 15cm\n" + "lebar cetakan = 10cm\n" + "Ditanya :\n" + "luas kue coklat yang dibuat ibu?\n" + "Penyelesaian :\n" + "L = p x l \n" + "L = 15 x 10 \n" + "L = 150cm²\n" + "jadi, luas kue coklat yang dibuat ibu adalah 150cm²\n" +
                        "\n\nSoal no 2\n" + "Paman memiliki kayu berbentuk persegii panjang yang memiliki keliling 6 meter dan panjang 2 meter. Hitunglah lebar kayu milik paman.\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "keliling kayu = 6 meter\n" + "panjang kayu = 2 meter\n" + "Ditanya :\n" + "lebar kayu milik paman?\n" + "Penyelesaian :\n" + "l = (K : 2) - p \n" + "l = (6 : 2) - 2 \n" + "l = 3 - 2 \n" + "l = 1 meter\n" + "jadi, lebar katu milik p"
            )
        )
        partList.add(
            Bangun(
                R.drawable.segitiga,
                "Blaise Pascal adalah seorang ilmuwan penemu bangun datar segitiga.",
                "SEGITIGA - TRIANGLE",
                "Apa itu Segitiga ?..\n" + "\t\t Segitiga atau Triangle adalah sebuah bangun datar yang dibatasi oleh 3 buah sisi dan mempunyai 3 buah titik sudut. Contoh Segitiga dalam kehidupan sehari-hari, antara lain penggaris segitiga, alat musik Triangle, sisi piramida di Negara Mesir, dan lain-lain." +
                        "\n\nJenis-Jenis Segitiga Berdasarkan Ukuran & Jenisnya\n" +
                        "1. Segitiga Sama Kaki\n" + "\t\tSegitiga sama kaki adalah jenis segitiga yang memiliki sepasang sisi yang sama Panjang. Terdapat dua sudut yang sama besar. Sepasang sisi yang sama Panjang yaitu sisi AB dan sisi AC. Sedangkan pasangan sudut yang sama besar yaitu sudut ABC dan sudut ACB.\n" +
                        "2. Segitiga Sama Sisi\n" + "\t\tSegitiga sama sisi adalah segitiga yang ketiga sisi dan sudutnya memiliki ukuran yang sama. Ketiga sisi yang sama yaitu sisi AB, sisi BC, dan sisi AC. Ketiga sudutnya juga sama besar yaitu sudut ABC, sudut ACB, dan sudut BAC.\n" +
                        "3. Segitiga Sembarang\n" + "\t\tSegitiga sembarang adalah jenis segitiga dengan ukuran ketiga sisinya berbeda dan ketiga sudutnya memiliki ukuran yang berbeda pula. sisi AB, sisi BC, dan sisi AC memiliki ukuran sisi yang tidak sama Panjang. Ukuran ketiga sudutnya yaitu sudut ABC, sudut ACB, dan sudut BAC berbeda.\n" + "\nJenis-Jenis Segitiga Berdasarkan Sudutnya\n" +
                        "1. Segitiga Lancip\n" + "\t\tSegitiga Lancip adalah bangun segitiga yang ketiga sudutnya memiliki ukuran kurang dari 90°.\n" +
                        "2. Segitiga Siku-Siku\n" + "\t\tSegitiga siku-siku merupakan jenis segitiga yang salah satu sudutnya memiliki ukuran 90°.\n" +
                        "3. Segitiga Tumpul\n" + "\t\tPada segitiga tumpul, terdapat salah satu sudutnya yang berukuran lebih dari 90°.\n" +
                        "\nRumus Segitiga\n" + "L = ½ x a x t\n" + "K = BC + AC + AB atau \n" + "K = a + b + c\n" +
                        "\nKeterangan\n" + "a = panjang alas segitiga\n" + "t = tinggi segitiga\n" + "L = luas\n" + "K = keliling\n" + "catatan -> panjang sisi miring segitiga siku-siku dicari dengan rumus Phytagoras (A2 + B2 = C2)",
                "Latihan Soal dan Cara Mengerjakannya\n" +
                        "\nSoal no 1\n" + "Suatu segitiga sama kaki memiliki ukuran kaki segitiga 6 cm dan sisi lainnya 5 cm. Tentukan keliling segitiga tersebut!\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "a = 6cm\n" + "b = 6cm\n" + "c = 5cm\n" + "Ditanya :\n" + "keliling segitiga?\n" + "Pembahasan\n" + "K = a + b + c \n" + "K = 6cm + 6cm + 5cm \n" + "K = 17cm\n" + "jadi, keliling segitiga adalah 17cm.\n" +
                        "\nSoal no 2\n" + "Suatu segitiga memiliki ukuran alas dan tinggi masing-masing 8 cm dan 11 cm. Tentukan luas segitiga tersebut!\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "alas = 8cm\n" + "tinggi = 11cm\n" + "Ditanya :\n" + "luas segitiga?\n" + "Penyelesaian :\n" + "L = ½ x alas x t\n" + "L = ½ x 8cm x 11cm\n" + "L = 44 cm²\n" + "jadi, luas segitiga adalah 44cm²."
            )
        )
        partList.add(
            Bangun(
                R.drawable.jajargenjang,
                "masih belum diketahui secara pasti.",
                "JAJAR GENJANG - PARALLELOGRAM",
                "Apa itu Jajar Genjang ?..\n" + "\t\t Jajar Genjang atau Parallelogram adalah bangun datar yang berupa segiempat mempunyai sisi-sisi yang berhadapan sama panjang dan sejajar, serta sudut-sudut yang berhadapan sama besar. Contoh Jajar Genjang dalam kehidupan sehari-hari, antara lain motif pada batik, \n" +
                        "\nSifat-Sifat Jajar Genjang\n" + "1. Memiliki 2 pasang sisi yang sejajar dan sama panjang\n" + "2. Memiliki 2 pasang sudut yang berhadapan sama besar\n" + "3. Memiliki 2 diagonal yang membagi jajar genjang menjad dua sama besar\n" + "4. Salah satu sudut lancip dijumlahkan dengan salah satu sudut tumpul menghasilkan nilai 180°\n" +
                        "\nRumus Jajar Genjang\n" + "K = 2 × (a + b)\n" + "L = a × t\n" + "a = (K ÷ 2) - b\n" + "b = (K ÷ 2) - a\n" + "t = L ÷ a\n" + "a = L ÷ t\n" +
                        "\nKeterangan\n" + "L = luas\n" + "K = keliling\n" + "a = sisi alas\n" + "b = sisi miring\n" + "t = tinggi",
                "Latihan Soal dan Cara Mengerjakan\n" +
                        "\nSoal no 1\n" + "Sebuah bangun datar Jajar Genjang memiliki alas 12cm dengan tinggi 5cm. Hitunglah luas dari bangun tersebut!\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "alas = 14cm\n" + "tinggi = 6cm\n" + "Ditanya :\n" + "luas bangun datar Jajar Genjang?\n" + "Penyelesaian :\n" + "L = a x t \n" + "L = 14 x 6 \n" + "L = 84cm²\n" + "jadi, luas bangun datar Jajar Genjang adalah 84cm².\n" +
                        "\nSoal no 2\n" + "Diketahui suatu jajar genjang mempunyai sisi alas 5 cm dan keliling 20 cm, hitunglah panjang sisi miring jajar genjang tersebut!\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "Keliling = 20 cm \n" + "Sisi alas = 5 cm\n" + "Ditanya  : \n" + "Sisi miring jajar genjang (b)!\n" + "Penyelesaian :\n" + "K = 2 × (a + b)\n" + "b = (K ÷ 2) - a\n" + "b = (20 ÷ 2) - 5\n" + "b = 10 - 5\n" + "b = 5 cm\n" + "Jadi, sisi miring jajar genjang adalah 6cm."
            )
        )
        partList.add(
            Bangun(
                R.drawable.trapesium,
                "Leonhard Euler adalah seorang ilmuwan penemu bangun datar trapesium.",
                "TRAPESIUM - TRAPEZOID",
                "Apa itu Trapesium ?..\n" + "\t\t Trapesium atau Trapezoid adalah bangun datar yang berupa segiempat, yang memiliki sepasang sisi yang sejajar. Contoh Trapesium dalam kehidupan sehari-hari, antara lain layang-layang, Jembatan rangka batang (truss brigde), dan lain-lain. \n" +
                        "\nJenis-Jenis Trapesium\n" +
                        "1. Trapesium Siku–Siku / Right Trapezoid\n" + "\t\t Trapesium siku-siku adalah jenis trapesium yang mempunyai dua sudut siku-siku ini pada titik sudutnya. Trapesium ini tidak memiliki simetri lipat, tetapi memiliki satu buah simetri putar.\n" +
                        "2. Trapesium Sama Kaki / Isosceles Trapezoid\n" + "\t\t Trapesium sama kaki adalah jenis trapesium yang mempunyai sepasang sisi yang sama panjang dan simetris, serta memiliki dua buah sudut tumpul dan dua sudut lancip yang masing-masing sama besar. Trapesium ini memiliki satu simetri lipat dan satu simetri putar.\n" +
                        "3. Trapesium Sembarang / Scalene Trapezoid\n" + "\t\t Trapesium sembarang adalah jenis trapesium yang keempat sisinya memiliki ukuran tidak sama panjang. Sehingga keempat sudutnya besarnya berbeda. Trapesium ini tidak memiliki simetri lipat, tetapi dan memiliki 1 buah simetri putar.\n" +
                        "\nSifat-Sifat Trapesium\n" + "1. Mempunyai 4 sisi\n" + "2. Mempunyai 4 sudut\n" + "3. Mempunyai sepasang sisi sejajar, tetapi tidak sama panjang\n" + "4. Jumlah sudut-sudut diantara sisi sejajar besarnya 180°\n" +
                        "\nRumus Trapesium\n" + "L = ½ × (a + b) × t\n" + "K = s1 + s2 + s3 + s4\n" + "t = (2 × L) : (a + b)\n" +
                        "\nKeterangan\n" + "t = tinggi trapesium\n" + "s1 = sisi-sisi sejajar pada trapesium\n" + "s2 = sisi-sisi sejajar pada trapesium\n" + "s3 = sisi-sisi sejajar pada trapesium\n" + "s4 = sisi-sisi sejajar pada trapesium\n" + "L = luas\n" + "K = keliling",
                "Latihan Soal dan Cara Mengerjakan\n" +
                        "\nSoal no 1\n" + "Sebuah trapesium memiliki sepasang sisi sejajar masing-masing berukuran 8 cm dan 12 cm. Jika tinggi trapesium 10 cm, hitunglah luas trapesium tersebut !\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "a = 8 cm\n" + "b = 12 cm\n" + "t = 10 cm\n" + "Ditanya :\n" + "Luas trapesium?\n" + "Penyelesaian :\n" + "L = ½ × (a + b) × t\n" + "L = ½ × (8 + 12) × 10\n" + "L = ½ × 20 × 10\n" + "L = ½ × 200\n" + "L = 100cm²\n" + "Jadi, luas trapesium tersebut adalah 100cm².\n" +
                        "\nSoal no 2\n" + "Sebuah trapesium memiliki luas 90 cm². Jika ukuran sepasang sisi sejajar pada trapesium adalah 8 cm dan 12 cm, hitunglah berapa tinggi trapesium tersebut !\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "L = 90 cm²\n" + "a = 8 cm\n" + "b = 12 cm\n" + "Ditanya :\n" + "Tinggi trapesium?\n" + "Penyelesaian :\n" + "t = (2 × L) : (a + b)\n" + "t = (2 × 90) : (8 + 12)\n" + "t = 180 : 20\n" + "t = 9cm\n" + "Jadi, tinggi trapesium tersebut adalah 9cm."
            )
        )
        partList.add(
            Bangun(
                R.drawable.layanglayang,
                "masih belum diketahui secara pasti.",
                "LAYANG-LAYANG - KITE",
                "Apa itu Layang-Layang ?..\n" + "\t\t Layang-layang atau kite adalah bangun datar segi empat yang mempunyai dua pasang sisi sama panjang dan memiliki sepasang sudut yang berhadapan sama besar. Layang-layang mempunyai dua garis diagonal yang saling tegak lurus, namun garis diagonal layang-layang tidak sama panjang seperti yang terdapat pada persegii.\n" +
                        "\nSifat-Sifat Layang-Layang\n" + "1. Memiliki 4 sisi AB, BC, CD, dan DA\n" + "2. Memiliki 4 sudut <A, <B, <C, dan <D\n" + "3. Memiliki 2 pasang sisi sama panjang, garis AB = BC dan CD = DA\n" + "4. Mmeiliki 2 sudut sama besar\n" +
                        "\nRumus Layang-Layang\n" + "L = ½ × d1 × d2\n" + "K = AB + BC + CD + DA atau K = 2 × (BC + CD)\n" + "Sisi AB = (½ × K) – AD\n" + "Sisi CD = (½ × K) – BC\n" + "d1 = (2 × L) : d2\n" + "d2 = (2 × L) : d1\n" +
                        "\nKeterangan\n" + "d1 = diagonal 1\n" + "d2 = diagonal 2\n" + "L = luas\n" + "K = keliling",
                "Latihan Soal dan Cara Menegrjakannya\n" +
                        "\nSoal no 1\n" + "Sebuah layang-layang memiliki keliling 20 cm. Jika sisi pendek (a) layang-layang 4 cm. Hitunglah berapa sisi panjang (c) layang-layang tersebut !\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "K = 20 cm\n" + "a = 4 cm\n" + "Ditanya :\n" + "Sisi panjang (c) layang-layang?\n" + "Penyelesaian :\n" + "Sisi c = (½ × K) – a\n" + "Sisi c = (½ × 20) – 4\n" + "Sisi c = 10 – 4\n" + "Sisi c = 6cm\n" + "Jadi, sisi panjang (c) layang-layang tersebut adalah 6cm.\n" +
                        "\nSoal no 2\n"+ "Sebuah layang – layang memiliki panjang diagonal 10 cm dan 20 cm. Hitunglah luas layang-layang tersebut !\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "d1 = 10 cm\n" + "d2 = 20 cm\n" + "Ditanya :\n" + "Luas layang-layang !\n" + "Penyelesaian :\n" + "L = ½ × d1 × d2\n" + "L = ½ × 10 × 20\n" + "L = ½ × 200\n" + "L = 100cm²\n" + "Jadi, luas layang-layang tersebut adalah 100cm².\n" +
                        "\nSoal no 3\n" + "Sebuah layang-layang memiliki ukuran sisi pendek (a) = 5 cm dan sisi panjang (b) = 7 cm. Hitunglah berapa keliling layang-layang tersebut !\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "a = 5 cm\n" + "b = 7 cm\n" + "Ditanya :\n" + "Keliling layang-layang !\n" + "Penyelesaian :\n" + "K = 2 × (a + b)\n" + "K = 2 × (5 + 7)\n" + "K = 2 × 12\n" + "K = 24cm\n" + "Jadi, keliling layang-layang tersebut adalah 24cm."
            )
        )
        partList.add(
            Bangun(
                R.drawable.belaketupat,
                "masih belum diketahui secara pasti.",
                "BELA KETUPAT - RHOMBUS",
                "Apa itu Belah Ketupat ?..\n" + "\t\t Belah Ketupat atau Rhombus adalah bangun datar yang berupa segiempat, keempat sisinya sama panjang dan kedua diagonalnya berpotongan tegak lurus.\n" +
                        "\nSifat-Sifat Belah Ketupat\n" + "1. Memiliki 4 sisi yang sama panjang, yaitu sisi AB, BC, CD, dan DA\n" + "2. Memiliki 2 pasang sudut yang berhadapan dan sama besar, yaitu <ABC dengan <ADC dan <BAD dengan <BCD\n" + "3. Memiliki 2 diagonal yang saling berpotongan tegak lurus, yaitu diagonal AC dan diagonal BD\n" + "4. Satu diagonal membagi dua diagonal yang lain sama panjang. Diagonal AC membagi diagonal BD menjadi dua sama panjang, begitupula dengan diagonal BD membagi diagonal AC menjadi dua sama panjang.\n" + "5. Memiliki 2 simetri lipat\n" + "6. Memiliki 2 simetri putar\n" + "7. Masing-masing sumbu simetri berhimpit dengan diagonal AC dan diagonal BD.\n" +
                        "\nRumus Belah Ketupat\n" + "L = ½ × d1 × d2\n" + "K = 4 × s\n" + "s = K : 4\n" + "d1 = (2 × L) : d2\n" + "d2 = (2 × L) : d1\n" +
                        "\nKeterangan\n" + "s = sisi\n" + "d1 = diagonal 1\n" + "d2 = diagonal 2\n" + "L = luas\n" + "K = keliling",
                "Latihan Soal dan Cara Menegrjakannya\n" +
                        "\nSoal no 1\n" + "Sebidang tanah berbentuk belah ketupat dengan panjang diagonal-diagonalnya adalah 18 cm dan 10 cm. Tentukan luas tanah tersebut!\n" +
                        "\nJawaban \n" + "\nDiketahui :\n" + "d1 = 12cm\n" + "d2 = 10cm\n" + "Ditanya :\n" + "luas tanah berbentuk belah ketupat?\n" + "Penyelesaian :\n" + "L = ½ x d1 x d2\n" + "L = ½ x 12 x 10\n" + "L = ½ x 180 \n" + "L = 90cm²\n" + "jadi, luas tanah adalah 90cm².\n" + "\n" +
                        "Soal no 2\n" + "Suatu belah ketupat memiliki sisi berukuran 45 cm. Berapakah keliling bangun belah ketupat tersebut?\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "s = 45cm\n" + "Ditanya :\n" + "keliling bangun belah ketupat?\n" + "Jawab :\n" + "K = 4 x s\n" + "K = 4 x 45\n" + "K = 180cm\n" + "jadi, keliling belah ketupat adalah 180cm."
            )
        )
        partList.add(
            Bangun(
                R.drawable.lingkaran,
                "Zu Chongzhi dan Archimedes adalah seorang ilmuwan penemu bangun datar lingkaran.",
                "LINGKARAN - CIRCLE",
                "Apa itu Lingkaran ?..\n" + "\t\t Lingakaran atau Circle adalah bangun datar yang terbentuk dari himpunan semua titik persekitaran yang mengelilingi suatu titik asal dengan jarak yang sama. jarak tersebut biasanya dinamakan r, atau radius, atau jari-jari.\n" +
                        "\nSifat-Sifat Lingakaran \n" + "1. Memiliki simetri lipat yang tak terhingga jumlahnya\n" + "2. Memiliki simetri putar yang tak terhingga jumlahnya\n" +
                        "\nRumus Lingakaran \n" + "L = π x r x r\n" + "K = 2 x π x r \n" + "r = d : 2\n" + "d = r x 2\n" +
                        "\nKeterangan\n" + "r = jari-jari\n" + "d = diameter\n" + "π = konstanta (22/7 atau 3,14)\n" + "L = luas\n" + "K = keliling",
                "Latihan Soal dan Cara Menegrjakannya\n" +
                        "\nSoal no 1\n" + "Sebuah bangun datar berbentuk lingkaran memiliki diameter 28. Berapa luas dari bangun datar tersebut?\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "d = 28cm\n" + "Ditanya :\n" + "luas lingkaran?\n" + "Penyelesaian :\n" + "- Mencari jari-jari (r)\n" + "r = d : 2\n" + "r = 28 : 2\n" + "r = 14cm\n" + "- Mencari luas\n" + "L = π x r x r\n" + "L = (22/7) x 14 x 14 \n" + "L = 44 x 14 \n" + "L = 616cm²\n" + "jadi, luas lingkaran adalah 616cm².\n" +
                        "\nSoal no 2\n" + "Sebuah lingkaran diketahui memiliki jari-jari 7 cm. Tentukan keliling lingkaran tersebut!\n" +
                        "\nJawaban\n" + "\nDiketahui :\n" + "r = 7 cm\n" + "π = 22/7\n" + "Ditanya :\n" + "keliling lingkaran!\n" + "Penyelesaian :\n" + "K = 2 x π x r\n" + "K = 2 x π x 7\n" + "K = 44cm\n" + "jadi, keliling lingkaran adalah 44cm."
            )
        )
        return partList
    }
}