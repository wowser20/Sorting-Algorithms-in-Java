
public class Exchangesort {
	public static void main (String[]args){
		int temp=0;
		String hold =" ";
		int num []={69,12,20,96,8};
		for(int i =0;i<num.length;i++){
			for(int j=0;j<num.length-1;j++){
				if(num[i]<num[j]){
					temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
				for(int a =0;a<num.length;a++){
					hold+=num[a]+" ";
				}
				hold+="\n";
			}
			System.out.println(hold);
		}
	}
}
