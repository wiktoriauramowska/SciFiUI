package ie.tudublin;

import java.awt.Color;

import processing.core.PApplet;


public class Spiral extends UI
{
    UI ui;
    private float y; // y coordinate of spiral
    private float x; // x coordinate of spiral
    //private float z; // z coordinate of spiral
    private float r = 1.0f; // radius
    //private float a = 0.0f; // angle
    

    public Spiral(UI ui, float x, float y,float z, float r)
    {
        this.ui = ui;
        this.x = 400;
        this.y = 300;
        //this.z = 100;
        this.r = r;
        // this.a = a; UI ui, float x, float y,float z, float r, float a
        

    }

    public void render(){
        /*
        ui.noFill();
        ui.ellipse(400, 200, 1, 1); //"centre" of spiral
        float x = ui.sin(a);
        float y = ui.cos(a);
        //int c = ui.color(255, 204, 0);  // Define color 'c'
        ui.noFill();  // Use color variable 'c' as fill color
        ui.ellipse(400, 200, 500, 300); //"border" of a spiral
        */
        //ui.pushMatrix();
        // fill(255);
        // //translate(width/2, height/2);
        // float r = 200; //radius of the spiral
        // int detail = 100; // how detailed the spiral should be 
        // for (int i = 0; i < detail; i++){
        //     float lon = map(i, 0, detail, -PI, PI);
        //     for (int j = 0; j < detail; j++){
        //         float lat = map(j, 0, detail, -HALF_PI, HALF_PI);
        //         float x = (r * sin(lon) * cos(lat)) + 400;
        //         float y = (r * sin(lon) * sin(lat)) + 250;
        //         //float z = r * cos(lon);
        //         point(x, y);
        //     }

        // }
        ui.fill(255);
        float r = 200; //radius of the spiral
        int detail = 100; // how detailed the spiral should be 
        for (int i = 0; i < detail; i++){
            float lon = map(i, 0, detail, -PI, PI);
            for (int j = 0; j < detail; j++){
                float lat = map(j, 0, detail, -HALF_PI, HALF_PI);
                float x = (r * sin(lon) * cos(lat)) + 400;
                float y = (r * sin(lon) * sin(lat)) + 250;
                //float z = r * cos(lon);
                ui.point(x, y);
            }

        }  
        //ui.popMatrix();

        // ui.pushMatrix();
        // ui.translate(500, height/2, -200);
        // ui.noFill();
        // ui.stroke(255);
        // ui.sphere(280);
        // ui.popMatrix();

        
    }

    public void update(){
        //put in the code for the "spiral" to rotate while on the screen 
    }
}