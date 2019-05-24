package com.ipvalidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPValidation {

	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * \\d{1,2}：\\d出现1至2次；[0-5]：匹配0到5之间的任意一个字符
		 * regex = "(" + number + "\\.){3}"：表示"number."出现3次
		 */
		String number = "((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))";
		String regex = "(" + number + "\\.){3}" + number;	//定义表示IP的正则表达式
		String ipNumber = "";
		while(true) {
			System.out.println("请输入IP地址");
			ipNumber = buf.readLine();
			boolean match = ipNumber.matches(regex);
			if(match) {
				System.out.println(ipNumber + "是合法的IP地址");
				break;
			} else
				System.out.println(ipNumber + "不是合法的IP地址");
		}

	}

}
