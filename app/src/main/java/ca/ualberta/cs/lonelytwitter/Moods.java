package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class  Moods {
    protected Date date;
    protected abstract void Moods();
    protected abstract void Moods(Date inputDate);

    public void setDate(Date inputDate) {
        this.date = inputDate;
    }
    public Date getDate(){
        return this.date;
    }
}