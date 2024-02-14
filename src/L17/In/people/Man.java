package L17.In.people;
import L17.People;


    public class Man extends People {
        String status;
        String child;

        public Man (int age, String name, String status, String child){
            super(age, name);
            this.status = status;
            this.child = child;
        }

        public String toString()
        {
            return super.toString() + "\n" + " Порода : " + this.status + "\n"
                    + " Цвет : " + this.child + "\n";
        }

    }



