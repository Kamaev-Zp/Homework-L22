import L17.People.people.*;
import L17.People.Anamial.*;
import L17.People.Transport.*;
public class L17Main {
    public static void main(String[] args) {
//
//
//        People

        Man grisha = new Man("Grisha", 35);
        System.out.println(grisha);

        Woman lida = new Woman("Lida", 33);
        System.out.println(lida);


//        Animal
//
//
        Cat vasya = new Cat("Vasya",2);
        System.out.println(vasya);

        Cow mumu = new Cow("Mumu", 3);
        System.out.println(mumu);

        Dog baron = new Dog("Baron", 7);
        System.out.println(baron);



//        Transport

        Bike herlyDavidson = new Bike("herlyDavidson", 1999);
        System.out.println(herlyDavidson);

        Bus marsedes = new Bus("Marsedes" , 2010);
        System.out.println(marsedes);

        Car bmw = new Car("BWB", 2019);
        System.out.println(bmw);

    }
}


