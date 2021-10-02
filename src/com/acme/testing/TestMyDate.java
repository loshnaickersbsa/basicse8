package com.acme.testing;

import com.acme.utils.MyDate;

import java.time.Year;
import java.util.GregorianCalendar;

public class TestMyDate {

	public static void main(String[] args){
		MyDate date1 = new MyDate(11,11,1918);

		MyDate date2 = new MyDate();
		date2.setDay(11);
		date2.setMonth(11);
		date2.setYear(1918);

		MyDate date3 = new MyDate();
		date3.setDate(21,4,1968);

		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		MyDate date4 = new MyDate();
		String str4 = date4.toString();
		System.out.println(str4);

		MyDate date4b = new MyDate(11, 11, 1918);
		MyDate date5 = new MyDate();
		date5.setDay(11);
		date5.setMonth(11);
		date5.setYear(1918);
		MyDate date6 = new MyDate();
		date6.setDate(11, 11, 1918);

		System.out.println("equals " + date4b.equals(date6));
		System.out.println("equals " + date3.equals(date6));

		GregorianCalendar gc = new GregorianCalendar();
		gc.isLeapYear(4);

	//	MyDate.leapYears();
	}
}