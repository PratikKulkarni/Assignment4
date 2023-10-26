package neebalgurukul.day4;

public class prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
		String[] years= {"2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"};
		int ind=-1;
		for(int i=0;i<(profits.length-1);i++) {
			if(profits[i]>profits[i+1]) {
				ind=i+1;
				break;
			}
		}
		System.out.println("The decline in profits began in the year "+years[ind]);
	}

}
