import javax.swing.*;
public class SortingAlgorithms{
	
public static void main(String[] args) {

		int length=Integer.parseInt(JOptionPane.showInputDialog("How many elements? "));

		int num[]=new int[length];



		for (int i = 0; i < num.length; i++) {

			num[i]=Integer.parseInt(JOptionPane.showInputDialog("Type array element: "));

		}



		String menu[]={"Ascending","Descending"};

		String options[]={"Bubble","Exchange","Selection"};

		String choose=JOptionPane.showInputDialog(null,"Menu","Choose",1,null,menu,menu[0]).toString();

		String chooseSort=JOptionPane.showInputDialog(null,"Menu","Choose",1,null,options,options[0]).toString();
		String selected=null;

		if (chooseSort=="Bubble") {
			 selected=bubbleSort(num,choose);	
			 
		}else if(chooseSort=="Exchange") {
			 selected=exchangeSort(num,choose);	
		}else if(chooseSort=="Selection"){
			 selected=selectionSort(num,choose);	
		}

		String hold="Number of Elements: "+num.length+"\nSorting Name\t: "+chooseSort

				+"\nSorting Type\t: "+choose+"\nUnsorted List\t: "+unsorted(num)

				+"\nArray Elements Swapped Values\n"+selected

				+"\nSorted Values\t: "+getSorted(num);

		JOptionPane.showMessageDialog(null, new JTextArea(hold));

	}
	
		
		
	


	public static String unsorted(int unsort[]){

		String value="";

		for (int i = 0; i < unsort.length; i++) {

			value+=unsort[i]+" ";

		}

		return value;

	}



	public static String bubbleSort(int num[],String chosen){

		String hold="";
		int temp=0;
		for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num.length-1; j++) {
				switch(chosen){

				case "Ascending":

					if (num[j]>num[j+1]){
						temp=num[j+1];
						num[j+1]=num[j];
						num[j]=temp;
					}
				

					break;

				case "Descending":


					if (num[j]<num[j+1]){
						temp=num[j+1];
						num[j+1]=num[j];
						num[j]=temp;
					}

					break;

				}

			}//end of inner loop


		for (int a = 0; a < num.length; a++) {
			hold+=num[a]+" ";

		}
		hold+="\n";
		}
return hold;
	}



	public static String exchangeSort(int num[],String chosen){

		String hold="";
		int temp=0;
		for (int i = 0; i < num.length-1; i++) {
		for (int j = i+1; j < num.length; j++) {
		switch(chosen){

		case "Ascending":

			if (num[i]>num[j]){
				temp=num[j];
				num[j]=num[j];
				num[i]=temp;

			}
			break;

		case "Descending":


			if (num[i]<num[j]){
				temp=num[j];
				num[j]=num[j];
				num[i]=temp;

			}
			break;

		}

		for (int a = 0; a < num.length; a++) {
			hold+=num[a]+" ";
		}
		}
		hold+="\n";
			}
		return hold;


	}



	public static String selectionSort(int num[],String chosen){

String hold="";
int temp=0,min =0, i=0, j=0;
for (; i < num.length-1; i++) {
min=i;
for (j = i+1; j < num.length; j++) {
		switch(chosen){

		case "Ascending":
			if (num[min]>num[j]){
				min=j;

				}
			break;

		case "Descending":

			if (num[min]<num[j]){
				min=j;

				}
			break;

		}
}
		temp=num[min];
		num[min]=num[i];
		num[i]=temp;
		for (int a = 0; a < num.length; a++) {
		hold+=num[a]+" ";

		}
		hold+="\n";
		}
		return hold;
	}

	private static String getSorted(int sort[]) {

		String value="";

		for (int i = 0; i < sort.length; i++) {

			value+=sort[i]+" ";

		}
		return value;

	}

}