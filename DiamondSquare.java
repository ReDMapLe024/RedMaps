public class DiamondSquare{
	
	public int n;
	public int size;
	public int width;
	public int height;
	
	public float water,
	grass,
	forest,
	mountain;
	
	
	public DiamondSquare(int n){
		
		water = 0.15f;
		grass = 0.58f;
		forest = 0.7f;
		mountain = 0.95f;
		
		
		this.n = n;
		size = (int) Math.pow(2, n);
		width = (int) (Math.pow(2,n)/2);
		height = (int) (Math.pow(2,n)/2);
	}
	
	public int [][] getMap(){
		
		float[][] map = new float[width+1][height+1];
		int endMap[][] =  new int[width+1][height+1];
		
		int step = width/2;
		
		int w = width;
		int h = height;
		
		float sum = 0;
		
		for(int i = 0; i < w + 1; i += step * 2){
			for(int j = 0; j < h + 1; j += step * 2){
				map[i][j] = (float) ((Math.random()* 100) + 1);
				
			}
		}
		
		while(step > 0){
			
			//Diamond step
			for(int i = step; i < w + 1; i += 2 * step){
				for(int j = step; j < h + 1; j += 2 * step){
					sum = (map[i-step][j-step] 		//top-left
							+ map[i+step][j-step] 		//top-right
							+ map[i-step][j+step] 	//bottom-left
							+ map[i+step][j+step] 	//bottom-right 
							)/4;
					map[i][j] = sum; 
					
				}
			}
			
			//Square step
			for(int i = 0; i < w + 1; i += step){
				for(int j = step * (1 - (i / step) % 2); j < h + 1; j += 2*step){
					sum = 0;
					int count = 0;
					if(i-step >= 0){
						sum += map[i-step][j];
						System.out.println("\n");
						count++;
					}
					if(i+step < w + 1){
						sum += map[i+step][j];
						System.out.println("\n");
						count++;
					}
					if(j-step >=0){
						sum += map[i][j-step];
						System.out.println("\n");
						count++;
					}
					if(j+step < h + 1){
						sum += map[i][j+step];
						System.out.println("\n");
						count++;
					}
					if(count>0){
						System.out.println("\n");
						map[i][j] = sum/count;
						
					}else{
						
						map[i][j] = 0;
					}
				}
			}
			step/=2;
		}
		
		 float max = Float.MIN_VALUE;
		  float min = Float.MAX_VALUE;
		  for (float[] row : map) {
		   for (float d : row) {
		    if (d > max) max = d;
		    if (d < min) min = d;
		   }
		  }
		
		  for(int row = 0; row < map.length; row++){
			   for(int col = 0; col < map[row].length; col++){
			    map[row][col] = (map[row][col]-min)/(max-min);
			    if (map[row][col] < water) endMap[row][col] = 1;
			    else if (map[row][col] < grass) endMap[row][col] = 2;
			    else if (map[row][col] < forest) endMap[row][col] = 0;
			    else if (map[row][col] < mountain) endMap[row][col] = 3;
			    else endMap[row][col] = 8;
			   }
			  }
		return endMap;
		
	}


}


