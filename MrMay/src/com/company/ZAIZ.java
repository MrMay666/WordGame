package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Zaiz {

    JTextField wordField;
    JTextField translationField;
    JButton startButton;

    class WordGameIntrface extends JFrame {
        private JButton start;
        private JButton next;
        private JButton check;
        private JTextField word;
        private JTextField translation;

        public WordGameIntrface() throws IOException {
            setTitle("Word Game");
            BufferedImage image = ImageIO.read(new File("src/1.ipg"));
            MrMay panel = new MrMay(image);
            panel.setLayout(null);

            wordField = new JTextField("word");
            translationField = new JTextField("слово(перевод слова)");

            wordField.setLayout(null);
            translationField.setLayout(null);

            wordField.setBounds(100, 90, 200, 30);
            translationField.setBounds(100, 130, 200, 30);

            wordField.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));
            translationField.setFont(new Font("Arial", Font.ROMAN_BASELINE, 16));

            startButton = new JButton("Начать");
            startButton.setLayout(null);
            startButton.setBounds(100, 50, 200, 30);
            startButton.setBackground(new Color(214, 114, 15));
            startButton.setForeground(Color.GREEN);
            startButton.setFont(new Font("Arial", Font.BOLD, 26));
            startButton.setFocusPainted(false);

            startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                }
            });
            setContentPane(panel);
            setSize(1920, 1080);
            setVisible(true);

        }

        public void main(String[] args) throws IOException {
            new Zaiz();
        }
    }
}

