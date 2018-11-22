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

	// ���췽��
	public DVDMgr(String name, int state, String date) {
		this.name = name;
		this.state = state;
		this.date = date;
	}

	public DVDMgr() {

	}

////////////////////////////////
	public static void initial() {
		DVDMgr luo = new DVDMgr("�������", 0, "2010/7/1");
		DVDMgr feng = new DVDMgr("�������", 1, "");
		DVDMgr lang = new DVDMgr("��������", 1, "");
		list.add(luo);
		list.add(feng);
		list.add(lang);
	}

	public static void add() {

		System.out.println("---> ����DVD");
		System.out.println();
		System.out.print("������DVD�����ƣ� ");
		String name = sc.next();
		DVDMgr ao = new DVDMgr(name, 1, "");
		list.add(ao);
		System.out.println("������" + name + "���ɹ�!");
		System.out.println("***********************");
	}

	public static void search() {
		System.out.println("---> �鿴DVD ");
		System.out.println();
		System.out.println("���\t״̬\t����\t�������");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "\t");
			System.out.print(list.get(i).getState() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.println(list.get(i).getDate());
		}
		System.out.println("***********************");
	}

	public static void delete() {
		System.out.println("---> ɾ��DVD ");
		System.out.println();
		System.out.print("������DVD�����ƣ�");
		String s = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i).getName())) {
				if (list.get(i).getState() == 1) {
					list.remove(list.get(i));
				} else
					System.out.println("��DVDΪ���״̬������ɾ��");
			} else
				System.out.println("�����ڸ�DVD");
		}
		System.out.println("***********************");
	}

}
