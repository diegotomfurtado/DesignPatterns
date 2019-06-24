package builderpatterns.test;

import builderpatterns.builder.Person;
import builderpatterns.builder.PersonWithBuilder;

public class TestingPerson {

	public static void main(String[] args) {

		
		Person personWithoutBuilder = new Person("Diego ", "Furtado Malaquias ", "Santos ", 31);
		
		System.out.println("Without Builder = " + 
				personWithoutBuilder.getFirstName() + 
				personWithoutBuilder.getAge()
			);
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		PersonWithBuilder person = new PersonWithBuilder.Builder()
				.setFirstName("Diego")
				.setAge(31)
		        .build();
		
		System.out.println( "With Builder = " +
				"Name: " + person.getFirstName() + 
				" Age: " + person.getAge()
			);
	}
}
