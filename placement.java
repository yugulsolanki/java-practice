import java.util.Scanner;

class Placement{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollNo os student : ");
		int rollNo = sc.nextInt();
		System.out.println("Enter name of student : ");
		String sName = sc.next();
		System.out.println("Enter college name : ");
		String collName = sc.next();
		System.out.println("Enter course name : ");
		String course = sc.next();
		System.out.println("Enter current year : ");
		int year = sc.nextInt();
		System.out.println("Enter branch name : ");
		String branch = sc.next();
		System.out.println("Enter max marks of all subjects: ");
		float maxMarks = sc.nextFloat();
		System.out.println("Enter min marks all all subjects : ");
		float minMarks = sc.nextFloat();
		System.out.println("Enter subject1 name :");
		String subName1 = sc.next();
		System.out.println("Enter marks of subject1 :");
		float obMarks1 = sc.nextFloat();
		System.out.println("Enter subject2 name :");
		String subName2 = sc.next();
		System.out.println("Enter marks of subject2 :");
		float obMarks2 = sc.nextFloat();
		System.out.println("Enter subject3 name :");
		String subName3 = sc.next();
		System.out.println("Enter marks of subject3 :");
		float obMarks3 = sc.nextFloat();
		System.out.println("Enter subject4 name :");
		String subName4 = sc.next();
		System.out.println("Enter marks of subject4 :");
		float obMarks4 = sc.nextFloat();
		float percentage = ((obMarks1+obMarks2+obMarks3+obMarks4)/400)*100;
		//float percentage = (obMarks1+obMarks2+obMarks3+obMarks4)/maxMarks*4;
		//System.out.println(percentage);
		System.out.println("						"+collName);
		System.out.println("Name :"+sName+"								RollNO:"+rollNo);
		System.out.println("======================================================================================");
		System.out.println("  Subject	  MinMarks	 MaxMarks	 ObtainedMarks");
		System.out.println("    "+subName1+"		 "+minMarks+"		 "+maxMarks+"		 "+obMarks1);
		System.out.println("    "+subName2+"		 "+minMarks+"		 "+maxMarks+"		 "+obMarks2);
		System.out.println("    "+subName3+"		 "+minMarks+"		 "+maxMarks+"		 "+obMarks3);
		System.out.println("    "+subName4+"		 "+minMarks+"		 "+maxMarks+"		 "+obMarks4);
		System.out.println("======================================================================================");
		String grade = "";
		if(percentage>80){grade = "A";}	
		else if(percentage>65){grade = "B";}
		else if(percentage>50){grade = "C";}
		System.out.println("		Percentage : "+percentage+"				"+"Grade : "+grade);
		System.out.println();
		System.out.println("Best companies in which you can apply :");
		if(grade=="A"){
			System.out.println("1.Google");
			System.out.println("2.Apple");
			System.out.println("3.Microsoft");
		}
		else if(grade=="B"){
			System.out.println("1.VMware");
			System.out.println("2.Amezon");
			System.out.println("3.Uber");
		}
		else if(grade=="C"){
			System.out.println("1.TCS");
			System.out.println("2.Vipro");
			System.out.println("3.Accenture");
		}
		System.out.println("Select a company");
		int ch=sc.nextInt();
		//float salary[9]={25,30,22,17,20,12,4,5,3.6};
		float google = 25;
		float apple = 30;
		float micro = 22;
		float vm = 17;
		float amezon = 20;
		float uber = 22;
		float tcs = 4;
		float vipro = 5;
		float accen = 6;
		if(grade=="A"){
			if(ch==1){
				System.out.println("Details of GOOGLE :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+google+"Lacks");
			}	
			else if(ch==2){
				System.out.println("Details of APPLE :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+apple+"Lacks");
			}
			else if(ch==3){
				System.out.println("Details of MICROSOFT :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+micro+"Lacks");
			}
			else{
				System.out.println("Invalid choice");
			}
		}
		else if(grade=="B"){
			if(ch==1){
				System.out.println("Details of VMware :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+vm+"Lacks");
			}	
			else if(ch==2){
				System.out.println("Details of AMEZON :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+amezon+"Lacks");
			}
			else if(ch==3){
				System.out.println("Details of UBER :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+uber+"Lacks");
			}
			else{
				System.out.println("Invalid choice");
			}
		}
		else if(grade=="c"){
			if(ch==1){
				System.out.println("Details of TCS :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+tcs+"Lacks");
			}	
			else if(ch==2){
				System.out.println("Details of VIPRO :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+vipro+"Lacks");
			}
			else if(ch==3){
				System.out.println("Details of ACCENTURE :");
				System.out.println("Address : ");
				System.out.println("City : ");
				System.out.println("Contact no :");
				System.out.println("No of Branches :");
				System.out.println("Post :");
				System.out.println("Salary package :"+accen+"Lacks");
			}
			else{
				System.out.println("Invalid choice");
			}
		}
		else{
			System.out.println("Master a skill and apply in open.");
		}
		System.out.println("To get companies name according your dream salary, please enter your dream salary :");
		float dreamSalary = sc.nextFloat();
		if(dreamSalary<=google){
			System.out.println("GOOGLE");
		}
		if(dreamSalary<=apple){System.out.println("APPLE");}
		if(dreamSalary<=micro){System.out.println("MICROSOFT");}
		if(dreamSalary<=vm){System.out.println("AMEZON");}
		if(dreamSalary<=amezon){System.out.println("UBER");}
		if(dreamSalary<=uber){System.out.println("VMWARE");}
		if(dreamSalary<=tcs){System.out.println("TCS");}
		if(dreamSalary<=vipro){System.out.println("VIPRO");}
		if(dreamSalary<=accen){System.out.println("ACCENTURE");}
	}	
}