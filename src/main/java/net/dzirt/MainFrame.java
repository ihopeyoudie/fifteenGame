package net.dzirt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dzirt on 25.05.2016.
 */
public class MainFrame extends JFrame{
    //private JFrame mainFrame = new JFrame("Fifteen the Game");
    //JPanel contentPane;
    //JPanel gamePane = new JPanel();
    //BorderLayout borderLayout1 = new BorderLayout();
    private int N = 4;
    //линия статус бара
    //JLabel status= new JLabel();

    //private JButton[][] buttons = new JButton[10][10];
    //матрица для хранения чисел
    //private int[][] matrix = new int[10][10];

    public MainFrame() {
        //this.init(N);
    }

    public void init(int n) {
        this.N = n;
        this.setLocation(400,400);
//        this.setMaximumSize(new Dimension(500,500));
//        this.setSize(new Dimension(400,250));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
        MainMenu menuBar = new MainMenu();
        //Устанавливаем полученное меню на окно
        this.setJMenuBar(menuBar);

        //contentPane = (JPanel) this.getContentPane();
        //contentPane.setLayout(borderLayout1);
        this.setSize(new Dimension(50*N+5,50*N+50));
        //запрещаем изменение размера окна
        this.setResizable(false);
        GamePanel gPanel1 = new GamePanel();
        gPanel1.createGame(N);

       // gamePane.setLayout(null);
        // добавляем кнопочки
//        int count=0;
//        for(int i = 0;i<N;i++)
//            for(int j = 0;j<N;j++)
//            {
//                buttons[i][j] = new JButton(""+count);
//                //устанавливаем обработчик событий
//                //buttons[i][j].addMouseListener(new mAdapter(i,j));
//                buttons[i][j].addActionListener(new ButtonActionListener(count));
//                buttons[i][j].setSize(50,50);
//                buttons[i][j].setLocation(50*j,50*i);
//                buttons[i][j].setCursor(new Cursor(Cursor.HAND_CURSOR));
//                gamePane.add(buttons[i][j]);
//                matrix[i][j]=count;//задаем матрицу
//                count++;
//            }
//        buttons[0][0].setText(" ");
//        //Добавляем игровую панель с кнопками
//        contentPane.add(gamePane,BorderLayout.CENTER);

        //новая игра
        //newGame();
    }
//    public void randomizeMatrix()
//    {
//        for(int i = 0;i<100;i++)
//        {
//            int a = (int)(Math.random()*N);
//            int b = (int)(Math.random()*N);
//            int a2 = (int)(Math.random()*N);
//            int b2 = (int)(Math.random()*N);
//
//            int c = matrix[a][b];
//            matrix[a][b] = matrix[a2][b2];
//            matrix[a2][b2] = c;
//        }
//    }
//    /**Начинаем новую игру*/
//    public void newGame()
//    {
//        randomizeMatrix();
//        for(int i = 0;i<N;i++)
//                for(int j = 0;j<N;j++)
//                {
//                //пишем на кнопочках числа из матрицы
//                if(matrix[i][j]!=0)buttons[i][j].setText(""+matrix[i][j]);
//                else buttons[i][j].setText("");
//            }
//        //status.setText("new game started");
//        gamePane.setVisible(true);
//    }

//    public class ButtonActionListener implements ActionListener{
//        private int num;
//        //@Override
//        ButtonActionListener(int i){
//            this.num = i;
//        }
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("button pressed "+ num);
//        }
//    }

}
