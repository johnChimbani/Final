package se.JohnChimbani.user;

import se.JohnChimbani.Main;

/**
 * Created by John Chimbani
 * Date: 2020-11-06
 * Time: 14:29
 * Project: Inläming_3
 * Copyright: MIT
 * User class som innehåller
 */
public class User {

    private String userName;
    int i;
    String [] userNameList = new String[100];

    /**
     * Metod som är en getter för userName
     *
     * @return userName
     */
    public String getCredentials() {
        if (this.userName == null) {
            this.userName = "Besökare";
        } else
            throw new NullPointerException();
        return userName;
    }

    /**
     * Metod som är en setter för userName
     *
     * @param user
     * variablen skickas in för att kolla vad användaren har matat in
     */
    public void setCredentials(String user) {

        if (user != null) {
            this.userName = user;
            userNameList[i] = user;
        } else

            throw new NullPointerException();
    }

    public void removeCredentials(String removeUser) {
        if (removeUser == null) {
            System.out.println("Det finns inga användare att radera");
        } else

             this.userName = null;
    }

    /**
     * Metod som kör över Java's inbyggda toString metod
     *
     * @return en sträng istället för hashcode
     */
    @Override
    public String toString() {
        return "UserName: " + getCredentials();
    }
}
