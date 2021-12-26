
class CH04_P02_CompileTimeArray{
	public static void main(String[] ar) {
		 
		 int a[] = {1,2,3,4,5,6,7,8,9,23,42};
		 int max = a[0];
		 int min = a[0];

		 for(int i:a)
		 {
		 	if(i>max)
		 		max = i;

		 	if(i<min)
		 		min = i;

		 	System.out.print(" "+i);
		 }

		System.out.println(".\nMin "+min+"\t MAx : "+max);
	}
}