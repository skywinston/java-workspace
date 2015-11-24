class TwoDimensionalObject {
  protected int width;
  protected int height;
  TwoDimensionalObject(int width, int height){
    this.width = width;
    this.height = height;
  }
}

class ThreeDimensionalObject extends TwoDimensionalObject {
  protected int depth;
  ThreeDimensionalObject(int width, int heigh, int depth){
    super(width, height);
    this.depth = depth;
  }
}

class RunTime {
  public static void main (String[] args){
    TwoDimensionalObject twoD = new TwoDimensionalObject(1, 2);
    ThreeDimensionalObject threeD = new ThreeDimensionalObject(1, 2, 10);
  }
}
