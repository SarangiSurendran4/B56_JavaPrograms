public class matricstranspose {

	public static void main(String[] args) {
		int original[][]= {{1,2},{3,4}};
		System.out.println("printing matrix without transpose:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(original[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("printing matrix after transpose:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(original[j][i]+" ");
			}
			System.out.println();
		}
	}
	}

