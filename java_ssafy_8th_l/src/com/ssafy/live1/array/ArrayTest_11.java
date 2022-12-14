package com.ssafy.live1.array;


public class ArrayTest_11 {
	public static void main(String[] args) {
		int[] intArray = { 3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54 };

		// TODO: 위 배열의 요소 중 평균(실수, 소숫점 세째에서 반올림 출력)과 절대값 기준으로
		//  평균에서 가장 거리가 먼 값을 출력하시오.(여러 개일 경우는 하나만)
		int sum=0;
		for(int v:intArray) {
			sum+=v;
		}
		double avg=sum/intArray.length;
		double max=Double.MIN_VALUE;
		double min=Double.MAX_VALUE;
		int maxIdx=0;
		int minIdx=0;
		for(int i=0; i<intArray.length;i++) {
			if(Math.abs(intArray[i]-avg)>max) {
				maxIdx=i;
				max=Math.abs(intArray[i]-avg);
			}
			if(Math.abs(intArray[i]-avg)<min) {
				minIdx=i;
				min=Math.abs(intArray[i]-avg);
			}
		}
		// END:
		System.out.printf("avg:%.2f, maxDiff: %d, minDiff:%d%n", avg, intArray[maxIdx], intArray[minIdx]);

	}
}
