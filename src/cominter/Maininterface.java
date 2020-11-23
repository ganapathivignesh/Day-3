package cominter;

public class Maininterface {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Greetings g=new English();//english object//
		{
			g.morning();
			g.afternoon();
			g.evening();
			g.night();
		}
		
		 g=new Hindi();   //hindi object//
		 {
			    g.morning();
				g.afternoon();
				g.evening();
				g.night();
		 }
		
		 g=new Telugu();     //telugu object//
		 {
			    g.morning();
				g.afternoon();
				g.evening();
				g.night();
			 
		 }
	}

}
