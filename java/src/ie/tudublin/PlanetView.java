package ie.tudublin;

public class PlanetView extends UI
{
    UI ui;

    public PlanetView(UI ui){
        this.ui = ui;
    }

    public void render(){
        Float r;
        for(r = (float) 0; r < 1000000; r++) {
            ui.pushMatrix();
            ui.noStroke();
            ui.fill(238,77,21);
            ui.translate(200,200);
            ui.rotate(radians(r));
            ui.ellipse(20, 30, 50, 50);
            ui.popMatrix();
        }
        

    }
}