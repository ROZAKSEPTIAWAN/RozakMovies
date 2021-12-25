package com.example.rozakmovies;

public class Adventure {
    private String name;
    private int imageResourceId;
    public static final Adventure [] adventures ={
            new Adventure("iam legend", R.drawable.legend),
            new Adventure("jumanji",R.drawable.jumanji),
            new Adventure("assasins origins", R.drawable.assasins),
            new Adventure("trinity the nekad", R.drawable.trinity),
            new Adventure("pokemon", R.drawable.pikachu),
            new Adventure("pixel", R.drawable.pixel),
            new Adventure("212 warrior", R.drawable.kapak),
            new Adventure("TNCS", R.drawable.tncs),
            new Adventure("Avatar legends", R.drawable.avatar),
            new Adventure("Startup", R.drawable.startup),
            new Adventure("Crawl", R.drawable.crawl),


    };

    private Adventure (String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
          public  String getName(){return name;}
          public  int getImageResourceId(){return imageResourceId;}
}
