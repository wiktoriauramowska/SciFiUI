package ie.tudublin;


public class FileIcons{
    UI ui;
    Integer i;
    

    public FileIcons(UI ui){
        this.ui = ui;

    }

    public void render(){
        ui.noFill();
        ui.stroke(255);
        for(i=100;i<1200;i+=260){
            ui.beginShape();
            ui.vertex(50+i,54);
            ui.vertex(54+i,50);
            ui.vertex(96+i,50);
            ui.vertex(100+i,54);
            ui.vertex(108+i,62);
            ui.vertex(112+i,66);
            ui.vertex(196+i,66);
            ui.vertex(200+i,70);
            ui.vertex(200+i,176);
            ui.vertex(196+i,180);
            ui.vertex(54+i,180);
            ui.vertex(50+i,176);
            ui.vertex(50+i,54);
            ui.endShape();
          }
    }
}

