package streamsExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo5 {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();

		names.add("Sunny loene");
		names.add("Kajal Agarwal");
		names.add("Prabhas");
		names.add("Anushka Setty");
		names.add("Mallika Sherawat");

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

		// List<String> customizedorder =
		// (List<String>)names.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());

		List<String> customizedsorted = (List<String>) names.stream().sorted(c).collect(Collectors.toList());

		System.out.println("natural sorting order" + customizedsorted);

		// sorted((i1,i2)->i2.compareTo(i1))
	}

}
