
public class BodyTypeCheckWithBMI {
	public static String checkBodyType(String metric, double weight, double height) {
		 double bmi = 0;
		 String CheckResult;
		 
		 if (metric.equals("SI") || metric.equals("Si") || metric.equals("si") ) {
			 bmi = ((weight)/(height * height));
	            
	     } else if (metric.equals("USC") || metric.equals("Usc") || metric.equals("usc")) {
	    	 bmi = ((weight * 703)/(height * height));
	     } else {
	    	 System.out.println("There is something wrong!");
	     }
		 
		 // BMI Table for Adults decision
	        
	        if (bmi <= 16) {
	        	CheckResult = "Severe Thinness";
	        	
	        } else if (bmi>16 & bmi<17) {
	        	CheckResult = "Moderate Thinness";
	        	
	        } else if (bmi>17 & bmi<18.5) {
	        	CheckResult =  "Mild Thinness";
	        	
	        } else if (bmi>18.5 & bmi<25) {
	        	CheckResult = "Normal";
	        	
	        } else if (bmi>25 & bmi<30) {
	        	CheckResult = "Overweight";
	        	
	        } else if (bmi>=30) {
	        	CheckResult = "Obese";
	        	
	        }else {
	        	CheckResult = "There is something wrong!";
	        }	
	        
	        
			return CheckResult;
	}
	
}
