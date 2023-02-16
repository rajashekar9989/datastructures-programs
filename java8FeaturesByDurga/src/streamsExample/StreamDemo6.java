package streamsExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo6 {

	public static void main(String[] args) {

		
		ArrayList names = new ArrayList();

		names.add("A");
		names.add("AAAA");
		names.add("AA");
		names.add("AAAAA");
		//names.add("AAA");
		names.add("XXX");
		names.add("AAA");

		System.out.println(names);

		Comparator<String> c = (s1, s2)-> {

			int l1 = s1.length();

			int l2 = s2.length();
			if (l1<l2)
				return -1;

			else if (l1>l2)
				return +1;

			else
				return s1.compareTo(s2);

		};

		

		List<String> customizedsorted = (List<String>) names.stream().sorted(c).collect(Collectors.toList());

		System.out.println("natural sorting order" + customizedsorted);


	}

}
