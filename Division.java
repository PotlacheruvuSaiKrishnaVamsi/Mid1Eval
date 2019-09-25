public class Division implements Operation{
	public String operation(double a, double b){
		try{
			double div = a / b;	
		} catch(Exception e){
		}
		return "Division is "+div; 
	}
}