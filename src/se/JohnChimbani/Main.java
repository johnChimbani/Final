package se.JohnChimbani;


import java.util.*;


import se.JohnChimbani.time.Time;
import se.JohnChimbani.user.User;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


       String[] users = new String[100];
       users[0] = "user";

        int i=0;
        //String input = JOptionPane.showInputDialog(null,"Skriv ditt användarnam: ");
        //if (input.equals(users[0]))  {

            System.out.println("--------------------------------------------------------------------------------------  Brf Klintens Bokningssystem  -----------------------------------------------------------------------------------------------------");

            System.out.println("\n                                                                                            1. Boka en tid ");
            System.out.println("\n                                                                                            2. Se bokad tid ");
            System.out.println("\n                                                                                            3. Skapa användare ");
            String c = JOptionPane.showInputDialog("Välj vad du vill göra? ");

            switch (c) {


                case "1":

                    JOptionPane.showMessageDialog(null,"Välj År/Mån/Dag/Startid");
                    Calendar yourCalendar = Calendar.getInstance();
                    String year = JOptionPane.showInputDialog(null, " År(Exempelvis 2021)");
                    int or = Integer.parseInt(year);
                    String month = JOptionPane.showInputDialog(null, " Mån(Exempelvis 5 för Maj)");
                    int monad = Integer.parseInt(month);
                    monad -=1;
                    String date = JOptionPane.showInputDialog(null, " Datum(Exempelvis 4)");
                    int datum = Integer.parseInt(date);
                    String hour = JOptionPane.showInputDialog(null, " Klockslag(Exempelvis 15 för 15:00)");
                    int timme = Integer.parseInt(hour);

                   yourCalendar.set(or,monad,datum,timme,0,0);
                   System.out.println("Din tvätttid är " + yourCalendar.getTime());

                    break;
                case "2":

                    break;
                case "3":
                    int k = 0;
                    boolean h = true;
                     String newUser;

                    while (true) {
                        newUser = JOptionPane.showInputDialog(null, "Skriv ett användarnamn");
                        if (newUser == null)
                            break;
                        User x = new User();
                        x.setCredentials(newUser);
                        users[i] = newUser;
                        System.out.println("                                                                                         Du har lagt till : " + x.getCredentials() + " !");

                        }
                    break;


        }


        }

    }

