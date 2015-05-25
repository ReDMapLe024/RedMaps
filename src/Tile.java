public class Tile{

  public static final int BLOCKED = 0;
  public static final int NORMAL = 1;
  public static final int DOORWAY = 2;

  private BufferedImage image;
  private int tileType;

  public Tile(BufferedImage image, int tileType ){
    
    this.image = image;
    this.tileType = tileType;
    
  }
  
  public BufferedImage getImage(int index){ return image; }
  public int getTileType(){ return tileType; }
}
