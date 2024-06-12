package datadriven;

public class Sample1 {
	public static void main(String[] args) {
		String[][] sref=new String[3][2];
		
		sref[0][0]="admin";
		sref[0][1]="manager";
		
		sref[1][0]="geetha";
		sref[1][1]="admin";
		
		sref[2][0]="anjali";
		sref[2][1]="1234";
		
		System.out.println(sref[0][0]);
		System.out.println(sref[0][1]);
		
		System.out.println(sref[1][0]);
		System.out.println(sref[1][1]);
		
		System.out.println(sref[2][0]);
		System.out.println(sref[2][1]);
		System.out.println("====================");
		for(int i=0; i<=sref.length-1; i++)
		{
			for(int j=0; j<=sref[i].length-1;j++)
			{
				System.out.print(sref[i][j]+" ");
			}
			System.out.println();
		}
	}

}
