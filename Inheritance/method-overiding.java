class SodaStream {

  void carbonate(int amt, int time){
    System.out.println("PPBBBBBTTTTT");
  }

  void carbonate(int amt, String howmuch){
    System.out.println("That's a lot of bubbles.");
  }

  void carbonate(boolean c02, int amt){
    System.out.println("Running low on C02");
  }

  void carbonate(int amt, int time, boolean overload){
    System.out.println("I never thought I'd say this, but that's actually too bubbly.");
  }
}

class RunTime {
  public static void main(String[] args){
    SodaStream fizzy = new SodaStream();
    
  }
}
