package quotes;

import java.util.ArrayList;

public class Quote {
    //variables
    ArrayList<String> tags;
    String author;
    String likes;
    String text;

    //constructor
    Quote (ArrayList<String> tags, String author, String likes, String text){
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    Quote (String text){

        this.author = "Ron Swanson";

        this.text = text;
    }

    //methods
    public String toString(){
        return "text: "+ this.text + "\nauthor: " + this.author;
    }

    public String tagsToString(){
        String output= "";
        for (String tag:this.tags) {
            output = output + tag;
        }
        return output;
    }


}
