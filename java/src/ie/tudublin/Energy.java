package ie.tudublin;

public class Energy extends UI
{
    UI ui;
    int[] angles = { 75, 20, 65, 110, 10, 10, 50, 20 };


    public Energy(UI ui){
        this.ui = ui;
    }
    
    public void render()
    {
        float lastAngle = 0;
        for (int i = 0; i < angles.length; i++) 
        {
            float x = 300;
            float colours = ui.map(i, 0, angles.length, 0, 255);
            ui.fill(colours + 120, 50, 0);
            ui.stroke(0);
            ui.pushMatrix();
            ui.translate(450,-300);
            ui.arc(width/2, height/2, x, x, lastAngle, lastAngle+ui.radians(angles[i]));
            ui.popMatrix();
            lastAngle += ui.radians(angles[i]);
        }

    }
}