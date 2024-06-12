package datadriven;

public class Sample3 {
	public static void main(String[] args) {
		String[][] sref=new String[3][];
		System.out.println(sref[0]);
		System.out.println(sref[1]);
		System.out.println(sref[2]);
		System.out.println("==============");
		sref[0]=new String[3];
		sref[1]=new String[2];
		sref[2]=new String[1];
		
		sref[0][0]="admin";
		sref[0][1]="manager";
		sref[0][2]="90";
		
		sref[1][0]="geetha";
		sref[1][1]="manager";
		
		sref[2][0]="geethanjali";
		
		//To print address of string
		System.out.println(sref[0]);
		System.out.println(sref[1]);
		System.out.println(sref[2]);
		System.out.println("==============");
		
		int rowsCount=sref.length;
		System.out.println(rowsCount);
		for(int i=0; i<=rowsCount-1; i++)
		{
			int cellsCount=sref[i].length;
			for(int j=0; j<=cellsCount-1; j++)
			{
				System.out.print(sref[i][j]+" ");				
			}
			System.out.println();
		}
	}

}
