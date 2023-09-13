public class Dog {
    String bread;
    Boolean hasOwener;
    int age;

    public Dog(String dogBreed, boolean dogOwened, int dogYears){
        System.out.println("Constructor invoked");
        bread = dogBreed;
        hasOwener = dogOwened;
        age = dogYears;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Main metod started");
        Dog Lulu = new Dog("Hasn´t breed", false, 8);
        Dog Blue = new Dog("Husky", true, 5);
        boolean isLuluOlder = Lulu.age > Blue.age;
        int totalDogYear = Blue.age + Lulu.age;
        System.out.println("Two dogs created a " + Lulu.bread + " and a " + Blue.bread);
        System.out.println("The statment that Lulu is an older dog is: " + isLuluOlder);
        System.out.println("The total age of the dog is: " + totalDogYear);
        System.out.println("Main method finished");
    }
}
