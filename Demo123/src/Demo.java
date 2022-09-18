import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// method overloading and constructor overloading
		// method/constructor name same
		// parameters different

		OverloadingExample obj = new OverloadingExample(1);

		obj.myMethod();

		String s = "Ajinkya is an indian";
		Map<Integer, String> map = new ConcurrentHashMap();
		s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()))
		.entrySet().forEach(c -> {
			System.out.println(c.getKey()+" - "+c.getValue());
		});
Arrays.asList(4,7,3,4,5).stream().sorted((s1, s2) -> s1.compareTo(s1)).collect(Collectors.toList()).get(2);
//System.out.println("hello world".chars().filter(s3 -> Arrays.asList('a', 'e').contains(s3)).collect(null, null, null);
	}

}
