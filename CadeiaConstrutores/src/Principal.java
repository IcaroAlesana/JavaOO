
public class Principal {

	private static DeBaixo obj;

	public static void main(String[] args) {
		setObj(new DeBaixo());
	}

	public static DeBaixo getObj() {
		return obj;
	}

	public static void setObj(DeBaixo obj) {
		Principal.obj = obj;
	}
}
