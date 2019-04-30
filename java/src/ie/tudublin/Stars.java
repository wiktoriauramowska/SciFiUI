package ie.tudublin;

public class Stars extends UI
{
    float x;
    float y;
    float z;
    float prevZ;
    UI ui;

    public Stars(UI ui){
        x = random(-width, width);
        y = random(-height, height);
        z = random(width);
        this.ui = ui;
        prevZ = z;
    }

    public void render() 
    {
        ui.fill(255);
        ui.noStroke();
    
        float sx = map(x / z, 0, 1, 0, width);
        float sy = map(y / z, 0, 1, 0, height);;
    
        float px = map(x / prevZ, 0, 1, 0, width);
        float py = map(y / prevZ, 0, 1, 0, height);
    
        prevZ = z;
    
        ui.stroke(255);
        ui.line(px, py, sx, sy);
    
      }
}
