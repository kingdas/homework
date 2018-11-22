package _DVD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVDMgr {
	private String name;
	private int state;
	private String date;
	static List<DVDMgr> list = new ArrayList<DVDMgr>();
	static Scanner sc = new Scanner(System.in);

//get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	// 构造方法
	public DVDMgr(String name, int state, String date) {
		this.name = name;
		this.state = state;
		this.date = date;
	}

	public DVDMgr() {

	}

////////////////////////////////
	public static void initial() {
		DVDMgr luo = new DVDMgr("罗马假日", 0, "2010/7/1");
		DVDMgr feng = new DVDMgr("风声鹤唳", 1, "");
		DVDMgr lang = new DVDMgr("浪漫满屋", 1, "");
		list.add(luo);
		list.add(feng);
		list.add(lang);
	}

	public static void add() {

		System.out.println("---> 新增DVD");
		System.out.println();
		System.out.print("请输入DVD的名称： ");
		String name = sc.next();
		DVDMgr ao = new DVDMgr(name, 1, "");
		list.add(ao);
		System.out.println("新增《" + name + "》成功!");
		System.out.println("***********************");
	}

	public static void search() {
		System.out.println("---> 查看DVD ");
		System.out.println();
		System.out.println("序号\t状态\t名称\t借出日期");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "\t");
			System.out.print(list.get(i).getState() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.println(list.get(i).getDate());
		}
		System.out.println("***********************");
	}

	public static void delete() {
		System.out.println("---> 删除DVD ");
		System.out.println();
		System.out.print("请输入DVD的名称：");
		String s = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i).getName())) {
				if (list.get(i).getState() == 1) {
					list.remove(list.get(i));
				} else
					System.out.println("该DVD为借出状态，不可删除");
			} else
				System.out.println("不存在该DVD");
		}
		System.out.println("***********************");
	}

}
