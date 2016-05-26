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
    private VoidButton voidButton = new VoidButton();
    private int N;

    public void init(int N) {
        this.N = N;
        buttonsMatrix = new JButton[N][N];
        numberMatrix = new int[N][N];
        this.setLayout(null);//new BorderLayout());
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                buttonsMatrix[i][j] = new JButton();
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
        //System.out.println("Button field created");
        randomizeMatrix();
        refreshField();
        System.out.println("x-" + voidButton.getX() + " y-" + voidButton.getY());
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                buttonsMatrix[i][j].setText(""+numberMatrix[i][j]);
//                if (numberMatrix[i][j] == 0){buttonsMatrix[i][j].setText("");}
//            }
//        }

    }
    public void refreshField(){
         for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                buttonsMatrix[i][j].setText(""+numberMatrix[i][j]);
                if (numberMatrix[i][j] == 0){
                    buttonsMatrix[i][j].setText("");
                    voidButton.setX(j);
                    voidButton.setY(i);
                }
            }
        }
    }

    public void randomizeMatrix()
    {
        for(int i = 0;i<100;i++)
        {
            int a = (int)(Math.random()*N);
            int b = (int)(Math.random()*N);
            int a2 = (int)(Math.random()*N);
            int b2 = (int)(Math.random()*N);

            int c = numberMatrix[a][b];
            numberMatrix[a][b] = numberMatrix[a2][b2];
            numberMatrix[a2][b2] = c;
        }
        System.out.println("Matrix after randomize");
        printNumMatr();


    }
    public void printNumMatr(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(numberMatrix[i][j]+ " ");
            }
            System.out.println("");
        }
    }


}
