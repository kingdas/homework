package _DVD;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {

	}

	public static void returnmain() {
		System.out.println("��ӭʹ������DVD������");
		System.out.println("--------------------");
		System.out.println("0��������а�");
		System.out.println("1������");
		System.out.println("2���鿴");
		System.out.println("3��ɾ��");
		System.out.println("4�����");
		System.out.println("5���黹");
		System.out.println("6���˳�");
		System.out.println("---------------------");
	}

	public static void startmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ѡ�� ");
		int n = sc.nextInt();
		if (n == 1) {
			DVDMgr.add();
			System.out.println("����0���� ��");
			int s = sc.nextInt();
			if (s == 0) {
				returnmain();
			}
		}
		//////////////////////////
		if (n == 2) {
			DVDMgr.search();
			System.out.println("����0���� ��");
			int s = sc.nextInt();
			if (s == 0) {
				returnmain();
			}
		}
		if (n == 3) {
			DVDMgr.delete();
			System.out.println("����0���� ��");
			int s = sc.nextInt();
			if (s == 0) {
				returnmain();
			}
		}
	}
}