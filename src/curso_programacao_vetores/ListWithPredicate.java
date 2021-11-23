package curso_programacao_vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListWithPredicate {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Jo�o");
		list.add("Jos�");
		list.add("Mathes");
		list.add("Ana");
		list.add("Andr�");

		
		for(String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("---------------------------------")	;
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("Index of Jo�o" + list.indexOf("Jo�o"));
		
		// 1 converto para stream, fa�o a opera��o e depois volto pra List.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("---------------------------------")	;

		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------------")	;
		String name = list.stream().filter(x -> x.charAt(0) =='A').findFirst().orElse(null);
	}

}
