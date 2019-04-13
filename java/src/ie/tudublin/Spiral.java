package ie.tudublin;

import java.awt.Color;

import processing.core.PApplet;

public class Spiral
{
    UI ui;
    private float cy; // y coordinate of spiral
    private float cx; // x coordinate of spiral
    private float r = 1.0f; // radius
    private float a = 0.0f; // angle
    

    public Spiral(UI ui, float cy, float cx, float r, float a)
    {
        
        this.ui = ui;
        this.cx = 500;
        this.cy = 300;
        this.r = r;
        this.a = a;

    }

    public void render(){
        ui.noFill();
        ui.ellipse(500, 200, 1, 1);
        float x = ui.sin(a);
        float y = ui.cos(a);
        //int c = ui.color(255, 204, 0);  // Define color 'c'
        ui.noFill();  // Use color variable 'c' as fill color
        ui.ellipse(500, 200, 500, 300);
        
        
            
        
    
    
    }
}