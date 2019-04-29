package ie.tudublin;

public class SpaceShip extends UI
{
    UI ui;
    
    public SpaceShip(UI ui){
        this.ui = ui;

    }

    public void render(){
        ui.noStroke();
        ui.pushMatrix();
        ui.translate(100,100);
        ui.rect(50, 0, 20, 50);
        ui.fill(255,0,0);
        ui.triangle(50,0,70,0,60,-30);
        ui.triangle(35,50,50,50,50,20);
        ui.triangle(70,50,85,50,70,20);
        ui.fill( random(255), random(255), random(255), random(255));
        ui.beginShape();
        ui.vertex(50,50);
        ui.vertex(70,50);
        ui.vertex(68,58);
        ui.vertex(65,63);
        ui.vertex(65,68);
        ui.vertex(60,73);
        ui.vertex(60,70);
        ui.vertex(56,61);
        ui.vertex(52,58);
        ui.vertex(50,50);
        ui.endShape();
        ui.popMatrix();
    }
}