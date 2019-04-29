package ie.tudublin;

public class SideBoxes extends UI
{
    UI ui;

    public SideBoxes(UI ui){
        this.ui = ui;

    }

    public void render(){
        float x = - ui.width * 0.1f;
        float y = - ui.height * 0.1f;
        for(Integer i = 0; i < ui.height - 100; i += 50){
            ui.fill(ui.random(255),ui.random(255),ui.random(255));
            ui.noStroke();
            ui.pushMatrix();
            ui.translate(-570, -300);
            ui.rect(x, y + i, 50, 30);
            ui.popMatrix();
        }
        for(Integer i = 0; i < ui.height - 100; i += 50){
            ui.fill(ui.random(255),ui.random(255),ui.random(255));
            ui.noStroke();
            ui.pushMatrix();
            ui.translate(-500, -300);
            ui.rect(x, y + i, 50, 30);
            ui.popMatrix();
        }
    }
}