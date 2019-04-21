package ie.tudublin;

import processing.core.PApplet;

public class LoadingBar
{
    
    int counter; 
    int startTime; 
    int maxTime;
    boolean done;
    UI ui;

    public LoadingBar(UI ui, int counter, int startTime, int maxTime, boolean done)
    {
        this.ui = ui;
        this.counter = counter;
        this.startTime = startTime;
        this.maxTime = maxTime;
        this.done = done;
    }

    public void render(){
        ui.textSize(0100);
        if (done) {
            ui.fill(255); 
            ui.text("DONE", ui.width/2, ui.height/2);
        } else {
            if (counter-startTime < maxTime) 
            {
                counter=ui.millis();
            } 
            else 
            {
                done=true;
            }
            ui.fill(255);
            ui.noStroke();
            ui.rect(ui.width/2 - 100, ui.height/2, ui.map(counter-startTime, 0, maxTime, 0, 200), 19 );
            ui.text(counter- startTime+" " + (maxTime) +  " " + ( ui.map(counter-startTime, 0, maxTime, 0, 200)), 20, 160);
            ui.noFill();
            ui.stroke(255, 7, 58);
            ui.rect(ui.width/2 - 100, ui.height/2,200, 19);
        }//else
    }

    public void mousePressed() { 
        if (done) { 
            counter = 0; 
            startTime = ui.millis();
            maxTime = 5000; 
            done = false;
        }
    }

}