import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		Scanner Num = new Scanner(System.in);
		System.out.println("Enter any four different integers: ");
		int n1 = Num.nextInt();
		int n2 = Num.nextInt();
		int n3 = Num.nextInt();
		int n4 = Num.nextInt();
		
		int Choice;
		do {
			System.out.println("Choose the action required: \n");
			System.out.println(" 1-   Print max integer");
			System.out.println(" 2-   Print min integer");
			System.out.println(" 3-   Print integers arranged in ascending order");
			System.out.println(" 4-   Print integers reversed ");
			System.out.println(" 5-   Exit");
			
			Choice=Num.nextInt();
			
			switch(Choice){
				case 1:
					int MaxNum;
					MaxNum=getMax(n1,n2,n3,n4);
					System.out.println("Max integer="+MaxNum);
					break;
				case 2:
					int MinNum;
					MinNum=getMin(n1,n2,n3,n4);
					System.out.println("Min integer="+MinNum);
					break;
				case 3:
					System.out.println("The integers arranged in ascending order are:");
					printArrangedNumbers(n1,n2,n3,n4);
					break;
				case 4:
					System.out.println("The reversed integers in the order entered are:");
				    printReversedNumbers(n1,n2,n3,n4);
				    break;
				case 5:
					System.out.println("Thank you for using my program , goodbye");
					break;
			}
		}while(Choice!=5);
		Num.close();
	}
	
	public static int getMax(int n1,int n2,int n3,int n4){
		int max=0;
		if(n1>=n2 && n1>=n3 && n1>=n4) {
			max = n1;
		}
		else if(n2>=n1 && n2>=n3 && n2>=n4) {
			max = n2;
		}
		else if(n3>=n1 && n3>=n2 && n3>=n4) {
			max = n3;
		}
		if(n4>=n1 && n4>=n2 && n4>=n3) {
			max = n4;
		}
		return max;
		
	}
	
	public static int getMin(int n1,int n2,int n3,int n4){
		int min=0;
		if(n1<=n2 && n1<=n3 && n1<=n4) {
			min = n1;
		}
		else if(n2<=n1 && n2<=n3 && n2<=n4) {
			min = n2;
		}
		else if(n3<=n1 && n3<=n2 && n3<=n4) {
			min = n3;
		}
		if(n4<=n1 && n4<=n2 && n4<=n3) {
			min = n4;
		}
		return min;
}
	public static void printArrangedNumbers(int n1,int n2,int n3,int n4) {
		int temp;
		if (n1>n2){
			temp=n1;
			n1=n2;
			n2=temp;
	}
		if (n2>n3){
			temp=n2;
			n2=n3;
			n3=temp;
	}
		if (n3>n4){
			temp=n3;
			n3=n4;
			n4=temp;
	}
		if (n1>n2){
			temp=n1;
			n1=n2;
			n2=temp;
	}
		if (n2>n3){
			temp=n2;
			n2=n3;
			n3=temp;
	}
		if (n1>n2){
			temp=n1;
			n1=n2;
			n2=temp;
	}
		System.out.println(n1+" "+n2+" "+n3+" "+n4);
	}
	
	public static void printReversedNumbers(int n1,int n2,int n3,int n4) {
		System.out.println(n4+" "+n3+" "+n2+" "+n1);
	}
}
	

