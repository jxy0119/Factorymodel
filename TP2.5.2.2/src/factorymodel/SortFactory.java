package factorymodel;

public class SortFactory {
     public static Sort createSort(String name,int []data){
    	 Sort sort=null;
         char []sortname=name.toCharArray();
    	 switch(sortname[0]){
    	 case 'b':
    	 sort=new BubbleSort();
    	 break;
    	
         case 's':
    	 sort=new SelectionSort();
    	 break;
    	 }
    	 return sort;
     }
}
