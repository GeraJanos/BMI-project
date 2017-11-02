import java.util.Scanner;

class BMI {
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        double weight = 0, height = 0;
        String metric, BodyType;
        
        System.out.println("Enter which metric system are you using (SI or USC): ");
        metric = input1.nextLine();
        
        if (metric.equals("SI") || metric.equals("Si") || metric.equals("si") ) {
        	System.out.println("Enter your weight in kilogramms: ");
            weight = input2.nextDouble();
            
            System.out.println("Enter your height in meters: ");
            height = input2.nextDouble();	
            
        } else if (metric.equals("USC") || metric.equals("Usc") || metric.equals("usc")) {
        	System.out.println("Enter your weight in pounds: ");
        	weight = input2.nextDouble();
        	
        	System.out.println("Enter your height in inches: ");
        	height = input2.nextDouble();
        	
        } else {
        	System.out.println("That is not a valid metric system. :( Try again please!");
        }
       
        BodyTypeCheckWithBMI BodyTypeCheckWithBMIObject = new BodyTypeCheckWithBMI ();
        BodyType = BodyTypeCheckWithBMI.checkBodyType(metric, weight, height);
        
        System.out.println("Your body type are: " + BodyType);
	}
	
}