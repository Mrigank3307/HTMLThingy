public class Dog{

    // Static variables
    public static String genus = "Canis";

    //Instance variables
    public int age;
    public String name;

    public Dog(int inputAge, String inputName){
        this.age = inputAge;
        this.name = inputName;
    }

    public static void main (String[] args) {
        Dog BarkArf = new Dog(6,"BarkArf");
        System.out.println(BarkArf.genus);
    }
}
