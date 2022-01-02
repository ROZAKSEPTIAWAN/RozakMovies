package com.example.rozakmovies;

public class Adventure {
    private String name;
    private int imageResourceId;
    private String detail;

    public static final Adventure [] adventures ={
            new Adventure("iam legend", R.drawable.legend,"Starring: Will smith, jhonny roya, miccheke"+
                    "\n"+"\n"+"Sinopsis : Film berkisah tentang Robert Neville (Will Smith), seorang ilmuan yang berjuang untuk menyelamatkan diri dan anjingnya, " +
                    "Sam, dari serangan para zombie"+
                    "\n"+"\n"+"Sutradara: Verelladevanka Adryamarthanino"),
            new Adventure("jumanji",R.drawable.jumanji,"Starring: Chris McKenna, Erik Sommers, Scott Rosenberg, and Jeff Pinkner, and starring Dwayne Johnson"+
                    "\n"+"\n"+"Sinopsis: Petualangan yang berasal dari sebuah kotak bernama jumanji"+
                    "\n"+"\n"+"Sutradara: Jake Kasdan"),
            new Adventure("assasins origins", R.drawable.assasins,"Sinopsis: mengisahkan Callum Lynch (Michael Fassbender) ," +
                    "seorang narapidana kasus pembunuhan yang diselamatkan dari eksekusi hukuman mati oleh Abstrego Industry"+
                    "\n"+"\n"+"Sutradara:Justin Kurzel"
                  ),
            new Adventure("trinity the nekad", R.drawable.trinity,"Starring : Maudy Ayunda dan Hamish Daud"+
                    "\n"+"\n"+"Sinopsis: Film Trinity, The Nekad Traveler mengisahkan Trinity (diperankan oleh Maudy Ayunda)" +
                    " adalah seorang pegawai kantoran yang memiliki hobi traveling"+
                    "\n"+"\n"+"Sutradara: "),
            new Adventure("pokemon", R.drawable.pikachu,"Starring: Ryan Rey,Justine Sith,Kathryn"+
                    "\n"+"\n"+"Sinopsis : Film yang mengisahkan dunia dimana orang mengumpulkan  pokemon untuk bertempur"+
                    "\n"+"\n"+"Sutradara: Rob Letterman"),
            new Adventure("pixel", R.drawable.pixel,"Sinopsis: old-school arcade gamers, dimana mereka mempunyai tugas " +
                    "dengan cara menggunakan keterampilan game-nya untuk menyelamatkan dunia dari raksasa video game sprites."+
                    "\n"+"\n"+"Sutradara: Chris columbus"),

    };

    private Adventure (String name, int imageResourceId, String detail){
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.detail = detail;
    }
          public  String getName(){return name;}
          public  int getImageResourceId(){return imageResourceId;}
          public String getDetail() {
        return detail;
    }
}
