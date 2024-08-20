package com.doublylinkedlist;   import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




    public class MovingDonut extends JPanel implements ActionListener {
        private static final int DONUT_SIZE = 100;
        private static final int PANEL_SIZE = 600;
        private static final int MOVE_STEP = 5;

        private int x = 0;
        private int y = PANEL_SIZE / 2 - DONUT_SIZE / 2;
        private Timer timer;

        public MovingDonut() {
            setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
            timer = new Timer(30, this); // Update every 30 ms
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawDonut(g, x, y);
        }

        private void drawDonut(Graphics g, int x, int y) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.RED);
            g2d.fillOval(x, y, DONUT_SIZE, DONUT_SIZE);

            g2d.setColor(Color.WHITE);
            g2d.fillOval(x + DONUT_SIZE / 4, y + DONUT_SIZE / 4, DONUT_SIZE / 2, DONUT_SIZE / 2);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            x += MOVE_STEP;
            if (x > PANEL_SIZE) {
                x = -DONUT_SIZE; // Reset position to the left when it goes off-screen
            }
            repaint();
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Moving Donut");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new MovingDonut());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }


