package com.blogspot.codesgram.endangeranimals;

import java.util.ArrayList;

public class AnimalData {
    private static String[] animals = {
      "Komodo",
      "Kerbau Anoa",
      "Badak Jawa",
      "Babi Rusa",
      "Maleo",
      "Orangutan Sumatera",
      "Cendrawasih",
      "Monyet Hitam",
      "Merak",
      "Rangkong Helm",
    };

    private static String[] desc = {
            "Ada banyak cara yang bisa dilakukan untuk menggambarkan spesies yang satu ini. Komodo bisa ditemukan di pulau-pulau eksotis Indonesia, seperti Pulau Komodo, Rinca, Padar, dan Flores.\n" +
                    "\n" +
                    "Beberapa orang mengamati ukurannya yang besar, dan menyimpulkan bahwa komodo merupakan kadal tertinggi dan terbesar di dunia. Komodo sendiri memiliki panjang yang mencapai hingga tiga meter.\n" +
                    "\n" +
                    "Sedangkan beberapa orang lainnya berfokus pada evolusi yang dialami oleh reptil ini. Mereka memberi label komodo sebagai salah satu kerabat dekat dari dinosaurus dan spesies purba tertua yang masih hidup sampai sekarang.\n" +
                    "\n" +
                    "Sangat aman untuk menjelajahi Pulau Komodo dan melihat kadal karnivora terbesar di dunia ini, sambil menikmati pemandangan indah yang ada di pulau tersebut. Namun, pastikan kamu telah mempelajari berbagai peraturan keselamatan secara menyeluruh.",
            "Anoa adalah kerbau dengan ukuran yang sangat kecil (cebol). Terkadang, masyarakat setempat menyebutnya dengan sapiutan.\n" +
                    "\n" +
                    "Anoa tinggal di seluruh hutan hujan di Sulawesi. Kerbau ini tinggal di dataran rendah dan dataran tinggi. Anoa memiliki nama yang berbeda-beda tergantung dari di mana tempat ia tinggal.\n" +
                    "\n" +
                    "Penduduk lokal biasanya memburu anoa untuk dijadikan makanan bagi mereka. Sama seperti spesies kerbau lainnya, anoa juga dapat dimakan. Namun, banyak orang yang berpendapat bahwa hewan ini dapat memabukkan sehingga tidak bisa dikonsumsi. Anoa dewasa dapat berlari dengan kecepatan lebih dari 10km/jam dan mereka memiliki sepasang tanduk yang tajam",
            "Badak jawa atau badak dengan cula satu yang lebih pendek adalah hewan langka lain yang ada di Indonesia. Sebagian besar dari badak ini ditemukan di Pulau Jawa.\n" +
                    "\n" +
                    "Populasinya dari tahun ke tahun semakin menyusut. Badak jawa mengalami kesulitan untuk berkembang biak dan mereka hanya hidup selama 80 tahun.",
            "Nama hewan ini merupakan gabungan dari hewan babi dan rusa. Secara sekilas, bentuk babirusa seperti campuran antara kepala babi, kaki rusa, dan taring liar yang aneh.\n" +
                    "\n" +
                    "Babirusa memang termasuk ke dalam keluarga babi, tetapi bentuk fisik dan pencernaannya yang seperti rusa, sangat menarik untuk diamati. Babirusa dapat ditemukan di Sulawesi Utara dan beberapa provinsi terdekat lainnya.",
            "Maleo merupakan salah satu jenis endemik Megapode besar yang ada di Pulau Sulawesi. Maleois adalah satu-satunya anggota dari genus monotip Macrocephalo.\n" +
                    "\n" +
                    "Spesies ini dapat ditemukan di hutan dataran rendah dan juga bukit-bukit di Sulawesi. Maleo adalah salah satu hewan yang dilindungi di Indonesia.",
            "Orangutan Sumatera adalah salah satu spesies orangutan yang terancam punah. Hewan ini hanya ditemukan di Kepulauan Sumatera. Orangutan Sumatera liar merupakan hewan pemakan buah dan mereka hanya bertahan hidup di Provinsi Nanggroe Aceh Darussalam.",
            "Cenderawasih adalah spesies endemik yang termasuk ke dalam keluarga Paradisaeidae, atau burung dari surga (paradise). Burung agung dan penuh warna ini dapat ditemukan di Papua, pulau paling timur di Indonesia.\n" +
                    "\n" +
                    "Burung ini, terutama spesies jantannya, memiliki bulu yang sangat berornamen dan halus dengan warna-warna yang cerah dan ekor panjang yang menggantung dengan anggun di tubuh mereka.\n" +
                    "\n" +
                    "Cenderawasih bisa memiliki beberapa campuran warna, dari kuning, cokelat, merah, oranye, hingga warna biru dan ungu yang berbeda-beda.",
            "Yaki atau monyet wolai atau monyet hitam Sulawesi memiliki warna hitam di seluruh tubuhnya, dengan pengecualian beberapa bulu berwarna silver yang ada di bagian bahunya. Menjadi hewan sosial, monyet hitam ini hidup dalam kelompok berisi 5 hingga 25 ekor atau bahkan lebih.\n" +
                    "\n" +
                    "Biasanya, di dalam kelompok tersebut populasi monyet perempuan dewasa lebih banyak apabila dibandingkan dengan monyet laki-laki. Populasi manusia yang meningkat telah menjadi ancaman besar bagi keberlanjutan hidup monyet hitam ini.\n" +
                    "\n" +
                    "Apabila dibandingkan dengan daerah asalnya, banyak dari jenis monyet ini yang hidup dengan lebih bebas di beberapa pulau kecil sekitar Sulawesi.",
            "Merak adalah burung dari keluarga Phasianidae. Mereka adalah kerabat dari para petani. Merak dapat ditemukan di Pulau Jawa dan Sumatera.\n" +
                    "\n" +
                    "Kamu juga bisa menemukan merak di India atau Malaysia, tetapi mereka berbeda dengan merak yang berasal dari Indonesia. Merak yang ada di Indonesia memiliki keunikan tersendiri, yaitu bulunya yang berwarna-warni.\n" +
                    "\n" +
                    "Merak memiliki jenis yang berbeda-beda dan beberapa dari mereka memiliki warna bulu yang berbeda pula. Mereka sangat tenang tetapi di waktu yang bersamaan bisa menjadi agresif juga.\n" +
                    "\n" +
                    "Kamu mungkin berpikir akan menyenangkan apabila bisa berfoto dengan hewan ini. Namun, kamu mungkin akan berubah pikiran setelah mengetahui bahwa merak dapat menyerang orang lain kapan saja.",
            "Secara fisik, burung ini memang memesona, dengan helm cerahnya yang ikonik dan sayap yang lebar dan luas. Namun, mungkin apa yang membuat rangkong helm menjadi begitu luar biasa adalah makna budaya yang disematkan kepadanya.\n" +
                    "\n" +
                    "Di Kalimantan Barat atau Borneo, spesies rangkong ini dijadikan sebagai simbol alam ilahi. Mereka juga sering dimanifestasikan ke dalam seni tradisional dan berbagai ukiran.\n" +
                    "\n" +
                    "Meskipun sekarang akan sulit untuk menemukan salah satu burung aneh ini, tetapi kamu bisa mendengar suara jeritan aneh mereka. Beberapa orang mengatakan suaranya seperti tawa nyaring yang terdengar dari jarak dua kilometer.",
    };

    private static int[] image = {
            R.drawable.komodo,
            R.drawable.kerbauanoa,
            R.drawable.badakjawa,
            R.drawable.babirusa,
            R.drawable.maleo,
            R.drawable.orangutan,
            R.drawable.cendrawasih,
            R.drawable.monyethitam,
            R.drawable.merak,
            R.drawable.rangkonghelm,
    };

    static ArrayList<Animal> getAllListData() {
        ArrayList<Animal> listA = new ArrayList<>();
        for (int position = 0; position < animals.length; position++) {
            Animal animal = new Animal();
            animal.setName(animals[position]);
            animal.setDetail(desc[position]);
            animal.setPhoto(image[position]);
            listA.add(animal);
        }
        return listA;
    }
}
