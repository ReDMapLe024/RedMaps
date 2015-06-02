public class Camera{
  private leftX;
  private leftY;
  private x;
  private y;
  
  public Camera(){
    x = 0;
    y = 0;
  }
  
  public setCameraPosition(int x, int y){
    this.x = x;
    this.y = y;
  }
  
  public getX(){
    return x;
  }
  
  public getY(){
    return y;
  }
  
}
