public class Droid {
    int batteryLevel;
    String name;

    public Droid(String droidName){
        batteryLevel = 100;
        name = droidName;
    }

    public String toString(){
        return "Hello, I'm god" + name;
    }

    public void performTask(String task){
        System.out.println(name + " is " + task);
    }

    public void batteryLevelLosing(){
        batteryLevel -= 10;
    }

    public void energyReport(){
        System.out.println(batteryLevel);
    }
    
    public static void main(String[] args) {       
        Droid Little_Christmas = new Droid("Little Christmas");
        System.out.println(Little_Christmas.toString());
        Little_Christmas.performTask("Cooking");
        Little_Christmas.batteryLevelLosing();
        Little_Christmas.energyReport();
    }
}