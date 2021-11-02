public class AnonymusInnerClasses {
    public static void main(String[] args) {
            
        IStudent student1 = new IStudent(){
            @Override
            public void study() {
                System.out.println("I'm studying...");
            }

            @Override
            public void go_to_school() {
                System.out.println("I'm going to school...");
            }
            
        };
        student1.go_to_school();
        student1.study();
        System.out.println();
        
        AStudent student2 =new AStudent("Lale","1234"){
            @Override
            void sign() {
               System.out.println("I've already signed you can control my name.");
               System.out.println("My name is: " + getName()+"\n"+"My number is :"+getNumber());
            }
            @Override
            public void say_hi(){
                super.say_hi();
            }
        };
        
        student2.say_hi();
        student2.sign();
    }
    
    public interface IStudent{ //Interface içinde gövdeli metod bulunmadığı için static tanımlanması gerekmez!
        void go_to_school();
        void study();
    }
    
    public static abstract class AStudent{ //Main fonk static olduğu için static tanımlamak gerekli!
        abstract void sign();
        public void say_hi(){
            System.out.println("Hi!");
        }
        private String name;
        private String number;

        public AStudent(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
}
