public class Student {
    public String surname;


    public Student(String surname) {
        this.surname = surname;
    }


    public void showSurname(){
        System.out.println("Nazwisko studenta: " +surname);
    }
}