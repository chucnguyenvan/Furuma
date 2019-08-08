package code.day6;

public class main {
    public static void main(String[] args) {
        ThuVien<Book> bookLibrary=new ThuVien<Book>();
        Book java =new Book("howtolearnJava",150000,2000);
        bookLibrary.addLibrary(java);
        Book cshape=new Book("HOC C",100000,2000);
        bookLibrary.addLibrary(cshape);
        bookLibrary.disPlayListbrary();

        Library<Video> videoLibrary=new Library<Video>();
        Video javatutal=new Video("learn to java A-Z",20000,2017);
        videoLibrary.addAnElementLibrary(javatutal);
        videoLibrary.showLibrary();

        Library<Music> musicLibrary =new Library<Music>();
        Music Jackson =new Music("Album Michale Jackson",200000,2000);
        Music mrSiro =new Music("Nhac Mrsiro",20000,2017);
        musicLibrary.addAnElementLibrary(Jackson);
        musicLibrary.addAnElementLibrary(mrSiro);
        musicLibrary.showLibrary();

    }
}

