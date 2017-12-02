package factorymodel;

import java.util.Random;

public class SortTest {
    
    public SortTest(){
    	
    }
    public static int[] generate1d(int nbVals, int min, int max){ 
		int[] res= new int[nbVals]; 
		Random generator = new Random(); 
		
		for(int i=0; i != nbVals; ++i){ 
			res[i]= (int)((Math.abs(generator.nextLong())% ((long)max-min))+min); 
			} 
		return res; 
		} 
	public static void main(String[] args){
		Sort sort=null;
		for (int i=1;i<500;i+=10){
	    
	    int[]data=generate1d(i,0,i);
	    
		sort=SortFactory.createSort("bubble", data);
		sort.time(data);
		
	  }
	}
}
