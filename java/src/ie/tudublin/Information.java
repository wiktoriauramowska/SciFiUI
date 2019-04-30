package ie.tudublin;

public class Information extends UI
{

    UI ui;

    public Information(UI ui){
        this.ui = ui;

    }

    public void render(){
        float startX = 100;
        float startY = 200;
        float x = startX - 650;
        float y = startY - 400;
        ui.pushMatrix();
        //ui.translate(500, 500);
        ui.fill(0);
        ui.noStroke();
        ui.rect(x, y, 350, 600 );
        ui.popMatrix();
    }
}