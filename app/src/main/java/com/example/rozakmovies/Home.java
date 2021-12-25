package com.example.rozakmovies;

public class Home {

    private String name;
    private int imageResourceId;
    public static final Home[] homes = {
            new Home("Startup", R.drawable.startup),
            new Home("Diavolo", R.drawable.ganzo),
            new Home("Funghi", R.drawable.pixel),
            new Home("uncony counter",R.drawable.uncounycounter),
            new Home("trinity the nekad", R.drawable.trinity),
            new Home("pee nak", R.drawable.peenak),
            new Home("212 warrior", R.drawable.kapak),
            new Home("Love monster",R.drawable.loemonster),
            new Home("it-chapter one", R.drawable.it),
            new Home("pokemon", R.drawable.pikachu),
            new Home("Chappie",R.drawable.chappie),
            new Home("TNCS", R.drawable.tncs),
            new Home("Passengers",R.drawable.passengers),
            new Home("assasins origins", R.drawable.assasins),
            new Home("iam legend",R.drawable.legend),
            new Home("outside the wire",R.drawable.outsidethewire),
            new Home("Unamed tales",R.drawable.unamedtales),
            new Home("orphan", R.drawable.orphan)
    };
    private Home(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
