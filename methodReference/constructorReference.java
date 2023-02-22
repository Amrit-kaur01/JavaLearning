package methodReference;

/*
 * we can refer a constructor by using the new keyword 
*/

interface Message
{
	MessageClass getMessage(String str);
}


class MessageClass
{
	public MessageClass(String str)
	{
		System.out.println(str);
	}
}

public class constructorReference {

	public static void main(String[] args) {
		// Referring constructor with the help of functional interface i.e. Sayable
		Message msg = MessageClass::new;
		msg.getMessage("Hey");

	}

}
