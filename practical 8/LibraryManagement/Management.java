class Management{
    String adminName;
    int year;
    int capacity=600;

    static int bookCount=0;

    static int programmingBooks=0;
    static int electronicsBooks=0;
    static int mechanicalBooks=0;
    static int civilBooks=0;
    static int mathematicsBooks=0;
    static int physicsBooks=0;

    Book[] bookList=new Book[capacity];

    Management(String name,int yr){
        adminName=name;
        year=yr;
    }

    String generateBookId(String category){
        int year=this.year;

        if(category.equals("Programming") && programmingBooks<100){
            programmingBooks++;
            if(programmingBooks>99) return year+"PRG"+programmingBooks;
            else{
                if(programmingBooks<10) return year+"PRG"+"00"+programmingBooks;
                else return year+"PRG"+"0"+programmingBooks;
            }
        }

        else if(category.equals("Electronics") && electronicsBooks<100){
            electronicsBooks++;
            if(electronicsBooks>99) return year+"ELC"+electronicsBooks;
            else{
                if(electronicsBooks<10) return year+"ELC"+"00"+electronicsBooks;
                else return year+"ELC"+"0"+electronicsBooks;
            }
        }

        else if(category.equals("Mechanical") && mechanicalBooks<100){
            mechanicalBooks++;
            if(mechanicalBooks>99) return year+"MEC"+mechanicalBooks;
            else{
                if(mechanicalBooks<10) return year+"MEC"+"00"+mechanicalBooks;
                else return year+"MEC"+"0"+mechanicalBooks;
            }
        }

        else if(category.equals("Civil") && civilBooks<100){
            civilBooks++;
            if(civilBooks>99) return year+"CIV"+civilBooks;
            else{
                if(civilBooks<10) return year+"CIV"+"00"+civilBooks;
                else return year+"CIV"+"0"+civilBooks;
            }
        }

        else if(category.equals("Mathematics") && mathematicsBooks<100){
            mathematicsBooks++;
            if(mathematicsBooks>99) return year+"MAT"+mathematicsBooks;
            else{
                if(mathematicsBooks<10) return year+"MAT"+"00"+mathematicsBooks;
                else return year+"MAT"+"0"+mathematicsBooks;
            }
        }

        else if(category.equals("Physics") && physicsBooks<100){
            physicsBooks++;
            if(physicsBooks>99) return year+"PHY"+physicsBooks;
            else{
                if(physicsBooks<10) return year+"PHY"+"00"+physicsBooks;
                else return year+"PHY"+"0"+physicsBooks;
            }
        }

        else{
            return "INVALID";
        }
    }



    void addBook(String title,String author,String publisher,int pages,String category){

        String id=generateBookId(category);

        if(id.equals("INVALID")){
            System.out.println("Category Full");
            return;
        }

        Book b=new Book(title,author,publisher,pages,category);
        bookList[bookCount++]=b;

        b.bookId=id;
    }



    int removeBook(String id){

        Book[] mylist=this.bookList;
        int found=0;
        int index=0;

        for(int i=0;i<(mylist.length);i++){

            if(mylist[i]==null) break;

            if(id.equals(mylist[i].bookId)){

                found=1;
                index=i;

                for(int j=i;j<mylist.length-1;j++){
                    mylist[j]=mylist[j+1];
                }

                bookCount--;
            }
        }

        return found;
    }



    Book searchBook(String id){

        Book[] mylist=this.bookList;
        Book b=null;

        for(int i=0;i<mylist.length;i++){

            if(mylist[i]==null) break;

            if(id.equals(mylist[i].bookId)){
                b=mylist[i];
                break;
            }
        }

        return b;
    }



    void updateTitle(Book b,String newTitle){
        b.title=newTitle;
    }

    void updateAuthor(Book b,String newAuthor){
        b.author=newAuthor;
    }

    void updatePublisher(Book b,String newPublisher){
        b.publisher=newPublisher;
    }

    void updatePages(Book b,int newPages){
        b.pages=newPages;
    }

    void updateCategory(Book b,String newCategory){
        b.bookId=this.generateBookId(newCategory);
    }

}
