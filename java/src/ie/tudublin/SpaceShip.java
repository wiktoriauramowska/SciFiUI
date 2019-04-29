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
    
    public SpaceShip(UI ui){
        this.ui = ui;

    }

    public void render(){
        ui.frameRate(3);
        float moveX =  random(-300, 120);
        float moveY = random(-300, 120);
        ui.noStroke();
        ui.pushMatrix();
        ui.translate(100,100);
        ui.rect(50 + moveX, 0 + moveY, 20, 50);
        ui.fill(255,0,0);
        ui.triangle(50+ moveX,0+ moveY,70+ moveX,0+ moveY,60+ moveX,-30+ moveY);
        ui.triangle(35+ moveX,50+ moveY,50+ moveX,50+ moveY,50+ moveX,20+ moveY);
        ui.triangle(70+ moveX,50+ moveY,85+ moveX,50+ moveY,70+ moveX,20+ moveY);
        ui.fill( random(255), random(255), random(255), random(255));
        ui.beginShape();
        ui.vertex(50+ moveX,50+ moveY);
        ui.vertex(70+ moveX,50+ moveY);
        ui.vertex(68+ moveX,58+ moveY);
        ui.vertex(65+ moveX,63+ moveY);
        ui.vertex(65+ moveX,68+ moveY);
        ui.vertex(60+ moveX,73+ moveY);
        ui.vertex(60+ moveX,70+ moveY);
        ui.vertex(56+ moveX,61+ moveY);
        ui.vertex(52+ moveX,58+ moveY);
        ui.vertex(50+ moveX,50+ moveY);
        ui.endShape();
        ui.popMatrix();
        
    }

    
}