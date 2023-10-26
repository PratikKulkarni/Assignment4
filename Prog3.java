package neebalgurukul.day4;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
		int min_in,min_out,hr_in,hr_out,total_mins=0,total_hrs=0;
		for(int i=0;i<ev.length;i+=2) {
			hr_in=ev[i]/100;
			hr_out=ev[i+1]/100;
			min_in=ev[i]%100;
			min_out=ev[i+1]%100;
			
				if(hr_in>hr_out) {
					if(min_in==0) {
						total_hrs+=((24-(hr_in))+hr_out);
						total_mins+=min_out;
					}
					else {
						total_hrs+=((24-(hr_in+1))+hr_out);
						total_mins+=((60-min_in)+min_out);
					}
				}else {
					if(hr_in==hr_out) {
						total_mins+=min_out-min_in;
					} else {
						if(min_in==0) {
							total_hrs+=(hr_out-hr_in);
							total_mins+=min_out;
						}
						else {
							total_hrs+=(hr_out-(hr_in+1));
							total_mins+=(60-min_in)+min_out;
						}
					}
					
				}
			
		}
		total_hrs+=((total_mins)/60);
		total_mins=total_mins%60;
		System.out.println("Answer: "+total_hrs+" hr "+total_mins+" min");
	}

}
