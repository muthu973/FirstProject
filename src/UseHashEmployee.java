import java.util.*;

public class UseHashEmployee {

	public static void main(String[] args) {
		HashEmployee e1 = new HashEmployee(101, "Prasfa", 22, "Male", 8765);
		HashEmployee e2 = new HashEmployee(102, "Prssa", 42, "Male", 8445);
		HashEmployee e3 = new HashEmployee(103, "Prfb", 26, "Male", 8765445);
		HashEmployee e4 = new HashEmployee(104, "Prsea", 62, "Male", 5445);
		HashEmployee e5 = new HashEmployee(105, "Pr7f", 2, "Female", 85445);
		HashEmployee e6 = new HashEmployee(106, "Pra5gha", 22, "Male", 87645);
		HashEmployee e7 = new HashEmployee(107, "Prhy", 22, "Male", 876445);
		HashEmployee e8 = new HashEmployee(108, "Chinese", 23, "	Female", 8765445);
		HashEmployee e9 = new HashEmployee(109, "Abu", 22, "Male", 867545);
		HashEmployee e10 = new HashEmployee(110, "Prabde", 22, "Male", 8765445);

		HashMap<Integer, HashEmployee> hashEmployees = new HashMap<>();
		hashEmployees.put(e1.getId(), e1);
		hashEmployees.put(e2.getId(), e2);
		hashEmployees.put(e3.getId(), e3);
		hashEmployees.put(e4.getId(), e4);
		hashEmployees.put(e5.getId(), e5);
		hashEmployees.put(e6.getId(), e6);
		hashEmployees.put(e7.getId(), e7);
		hashEmployees.put(e8.getId(), e8);
		hashEmployees.put(e9.getId(), e9);
		hashEmployees.put(e10.getId(), e10);

		for (Integer in : hashEmployees.keySet()) {
			System.out.println(in);
			System.out.println(hashEmployees.get(in));
		}

		hashEmployees.forEach((x, y) -> {
			if (y.getAge() > 25) {
				System.out.println(y);
			}

		});
		System.out.println(e1.hashCode());
	}

}
