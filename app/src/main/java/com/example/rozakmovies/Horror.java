package com.example.rozakmovies;

public class Horror {

    private String name;
    private int imageResourceId;
    private String detail;

    public static final Horror[] horrors = {
            new Horror("ganzo", R.drawable.ganzo,"Starring: Daisuke Ono, Mao Ichimichi, Tomohiro Kaku, Saori Hayami,"+
                    "\n"+"\n"+"Sinopsis : film action fiksi horror,pertarungan melawan monster kegelapan"+
                    "\n"+"\n"+"Sutradara: Yasushi"),
            new Horror("asih 1", R.drawable.asih,"Starring: Shareefa Daanish, Citra Kirana, Darius Sinathrya, Marini"+
                    "\n"+"\n"+"Sinopsis: Film Asih bercerita tentang karakter hantu bernama Asih yang ada dalam film Danur."+
                    "\n"+"\n"+"Sutradara: Awi Suryadi"),
            new Horror("ptj", R.drawable.jahanam,"Starring: Tara Basro, Marissa Anita, Christine Hakim, Asmara Abigail,"+
                    "\n"+"\n"+"Sinopsis: Menceritakan dua orang gadis yang datang ke sebuah desa yang mempunyai sisi kegelapan"+
                    "\n"+"\n"+"Sutradara: Joko Anwar"),
            new Horror("kafir", R.drawable.kafir,"Starring: Putri Ayudya, Sujiwo Tejo, Indah Permatasari"+
                    "\n"+"\n"+"Sinopsis: mengisahkan Sri (diperankan oleh Putri Ayudya) yang kehilangan suaminya, Herman (diperankan oleh Tedy Syah)," +
                    " secara tiba-tiba, bahkan Herman memuntahkan beling saat makan malam sebelum meninggal. " +
                    "Setelah kematian suaminya, Sri mengalami hantaman berupa kejadian-kejadian misterius yang membuat hidupnya berantakan"+
                    "\n"+"\n"+ "Sutradara: Kinoi azhar lubis"),
            new Horror("pee nak", R.drawable.peenak,"Starring: Paisarnkulwong Vachiravit, Bhuripat Vejvongsatechavat, " +
                    "and Witthawat Rattanaboonbaramee" +
                     "\n"+"\n"+"Sinopsis : Pee Nak mengisahkan tentang perjalanan tiga sekawan yang mengalami teror di sebuah kuil terkutuk"+
                      "\n"+"\n"+"Sutradara: Phontharis Chotkijsadarsopon"  ),
            new Horror("pocong origins", R.drawable.pocong,"Starring: Surya Saputra, Nadya Anira,Tyo"+
                    "\n"+"\n"+"Sinopsis: Mengisahkan tentang kematian seorang pembunuh bayaran berdarah dingin yang " +
                    "memiliki ilmu banaspati"+
                    "\n"+"\n"+"Sutradara : Monty tiwa"),


    };
    private Horror(String name, int imageResourceId,String detail) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.detail = detail;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String getDetail() {
        return detail;
    }
}
