package com.ssafy.live0801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BufferedReaderScannerTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		{
			System.setIn(new FileInputStream("inputTC.txt"));
			Scanner sc = new Scanner(System.in);
			
			long start = System.nanoTime();
			int T = sc.nextInt();
			for(int tc =0; tc<T; tc++) {
				int hw = sc.nextInt();
				
				int sum=0;
				for(int i=0; i<hw; i++) {
					for(int j=0; j<hw; j++) {
						sum+=sc.nextInt();
					}
				}
				System.out.printf("#%d $d",tc,sum);
				
			}
			long end = System.nanoTime();
			System.out.println((end-start)/1_000_000_000);
		}
		{
			System.setIn(new FileInputStream("inputTC.txt"));
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			long start = System.nanoTime();
			int T = Integer.parseInt(in.readLine());
			for(int tc =0; tc<T; tc++) {
				int hw = Integer.parseInt(in.readLine());
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				int sum=0;
				for(int i=0; i<hw; i++) {
					for(int j=0; j<hw; j++) {
						sum+=Integer.parseInt(st.nextToken());
					}
				}
				System.out.printf("#%d $d",tc,sum);
				
			}
			long end = System.nanoTime();
			System.out.println((end-start)/1_000_000_000);
		}
	}

}
