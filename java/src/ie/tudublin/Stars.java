package ie.tudublin;

public class Stars extends UI
{
    float x;
    float y;
    float z;
    float previousZ;
    UI ui;

    public Stars(UI ui){
        x = random(-width, width);
        y = random(-height, height);
        z = random(width);
        this.ui = ui;
    }

    public void render() 
    {
        ui.fill(255);
        ui.noStroke();
    
        float sx = map(x / z, 0, 1, 0, width);
        float sy = map(y / z, 0, 1, 0, height);;
    
        float px = map(x / previousZ, 0, 1, 0, width);
        float py = map(y / previousZ, 0, 1, 0, height);
    
        previousZ = z;
    
        ui.stroke(255);
        ui.line(px, py, sx, sy);
    
      }
}
