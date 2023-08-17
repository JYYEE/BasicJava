package chapter05;

public class CheckExample5_2_5 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},      			//array[0]
				{83, 92, 96},			//array[1]
				{78, 83, 93, 87, 88}	//array[2]
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				//count++; -- 선생님은 이걸로 하심
			}
			count = count + array[i].length;
			avg = (double) sum/count;
		}
		
		System.out.println("sum: " + sum);
		//System.out.println("count: " + count);
		System.out.println("avg: " + avg);
	}

}
