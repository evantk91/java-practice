public class Droid {
    int batteryLevel;
    String name;
  
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;    
    }
  
    public String performTask(String task) {
      batteryLevel -= 10;
      return name + " is performing task: " + task;
    }
  
    public void energyReport() {
      System.out.println("current " + name + " battery level: " + batteryLevel);
    }
  
    public void energyTransfer(Droid droid) {
      int tmpBatteryLevel = batteryLevel;  
      batteryLevel = droid.batteryLevel;    
      droid.batteryLevel = tmpBatteryLevel;
    }
  
    public String toString() {
      return "Hello, I'm the droid: " + name;
    }
  
    public static void main(String[] args) {
      Droid droid1 = new Droid("Shads");
      Droid droid2 = new Droid("Wally");
      System.out.println(droid1.performTask("dancing"));
      System.out.println(droid1.performTask("calculating"));
      System.out.println(droid2.performTask("calculating"));
      droid1.energyReport();
      droid2.energyReport();
      droid1.energyTransfer(droid2);
      droid1.energyReport();
      droid2.energyReport();
    }      
}
