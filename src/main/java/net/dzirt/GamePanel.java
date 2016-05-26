package net.dzirt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dzirt on 26.05.2016.
 */
public class GamePanel extends JPanel{
    private BorderLayout borderLayout1 = new BorderLayout();
    private int N;
    private JButton[][] gameButtons;// = new JButton[10][10];
    private int[][] matrix;// = new int[10][10];

    public void createGame(int n){
        this.N = n;
        gameButtons = new JButton[N][N];
        matrix = new int[N][N];
        setLayout(borderLayout1);
        setVisible(true);
        int count=0;
        for(int i = 0;i<N;i++)
            for(int j = 0;j<N;j++)
            {
                gameButtons[i][j] = new JButton(""+count);
                //устанавливаем обработчик событий

                gameButtons[i][j].addActionListener(new ButtonActionListener(count));
                gameButtons[i][j].setSize(50,50);
                gameButtons[i][j].setLocation(50*j,50*i);
                gameButtons[i][j].setCursor(new Cursor(Cursor.HAND_CURSOR));
                add(gameButtons[i][j]);
                matrix[i][j]=count;//задаем матрицу
                count++;
            }
        gameButtons[0][0].setText(" ");
        //Добавляем игровую панель с кнопками
//        contentPane.add(gamePane,BorderLayout.CENTER);

    }
    public void randomizeMatrix()
    {
        for(int i = 0;i<100;i++)
        {
            int a = (int)(Math.random()*N);
            int b = (int)(Math.random()*N);
            int a2 = (int)(Math.random()*N);
            int b2 = (int)(Math.random()*N);

            int c = matrix[a][b];
            matrix[a][b] = matrix[a2][b2];
            matrix[a2][b2] = c;
        }
    }
    public void newGame()
    {
        randomizeMatrix();
        for(int i = 0;i<N;i++)
            for(int j = 0;j<N;j++)
            {
                //пишем на кнопочках числа из матрицы
                if(matrix[i][j]!=0)gameButtons[i][j].setText(""+matrix[i][j]);
                else gameButtons[i][j].setText("");
            }
        //status.setText("new game started");
        setVisible(true);
    }

    public class ButtonActionListener implements ActionListener {
        private int num;
        //@Override
        ButtonActionListener(int i){
            this.num = i;
        }
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed "+ num);
        }
    }
}
