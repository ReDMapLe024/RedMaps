
public class MapGenerator{
  
  private static final int WATER = 0; 
  private static final int BORDER_WATER_N = 1;
  private static final int BORDER_WATER_E = 2;
  private static final int BORDER_WATER_S = 3;
  private static final int BORDER_WATER_W = 4;
  private static final int EDGE_WATER_NE = 5;
  private static final int EDGE_WATER_NW = 6;
  private static final int EDGE_WATER_SE = 7;
  private static final int EDGE_WATER_SW = 8;
  private static final int CORNER_WATER_NE = 9;
  private static final int CORNER_WATER_NW = 10;
  private static final int CORNER_WATER_SE = 11;
  private static final int CORNER_WATER_SW = 12;
  private static final int GRASS = 13;
  private static final int MOUNTAIN = 14;
    
  private DiamondSquare ds;
  private int [][] map;
    
  public MapGenerator(int size){
   
    ds = new DiamondSquare(size);
    map = ds.getMap();
    
    map = smooth(map);
    map = addBorders(map);
    map = addEdges(map);
    map = addCorners(map);
      
  }
  
  public int[][] getMap(){ return map; }
    
  public static int[][] smooth(int [][] map){
	    for(int i = 0; i < map.length; i++){
	      for(int j = 0; j < map.length; j++){
	        if(i+1 < map.length && i-1 >= 0 && j+1 < map.length && j-1 >= 0){
	          
	          
	          //WATER Smoothing
	          if(map[i+1][j] == WATER && map[i-1][j] == WATER && map[i][j+1] == WATER && map[i][j-1] == WATER){
	            map[i][j] = WATER;
	          }
	          if(map[i+1][j] != WATER && map[i-1][j] == WATER && map[i][j+1] == WATER && map[i][j-1] == WATER){
	            map[i][j] = WATER;
	          }
	          if(map[i+1][j] == WATER && map[i-1][j] != WATER && map[i][j+1] == WATER && map[i][j-1] == WATER){
	            map[i][j] = WATER;
	          }
	          if(map[i+1][j] == WATER && map[i-1][j] == WATER && map[i][j+1] != WATER && map[i][j-1] == WATER){
	            map[i][j] = WATER;
	          }
	          if(map[i+1][j] == WATER && map[i-1][j] == WATER && map[i][j+1] == WATER && map[i][j-1] != WATER){
	            map[i][j] = WATER;
	          }
	          
	          
	          //GRASS Smoothing
	          if(map[i+1][j] == GRASS && map[i-1][j] == GRASS && map[i][j+1] == GRASS && map[i][j-1] == GRASS){
	            map[i][j] = GRASS;
	          }
	          if(map[i+1][j] != GRASS && map[i-1][j] == GRASS && map[i][j+1] == GRASS && map[i][j-1] == GRASS){
	            map[i][j] = GRASS;
	          }
	          if(map[i+1][j] == GRASS && map[i-1][j] != GRASS && map[i][j+1] == GRASS && map[i][j-1] == GRASS){
	            map[i][j] = GRASS;
	          }
	          if(map[i+1][j] == GRASS && map[i-1][j] == GRASS && map[i][j+1] != GRASS && map[i][j-1] == GRASS){
	            map[i][j] = GRASS;
	          }
	          if(map[i+1][j] == GRASS && map[i-1][j] == GRASS && map[i][j+1] == GRASS && map[i][j-1] != GRASS){
	            map[i][j] = GRASS;
	          }
	          
	          
	          //MOUNTAIN Smoothing
	          if(map[i+1][j] == MOUNTAIN && map[i-1][j] == MOUNTAIN && map[i][j+1] == MOUNTAIN && map[i][j-1] == MOUNTAIN){
	            map[i][j] = MOUNTAIN;
	          }
	          if(map[i+1][j] != MOUNTAIN && map[i-1][j] == MOUNTAIN && map[i][j+1] == MOUNTAIN && map[i][j-1] == MOUNTAIN){
	            map[i][j] = MOUNTAIN;
	          }
	          if(map[i+1][j] == MOUNTAIN && map[i-1][j] != MOUNTAIN && map[i][j+1] == MOUNTAIN && map[i][j-1] == MOUNTAIN){
	            map[i][j] = MOUNTAIN;
	          }
	          if(map[i+1][j] == MOUNTAIN && map[i-1][j] == MOUNTAIN && map[i][j+1] != MOUNTAIN && map[i][j-1] == MOUNTAIN){
	            map[i][j] = MOUNTAIN;
	          }
	          if(map[i+1][j] == MOUNTAIN && map[i-1][j] == MOUNTAIN && map[i][j+1] == MOUNTAIN && map[i][j-1] != MOUNTAIN){
	            map[i][j] = MOUNTAIN;
	          }
	        }
	      }
	    }
	    return map;
	  }
	  
	  
	  public static int [][] addBorders(int [][] map){
	    for(int i = 0; i < map.length; i++){
	      for(int j = 0; j < map.length; j++){
	        if(i+1 < map.length && i-1 >= 0 && j+1 < map.length && j-1 >= 0){
	          if(map[i+1][j] == WATER && map[i-1][j] != WATER && map[i][j+1] != WATER && map[i][j-1] != WATER){
	            map[i][j] = BORDER_WATER_N;
	          }
	          if(map[i+1][j] != WATER && map[i-1][j] == WATER && map[i][j+1] != WATER && map[i][j-1] != WATER){
	        	  map[i][j] = BORDER_WATER_S;
	          }
	          if(map[i+1][j] != WATER && map[i-1][j] != WATER && map[i][j+1] == WATER && map[i][j-1] != WATER){
	        	  map[i][j] = BORDER_WATER_W;
	          }
	          if(map[i+1][j] != WATER && map[i-1][j] != WATER && map[i][j+1] != WATER && map[i][j-1] == WATER){
	        	  map[i][j] = BORDER_WATER_E;
	          }
	        }
	      }
	    }
	    return map;
	  }
	  
	  
	  public static int [][] addEdges(int [][] map){
	    for(int i = 0; i < map.length; i++){
	      for(int j = 0; j < map.length; j++){
	        if(i+1 < map.length && i-1 >= 0 && j+1 < map.length && j-1 >= 0){
	          if(map[i+1][j] == WATER && map[i-1][j] != WATER && map[i][j+1] == WATER && map[i][j-1] != WATER){
	            map[i][j] = EDGE_WATER_NW;
	          }
	          if(map[i+1][j] != WATER && map[i-1][j] == WATER && map[i][j+1] == WATER && map[i][j-1] != WATER){
	            map[i][j] = EDGE_WATER_NE;
	          }
	          if(map[i+1][j] == WATER && map[i-1][j] != WATER && map[i][j+1] != WATER && map[i][j-1] == WATER){
	            map[i][j] = EDGE_WATER_SW;
	          }
	          if(map[i+1][j] != WATER && map[i-1][j] == WATER && map[i][j+1] != WATER && map[i][j-1] == WATER){
	            map[i][j] = EDGE_WATER_SE;
	          }
	        }
	      }
	    }
	    return map;
	  }
	  
	  
	  public static int [][] addCorners(int [][] map){
	    for(int i = 0; i < map.length; i++){
	      for(int j = 0; j < map.length; j++){
	        if(i+1 < map.length && i-1 >= 0 && j+1 < map.length && j-1 >= 0){
	          if((map[i+1][j] == BORDER_WATER_W || map[i+1][j] == EDGE_WATER_NW) && (map[i][j+1] == BORDER_WATER_N || map[i][j+1] == EDGE_WATER_NW)){
	            map[i][j] = CORNER_WATER_NW;
	          }
	          if((map[i+1][j] == BORDER_WATER_E || map[i+1][j] == EDGE_WATER_NE) && (map[i][j-1] == BORDER_WATER_N|| map[i][j-1] == EDGE_WATER_NE)){
	            map[i][j] = CORNER_WATER_NE;
	          }
	          if((map[i-1][j] == BORDER_WATER_W || map[i-1][j] == EDGE_WATER_SW) && (map[i][j+1] == BORDER_WATER_S|| map[i][j+1] == EDGE_WATER_SW)){
	            map[i][j] = CORNER_WATER_SW;
	          }
	          if((map[i-1][j] == BORDER_WATER_E || map[i-1][j] == EDGE_WATER_SE) && (map[i][j-1] == BORDER_WATER_S || map[i][j-1] == EDGE_WATER_SE)){
	            map[i][j] = CORNER_WATER_SE;
	          }
	        }
	      }
	    }
	    return map;
	  }
}
