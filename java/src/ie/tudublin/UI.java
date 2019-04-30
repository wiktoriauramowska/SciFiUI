package ie.tudublin;

//import processing.core.PApplet;
//import processing.opengl.PGraphics3D;
//import processing.opengl.PGraphicsOpenGL;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.core.*;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;
import ddf.minim.*;


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
    SpaceShip ship;
    SideBoxes boxes;
    SpaceShip ship1;
    Minim minim;
    AudioPlayer song;
    AudioPlayer snap;
    Information info;
    Integer counter;
    SpaceShip ship2;
    Energy energy;
    SideBars bars;
    
    

    
    ArrayList<Title> title = new ArrayList<Title>();
    ArrayList<Code> code = new ArrayList<Code>();
    


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
        //fullScreen(P3D,SPAN);
        loadTitle();
        loadCode();
        
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, mouseX, mouseY, 200, 100);
        sp = new Spiral(this, 1000, 500, 30, 5);
        loading = new LoadingBar(this, 0, millis(), 5000, false);
        start = new StartScreen();
        icon = new FileIcons(this);
        border = new Border(this);
        flash = new FlashingCircles(this);
        planet = new PlanetView(this);
        back = new Background(this);
        ship = new SpaceShip(this, 50);
        boxes = new SideBoxes(this);
        ship1 = new SpaceShip(this, -50);
        ship2 = new SpaceShip(this, -150);
        minim = new Minim(this);
        info = new Information(this);
        song = minim.loadFile("spaceShip.mp3");
        song.play();
        energy = new Energy(this);
        bars = new SideBars(this);
        

        
        
       
        
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Stars(this);
          }

        drawStars();

    }

    public void loadTitle(){
		Table table = loadTable("welcome.csv", "header");
		for(TableRow row:table.rows()){
			title.add(new Title(row));
		}
    }

    public void loadCode(){
        Table table = loadTable("code.csv", "header");
        for(TableRow row:table.rows()){
            code.add(new Code(row));
        }
    }

    public void printCode(){

        PFont myFont;

        myFont = createFont("data-latin.ttf", 20);
        textFont(myFont);

        // float x = width *0.2f;
        // float h = height * 0.3f;
        float w = -520;
        float h = -80;
        float startX = 100;
        float startY = 200;
        float x = startX - 650;
        float y = startY - 300;
        fill(0);
        stroke(255);
        rect(x, y, 350, 500 );
        textAlign(LEFT, CENTER);
        noStroke();
        fill(57,255,20);

        for(int i = 0; i < code.size(); i++)
        {
            for(int j = 0; j < 500; j +=50){
                Code c = code.get(i);
                textAlign(LEFT, CENTER);
                text(c.code, w, h + j);
            }
        }
    }

    // float border = height * 0.1f;
    //     float start = width * 0.05f;
    //     float w = width * 0.3f;
    //     float h = height * 0.1f;
    //     textAlign(LEFT, CENTER);
    //     textSize(16);
    //     for(int i = 0 ; i < products.size() ; i ++)
    //         {
    //             Product p = products.get(i);
    //             float y = map(i, 0, products.size(), border, height - border);
    //             fill(255);
    //             rect(start, y, w, h);
    //             fill(0);
    //             textAlign(LEFT, CENTER);
    //             text(p.name, start + 10, y + (h / 2));
    //             textAlign(RIGHT, CENTER);
    //             text(nf(p.price, 0, 2), start + w - 10, y + (h / 2));
    //         }

    
    public void printTitle(){

        PFont newFont;
        
        newFont = createFont("Amatic-Bold.ttf", 100);
        textFont(newFont);
        
        float x = width /2;
        float h = height * 0.13f;
        textAlign(CENTER, CENTER);
        fill(255);
        
        for(int i = 0 ; i < title.size() ; i ++)
        {
                Title t = title.get(i);
                textAlign(CENTER, CENTER);
                text(t.title,x, h);
        }
    }

    public void mousePressed(){
        snap = minim.loadFile("snap.mp3");
        snap.play();
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
        
        
        printTitle();
        
        //drawTerminal();
        //drawSideTab();
        border.render();
        //flash.render();
        //planet.render();
        //back.render();
        
        drawStars();
        sp.render();
        energy.render();
        
        
        //info.render();
        printCode();
        //for(counter = 0; counter < 5; counter++){
        ship.render();
        ship1.render();
        ship2.render();
        
        
        boxes.render();
        bars.render();
        bars.update();
        
        

        

        


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

