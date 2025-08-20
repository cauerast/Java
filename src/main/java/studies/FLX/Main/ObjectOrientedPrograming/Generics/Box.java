package studies.FLX.Main.ObjectOrientedPrograming.Generics;

public class Box<T> {

    T item; // we don't know what type it was to be

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }

}
