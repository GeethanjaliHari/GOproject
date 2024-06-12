package datadriven;

public class Sample2 {
	public static void main(String[] args) {
		String[][] sref= {{"admin", "manager"}, {"geetha", "anjali"}, {"geetha", "admin"}};
		
		for(int i=0; i<=sref.length-1; i++)
		{
			for(int j=0; j<=sref[i].length-1; j++)
			{
				System.out.print(sref[i][j]+" ");
			}
			System.out.println();
		}
	}

}
