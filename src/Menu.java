import javax.swing.*;
/**
 * Created by John Chimbani
 * Date: 2020-11-06
 * Time: 14:31
 * Project: Inläming_3
 * Copyright: MIT
 */
public class Menu {

    // Privata instansvariabler
     private String userName;
     private String email;

    public static void main (String[] args) {


        String choice = "";


        System.out.println("------------------------------------------------------------------ Brf Klintens Bokningssystem ----------------------------------------");

        System.out.println("\n                                                                        1. Boka en tid? ");
        System.out.println("\n                                                                        2. Se min bokad tid ");
        System.out.println("\n                                                                        3. Skapa en användare ");
        String s = JOptionPane.showInputDialog("Välj vad du vill göra ");

        //if (choice == "3"){

          //  getUserName();
    }

            //skapaUser(x);

         //Konstruktor

    /* public Menu(String userName, String email){
        setUserName(userName);
        setUserEmail(email);
    }*/

    public String getUserName() {
        if(this.userName == null)
            this.userName = "Visitor";

        return userName;
    }

    public String getUserEmail() {
        if(this.email == null)
            this.email = "";

        return userName;
    }


/*    public void setUserName(String userName) {
        if(userName != null)
            this.userName = userName;
        else
            throw new NullPointerException();
    }
*/

  /*  public void setUserEmail(String userName) {
        if(userName != null)
            this.userName = userName;
        else
            throw new NullPointerException();
    }

*/

    }

