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
    GetInput userName;
    LoadingBar loading;
    


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
        //fullScreen(P3D,SPAN);
        fullScreen();
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, 1200, 200, 100);
        sp = new Spiral(this, 1000, 500, 30, 5);
        loading = new LoadingBar(this, 0, millis(), 5000, false);

    }

    


    public void draw()
    {
        background(32, 15, 19);
        //b.render();

        //have to put those in an if statement, only to execute after the user name is inputted
        sp.render();
        loading.render();
        loading.mousePressed();
        mc.update();
        mc.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }

    
}

