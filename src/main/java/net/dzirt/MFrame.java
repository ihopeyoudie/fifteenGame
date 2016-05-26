package net.dzirt;

import javax.swing.*;

/**
 * Created by Андрей on 26.05.2016.
 */
public class MFrame extends JFrame{

    public void init(int n){
        setTitle("GAME");
        setLocation(600,300);
        setSize(n*50+6,n*50+28);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        FPanel gamePanel = new FPanel();
        gamePanel.init(n);
        gamePanel.buildField();
        add(gamePanel);
        //pack();
    }
}
