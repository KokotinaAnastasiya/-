public class PersonBuilder {
    private String name;
    private String lastName;
    private int age;
    private String placeResidence;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }
    public PersonBuilder setLastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public PersonBuilder setAge(int age){
        if (age >= 0 && age < 105){
            this.age = age;
            return this;
        }else {
            throw new IllegalArgumentException();
        }
    }
    public PersonBuilder setPlaceResidence(String placeResidence){
        this.placeResidence = placeResidence;
        return this;
    }
    public Person build() {
        if (name != null && lastName != null){
            return new Person(name,lastName,age,placeResidence);
        }else {
            throw new IllegalStateException ("Не ввели обязательные данные");
        }
    }
}
