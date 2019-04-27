package ie.tudublin;

import processing.core.PApplet;
import java.util.Scanner;
import java.lang.String;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class StartScreen extends UI
{
    /**
     *
     */

    private static final String NAME_TXT = "name.txt";
    private static String name = "Wiktoria";
    UI ui;
    BufferedReader input = new BufferedReader((new InputStreamReader(System.in)));

    public StartScreen(){
        this.ui = ui;

    }

    public void onClick()
    {
        System.out.println("Enter your name: ");
        String userName;
        Scanner userInput = new Scanner(System.in);
        userName = userInput.next();

        // Writes the strings to a file, each on a separate line
        //ui.saveStrings("name.txt", userName);
        //public static void saveStrings(String NAME_TXT, String[] data);
        loadStrings(input);

    }

    
    
}