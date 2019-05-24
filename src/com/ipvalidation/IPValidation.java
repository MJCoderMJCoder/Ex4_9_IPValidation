package com.ipvalidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPValidation {

	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * \\d{1,2}��\\d����1��2�Σ�[0-5]��ƥ��0��5֮�������һ���ַ�
		 * regex = "(" + number + "\\.){3}"����ʾ"number."����3��
		 */
		String number = "((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))";
		String regex = "(" + number + "\\.){3}" + number;	//�����ʾIP��������ʽ
		String ipNumber = "";
		while(true) {
			System.out.println("������IP��ַ");
			ipNumber = buf.readLine();
			boolean match = ipNumber.matches(regex);
			if(match) {
				System.out.println(ipNumber + "�ǺϷ���IP��ַ");
				break;
			} else
				System.out.println(ipNumber + "���ǺϷ���IP��ַ");
		}

	}

}
