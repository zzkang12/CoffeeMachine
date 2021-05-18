package com.ex;

import java.util.Scanner;

public class CoffeeMacine {

	int money;
	int cups;

	public void getCoffee(int cups) {

		if (money >= 200 * cups) {
			money = money - 200 * cups;
			System.out.println("커피 " + cups + "잔 나왔습니다.");
			System.out.println("잔액은 " + money + "원입니다.");
		} else {
			System.out.println("커피를 뽑을 수 없습니다.");
		}
	}

	public static void main(String[] args) {

		CoffeeMacine c1 = new CoffeeMacine();
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요");
		c1.money = sc.nextInt();
		do {

			if (c1.money <= 0) {
				break;
			} else {

				System.out.print("커피를 몇 잔 뽑을까요?(커피를 그만 뽑고 싶으면 -1을 누르세요)");

				c1.cups = sc.nextInt();
				if (c1.cups > 0) {
					c1.getCoffee(c1.cups);
				} else {
					System.out.println("+값을 입력하세요.");
					break;
				}
			}

		} while (c1.money > 0 || c1.cups > 0);
	}
}
