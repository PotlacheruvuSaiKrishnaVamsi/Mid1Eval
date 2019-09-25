public class Division implements Operation{
	public String operation(double a, double b){
		double div=0.00;
		try{
			div = a / b;	
		} catch(Exception e){
		}
		return "Division is "+div; /*This statement returns the string*/
	}
}