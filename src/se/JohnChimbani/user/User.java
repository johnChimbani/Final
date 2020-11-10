package se.JohnChimbani.user;

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
     * @param user variablen skickas in för att kolla vad användaren har matat in
     */
    public void setCredentials(String user) {

        if (user != null) {
            this.userName = user;
        } else

            throw new NullPointerException();
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
