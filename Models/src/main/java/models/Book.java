package models;

public class Book {
     private static int lastAssignedId=1;
     private int id;
     private String title;
     private String authorName;
     private Types types;

     public Book() {
          this.id=++lastAssignedId;
     }

     public Book(String title, String authorName, Types types) {
          this();
          this.title = title;
          this.authorName = authorName;
          this.types = types;
     }

     public  int getId() {
          return id;
     }


     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getAuthorName() {
          return authorName;
     }

     public void setAuthorName(String authorName) {
          this.authorName = authorName;
     }

     public Types getTypes() {
          return types;
     }

     public void setTypes(Types types) {
          this.types = types;
     }
}
