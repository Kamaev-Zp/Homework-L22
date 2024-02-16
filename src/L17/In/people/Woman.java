package L17.In.people;


    public class Woman extends People {
        protected  String status;
        protected  String child;

        public Woman(int age, String name, String status, String child) {
            super(age, name);
            this.status = status;
            this.child = child;
        }
        public void voice (){
            super.voice();
            System.out.println(" Ищю мужчину желательно с деньгами ");
        }
        public String toString() {
            return super.toString() + "\n" + " Статус : " + this.status + "\n"
                    + " Дети : " + this.child + "\n";
        }
    }


