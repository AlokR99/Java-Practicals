import java.util.Scanner;

class LibraryManagementSystem{

    public static void main(String[] args){

        System.out.println("----------WELCOME TO SGGS LIBRARY MANAGEMENT SYSTEM----------");

        Management m=new Management("admin1",2026);

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the below options :\n");
        System.out.println("Enter 1 to Add Book ");
        System.out.println("Enter 2 to Remove Book");
        System.out.println("Enter 3 to Count Total Books ");
        System.out.println("Enter 4 to Search Book ");
        System.out.println("Enter 5 to Edit Book Info ");
        System.out.println("Enter 6 to EXIT\n");

        boolean runLoop=true;

        while(runLoop){

            System.out.print("Enter the operation :");
            int operation=sc.nextInt();

            switch(operation){

                case 1:

                    if(m.bookCount==m.capacity){
                        System.out.println("Library Full");
                        break;
                    }

                    System.out.println("----------ADDING NEW BOOKS-----------");

                    System.out.print("Enter number of books:");
                    int books=sc.nextInt();
                    sc.nextLine();

                    for(int i=0;i<books;i++){

                        System.out.println("BOOK "+(i+1));

                        System.out.print("Enter Title:");
                        String title=sc.nextLine();

                        System.out.print("Enter Author:");
                        String author=sc.nextLine();

                        System.out.print("Enter Publisher:");
                        String publisher=sc.nextLine();

                        System.out.print("Enter Pages:");
                        int pages=sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Category Choice");
                        System.out.print("1.Programming | 2.Electronics | 3.Mechanical | 4.Civil | 5.Mathematics | 6.Physics\nChoice:");

                        int choice=sc.nextInt();
                        sc.nextLine();

                        String category="";

                        switch(choice){

                            case 1:
                                category="Programming";
                                break;

                            case 2:
                                category="Electronics";
                                break;

                            case 3:
                                category="Mechanical";
                                break;

                            case 4:
                                category="Civil";
                                break;

                            case 5:
                                category="Mathematics";
                                break;

                            case 6:
                                category="Physics";
                                break;

                            default:
                                System.out.println("Wrong Choice");
                        }

                        m.addBook(title,author,publisher,pages,category);

                        System.out.println("----------------------------------------------------");
                    }

                    Book[] list=m.bookList;

                    for(int i=0;i<m.bookCount;i++){
                        System.out.println("Book_"+(i+1)+":"+list[i].bookId);
                    }

                    break;



                case 2:

                    System.out.print("Enter Book ID to remove:");
                    String id=sc.next();

                    int found=m.removeBook(id);

                    if(found==0) System.out.println("Book Not Found");
                    else System.out.println("Book Removed");

                    break;



                case 3:

                    System.out.println("Total Books:"+m.bookCount);

                    break;



                case 4:

                    System.out.print("Enter Book ID:");
                    String bookId=sc.next();

                    Book b=m.searchBook(bookId);

                    if(b==null){
                        System.out.println("Book Not Found");
                    }

                    else{

                        System.out.println("Title:"+b.title);
                        System.out.println("Author:"+b.author);
                        System.out.println("Publisher:"+b.publisher);
                        System.out.println("Pages:"+b.pages);
                        System.out.println("Category:"+b.category);
                    }

                    break;



                case 5:

                    System.out.print("Enter Book ID:");
                    String searchId=sc.next();

                    Book book=m.searchBook(searchId);

                    while(book!=null){

                        System.out.println("1.Title 2.Author 3.Publisher 4.Pages 5.Category 6.EXIT");

                        int update=sc.nextInt();
                        sc.nextLine();

                        switch(update){

                            case 1:
                                String newTitle=sc.nextLine();
                                m.updateTitle(book,newTitle);
                                break;

                            case 2:
                                String newAuthor=sc.nextLine();
                                m.updateAuthor(book,newAuthor);
                                break;

                            case 3:
                                String newPublisher=sc.nextLine();
                                m.updatePublisher(book,newPublisher);
                                break;

                            case 4:
                                int newPages=sc.nextInt();
                                sc.nextLine();
                                m.updatePages(book,newPages);
                                break;

                            case 5:
                                String newCategory=sc.nextLine();
                                m.updateCategory(book,newCategory);
                                break;

                            case 6:
                                book=null;
                                break;

                            default:
                                System.out.println("Wrong Option");
                        }
                    }

                    break;



                case 6:

                    System.out.println("Exiting Program");
                    runLoop=false;

                    break;



                default:

                    System.out.println("Wrong Option");

            }
        }
    }
}