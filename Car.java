public class NewClass2 {

  public static void main (String[] args) {
    BMW bmw=new BMW();
   bmw.reverseGear();
bmw.switchOnHeadlights();
bmw.topSpeed();

  }

}
class car{
  public int no_of_tires = 4;
  public String bodyType = "Plastic";
  public void reverseGear(){
    System.out.println("Reverse Gear is Applied...");
  }
   public void reverseGearConf(){
    System.out.println("Gear is Applied...");
  }
   public void switchOnHeadlights(){
    System.out.println("Headlights turned on...");
  }
}
class BMW extends car{
  public String modelName = "X3";
  public void topSpeed()
  {
    System.out.println("TopSpeed of BMW is 900 kmph");
    
  }
}
