package se.JohnChimbani.user;



/**
 * Created by John Chimbani
 * Date: 2020-11-06
 * Time: 14:29
 * Project: Inläming_3
 * Copyright: MIT
 */
public class User {

    //Instance variables
    private  String userName;


    //Instance methods

    public String getCredentials()
    {
        if (this.userName == null )
        {
            this.userName = "Visitor ";
        }

          return userName;
    }


    public void setCredentials(String user) {

        if (user != null ) {
            this.userName = user;
        }
        else

            throw  new  NullPointerException();    }

    /**
     * Method that overrides Java's inbuilt toString method
     * @return string representation instead of hash code
     */
    @Override
    public String toString() {
        return "UserName: " + getCredentials();
    }
}
