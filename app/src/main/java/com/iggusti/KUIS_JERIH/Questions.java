package com.iggusti.KUIS_JERIH;

/**
 * Created by IGGusti on 18/04/2017.
 */

public class Questions {

    public String mQuestions[] = {
            "Planet terdekat dari matahari adalah...",
            "FIFA World Cup pertama diselenggarakan di negara?",
            "Contoh Software yang fungsi utamanya sama dengan Windows Media Player adalah...",
            "Planet diantara bumi dan merkurius adalah...",
            "Angka 123321 merupakan contoh bilangan?",
            "Simbol garis-garis yang dibawahnya ada angka-angka yang selalu ditemukan pada produk disebut...",
            "Novel Harry Potter yang pertama terbit pada tahun?",
            "Perubahan benda padat menjadi gas disebut...",
            "Yang bukan merupakan film animasi Dream Works adalah...",
            "Mantan anggota Black Organization dalam anime Detective Conan adalah...",
            "Siapa artis fenomenal yang meninggal ketika sedang naik daun",
            "Berapa banyak medali emas yang telah di menangkan perenang Amerika Michael phelps",
            "Berapa jumlah maksimal kita bisa memukul bola sebelum mengirimnya ke daerah lawan dalam permainan bola volly",
            "Jaringan grosir manakah yang berasal dari Francis",
            "Manakah Neagara yang tidak ikut serta ajang piala Dunia 2010",
            "Manakah unsur yang memiliki simbol kimia Mg",
            "Apa warna seorang Avatar dalam film avatar 2009",
            "Vitamin yang banyak terkandung dalam buah-buahan adalah",
            "Arah jam 9 itu sama dengan arah",
            "Anjing Pitbull berasal dari negara ",
            "Penemu radio berasal dari negara",
            "Burung tercepat di dunia adalah",
            "Negara terkaya di dunia adalah",
            "Negara termiskin di dunia adalah",
            "Mamalia laut terpintar adalah",
            "Minuman terfavorit di dunia adalah",
            "Pakaian tradisional khas Indonesia yang bernilai seni tinggi adalah",
            "Sword adalah bahasa Inggris dari ",
            "Senjata yang dipakai Indonesia pada masa penjajahan adalah",
            "Serangga yang memiliki rasa solidaritas tinggi adalah",
            "Air terjun tertinggi di dunia terletak di negara",
            "Negara terpadat di dunia adalah",
            "Hewan terkecil adalah",
            "Untuk melakukan perintah 'find' pada komputer bisa dengan cara menekan tombol",



    };

    private String mChoices[][] = {
            {"Bumi", "Saturnus", "Merkurius", "Venus"},
            {"Amerika", "Brazil", "Uruguay", "Italia"},
            {"VLC", "Picasa", "MP3Player", "MiniLyrics"},
            {"Pluto", "Saturnus", "Bumi", "Venus"},
            {"Palindrom", "Prima", "Kuadrat", "Imajiner"},
            {"Codec", "Barcode", "Komposisi", "Chapta"},
            {"1995", "1996", "1997", "1998"},
            {"Menyublim", "Mengembun", "Mencair", "Mengkristal"},
            {"Inside Out", "How to Train Your Dragon", "Madagascar", "Kung Fu Panda"},
            {"Korn", "Rum", "Bourbon", "Rye"},
            {"Olga", "Kasino", "Julia Perez", "Billy Syaputra"},
            {"17", "16", "18", "20"},
            {"4" , "3", "2", "5"},
            {"Carrefour", "Yogya ", "Griya", "Matahari"},
            {"Brazil", "Kanada", "Spanyol", "Mesir"},
            {"Oksigen", "Karbon", "Magnesium", "Karbon Magnesium"},
            {"Merah", "hijau", "Hitam", "Biru"},
            {"Vitamin A", "vitamin B", "Vitamin C", "Vitamin D"},
            {"Barat", "Timur", "Selatan", "Utara"},
            {"Inggris", "Arab", "Francis", "Jepang"},
            {"German", "Italia", "Belanda", "Inggris"},
            {"Falcon", "Gereja", "BEO", "Kakak tua"},
            {"Qatar", "Philiphina", "Afrika", "Amerika"},
            {"Kongo", "Abudabi", "Thailand", "Afrika"},
            {"Lumba lumba", "Paus", "Beo", "Gajah"},
            {"Teh", "Air Mineral", "Jus", "kopi"},
            {"Kebaya", "Batik", "Gamis", "koko"},
            {"Pedang", "Pisau", "kapak", "Golok"},
            {"Pistol", "Bambu runcing", "Pisau", "Golok"},
            {"Semut", "Gajah", "Kucing", "Sapi"},
            {"Venezuela", "Indonesi", "Korea", "Eropa"},
            {"Seoul", "India", "Indonesia", "Arab"},
            {"Amuba", "Semut", "Cacing", "belatung"},
            {"Ctrl + F", "Ctrl+f4", "Ctrl+f5", "Cttrl+y"},




    };

    private String mCorrectAnswer[] = {"Merkurius", "Uruguay", "VLC", "Venus", "Palindrom", "Barcode",
            "1997", "Menyublim", "Inside Out", "Rye", "Olga", "18", "3", "Carrefour",
            "Brazil", "Oksigen", "Biru",  "Vitamin C", "Barat", "Inggris", "German",
            "Falcon", "Qatar", "Kongo", "Lumba lumba", "Teh", "Batik", "Pedang","Bambu runcing", "Semut",
            "Venezuela", "Amuba", "Ctrl + F",
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
