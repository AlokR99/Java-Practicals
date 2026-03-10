class Book{
    String title;
    String bookId;
    String author;
    String publisher;
    int pages;
    String category;

    Book(String Title,String Author,String Publisher,int Pages,String Category){
        title=Title;
        author=Author;
        publisher=Publisher;
        pages=Pages;
        category=Category;
    }

    void displayTitle(){
        System.out.println(title);
    }
    void displayBookId(){
        System.out.println(bookId);
    }
    void displayAuthor(){
        System.out.println(author);
    }
    void displayPublisher(){
        System.out.println(publisher);
    }
    void displayPages(){
        System.out.println(pages);
    }
}