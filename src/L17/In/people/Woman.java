package L17.In.people;


    public class Woman extends People {
        String status;
        String child;

        public Woman(int age, String name, String status, String child) {
            super(age, name);
            this.status = status;
            this.child = child;
        }

        public String toString() {
            return super.toString() + "\n" + " Статус : " + this.status + "\n"
                    + " Дети : " + this.child + "\n";
        }
    }


