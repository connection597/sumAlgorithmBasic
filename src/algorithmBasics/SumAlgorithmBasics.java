package algorithmBasics;

public class SumAlgorithmBasics {

	public static void main(String[] args) {
		int [] score = {89,56,45,76,59};
		int sum =0;
		int sumCondition =0;
		
		for(int i=0 ; i < score.length; i++) {
			sum +=score[i];
		}
		    if(score[sum]>=80) {
			   sumCondition += score[sum];
		}
		    System.out.println(score.length +"명의 총점"+ sum);
		    System.out.println(score.length +"명의 총점중 80점이 이사의 총점"+sumCondition);

	}

}
