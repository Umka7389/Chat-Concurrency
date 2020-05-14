package Java2.HW_1;

import javax.swing.*;
import java.awt.*;

public class Background extends JFrame {
    MainCanvas canvas;
    float vChange = 0.5f;
    float red = (int) (Math.random()*255);
    float green = (int) (Math.random()*255);
    float blue = (int) (Math.random()*255);


    Background(MainCanvas canvas){
        this.canvas = canvas;
    }

    public void changeCanvasColor (){
        if (red+vChange <= 255 && red+vChange >= 0){
            red += vChange;
        } else if (green+vChange <= 255 && green+vChange >= 0){
            green += vChange;
        } else if (blue+vChange <= 255 && blue+vChange >= 0) {
            blue += vChange;
        } else vChange = -vChange;
        canvas.setBackground(new Color((int) red, (int) green, (int)blue));
    }
}
