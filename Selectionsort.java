
public class Selectionsort {
	public static void main(String[]args){
		int num []={69,12,20,96,8};
		String hold ="";
		int min=0,temp=0;
		
		for(int i=0;i<num.length-1;i++){
			min =i;
			for(int j=i+1;j<num.length;j++){
				if(num[min]>num[j]){
					min=j;
				}
			}
			temp=num[min];
			num[min]=num[i];
			num[i]=temp;
		for(int a=0;a<num.length;a++){
			hold+=num[a]+" ";
		}
		hold+="\n";
	}
	System.out.println(hold);
}
}
