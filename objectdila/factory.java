package org.javaturk.oopj.objectdila;

public class factory {
    public static void main(String[] args) {
        pen firstpen = new pen();

        String message = "İlk kalem üretildi";

        firstpen.writeMessage(message);

/**        pen secondPen = new pen();
        secondPen.color = "Mavi";
        secondPen.height =8;
        secondPen.writeMessage(secondPen.color+" "+ secondPen.height);
**/
        Car car = new Car();
        car.numberOfSeats = 5;
        car.numberOfWheehls = 4;


        Bicycle bicycle = new Bicycle();
        bicycle.numberOfWheehls=1;
        bicycle.numberOfSeats =2;
        //her araba açtır
        Vehicle car2 = new Car();

        car2.stop();


        car.start();
        bicycle.start();

        //getset koıyup encapsulation yaptık o yüzden dşrek penlerin coloruna ulaşamlıyorum.
        firstpen.setColor("Pembe");
        firstpen.setHeight(10);


    }
}
