/**
 * Compile time
 * */
class CH04_P04_Matrix{
	public static void main(String[] args) {
		
		int a[][] = {{1,2},
					 {3,4,3},
					 {2}};

		// for(int i=0;i<a.lenght())
		System.out.println("length "+a.length); // row count
		System.out.println("length "+a[2].length); // column count


		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

	}
}