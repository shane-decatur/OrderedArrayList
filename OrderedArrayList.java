public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    int index = 0;
    for (int i = 0; i < size(); i++){
      Comparable<T> tempElement = get(i);
      if (tempElement.compareTo(element) >= 0){
        index = i;
        super.add(index, element);
        return true;
      }
    }
    super.add(element);
    return true;
  }

  public void add(int index,T element){
    add(element);
  }

  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    T tempElement = remove(index);
    add(element);
    return tempElement;
  }
}
