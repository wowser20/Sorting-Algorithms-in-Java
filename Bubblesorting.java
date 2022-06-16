
public class Bubblesorting {
	public static void main(String[]args){
	int num []={69,12,20,96,8};
	System.out.println(Bubblesorting.bubblesort(num));
	}
	public static String bubblesort(int num []){
		String hold = "";
		int temp=0;
		for(int i =0;i<num.length;i++){
			for (int j= 0;j<num.length-1;j++){
				if(num[j]>num[j+1]){
					temp=num[j+1];
					num[j+1]=num[j];
					num[j]=temp;
				}
				}
				for(int a=0;a<num.length;a++){
					hold+=num[a]+"\t";
				}
				hold+="\n";
				
		}
		return hold;
	}
}
	
