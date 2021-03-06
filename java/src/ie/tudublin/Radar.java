package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar
{
    private float radius;
    private PVector pos;
    private float frequency;
    private UI ui;
    private float theta = 0;

    public Radar(UI ui, float frequency, float x, float y, float radius)
    {
        this.ui = ui;
        this.frequency = frequency;
        pos = new PVector(x, y);
        this.radius = radius;
    }

    public void render()
    {

        ui.noFill();
        if (ui.mousePressed) {
            ui.noStroke();
        }
        else {
            ui.stroke(255);
            ui.pushMatrix();
            ui.translate(-765,-430);
            ui.ellipse(ui.mouseX, ui.mouseY, radius * 2, radius * 2);
            float x2 = ui.mouseX + (float) Math.sin(theta) * radius;
            float y2 = ui.mouseY - (float) Math.cos(theta) * radius;
            for( Integer i = 20; i < radius * 2; i += 20){
                ui.ellipse(ui.mouseX, ui.mouseY, radius * 2 - i, radius * 2 - i);
            }
            ui.line(ui.mouseX, ui.mouseY, x2, y2);
            ui.translate(0,100);
            ui.line(ui.mouseX, ui.mouseY, x2, y2);
            ui.translate(0, -100);
            ui.line(ui.mouseX, ui.mouseY,ui.mouseX + radius, ui.mouseY);
            ui.line(ui.mouseX, ui.mouseY, ui.mouseX - radius, ui.mouseY);
            ui.popMatrix();
        }
    }

    float timeDelta = 1.0f / 60.0f;

    public void update()
    {
        
        theta += PApplet.TWO_PI * timeDelta * frequency;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the frequency
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    
}