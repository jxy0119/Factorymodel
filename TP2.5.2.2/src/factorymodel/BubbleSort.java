package factorymodel;

public class BubbleSort implements Sort {
	
	
	
	public void sort(int[] data) {
		// TODO Auto-generated method stub
		if(data.length < 2){
			 return;
		 }  
		 boolean hadToSwap= false; 
		 do{ hadToSwap=false; 
		 for(int i= 0; i != data.length-1; ++i){  
			 if(data[i] > data[i+1]){ 
				 swap(data, i, i+1);
				 hadToSwap= true;
				 } 
			 }
		 }
		 while(hadToSwap);	
	}
	public static void swap(int[] data, int i, int j){  //selection sort 
		 int tmp= data[i]; 
		 data[i]= data[j]; 
		 data[j]= tmp; 
		 }
	public void time(int []data){
		long st=System.nanoTime();
		this.sort(data);
		long en=System.nanoTime();
		System.out.println(en-st);
	}
}
