
public class FormatandoStrings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ lmno PQRST abc   ";
		
		String palavra = "O rato roeu a roupa do rei";
		String [] v1 = palavra.split(" "); // Espaço em branco como separador.
		String p1 = v1[0];
		String p2 = v1[1];
		String p3 = v1[2];
		String p4 = v1[3];
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,10);
		String s06 = original.replace('a', 'X');
		String s07 = original.replace("abc", "123");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println("iNDEX OF 'bc' : " + i);
		System.out.println("LastIndexOF 'bc' : " + j);
		
		System.out.println();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}

}
