
public class QueueApp {

	
	public static void main(String[] args) {
		
		

		Queue Ringpuffer = new Queue(4); 
		Ringpuffer.insert("04 HolyGuacamoly"); 
		Ringpuffer.insert("03 Wassup"); 
		Ringpuffer.insert("02 Keine Chance"); 
		Ringpuffer.insert("01 Idiots"); 

		
		Ringpuffer.print(); 
		
		
	}
	
	
}
