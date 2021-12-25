package com.example.rozakmovies;

public class Science {

    private  String name;
    private int imageResourceId;
    public static final Science[] sciences = {
            new Science("Unamed tales",R.drawable.unamedtales),
            new Science("Passengers",R.drawable.passengers),
            new Science("Back to future",R.drawable.backtofuture),
            new Science("Chappie",R.drawable.chappie),
            new Science("Better than Us",R.drawable.betterthanus),
            new Science("uncony counter",R.drawable.uncounycounter),
            new Science("outside the wire",R.drawable.outsidethewire),
            new Science("Love monster",R.drawable.loemonster),

    };
    private  Science (String name, int imageResourceId){
        this.name= name;
        this.imageResourceId= imageResourceId;
    }
    public  String getName(){return  name;}

    public int getImageResourceId() {
        return imageResourceId;
    }
}
