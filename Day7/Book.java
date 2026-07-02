package Day7;

class Book {//simple book class

    String title="Java";

    Book(){
        System.out.println("Book Object Created");
    }

    void display(){
        System.out.println(title);
    }

    public static void main(String[] args){

        Book b=new Book();

        b.display();
    }
}
