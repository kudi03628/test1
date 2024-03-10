package test1;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	String input_main_num = "";
		
		do {
			
			System.out.println("[도서 대여관리] 프로그램 입니다.");
			
			
			input_main_num = sc.nextLine();
			
			switch (input_main_num) {
			
			case "1":
				
				
				break;
				
			case "2":
				
				
				break;	
			
			case "3":
		
			
				
				break;	
				
			case "4":
				
				
				
				break;
			
			case "5":	
				
				System.out.println("\n[도서 대여관리] 프로그램을 종료합니다!");
				
				
				break;
				
		
			default:
				
				System.out.println("\n메뉴에 존재하는 번호만 입력해주세요!\n");
				
				break;
				
			} // end of main_switch
			
			
		
		} // end of main_do_while 
		while (! ("4".equals(input_main_num) ) );
		
		sc.close();
		


	}

}
