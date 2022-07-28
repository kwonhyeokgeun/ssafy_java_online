package com.ssafy.live5.io.node;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class SimpleInputTest {

    private String data1 = "hi java world";
    private String data2 = "자바는 객체지향 언어입니다.";  //바꿔가며 테스트 해보기

    private void read1() {
        // TODO: data2를 읽어보자.
        try (InputStream input = new ByteArrayInputStream(data2.getBytes())) {
            int read = -1;
            while ((read = input.read()) != -1) { //한바이트씩 읽음
                System.out.printf("읽은 값: %d, 문자로: %c%n", read, read); //한글은 한바이트씩 받으면 무조건 깨짐(한글자가 여러 바이트라서), 영어는 잘됨
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private void read2() {
        byte[] buffer = new byte[10]; //10개 바이트씩 가져온다
        try (InputStream input = new ByteArrayInputStream(data1.getBytes())) {
            int read = -1;
            while ((read = input.read(buffer)) > 0) {  //10개 바이트씩읽음 (while문 두번만 반복)
                System.out.printf("읽은 개수: %d, 문자열: %s%n", read, new String(buffer, 0, read));  //한글은 한글자가 여러바이트라 10에서 잘리면 께진다
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private void read3() {
        char[] buffer = new char[10];  //10글자씩 읽음(영어도 한글도)
        // TODO: CharReader를 이용해 data2를 읽고 출력하시오.
        try(Reader input = new CharArrayReader(data2.toCharArray())) {
        	int read = -1; //읽은 글자 수
        	while((read=input.read(buffer))>0) {
        		System.out.printf("읽은 개수: %d, 문자열: %s%n", read, new String(buffer,0,read));  //일면 한글 안깨짐
        																	//buffer 0부터 읽은 수만큼
        	}
        }catch(IOException e) {
        	e.printStackTrace();
        }
        // END:
    }

    public static void main(String[] args) {
        SimpleInputTest ns = new SimpleInputTest();
        ns.read1(); //한바이트씩 읽음
        System.out.println();
        ns.read2();  //10바이트씩 읽음
        System.out.println();
        ns.read3();  //10문자씩 읽음
    }
}
