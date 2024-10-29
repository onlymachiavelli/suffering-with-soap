package models;

public class Person {


    int id ;
    String fullname ;


    public Person(int id , String fName) {
        this.id = id ;
        this.fullname = fName;
    }




    public int getId () {
        return this.id;
    }

    public String getFullname  ()  {
        return this.fullname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }



}
