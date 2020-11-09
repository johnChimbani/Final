package se.JohnChimbani.time;

/**
 * Created by John Chimbani
 * Date: 2020-11-07
 * Time: 19:44
 * Project: Inläming_3
 * Copyright: MIT
 */
public class Time {

 //Instance variables
    private String s;

    //Instance methods

    public String getTime (){

        if (this.s == null )
        {
           getTime();
        }
        return this.s;
    }

    public void setTime (String x){

        if (x != null ) {
            this.s = x;

        }
        else

            throw  new  NullPointerException();
    }

    @Override
    public String toString() {
        return "Time{" +
                "s='" + s + '\'' +
                '}';
    }
}
