package com.ssafy.live5.io.node;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class NodeDiaryTest {
    public static void main(String[] args) throws IOException {
        NodeDiaryTest st = new NodeDiaryTest();
        st.writeDiary();
    }

    private void writeDiary() {
        File target = new File("C:/Users/samsung/eclipse-workspace/java_ssafy_8th_l/src/com/ssafy/live5/io/node/diary.txt");
     
        try (Scanner sc = new Scanner(System.in);
                FileWriter writer = new FileWriter(target, true);
                //FileReader reader = new FileReader(target);
        		) {
        	
            System.out.println("일기를 작성합니다. 그만두려면 x를 입력하세요.");
            writer.write("\n오늘 날짜: - " + new Date() + "\n");
            // TODO: Scanner를 통해서 읽은 내용을 writer를 통해서 파일에 출력하시오.
            while(true) {
            	String line = sc.nextLine();
            	if(line.equals("x"))
            		break;
            	else {
            		writer.write(line +"\n"); //읽은거 쓰기
            		
            	}
            }
            // END:
            
            System.out.println("일기 저장 완료!!");
            
            // TODO: reader를 이용해 diary의 내용을 읽은 후 콘솔에 출력하시오.
            // END:
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
