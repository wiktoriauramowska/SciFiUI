package ie.tudublin;

//import processing.core.PApplet;
//import processing.opengl.PGraphics3D;
//import processing.opengl.PGraphicsOpenGL;
import processing.core.PApplet;
import java.lang.Math;
import java.util.Random;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Spiral sp;
    StartScreen start;
    Radar radar;
    int counter; 
    int startTime; 
    int maxTime;
    boolean done;
    GetInput userName;
    


    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        fullScreen();
        
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, 1200, 200, 100);
        sp = new Spiral(this, 1000, 500, 30, 5);
        counter = 0; 
        startTime = millis(); 
        maxTime = 5000;
        done = false;

    }

    


    public void draw()
    {
        background(32, 15, 19);
        //b.render();

        textSize(0100);
        if (done) {
            fill(255); 
            text("DONE", width/2, height/2);
        } else {
            if (counter-startTime < maxTime) 
            {
                counter=millis();
            } 
            else 
            {
                done=true;
            }
            fill(255);
            noStroke();
            rect(width/2 - 100, height/2, map(counter-startTime, 0, maxTime, 0, 200), 19 );
            text(counter- startTime+" " + (maxTime) +  " " + ( map(counter-startTime, 0, maxTime, 0, 200)), 20, 160);
            noFill();
            stroke(255, 7, 58);
            rect(width/2 - 100, height/2,200, 19);
        }//else

        //have to put those in an if statement, only to execute after the user name is inputted
        sp.render();

        mc.update();
        mc.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }

    public void mousePressed() { 
        if (done) { 
            counter = 0; 
            startTime = millis();
            maxTime = 5000; 
            done = false;
        }
    }
}

