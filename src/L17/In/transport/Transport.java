package L17.In.transport;

import L17.In.animals.Animal;

import java.util.Objects;

public class Transport implements Drawable {
    protected String marka;
    protected int age;

    public Transport(int age, String marka) {
        this.marka = marka;
        this.age = age;
    }

    @Override
    public void draw() {
        System.out.println("Марка: " + marka);
        System.out.println("Год: " + age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Transport transport = (Transport) obj;
        return age == transport.age && Objects.equals(marka, transport.marka);
    }

    @Override
    public void print() {
        System.out.println("Есть Aux? ");
    }
}

//    public String toString()
//    {
//        return  " Название : " + marka + "\n" + " Год : " + age;
//    }
//}

