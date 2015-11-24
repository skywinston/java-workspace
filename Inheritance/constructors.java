class TwoDimensionalObject {
  protected int width;
  protected int height;
  TwoDimensionalObject(int width, int height){ // This is the constructor.  It has no void, public/private value
    this.width = width;
    this.height = height;
  }
}

class ThreeDimensionalObject extends TwoDimensionalObject {
  protected int depth;
  ThreeDimensionalObject(int width, int heigh, int depth){
    super(width, height);  // this will reference the class further up the inheritance chain to set the width and height values
    this.depth = depth;
  }
}

class RunTime {
  public static void main (String[] args){
    TwoDimensionalObject twoD = new TwoDimensionalObject(1, 2);
    ThreeDimensionalObject threeD = new ThreeDimensionalObject(1, 2, 10);
  }
}
