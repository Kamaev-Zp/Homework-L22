import L17.In.animals.*;
import L17.In.transport.Bike;
import L17.In.transport.Bus;
import L17.In.transport.Car;
import L17.In.transport.Transport;
import L17.In.people.Man;
import L17.In.people.People;
import L17.In.people.Woman;

public class L17Main {
  public static void main(String[] args) {



    System.out.println("=====================================================");


    System.out.println(" Люди : ");
//        People

    System.out.println("=====================================================");

    People karl = new Man(25, "Карл", "не женат", "0");
    karl.draw();
    String name = ((Man) karl).getName();
    System.out.println(name);
    karl.print();
    karl.info();
//
      System.out.println("=====================================================");

    People maria = new Woman(27, "Maрия", " не замужем", "2");
    maria.draw();
    System.out.println(name);
    maria.print();
    maria.info();
//



    System.out.println("=====================================================");

    System.out.println("Животные :");
    // Animals
    System.out.println("=====================================================");


    Animal baron = new Dog(4, "Барон", "Черный", "Роттвелер");
    baron.draw();
    baron.print();
      System.out.println("=====================================================");

    Animal mumu = new Cow(2, "Му-Му", "Белая", "-");
    mumu.draw();
    mumu.print();

      System.out.println("=====================================================");
    
//      Восходящее преобразование (upcasting)
    Animal murzik = new Cat(6, "Мурзик", "Серый", "Британец");
    murzik.draw();
    murzik.print();


//        Transport
    System.out.println("=====================================================");

    System.out.println(" Транспорт :");

    System.out.println("=====================================================");

    Transport harleyDevidson = new Bike(1988, "HarleyDevidson", "1250");
    harleyDevidson.print();
    harleyDevidson.draw();
    System.out.println("=====================================================");

    Transport bmw = new Car(2016, "BMW", "X6");
    bmw.print();
    bmw.draw();
    System.out.println("=====================================================");

    Transport marcedes = new Bus(2015, "Marcedes", "Sprinter");
    marcedes.print();
    marcedes.draw();
  }
}