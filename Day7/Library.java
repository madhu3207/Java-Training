package Day7;

class Book{
    String name="Java Programming";
}

class Student{
    String name="Madhu";
}

class Library{//simple  library class

    public static void main(String[] args){

        Book b=new Book();

        Student s=new Student();

        System.out.println("Book: "+b.name);

        System.out.println("Student: "+s.name);
    }
}
