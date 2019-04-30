package ie.tudublin;



public class Spiral extends UI
{
    UI ui;
    private float y; // y coordinate of spiral
    private float x; // x coordinate of spiral
    //private float z; // z coordinate of spiral
    private float r = 1.0f; // radius
    //private float a = 0.0f; // angle
    

    public Spiral(UI ui, float x, float y,float z, float r)
    {
        this.ui = ui;
        this.x = 400;
        this.y = 300;
        //this.z = 100;
        this.r = r;
        

    }

    public void render(){
        if (frameCount % 10 == 0) 
        {
            float r = 150; //radius of the spiral
            int detail = 100; // how detailed the spiral should be 
            for (int i = 0; i < detail; i++)
            {
                float lon = map(i, 0, detail, -PI, PI);
                for (int j = 0; j < detail; j++)
                {
                    float lat = map(j, 0, detail, -HALF_PI, HALF_PI);
                    float x = (r * sin(lon) * cos(lat)) + 400;
                    float y = (r * sin(lon) * sin(lat)) + 250;
                    //float z = r * cos(lon);
                    ui.pushMatrix();
                    ui.fill(255);
                    ui.translate(-790, -510);
                    ui.rotate(radians(frameCount * 2  % 360));
                    ui.point(x, y);
                    ui.popMatrix();
                    ui.fill(58,250,21);
                    // ui.pushMatrix();
                    // ui.translate(5, 50);
                    // ui.rotateX(0);
                    // ui.rotateY(0);
                    // ui.sphere(90);
                    // ui.popMatrix();
                }
            }
            //ui.rect(0, 0, 80, 20);
            
        }

        
    }

    public void update(){
        //put in the code for the "spiral" to rotate while on the screen 
    }
}