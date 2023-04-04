import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String lastname;
    private int age = -1;
    private String placeResidence;
    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    public Person(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public Person (String name, String lastname, int age, String placeResidence){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.placeResidence = placeResidence;
    }

    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public OptionalInt getAge(){
       if (hasAge()){
           return OptionalInt.of(age);
       }else {
           return null;
       }
    }

    public String getPlaceResidence() throws Exception {
      if (hasPlaceResidence()){
          return placeResidence;
      }else {
          throw new Exception();
      }
    }
    public Boolean hasAge(){

        return  age >= 0;
    }
    public boolean hasPlaceResidence(){
        return placeResidence != null;

    }

    public void setPlaceResidence(String place){
        placeResidence = place;
    }

    public void happyBirthday() throws Exception {

        if (hasAge()){
            age += 1;
        }else {
            throw new Exception("Возраст не указан");
        }
    }
    public PersonBuilder newChildBuilder(){
        return new  PersonBuilder().setLastName(lastname).setPlaceResidence(placeResidence).setAge(0);
    }

    @Override
    public String toString(){
return getName() + " " + getLastname();
    }
}
