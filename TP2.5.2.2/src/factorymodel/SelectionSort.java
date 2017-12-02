package factorymodel;

public class SelectionSort implements Sort {

	public void time(int []data){
		long st=System.nanoTime();
		this.sort(data);
		long en=System.nanoTime();
		System.out.println(en-st);
	}
	public static void swap(int[] data, int i, int j){  //selection sort 
		 int tmp= data[i]; 
		 data[i]= data[j]; 
		 data[j]= tmp; 
		 }
	 public static int minimumIndex(int[] data, int begin, int end){ 
		 int res= begin; 
		 for(int i=begin+1; i != end; ++i){
			 if(data[i] < data[res]){
				 res= i; 
				 } 
			 }
		 return res; 
	 }
	 public void sort(int[] data){ 
		 if(data.length < 2){
			 return;
			 } 
		 for(int i=0; i != data.length-1; ++i){  
			 swap(data, i, minimumIndex(data, i, data.length)); 
		 }  
		}
}
