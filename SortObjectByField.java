import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortObjectByField {
	public static void main(String[] args) {
		List <Person> personList = new ArrayList<>();
		personList.add(new Person("Mike", "harvey", 34, "001894536"));
		personList.add(new Person("Nick", "young", 75,  "005425676"));
		personList.add(new Person("Jack", "slater", 21 ,"009654153"));
		personList.add(new Person("gary", "hudson", 55,"00564536"));
		personList.add(new Person("Mike", "harvey", 21 ,"003685417"));
		personList.add(new Person("gary", "hudson", 25,"00452341"));
		
		System.out.println("1. Sort List of person objects by firstName");
		
		Comparator comp=Comparator.comparing((Person p)->p.getAge())
				.thenComparing(p->p.getFirstName().toLowerCase())
				.thenComparing(p->p.getLastName().toLowerCase());
		personList.sort(comp);
		System.out.println();
		//Sort by First Name
		personList
			.stream()
			.sorted(
					(person1,person2) ->
					person1.firstName.
						compareToIgnoreCase(person2.firstName)	
				   )
			.forEach(
						person->
						System.out.println(person)
					);
		
		//Sort by first and last name
		System.out.println("\n2.Sort list of person objects by firstName then "
											+ "by lastName then by age");
		Comparator<Person> sortByFirstName 
								= (p, o) -> p.firstName.compareToIgnoreCase(o.firstName);
		Comparator<Person> sortByLastName 
								= (p, o) -> p.lastName.compareToIgnoreCase(o.lastName);
		Comparator<Person> sortByAge 
								= (p, o) -> Integer.compare(p.age,o.age);
		
		//Sort by first Name then Sort by last name then sort by age
		personList
		.stream()
		.sorted(
				sortByFirstName
					.thenComparing(sortByLastName)
					.thenComparing(sortByAge)
			   )
		.forEach(
				person->
					System.out.println(person)
				);		
	}
}
