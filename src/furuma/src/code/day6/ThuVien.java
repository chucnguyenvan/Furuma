package code.day6;

import java.util.ArrayList;

public class ThuVien<E> {
    private ArrayList<E> listLibrary;

    public ThuVien() {
        listLibrary=new ArrayList<E>();
    }

    public void addLibrary(E e){
        listLibrary.add(e);
    }
    public void addListLibrary(E e){
        listLibrary.remove(e);
    }
    public void disPlayListbrary(){
        for (int i = 0; i < listLibrary.size(); i++) {
            System.out.println(listLibrary.get(i));
        }
    }
}
