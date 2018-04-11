package polymorph;

public class Transport {
  int passengerCount;
  int speed;
  public Transport(int passengerCount, int speed) {
    this.passengerCount = passengerCount;
    this.speed = speed;
  }

  public int milesPerGallon() {
    return 1;
  }
}

class Motorcycle extends Transport {
  public Motorcycle() {
    super(2, 120);
  }
  public int milesPerGallon() {
    return 70;
  }
}

class Car extends Transport {
  public Car() {
    super(5, 100);
  }
  public int milesPerGallon() {
    return 35;
  }
}

class Aeroplane extends Transport {
  public Aeroplane() {
    super(500, 500);
  }
  public int milesPerGallon() {
    return 1;
  }
  public void doFoodService() {
    System.out.println("serving dry pretzels");
  }
}

class Logistics {
  public static double costPerPassengerMile(Transport t) {
    if (t instanceof Aeroplane) {
      Aeroplane a = (Aeroplane)t;
      a.doFoodService();
    }
    return 3.0 / t.milesPerGallon() / t.passengerCount;
  }

  public static void main(String[] args) {
    Transport t1 = new Motorcycle();
    Transport t2 = new Car();
    System.out.println("Cost per mile of car is "
        + costPerPassengerMile(t2));
    System.out.println("Cost per mile of bike is "
        + costPerPassengerMile(t1));
    System.out.println("Cost per mile of plane is "
        + costPerPassengerMile(new Aeroplane()));

  }
}