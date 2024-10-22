import carsThreading.Car;
import carsThreading.Piste;

import java.awt.*;

public class Main {
  public static void main(String[] args) {

    Piste piste = new Piste("Cars-threading",500,300);

    Car cars[] = new Car[4];
    Thread carThreads[] = new Thread[4];

    cars[0] = new Car("amine",360,0, Color.BLUE);
    cars[1] = new Car("yassine",360,0, Color.YELLOW);
    cars[2] = new Car("Ibtissam",360,0, Color.GREEN);
    cars[3] = new Car("Benomar",360,0, Color.RED);

    for(int i = 0; i < 4; i++) {
      carThreads[i] = new Thread(cars[i]);
      piste.add(cars[i]);
    }
    piste.validate();
    for(int i = 0; i < 4; i++) {
      carThreads[i].start();
    }
  }
}
