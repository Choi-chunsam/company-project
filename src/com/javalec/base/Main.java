package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int change = 0;
		
		int startNumber = 0;
		int endNumber = 0;
		int totEven = 0; //누적합용 
		int totOdd = 0;
		double mean = 0;
		
//		for(int i = 1; i <= 100; i++) {
//			 //순서가 증가 시키고 물어봐서 이렇게 하면 i의 최종값은 101이다 실수x
//		  tot += i;
//			
//		}
//		
//		tot = 0; //초기화
//		for(int i = 1; i <= 100; i++) {
//			//순서가 증가 시키고 물어봐서 이렇게 하면 i의 최종값은 101이다 실수x
//			tot += i;
//			
//		}
//		System.out.println("1부터 100까지의 합은 " + tot);
//		System.out.println(">>> End <<<");		
		
		System.out.print("시작숫자를 입력하새요 : ");
		startNumber = scanner.nextInt();
		System.out.print("끝 숫자를 입력하세요 : ");
		endNumber = scanner.nextInt();
		
		if (startNumber > endNumber) {
			change = startNumber;
			startNumber = endNumber;
			endNumber = change;
		}
		
		for(int i = startNumber; i <= endNumber; i += 2) {
			//if
//			if(i % 2 == 0) {
//				totEven += i;
//			}else {
//				totOdd += i;
//			}
			totOdd += i;
		}
		for(int i = startNumber+1; i <= endNumber; i += 2) {
			totEven += i;
		}
		
		mean = (totEven + totOdd)/(double)(startNumber + endNumber - 1);
		
		System.out.println("짝수의 합은 " + totEven + " 입니다.");
		System.out.println("홀수의 합은 " + totOdd + " 입니다.");
		System.out.println("전체 평균은 " + mean + " 입니다.");
		
		scanner.close();
	}

}
