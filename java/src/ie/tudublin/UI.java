package ie.tudublin;

//import processing.core.PApplet;
//import processing.opengl.PGraphics3D;
//import processing.opengl.PGraphicsOpenGL;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;


public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    UI ui;
    Spiral sp;
    StartScreen start;
    Radar radar;
    GetInput userName;
    LoadingBar loading;
    FileIcons icon;
    Border border;
    FlashingCircles flash;
    PlanetView planet;
    Background back;
    PImage bg;
    Stars[] stars = new Stars[3000];
    

    
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
        //fullScreen(P3D);
        fullScreen();
        //loadTitles();
        
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 100, 100, 200, 100);
        sp = new Spiral(this, 1000, 500, 30, 5);
        loading = new LoadingBar(this, 0, millis(), 5000, false);
        start = new StartScreen();
        icon = new FileIcons(this);
        border = new Border(this);
        flash = new FlashingCircles(this);
        planet = new PlanetView(this);
        back = new Background(this);
        
        
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Stars(this);
          }

        drawStars();

    }

    public void loadTitles(){
		Table table = loadTable("titles.csv", "header");
		for(TableRow row:table.rows()){
			titles.add(new Title(row));
		}
    }

    
    public void printTitles(){

        float start = width * 0.078f;
        float h = height * 0.13f;
        textAlign(CENTER, CENTER);
        textSize(16);
        
        for(int i = 0 ; i < titles.size() ; i ++)
            {
                Title t = titles.get(i);
                float x = map(i, 0, titles.size(), start, width*0.55f);
                stroke(255);
                noFill();
                rect(x-40, h-10, 80, 30);
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

    public void drawStars()
    {
        //translate needed so they "come out" of the centre 
        translate(width/2, height/2);
        for (int i = 0; i < stars.length; i++) {
            stars[i].render();
        }
    }
    

    public void draw()
    {
        background(32, 15, 19);
        //b.render();
        //icon.render();
        //printTitles();
        //drawTerminal();
        //drawSideTab();
        border.render();
        //flash.render();
        //planet.render();
        //back.render();
        drawStars();

        


        //have to put those in an if statement, only to execute after the user name is inputted
        //sp.render();
        // loading.render();
        // loading.mousePressed();
        // mc.update();
        // mc.render();
        // start.onClick();

        
        //radar.render();
        //radar.update();

        // if (checkKey(LEFT))
        // {
        //     System.out.println("Left arrow key pressed");
        // }
    }

    
}

