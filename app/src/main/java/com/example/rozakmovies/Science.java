package com.example.rozakmovies;

public class Science {

    private  String name;
    private int imageResourceId;
    private String detail;

    public static final Science[] sciences = {

            new Science("Passengers",R.drawable.passengers,"Starring:Chris Pratt dan Jennifer Lawrence"+
                    "\n"+"\n"+" Sinopsis: menceritakan petualangan Jennifer Lawrence dan Chris Pratt ke sebuah planet " +
                    "bernama Homestead II yang akan berlangsung selama 120 tahun"+
                    "\n"+"\n"+"Sutradara :Morten Tyldum "),
            new Science("Back to future",R.drawable.backtofuture,"Starring:  Michael J. Fox, Christopher Lloyd, Lea Thompson"+
                    "\n"+"\n"+ "Sinopsis: Marty McFly secara tidak sengaja terlempar ke masa lalu, " +
                    "tepatnya 30 tahun yang lalu, dengan mengendarai mobil DeLorean " +
                    "yang sudah dimodifikasi menjadi mesin waktu oleh teman dekatnya, Doc Brown, seorang ilmuwan eksentrik"+
                    "\n"+"\n"+ "Sutradara: Robert Zemeckis"),
            new Science("Chappie",R.drawable.chappie,"Starring:Sharlto Copley,Dev Pate,Yolandi Visser"+
                    "\n"+"\n"+ "Sinopsis: Bercerita tentang  Robot pertama dengan kemampuan untuk berpikir dan merasa untuk dirinya sendiri. " +
                    "Hidupnya, ceritanya, akan mengubah cara dunia melihat robot dan manusia selamanya."+
                    "\n"+"\n"+"Sutradara: Neill Blomkamp"),
            new Science("Better than Us",R.drawable.betterthanus,"Starring :Paulina Andreeva, Kirill Käro,Aleksandr Ustyugov,Olga Lomonosova"+
                    "\n"+"\n"+ "Sinopsis :Sebuah keluarga yang hampir terpecah belah menjadi pemilik robot canggih yang sedang dicari oleh sebuah perusahaan, " +
                    "para penyelidik pembunuhan, dan teroris."+
                    "\n"+"\n"+ "Sutradara : Andrey Junkovsky"),
            new Science("uncony counter",R.drawable.uncounycounter,"Starring:Jo Byung Gyu ∙ Yoo Jun Sang ∙ Kim Se Jeong"+
                    "\n"+"\n"+"Sinopsis: Bergabung bersama anggota lain, So Mun harus segera beradaptasi dengan tugasnya yang baru; " +
                    "menghadapi roh jahat yang kekuatannya bukan main-main"+
                    "\n"+"\n"+" Sutradara: Kim Sae Bom"),

            new Science("Love monster",R.drawable.loemonster,"Starring: Dylan,jessice,rockser"+
                    "\n"+"\n"+"Sinopsis: Love and Monster berkisah tentang pasangan kekasih, Joel dan Aimee yang terpaksa terpisah karena makhluk raksasa mendatangani bumi"+
                    "\n"+"\n"+" Sutradara: Michael Matthews"),
    };

    private  Science (String name, int imageResourceId, String detail){
        this.name= name;
        this.imageResourceId= imageResourceId;
        this.detail = detail;
    }
    public  String getName(){return  name;}

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDetail() {
        return detail;
    }
}
