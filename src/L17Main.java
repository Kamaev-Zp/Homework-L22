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
//
    People karl = new Man(25, "Карл", "не женат", "0");
    System.out.println("Мужчина" + "\n" + karl);
    People maria = new Woman(27, "Maрия", "замужем", "2");
    System.out.println("Женщина" + "\n" + maria);


    // Animals
    System.out.println("=====================================================");
    System.out.println(" Животные :");

    Animal baron = new Dog(4, "Барон", "Черный", "Роттвелер");
    System.out.println("Собака :" + "\n" + baron);
    Animal Mumu = new Cow(2, "Му-Му", "Белая", "-");
    System.out.println("Корова :" + "\n" + Mumu);
    Animal Murzik = new Cat(6, "Мурзик", "Серый", "Британец");
    System.out.println("Кот :" + "\n" + Murzik);

//        Transport
    System.out.println("=====================================================");
    System.out.println(" Транспорт :");
    Transport harleyDevidson = new Bike(1988, "HarleyDevidson", "1250");
    System.out.println("Байк :" + "\n" + harleyDevidson);
    Transport bmw = new Car(2016, "BMW", "X6");
    System.out.println("Машина :" + "\n" + bmw);
    Transport Marcedes = new Bus(2015, "Marcedes", "Sprinter");
    System.out.println("Автобус :" + "\n" + Marcedes);
  }
}