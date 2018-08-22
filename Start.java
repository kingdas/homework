package _DVD;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {

	}

	public static void returnmain() {
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("--------------------");
		System.out.println("0、借出排行榜");
		System.out.println("1、新增");
		System.out.println("2、查看");
		System.out.println("3、删除");
		System.out.println("4、借出");
		System.out.println("5、归还");
		System.out.println("6、退出");
		System.out.println("---------------------");
	}

	public static void startmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请选择： ");
		int n = sc.nextInt();
		if (n == 1) {
			DVDMgr.add();
			System.out.println("输入0返回 ：");
			int s = sc.nextInt();
			if (s == 0) {
				returnmain();
			}
		}
		//////////////////////////
		if (n == 2) {
			DVDMgr.search();
			System.out.println("输入0返回 ：");
			int s = sc.nextInt();
			if (s == 0) {
				returnmain();
			}
		}
		if (n == 3) {
			DVDMgr.delete();
			System.out.println("输入0返回 ：");
			int s = sc.nextInt();
			if (s == 0) {
				returnmain();
			}
		}
	}
}
