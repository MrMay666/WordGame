package com.company;

import javax.swing.*;
import java.awt.*;

public class MrMay extends JPanel {
    private Image image=null;
    private int iWidth2;
    private int iHeight2;
    public MrMay(Image image){
        this.image=image;
        this.iWidth2=image.getWidth(this);
        this.iHeight2=image.getHeight(this);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(image !=null){
            int x =this.getParent().getWidth();
            int y=this.getParent().getHeight();
            g.drawImage(image,x,y,this);
        }
    }
}
