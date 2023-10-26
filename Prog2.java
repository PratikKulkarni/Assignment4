package neebalgurukul.day4;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] months= {"January", "February", "March", "April", "May", 
				"June", "July", "August", "September", "October", "November", "December"};
		int[] monthly_sales= {125000, 93000, 80000, 75000, 84000, 110000, 
				105000, 120000, 90000, 115000, 123000, 150000};
		String[] quarters= {"1st quarter", "2nd quarter", "3rd quarter", "4th quarter"};
		int[] quarterly_sales=new int[4];
		System.out.println("The monthly sales of the product are as follows:");
		for(int i=0;i<months.length;i++) {
			System.out.println(String. format("%-17s", months[i]+" sales: ")+monthly_sales[i]);
		}
		//System.out.println("The quarterly sales of the product are as follows:");
		for(int i=0;i<quarters.length;i++) {
			quarterly_sales[i]=(monthly_sales[3*i]+monthly_sales[3*i+1]+monthly_sales[3*i+2]);
		}
		int sum=0;
		for(int i=0;i<quarters.length;i++) {
			sum+=(quarterly_sales[i]);
		}
		System.out.println("The quarterly sales of the product are as follows:");
		for(int i=0;i<quarters.length;i++) {
			System.out.println(String. format("%-11s", quarters[i])+" sales: "+quarterly_sales[i]);
		}
		
		System.out.println("The total sales of the product is: "+ sum);
	}

}
