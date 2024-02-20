package L17.In.transport;

import L17.In.animals.Animal;

import java.util.Objects;

public class Transport {
    protected String marka;
    protected int age;

    public Transport(int age, String name){
        this.marka = name;
        this.age = age;
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
    public void soundTransport (){
        System.out.println(" Есть Aux? ");
    }

    public String toString()
    {
        return  " Название : " + marka + "\n" + " Год : " + age;
    }
}

