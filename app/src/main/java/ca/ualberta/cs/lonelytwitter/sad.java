package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class sad extends Moods {
    public void Moods(){
        sad sad_mood = new sad();
        System.out.println("I am sad. ");
    }
    public void Moods(Date inputDate){
        sad sad_mood = new sad();
        this.date = inputDate;
        System.out.println("on this date: "+this.date+" Iam sad");
    }
}