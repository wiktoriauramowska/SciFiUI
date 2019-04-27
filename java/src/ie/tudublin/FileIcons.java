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
        for(i=30;i<700;i+=145){
            ui.beginShape();
            ui.vertex(50+i,50);
            ui.vertex(52+i,48);
            ui.vertex(55+i,46);
            ui.vertex(80+i,46);
            ui.vertex(90+i,50);
            ui.vertex(120+i,50);
            ui.vertex(123+i,52);
            ui.vertex(125+i,55);
            ui.vertex(125+i,90);
            ui.vertex(123+i,93);
            ui.vertex(120+i,95);
            ui.vertex(55+i,95);
            ui.vertex(52+i,93);
            ui.vertex(50+i,90);
            ui.vertex(50+i,50);
            ui.endShape();
          }
    }
}

