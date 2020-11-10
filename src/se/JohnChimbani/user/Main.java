package se.JohnChimbani.user;

import java.util.*;

import static javax.swing.JOptionPane.*;

public class Main {

    static List<Date> pass = new ArrayList<>();
    static Stack<String> users = new Stack<>();

    /**
     * menu metod som låter användaren interagera med programmet
     */
    public static void menu() {
        int input;

        Scanner console = new Scanner(System.in);

        do {

            System.out.println(" Välkommen till Brf Klintens Bokningssystem för tvättstugan");
            System.out.println("\n 1. Lägg till användare");
            System.out.println("\n 2. Boka pass");
            System.out.println("\n 3. Visa användare");
            System.out.println("\n 4. Visa pass ");
            System.out.println("\n 5. Regler");
            System.out.println("\n 6. Radera användare");
            System.out.println("\n 7. Avsluta");
            System.out.println("\n Välj vad du vill göra? ");
            input = console.nextInt();
            console.nextLine();

            switch (input) {

                case 1:

                    while (true) {

                        String newUser = showInputDialog(null, "Skriv ett användarnamn");
                        if (newUser == null)
                            break;
                        User x = new User();
                        x.setCredentials(newUser);
                        users.add(newUser);

                    }
                    break;

                case 2:

                    String userName = showInputDialog(null, "Användarnamn?");
                    if (users.search(userName) == 1) {
                        showMessageDialog(null, "Välj År/Mån/Dag/Startid");
                        Calendar yourCalendar = Calendar.getInstance();
                        String year = showInputDialog(null, " År(Exempelvis 2021)");
                        if (year == null)
                            System.exit(0);
                        int or = Integer.parseInt(year);
                        String month = showInputDialog(null, " Mån(Exempelvis 5 för Maj)");
                        if (month == null)
                            break;
                        int monad = Integer.parseInt(month);
                        monad -= 1;
                        String date = showInputDialog(null, " Datum(Exempelvis 4)");
                        if (date == null)
                            break;
                        int datum = Integer.parseInt(date);
                        String hour = showInputDialog(null, " Klockslag(Exempelvis 15 för 15:00)");
                        if (hour == null)
                            break;
                        int timme = Integer.parseInt(hour);
                        yourCalendar.set(or, monad, datum, timme, 0, 0);
                        pass.add(yourCalendar.getTime());
                    } else {
                        System.out.println("Du är tyväär inte registrerad!");
                    }
                    break;
                case 3:

                    System.out.println("Användare");
                    for (String u : users)
                        System.out.println(" " + u);
                    break;
                case 4:
                    System.out.println("Bokade pass");
                    for (Date p : pass)
                        System.out.println(" " + p);
                    break;
                case 5:
                    System.out.println("Läs gärna genom våra regler nedan");
                    System.out.println("\n 1. Tvätttiden gäller i 4 timmar från starttiden");
                    System.out.println("\n 2. Städa efter dig");
                    System.out.println("\n 3. Bokade tider försvinner om inte passet startas inom 30 min");
                    break;
                case 6:

                    String away = showInputDialog(null, "Vilken användare vill du ta bort?");
                    if (away == null)
                        break;
                    else {
                        User.remove(away);
                    }

                case 7:

                    break;
            }
        } while (input != 7);

    }

    public static void main(String[] args) {

        menu();

    }
}