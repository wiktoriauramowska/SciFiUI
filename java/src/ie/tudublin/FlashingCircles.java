package ie.tudublin;

public class FlashingCircles extends UI
{
    UI ui;
    //Integer i;
    
    
    
    public FlashingCircles(UI ui){
        this.ui = ui;

    }
    

    public void render(){
        for(Integer i = 0; i < 100; i ++)
        {
            if(i % 2 == 0)
            {
                ui.fill(255);
                ui.ellipse(50,50,50,50);
            }
            else
            {
                ui.fill(255,0,0);
                ui.ellipse(50,50,50,50);
            }
            if(i == 99)
            {
                i = 0;  
            }
        }


    }
}