//define public class Droid
public class Droid {
  int batteryLevel;
  String name;

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public static void main(String[] args) {
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
  }

  public String performTask(String task){
    System.out.println(name + " is performing task: " + name.performTask);
    batteryLevel = batteryLevel - 10;
  }
}
