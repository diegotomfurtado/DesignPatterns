package com.diegotomfurtado.builder;

public class PersonWithBuilder {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	
	
	public PersonWithBuilder(
			String firstName, 
			String middleName, 
			String lastName, 
			int age
			) 
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		
		return lastName;
	}
	public int getAge() {
		return age;
	}

	public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;

        public Builder(){}
        
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonWithBuilder build() {
            return new PersonWithBuilder(
            		firstName, 
            		middleName, 
            		lastName, 
            		age
            );
        }
    }
}
