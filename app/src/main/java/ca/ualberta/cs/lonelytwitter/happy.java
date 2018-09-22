package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class happy extends Moods {
    public void Moods(){
        happy happy_mood = new happy();
        System.out.println("I am happy. ");
    }
    public void Moods(Date inputDate){
        happy happy_mood = new happy();
        this.date = inputDate;
        System.out.println("on this date: "+this.date+" I am happy");
    }
}