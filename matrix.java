import java.util.Scanner;
class Matrix{
	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		//matrix 1 input
		System.out.println("Enter the rows of matrix 1: ");
		int rows1 = sc.nextInt();
		System.out.println("Enter cols  of matrix 1:");
		int cols1 = sc.nextInt();
		int arr1[][] = new int[rows1][cols1];
		for(int i=0;i<rows1;i++){
			for(int j=0;j<cols1;j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		/*
		//matrix 2 input
		System.out.println("Enter the rows of matrix 2: ");
		int rows2 = sc.nextInt();
		System.out.println("Enter cols of matrix 2:");
		int cols2 = sc.nextInt();
		int arr2[][] = new int[rows2][cols2];
		for(int i=0;i<rows2;i++){
			for(int j=0;j<cols2;j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		
		//Addition
		if(rows1==rows2 && cols1==cols2){
			int newmat[][] = new int[rows1][cols1];
			for(int i=0;i<rows1;i++){
				for(int j=0;j<cols1;j++){
					newmat[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
			
			// display addition
			System.out.println("Addition if matrix 1 and matrix 2 is :");
			for(int i=0;i<rows1;i++){
				for(int j=0;j<cols1;j++){
					System.out.print("  "+ newmat[i][j]+"  ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Not possible, coz dimentions are not same.");
		}*/
		//Addition of diagonal elements of matrix 1
		int sum=0;
		for(int i=0;i<rows1;i++){
			for(int j=0;j<cols1;j++){
				if((i+j)%2==0){
					sum = sum + arr1[i][j];
				}
			}
		}
		System.out.println("Addition of diagonal elements of matrix 1 : "+ sum);
	}
}