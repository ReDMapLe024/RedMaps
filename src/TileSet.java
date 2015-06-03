import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TileSet{
  
  //Dimension of 1 tile
  private int width;
  private int height;
  
  //Dimensions of the tileSet;
  private int rows;
  private int cols;
  
  //tileSet arrays and multidemensional arrays
  private BufferedImage img;
  private Tile [] tileSet;
  
  public TileSet(String src, int width, int height, int rows, int cols) {
    
    this.rows = rows;
    this.cols = cols;
    this.width = width;
    this.height = height;
    
    tileSet = new BufferedImage[rows];
    try {
		img = ImageIO.read(getClass().getResourceAsStream(src));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    spriteLoader();
    
  }
  
  public void spriteLoader(){
  
    for(int i = 0; i < rows; i++){
        tileSet[i] = new Tile(img.getSubimage(j * width, i * height, width, height), 1);
        //Rework method to allow for selection of blocked tiles!!!
    }
  }
  
  public BufferedImage getTile(int x){ return tileSet[x]; }
  
}
