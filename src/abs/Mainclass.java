package abs;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ibook b1=new Book("aew","red",9);
		b1.computeFine(5);
		Ibook b2=new Refbook("gifts",4);
		b2.computeFine(11);
		Ibook b3=new Audiobook("kite","blue",9);
		b3.computeFine(21);
	}

}
