class Knight {
  private String name = "";

  public void dubThee(String name){
    this.name = name;
  }

  public String whatIsYourName(){
    return name;
  }
}

class Castle {
  public static void main(String[] arg){
    Knight Lancelot = new Knight();
    Lancelot.dubThee("Lancelot");
    System.out.println(Lancelot.whatIsYourName());
  }
}
