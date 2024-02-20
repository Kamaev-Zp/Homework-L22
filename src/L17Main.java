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
    karl.voice();
    System.out.println("Мужчина" + "\n" + karl);

    People maria = new Woman(27, "Maрия", " не замужем", "2");
    maria.voice();
    System.out.println("Женщина" + "\n" + maria);



    // Animals
    System.out.println("=====================================================");
    System.out.println(" Животные :");

    Animal baron = new Dog(4, "Барон", "Черный", "Роттвелер");
    baron.voiceAnimal();
    System.out.println("Собака :" + "\n" + baron);

    Animal mumu = new Cow(2, "Му-Му", "Белая", "-");
    mumu.voiceAnimal();
    System.out.println("Корова :" + "\n" + mumu);

    
//      Восходящее преобразование (upcasting)
    Animal murzik = new Cat(6, "Мурзик", "Серый", "Британец");
    murzik.voiceAnimal();
    System.out.println("Кот :" + "\n" + murzik);
//      Нисходящее преобразование (downcasting)
   Cat cat =(Cat) murzik;
   cat.Attack();
   System.out.println("URaaaaaaaaaaaaaaaaaaaaaaaa");

//        Transport
    System.out.println("=====================================================");
    System.out.println(" Транспорт :");

    Transport harleyDevidson = new Bike(1988, "HarleyDevidson", "1250");
    harleyDevidson.soundTransport();
    System.out.println("Байк :" + "\n" + harleyDevidson);

    Transport bmw = new Car(2016, "BMW", "X6");
    bmw.soundTransport();
    System.out.println("Машина :" + "\n" + bmw);

    Transport marcedes = new Bus(2015, "Marcedes", "Sprinter");
    marcedes.soundTransport();
    System.out.println("Автобус :" + "\n" + marcedes);
  }
}