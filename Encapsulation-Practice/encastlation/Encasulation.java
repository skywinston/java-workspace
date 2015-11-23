class Knight {
  private String name = "";

  public void dubThee(String name){
    this.name = name;
  }

  public String whatIsYourName(){
    return name;
  }
}

class Defenses {
  private String[] armoury = String[10];
  private armouryIndex = 0;

  // I would like to remove a named item ("Excalibur") from the armoury by its name...
}

class Castle {
  public static void main(String[] arg){
    Knight Lancelot = new Knight();
    Lancelot.dubThee("Lancelot");
    System.out.println(Lancelot.whatIsYourName());
  }
}
