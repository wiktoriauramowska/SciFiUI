package ie.tudublin;

import java.util.ArrayList;

public class SpaceShip extends UI
{
    UI ui;
    Integer shipCount = 9;
    float x, y;
    float XX, YY;
    boolean hit;
    
    ArrayList<SpaceShip> ships = new ArrayList<SpaceShip>();
    
    public SpaceShip(UI ui, float x){
        this.ui = ui;
        this.x = x;

    }

    public void render(){
        //ui.frameRate(3);
        //float moveX =  random(-300, 120);
        //float moveY = random(-300, 120);
        ui.noStroke();
        ui.pushMatrix();
        ui.translate(0,100);
        ui.fill(255);
        ui.rect(x, 0, 20, 50);
        ui.fill(255,0,0);
        ui.triangle(x,0,x+20,0,x+10,-30);
        ui.triangle(x-15,50,x,50,x,20);
        ui.triangle(x+20,50,x+35,50,x+20,20);
        ui.fill( random(255), random(255), random(255), random(255));
        ui.beginShape();
        ui.vertex(x,50);
        ui.vertex(x+20,50);
        ui.vertex(x+18,58);
        ui.vertex(x+15,63);
        ui.vertex(x+15,68);
        ui.vertex(x+10,73);
        ui.vertex(x+10,70);
        ui.vertex(x+6,61);
        ui.vertex(x+2,58);
        ui.vertex(x,50);
        ui.endShape();
        ui.popMatrix();
        
    }

    
}