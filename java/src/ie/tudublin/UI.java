package ie.tudublin;

//import processing.core.PApplet;
//import processing.opengl.PGraphics3D;
//import processing.opengl.PGraphicsOpenGL;
import processing.core.PApplet;
import java.lang.Math;
import java.util.Random;
import java.io.File;
import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;


public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Spiral sp;
    StartScreen start;
    Radar radar;
    GetInput userName;
    LoadingBar loading;
    FileIcons icon;

    
    ArrayList<Title> titles = new ArrayList<Title>();
    


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
        loadTitles();
        
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, 1200, 200, 100);
        sp = new Spiral(this, 1000, 500, 30, 5);
        loading = new LoadingBar(this, 0, millis(), 5000, false);
        start = new StartScreen();
        icon = new FileIcons(this);

    }

    public void loadTitles(){
		Table table = loadTable("titles.csv", "header");
		for(TableRow row:table.rows()){
			titles.add(new Title(row));
		}
    }

    
    public void printTitles(){
		// for(int i = 0; i < titles.size(); i++){
		// 	Title t = titles.get(i);
		// 	print(t);
        // }
        float border = height * 0.1f;
        float start = width * 0.15f;
        float w = width * 0.3f;
        float h = height * 0.25f;
        textAlign(CENTER, CENTER);
        textSize(24);
        
        for(int i = 0 ; i < titles.size() ; i ++)
            {
                Title t = titles.get(i);
                float x = map(i, 0, titles.size(), start, width);
                stroke(255);
                noFill();
                rect(x-50, h-18, 100, 40);
                fill(255);
                textAlign(CENTER, CENTER);
                //text(t.title, start, y + (h / 2));
                text(t.title, x, h);
            }
    }
    
    public void drawTerminal()
    {
        float border = height * 0.4f;
        float start = width * 0.28f;
        float w = width * 0.68f;
        float h = height * 0.5f;
  
        stroke(0);
        fill(255);
        rect(start, border, w, h);
    
    }

    public void drawSideTab(){
        float border = height * 0.4f;
        float start = width * 0.04f;
        float w = width *0.2f;
        float h = height *0.5f;

        stroke(0);
        fill(255);
        rect(start, border, w, h);
    }

    


    public void draw()
    {
        background(32, 15, 19);
        //b.render();
        icon.render();
        printTitles();
        drawTerminal();
        drawSideTab();

        //have to put those in an if statement, only to execute after the user name is inputted
        // sp.render();
        // loading.render();
        // loading.mousePressed();
        // mc.update();
        // mc.render();
        // start.onClick();

        // radar.update();
        // radar.render();

        // if (checkKey(LEFT))
        // {
        //     System.out.println("Left arrow key pressed");
        // }
    }

    
}

