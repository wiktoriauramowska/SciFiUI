package ie.tudublin;

public class Border extends UI
{
    UI ui;


    public Border(UI ui){
        this.ui = ui;
    }
    
    public void render()
    {
        float x =ui.width * 0.01f;
        float y = ui.height * 0.02f;
        float w = ui.width * 0.98f;
        float h = ui.height * 0.96f;
        ui.noFill();
        ui.stroke(255);
        ui.rect(x,y,w,h);

    }
}