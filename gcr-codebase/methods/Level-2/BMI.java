import java.util.*;
public class BMI{
	public static void findBMI(double[][] data, int index){
		data[index][2] = (data[index][0]*10000)/(data[index][1]*data[index][1]);
	
	}
	public static String[] BMIStatus(double[][] data){
		String[] weightData = new String[10];
		for(int i=0;i<10;i++){
			if(data[i][2]<=18.4){
				weightData[i] = "Underweight";
			}
			else if(data[i][2]>=18.5 && data[i][2]<=24.9){
				weightData[i] = "Normal";
			}
			else if(data[i][2]>=25 && data[i][2]<=39.9){
				weightData[i] = "Overweight";
			}
			else{
				weightData[i] = "Obese";
			}
		}
		return weightData;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[][] personData = new double[10][3];
		for(int i=0;i<10;i++){
			for(int j=0;j<2;j++){
				personData[i][j] = input.nextDouble();
			}
			findBMI(personData,i);
		}
		String[] status = BMIStatus(personData);
		System.out.println(Arrays.toString(status));
	}
}