package com.example.rozakmovies;

public class Horror {

    private String name;
    private int imageResourceId;
    public static final Horror[] horrors = {
            new Horror("ganzo", R.drawable.ganzo),
            new Horror("asih 1", R.drawable.asih),
            new Horror("ptj", R.drawable.jahanam),
            new Horror("kafir", R.drawable.kafir),
            new Horror("pee nak", R.drawable.peenak),
            new Horror("pocong origins", R.drawable.pocong),
            new Horror("it-chapter one", R.drawable.it),
            new Horror("orphan", R.drawable.orphan),

    };
    private Horror(String name, int imageResourceId) {
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
