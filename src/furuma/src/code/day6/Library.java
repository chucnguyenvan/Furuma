package code.day6;

import java.util.Arrays;

public class Library<E>{
    private int size=0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public Library() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = elements.length +5;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int index, E element){
        if (index> size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        if(elements.length==size){
            this.ensureCapa();
        }
        for (int i = this.size; i >index; i--) {
            elements[i]=elements[i-1];
        }
        elements[index]=element;
        size++;
    }
    public void addAnElementLibrary(E e){
        if(elements.length==size){
            this.ensureCapa();
        }
        elements[size++]=e;
    }
    public E remove(int index){
        for (int i = index; i < this.size-1; i++) {
            elements[i]=elements[i+1];
        }
        elements[size]=null;
        size--;
        return (E) elements;
    }
    public int size(){
        return this.size;
    }
//    Xoa tat ca cac pt trong thu vien
    public void deleteAllElementLibrary(){
        for (int i = size; i >0; i--) {
            this.remove(i-1);
        }
    }
//    Hien thi thu vien
    public void showLibrary(){
        for (int i = 0; i <size() ; i++) {
            E e=(E)elements[i];
            System.out.println(e);
        }
    }
}
