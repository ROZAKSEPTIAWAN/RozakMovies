package com.example.rozakmovies;

public class Home {

    private String name;
    private int imageResourceId;
    private String detail;

    public static final Home[] homes = {
            new Home("assasins origins", R.drawable.assasins,"Sinopsis: mengisahkan Callum Lynch (Michael Fassbender) ," +
                    "seorang narapidana kasus pembunuhan yang diselamatkan dari eksekusi hukuman mati oleh Abstrego Industry"+
                    "\n"+"\n"+"Sutradara:Justin Kurzel"
            ),
            new Home("pocong origins", R.drawable.pocong,"Starring: Surya Saputra, Nadya Anira,Tyo"+
                    "\n"+"\n"+"Sinopsis: Mengisahkan tentang kematian seorang pembunuh bayaran berdarah dingin yang " +
                    "memiliki ilmu banaspati"+
                    "\n"+"\n"+"Sutradara : Monty tiwa"),
            new Home("Love monster",R.drawable.loemonster,"Starring: Dylan,jessice,rockser"+
                    "\n"+"\n"+"Sinopsis: Love and Monster berkisah tentang pasangan kekasih, Joel dan Aimee yang terpaksa terpisah karena makhluk raksasa mendatangani bumi"+
                    "\n"+"\n"+" Sutradara: Michael Matthews"),
            new Home("jumanji",R.drawable.jumanji,"Starring: Chris McKenna, Erik Sommers, Scott Rosenberg, and Jeff Pinkner, and starring Dwayne Johnson"+
                    "\n"+"\n"+"Sinopsis: Petualangan yang berasal dari sebuah kotak bernama jumanji"+
                    "\n"+"\n"+"Sutradara: Jake Kasdan"),
            new Home("uncony counter",R.drawable.uncounycounter,"Starring:Jo Byung Gyu ∙ Yoo Jun Sang ∙ Kim Se Jeong"+
                    "\n"+"\n"+"Sinopsis: Bergabung bersama anggota lain, So Mun harus segera beradaptasi dengan tugasnya yang baru; " +
                    "menghadapi roh jahat yang kekuatannya bukan main-main"+
                    "\n"+"\n"+" Sutradara: Kim Sae Bom"),
            new Home("ganzo", R.drawable.ganzo,"Starring: Daisuke Ono, Mao Ichimichi, Tomohiro Kaku, Saori Hayami,"+
                    "\n"+"\n"+"Sinopsis : film action fiksi horror,pertarungan melawan monster kegelapan"+
                    "\n"+"\n"+"Sutradara: Yasushi"),
            new Home("trinity the nekad", R.drawable.trinity,"Starring : Maudy Ayunda dan Hamish Daud"+
                    "\n"+"\n"+"Sinopsis: Film Trinity, The Nekad Traveler mengisahkan Trinity (diperankan oleh Maudy Ayunda)" +
                    " adalah seorang pegawai kantoran yang memiliki hobi traveling"+
                    "\n"+"\n"+"Sutradara: "),
            new Home("pee nak", R.drawable.peenak,"Starring: Paisarnkulwong Vachiravit, Bhuripat Vejvongsatechavat, " +
                    "and Witthawat Rattanaboonbaramee" +
                    "\n"+"\n"+"Sinopsis : Pee Nak mengisahkan tentang perjalanan tiga sekawan yang mengalami teror di sebuah kuil terkutuk"+
                    "\n"+"\n"+"Sutradara: Phontharis Chotkijsadarsopon"  ),
            new Home("Chappie",R.drawable.chappie,"Starring:Sharlto Copley,Dev Pate,Yolandi Visser"+
                    "\n"+"\n"+ "Sinopsis: Bercerita tentang  Robot pertama dengan kemampuan untuk berpikir dan merasa untuk dirinya sendiri. " +
                    "Hidupnya, ceritanya, akan mengubah cara dunia melihat robot dan manusia selamanya."+
                    "\n"+"\n"+"Sutradara: Neill Blomkamp"),
    };


    private Home(String name, int imageResourceId, String detail) {
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
