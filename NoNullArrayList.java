import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int cap){
    super(cap);
  }
  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException ("can't be null");
  }else{
    super.add(value);
  }
  return true;
}

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException ("can't be null");
  }else{
    super.add(index,value);
  }
}

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException ("can't be null");
  }
    return super.set(index,value);
}

}
