package net.dzirt;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Dzirt on 25.05.2016.
 */
public class FPanel extends JPanel {
    //private ArrayList<JButton> buttonList = new ArrayList<JButton>();

    private JButton[][] buttonsMatrix;
    private int[][] numberMatrix;

    private int N;

    public void init(int N) {
        this.N = N;
        buttonsMatrix = new JButton[N][N];
        numberMatrix = new int[N][N];
        this.setLayout(null);//new BorderLayout());
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
               //buttonList.add(new JButton());
                buttonsMatrix[i][j] = new JButton("" + k);
                buttonsMatrix[i][j].setSize(50,50);
                buttonsMatrix[i][j].setLocation(50*j,50*i);
                buttonsMatrix[i][j].setCursor(new Cursor(Cursor.HAND_CURSOR));
                numberMatrix[i][j] = k;
                k++;
            }
        }
        buttonsMatrix[0][0].setText(" ");
    }
    public void buildField(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
               add(buttonsMatrix[i][j]);
            }
        }
        System.out.println("Button field created");
    }


}
