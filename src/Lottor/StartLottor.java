package Lottor;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 *  로또 구매여부
 */
public class StartLottor {
	
	String name;
	
	static Scanner scanner        = new Scanner(System.in);
	static Random random          = new Random();
	static int[] auotLottor       = new int[6];	// 자동 번호 부여
	static int[] autoValue        = new int[6]; // 자동 추첨 번호 부여
	static int[] manualLottor     = new int[6]; // 수동 입력값
	static int[] manualAuotLottor = new int[6]; // 수동 자동 랜덤값
	
	public StartLottor() {
	}
	
	public static void buyLottor(String name) { // 로또 구매 
		System.out.println();
//		scanner.nextLine();
		System.out.println("구매자 이름을 적어주세요.");
		System.out.print("이름 : ");
		name = scanner.nextLine();
		
		
		System.out.println();
		System.out.println(name + "님" + " 뭐로 구매하시겠습니까?" );
		System.out.println("[1] 수동" + "\t" + "[2] 자동");	
		String result = scanner.nextLine();
		
		while (true) {
			if(result.equals("1") || result.equals("수동")) {
				manualLottor();
				break;
			}else if (result.equals("2") || result.equals("자동")) {
				automaticLottor(name);
				break;
			}else {
				System.out.println("[Error]\n번호를 다시 입력해주세요.");
				System.out.print("입력 : ");
				result = scanner.next();
			}
		}
	}
	public static void manualLottor() { // 수동 로또번호 입력
		
		System.out.println();
		System.out.print("수동을 선택하셨습니다 번호를 입력해 주세요\n");
		
		while (true) {
			System.out.print("[1]" + "번째 숫자 입력 :");
			manualLottor[0] = scanner.nextInt();
			
			if (manualLottor[0] > 50) {
				System.out.println("      [Error]    ");
				System.out.println("로또 번호는 50 이하로 입력해 주세요.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("[2]" + "번째 숫자 입력 :");
			manualLottor[1] = scanner.nextInt();

			if (manualLottor[1] == manualLottor[0]) {
				System.out.println("      [Error]    ");
				System.out.println("같은 번호는 입력하실 수 없습니다.");
			} else if (manualLottor[1] > 50) {
				System.out.println("      [Error]    ");
				System.out.println("로또 번호는 50 이하로 입력해 주세요.");
			} else {
				break;
			}

		}
		while (true) {
			System.out.print("[3]" + "번째 숫자 입력 :");
			manualLottor[2] = scanner.nextInt();

			if (manualLottor[2] == manualLottor[0] || manualLottor[2] == manualLottor[1]) {
				System.out.println("      [Error]    ");
				System.out.println("같은 번호는 입력하실 수 없습니다.");
			} else if (manualLottor[2] > 50) {
				System.out.println("      [Error]    ");
				System.out.println("로또 번호는 50 이하로 입력해 주세요.");
			} else {
				break;
			}

		}
		while (true) {
			System.out.print("[4]" + "번째 숫자 입력 :");
			manualLottor[3] = scanner.nextInt();

			if (manualLottor[3] == manualLottor[0] || manualLottor[3] == manualLottor[1] 
					|| manualLottor[3] == manualLottor[2]) {
				System.out.println("      [Error]    ");
				System.out.println("같은 번호는 입력하실 수 없습니다.");
			} else if (manualLottor[3] > 50) {
				System.out.println("      [Error]    ");
				System.out.println("로또 번호는 50 이하로 입력해 주세요.");
			} else {
				break;
			}

		}
		while (true) {
			System.out.print("[5]" + "번째 숫자 입력 :");
			manualLottor[4] = scanner.nextInt();

			if (manualLottor[4] == manualLottor[0] || manualLottor[4] == manualLottor[1] || 
					manualLottor[4] == manualLottor[2] || manualLottor[4] == manualLottor[3]) {
				System.out.println("      [Error]    ");
				System.out.println("같은 번호는 입력하실 수 없습니다.");
			} else if (manualLottor[4] > 50) {
				System.out.println("      [Error]    ");
				System.out.println("로또 번호는 50 이하로 입력해 주세요.");
			} else {
				break;
			}

		}
		while (true) {
			System.out.print("[6]" + "번째 숫자 입력 :");
			manualLottor[5] = scanner.nextInt();

			if (manualLottor[5] == manualLottor[0] || manualLottor[5] == manualLottor[1] || 
					manualLottor[5] == manualLottor[2] || manualLottor[5] == manualLottor[3] || 
					manualLottor[5] == manualLottor[4]) {
				System.out.println("      [Error]    ");
				System.out.println("같은 번호는 입력하실 수 없습니다.");
				break;
			} else if (manualLottor[5] > 50) {
				System.out.println("      [Error]    ");
				System.out.println("로또 번호는 50 이하로 입력해 주세요.");
				break;
			} else {
				break;
			}

		}
		System.out.println();
		System.out.println("[수동으로 입력하신 번호는]");
		for(int manualLottor : manualLottor) {
			System.out.print("[" + manualLottor + "]");
		}
		System.out.println("입니다");
		System.out.println();
		
		System.out.println("당첨 확인 하시겠습니까?");
		System.out.println("[1] 예" + "\t" + "[2] 아니오");
		String result3 = scanner.next();
		
		while(true) {
			if(result3.equals("1") || result3.equals("예")) {
				System.out.println("추첨 진행하겠습니다");
				try {
					System.out.println("자동으로 번호 추첨중");
					System.out.println(".");

					Thread.sleep(2000); 
					System.out.println(".");
					Thread.sleep(2000); 
					System.out.println(".");
					Thread.sleep(2000);
					
					for (int i = 0; i < 6; i++) {
						int randomNumber = random.nextInt(50) + 1; // 1부터 50 사이의 랜덤한 정수
						manualAuotLottor[i] = randomNumber; // 배열에 랜덤 값 할당
					}
					for (int i = 0; i < 6; i++) {
						System.out.print("[" + manualAuotLottor[i] + "]");
					}
					System.out.println("입니다");
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				
			}else if (result3.equals("2") || result3.equals("아니오")) {
				System.out.println("다음에 다시 찾아와 주세요.");
				return;
			}else {
				System.out.println("    [Error]    ");
				System.out.println("[1] 예" + "\t" + "[2] 아니오");
				result3 = scanner.nextLine();
			}
			break;
		}
		randomManualResultLottor(); // 수동 추첨 결과 메소드 호출
		
	}
	public static void automaticLottor(String name) { // 자동 로또번호
		
		try {
			System.out.println("자동을 선택하셨습니다");
			Thread.sleep(2000);
			System.out.println("자동으로 번호를 추첨하겠습니다.");
			Thread.sleep(2000);
			System.out.println();
			System.out.println("자동으로 추첨중");
			System.out.println(".");

			Thread.sleep(2000); 
			System.out.println(".");
			Thread.sleep(2000); 
			System.out.println(".");
			Thread.sleep(2000);
			
			for (int i = 0; i < 6; i++) {
				int randomNumber = random.nextInt(50) + 1; // 1부터 50 사이의 랜덤한 정수
				auotLottor[i] = randomNumber; // 배열에 랜덤 값 할당
			}
			for (int i = 0; i < 6; i++) {
				System.out.print("[" + auotLottor[i] + "]");
			}
			System.out.println();
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
		}
		
		System.out.println("자동 추첨이 완료되었습니다.");
		System.out.println();
		System.out.println("당첨 확인 하시겠습니까?");
		System.out.println("[1] 예" + "\t" + "[2] 아니오");
		
		String result2 = scanner.nextLine();
		if(result2.equals("1") || result2.equals("예")) {
			System.out.println("추첨 진행하겠습니다");
			try {
				Thread.sleep(2000); 
				System.out.println("자동으로 숫자 추첨중");
				System.out.println(".");
				Thread.sleep(2000); 
				System.out.println(".");
				Thread.sleep(2000); 
				System.out.println(".");
				Thread.sleep(2000);
				
				for (int i = 0; i < 6; i++) {
					int randomNumber = random.nextInt(50) + 1; // 1부터 50 사이의 랜덤한 정수
					autoValue[i] = randomNumber; // 배열에 랜덤 값 할당
				}
				for (int i = 0; i < 6; i++) {
					System.out.print("[" + autoValue[i] + "]");
				}
				
			} catch (InterruptedException e) {
//				e.printStackTrace();
			}
			
		}else if(result2.equals("2") || result2.equals("아니요")){
			System.out.println("다음에 또 방문해주세요.");
			return;
			
		}else {
			System.out.println("[Error]\n번호를 다시 입력해주세요.");
			System.out.print("입력 : ");
			result2 = scanner.next();
		}
		System.out.println();
		randomAutoResultLottor();
		
	}
	public static void randomAutoResultLottor() { // 자동 추첨 결과
		System.out.println();
		System.out.println("[당첨 결과]" + "\n");
		try {
			System.out.println("자동으로 뽑으신 숫자는");
			for (int auotLottor : auotLottor) {
				System.out.print("[" + auotLottor + "]");
			}
			System.out.println("입니다" + "\n");
			
			Thread.sleep(2000);
			
			System.out.println("자동 추첨 번호는");
	        for (int autoValue : autoValue) {
	            System.out.print("[" + autoValue + "]");
	        }
	        System.out.println("입니다" + "\n");
	        
		} catch (InterruptedException e) {
			
		}
		if(Arrays.equals(auotLottor, autoValue)) {
			System.out.println("당첨");
		}else {
			System.out.println("아쉽게 낙첨되셨습니다.");
		}
	}
	
	public static void randomManualResultLottor(){ // 수동 추첨 결과
		System.out.println();
		System.out.println("[당첨 결과]" + "\n");
		try {
			System.out.println("수동으로 뽑으신 숫자는");
			for (int manualLottor : manualLottor) {
				System.out.print("[" + manualLottor + "]");
			}
			System.out.println("입니다" + "\n");
			
			Thread.sleep(2000);
			
			System.out.println("자동 추첨 번호는");
	        for (int manualAuotLottor : manualAuotLottor) {
	            System.out.print("[" + manualAuotLottor + "]");
	        }
	        System.out.println("입니다" + "\n");
	        
		} catch (InterruptedException e) {
			
		}
		if(Arrays.equals(manualLottor, manualAuotLottor)) {
			System.out.println("당첨");
		}else {
			System.out.println("아쉽게 낙첨되셨습니다.");
		}
	}

	public void startLottor() {	// 로또 시작	
		System.out.println(
				" \n\n ##        ####    ######   ######    ####    #####      \r\n"
				+ " ##       ##  ##     ##       ##     ##  ##   ##  ##     \r\n"
				+ " ##       ##  ##     ##       ##     ##  ##   #####     \r\n"
				+ " ##       ##  ##     ##       ##     ##  ##   ## ##          \r\n"
				+ " ######    ####      ##       ##      ####    ##  ##    ");
		
		System.out.println("안녕하세요. 동행복권입니다.\n" + "복권 구입을 하시겠습니까?.\n" + "[1] 예\t[2] 아니요");
		System.out.print("입력 : ");
		String result = scanner.nextLine();
		
		
		while (true) { //
			if(result.equals("1") || result.equals("예")) {
				buyLottor(result);
				break;
			}else if(result.equals("2") || result.equals("아니요")){
				System.out.println("다음에 또 방문해주세요.");
				break;
			}else {
				System.out.println("    [Error]\n번호를 다시 입력해주세요.");
				System.out.println("[1] 예" + "\t" + "[2] 아니오");
				System.out.print("입력 : ");
				result = scanner.next();
			}
			
		}
		
		
	 
	}
	
}
