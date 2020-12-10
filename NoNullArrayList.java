import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.set(index,element);
  }

  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    return super.add(element);
  }
}
