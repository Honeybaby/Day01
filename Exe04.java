package com.hfut.demo;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
  Scanner in = new Scanner(System.in);
  System.out.println("| 1.����1��ѧ�� |");
  System.out.println("| 2.��ʾ����ѧ�� |");
  System.out.println("| 3.�˳����� |");
  System.out.println("| ������ѡ��1-3���� ");
  int choice=in.nextInt();
  String numberString="";
  switch(choice)
  {
    case 1:numberString="����1��ѧ��";break;
    case 2:numberString="��ʾ����ѧ��";break;
    case 3:numberString="�˳�����";break;
    default:numberString="error day";

}

    System.out.println(numberString);
}

}
