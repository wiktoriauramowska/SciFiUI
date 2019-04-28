package ie.tudublin;

public class Stars extends UI
{
    float x;
    float y;
    float z;
    float previousZ;
    UI ui;

    public Stars(UI ui){
        x = random(-width/2, width/2);
        y = random(-height/2, height/2);
        z = random(width/2);
        this.ui = ui;
    }

    public void render() 
    {
        ui.fill(255);
        ui.noStroke();
    
        float sx = map(x / z, 0, 1, 0, width/2);
        float sy = map(y / z, 0, 1, 0, height/2);;
    
        float px = map(x / previousZ, 0, 1, 0, width/2);
        float py = map(y / previousZ, 0, 1, 0, height/2);
    
        previousZ = z;
    
        ui.stroke(255);
        ui.line(px, py, sx, sy);
    
      }
}
