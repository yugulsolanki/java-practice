import java.util.Scanner;
class SearchSort{
	public static void search(int...ar){                                           
		System.out.println("Enter the number you want to search :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<ar.length;i++){
			if(num==ar[i]){
				System.out.println("Number found");
			}
			else if(i==ar.length-1){
				System.out.println("Number not found.");
			}
		}
	}
	public static void sort(int...ar){
		for(int i=0;i<9;i++){
			int temp;
			for(int j=i;j<9;j++){
				if(ar[j]<ar[i]){
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting : ");
		for(int data:ar){
			System.out.print(data+"  ");
		}
	}
	public static void even(int...ar){
		System.out.println("\nEven no are :");
		for(int data:ar){
			if(data%2==0){
				System.out.print(data+"  ");
			}
		}
	}
	public static void odd(int...ar){
		System.out.println("\nOdd no are :");
		for(int data:ar){
			if(data%2!=0){
				System.out.print(data+"  ");
			}
		}
	}
}


class VarArgs{
	public static void main(String...ar){
		SearchSort.search(2,5,8,4,9,10,33);
		SearchSort.sort(5,7,2,9,1,4,8,11,3);
		SearchSort.even(11,22,33,44,55,66,77);
		SearchSort.odd(11,22,33,44,55,66,77,88,99);
	}
}