package neebalgurukul.day4;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1)
				count++;
		}
		System.out.println("The attendance percentage of the student is: "+String.format("%.2f", (((double)count)/n)*100)+"%");
	}

}
