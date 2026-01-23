package chapter06;

public class Excercise3 {

	public static void main(String[] args) {
		
		int[] score = {90, 80, 60,100};
		
		int totalScore = 0;
		double avgScore = 0;
		
		// 코드 작성
		for (int i=0; i<score.length; i++) {
			totalScore += score[i];
		}
		avgScore = (double)totalScore / score.length;
		
		System.out.println("합계 점수 : "+totalScore);
		System.out.println("평균 점수 : "+avgScore);

	}

}
