package net.dzirt;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Dzirt on 26.05.2016.
 */
public class MainMenu extends JMenuBar{
    public MainMenu(){
        //Создаем основное меню
        //JMenuBar menuBar = new JMenuBar();
        //Создаем подменю
        JMenu menuGame = new JMenu("Game");
        JMenu menuHelp = new JMenu("Help");
        //Добавляем подменю в основное меню
        add(menuGame);
        add(menuHelp);

        //Создаем элементы подменю Game с обработчиками событий
        JMenuItem item1 = new JMenuItem("New game");
        JMenuItem item2 = new JMenuItem("Exit");
        //Создаем элемент подменю Help с обработчиками событий
        JMenuItem item3 = new JMenuItem("About...");
        //Добавляем обработчики событий по нажатию
        item1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //newGame();
            }
        });
        item2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);//Выход из системы
            }
        });
        item3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null,
                        "Created by Dzirt. Game fifteen or more =)","About",
                        JOptionPane.QUESTION_MESSAGE);
            }
        });
        //Добавляем созданные элементы к подменю
        menuGame.add(item1);
        menuGame.add(item2);
        menuHelp.add(item3);
    }
}
