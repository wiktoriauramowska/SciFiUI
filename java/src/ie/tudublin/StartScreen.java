package ie.tudublin;

import processing.core.PApplet;
import java.util.Scanner;
import java.lang.String;

public class StartScreen
{

    public void onClick()
    {
        System.out.println("Enter your name: ");
        String userName;
        Scanner userInput = new Scanner(System.in);
        userName = userInput.next();

        // Writes the strings to a file, each on a separate line
        //saveStrings("name.txt", userName);
    }
    
}