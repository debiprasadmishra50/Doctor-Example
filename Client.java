package doctor_example;

public class Client 
{
	public static void main(String[] args) 
	{
		Doctor d1 = new Doctor();
		
		OrthoPedician d2 = new OrthoPedician();
		
		Doctor d3 = new OrthoPedician();
		
//		OrthoPedician d4 = new Doctor();
		
		OrthoPedician d4 = (OrthoPedician) new Doctor(); //downcasting //child ref = (child type)parent obj // Will show ClassCastException
		OrthoPedician d5 = (OrthoPedician) d3; //Exception is Checked
		
//		Doctor d6 = d2;
//		
//		OrthoPedician d7 = (OrthoPedician)d5;
//		d6.treatPatient();
		
//		d1.treatPatient();
				
	}
}
