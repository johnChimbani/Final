/**
 * Created by John Chimbani
 * Date: 2020-11-06
 * Time: 14:29
 * Project: Inläming_3
 * Copyright: MIT
 */
public class User {

    //Instance variables
    String userName;
    String email;

    //Instance methods

    /**
     * An Instance method that returns the user email and userName
     * @ return "user email and userName"
     */
    public String getUser(){

        return this.userName + "" + this.email;

    }

    /**
     * Method that overrides Java's inbuilt toString method
     * @return string representation instead of hash code
     */
    @Override
    public String toString() {
        return "UserName: " + this.userName + "\nPassword: " + this.email;
    }
}
