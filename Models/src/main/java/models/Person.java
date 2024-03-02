package models;

import java.util.ArrayList;
import java.util.List;

public class Person {
           private static int lastAssignedId = 100;
           private int id;
           private String firstName;
           private String lastName;
           private String gender;
            public Person() {
            }

            public Person(String firstName,String lastName, String gender,List<Book> books) {
                id=++lastAssignedId;
                this.firstName = firstName;
                this.lastName = lastName;
                this.gender = gender;
            }

            public int getId() {
                return id;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public void setBooks(List<Book> books,Book book) {
                books.add(book);
            }
}
