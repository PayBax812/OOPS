 public class encapsulation {
        public static void main(String[] args) {
            eren obj = new eren();

            System.out.println("name before assigning value from main : "+obj.getName());
            obj.setName("Eren Jaegar");
            System.out.println("name after assigning vaule from main :" + obj.getName());
        }
    }

    class eren{

        private String Name="aot";

        String getName() {
            return Name;

        }

        void setName(String Name){
            this.Name = Name;
        }
    }
