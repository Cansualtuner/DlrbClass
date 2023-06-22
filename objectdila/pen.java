package org.javaturk.oopj.objectdila;

public class pen {

    //private yaparsak dılşardan erişmeyi engeller. get set olabilir

    private String color;
    int height;

    void writeMessage(String message){
        System.out.println("Mesajınız:" + message);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //encapsulation
    public void setColor(String color){
        if ("red".equals(color) || "blue".equals(color) || "black".equals(color))
            this.color = color;
        else
            throw new IllegalArgumentException();
    }

    public String getColor() {
        return color;
    }
}
