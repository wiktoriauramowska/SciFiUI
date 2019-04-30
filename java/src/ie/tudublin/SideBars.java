package ie.tudublin;

public class SideBars extends UI
{
    UI ui;

    public SideBars(UI ui){

        this.ui = ui;
    }

    public void render(){
        float x = 150;
        float y = 200;
        ui.stroke(255);
        ui.noFill();
        ui.rect( x - 320 , y, 950, 50);
        ui.noStroke();
        ui.fill(255);
        ui.rect( x + 2 ,y + 2 , 0 + ui.mouseX - 320, 48);

    }

    public void update(){
        float x = 150;
        float y = 200;
        ui.stroke(255);
        ui.noFill();
        ui.rect( x - 320 , y + 80, 950, 50);
        ui.noStroke();
        ui.fill(255);
        ui.rect( x + 2 ,y + 82 , 0 + ui.mouseY - 320, 48);
    }
}