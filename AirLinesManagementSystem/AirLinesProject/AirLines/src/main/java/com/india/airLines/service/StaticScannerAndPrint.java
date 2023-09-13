package com.india.airLines.service;

import java.io.PrintStream;
import java.util.Scanner;

public class StaticScannerAndPrint
{
	private static Scanner scanner = new Scanner(System.in);
	private static PrintStream s = System.out;
	public static void closeScanner() {
		scanner.close();
		scanner = null;
	}
	public static void openScanner() {
		if(scanner == null)
			scanner = new Scanner(System.in);
	}
	public static int scanNextInt() {
		return scanner.nextInt();
	}
	public static double scanNextDouble() {
		return scanner.nextDouble();
	}
	public static String scanNextLine() {
		return scanner.nextLine();
	}
	public static String scanNextString() {
		return scanner.next();
	} 
	
	public static void println() {
		s.println();
	}
	public static void println(Object o) {
		s.println(o);
	}
	public static  void print(Object o) {
		s.print(o);
	}
	public static  void println(String o) {
		s.println(o);
	}
	public static  void print(String o) {
		s.print(o);
	}
	public static  void println(long o) {
		s.println(o);
	}
	public static  void print(long o) {
		s.print(o);
	}
	public static  void println(double o) {
		s.println(o);
	}
	public static  void print(double o) {
		s.print(o);
	}
	public static  void println(char o) {
		s.println(o);
	}
	public static  void print(char o) {
		s.print(o);
	}
	public static  void println(boolean o) {
		s.println(o);
	}
	public static  void print(boolean o) {
		s.print(o);
	}
}
