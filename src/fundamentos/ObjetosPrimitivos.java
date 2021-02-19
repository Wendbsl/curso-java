package fundamentos;

public class ObjetosPrimitivos {

	public static void main(String[] args) {
		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		
		Float f = 5.1F;
		Double d = 6.1;
		
		System.out.println(bo.toString().length());
		System.out.println("true".length());
		System.out.printf("%c %b %d %d %d %d %.1f %.1f",c, bo, b, s, i, l, f, d);
		
	}
}
