package carsThreading;

import java.awt.*;

public class Car extends Canvas implements Runnable{
    private String driver;
    private Color color;
    private int start;
    private int end;
    private int speed;
    private int position;

    public Car(String driver, int end, int start, Color color) {
        this.driver = driver;
        this.end = end;
        this.speed = (int) Math.floor(Math.random() * 100);
        this.position = start;
        this.start = start;
        this.color = color;
        setSize(120,50);
    }

    @Override
    public void run() {
        while (position <= end){
            advance(1);
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void advance(int dx){
        position += dx;
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(color);
        g.fillRoundRect(position,10,120,30,10,10);
        g.fillOval(position+10,32,30,30);
        g.fillOval(position+75,32,30,30);
        g.setColor(Color.black);
        g.drawString(driver,position+10,30);
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
