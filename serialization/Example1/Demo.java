package serialization.Example1;

public class Demo implements java.io.Serializable {

	public int num;
	public String str;

	public Demo(int num, String str) {
		this.num = num;
		this.str = str;
	}
}
