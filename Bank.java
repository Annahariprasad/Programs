import java.util.Scanner;

class Bank{
	static int bal=0;
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = 1, id, pass; 
			System.out.println("Enter your id : ");
				id = s.nextInt();
			if(id == 503){
				System.out.println("Enter your password : ");
				pass = s.nextInt();
			if(pass == 5123){
			while(a==1){
			System.out.println("<----WELCOME TO JAVA Bank---->");
			System.out.println("1. Balance Enquiry \n 2. Deposit \n 3. Withdraw \n 4.Exit");
			System.out.println("Enter your option : ");
			int op = s.nextInt();
			switch(op){
				case 1 : {
					if(bal == 0)
						System.out.println("Your bank is empty");
					else
						System.out.println("YOUR BALANCE : "+bal);
					break;
				}
				case 2 : {
					System.out.print("Enter Amount you want to deposit : ");
					int dep = s.nextInt();
					bal += dep;
					//deposit();
					break;
				}
				case 3 : {
					System.out.print("Enter Amount you want to withdraw : ");
					int wid = s.nextInt();
					if(wid > bal){
						System.out.println("Insufficient Balance");
					} else{
					bal -= wid;
					System.out.println("Withdrawad Amount : "+wid);
					break;
				}} 
				case 4 :{
					a = 0;
					break;
				} 
				default : {
					System.out.println("Invaild Option");
				}
			}
		}}
			else {
				System.out.println("Invaild password");
			} } 
			else {
				System.out.println("Invaild ID");
			}
	}} 
		//public void deposit(){
			
		//}
		 //public void withdraw(){
				
		//}	
	
