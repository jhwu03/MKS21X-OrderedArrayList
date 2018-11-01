import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T>{

  public void add(int index, T value){
    if (value == null){
      throw new IllegalArgumentException ("can't be null");
  }else{
    Super.add(index,value);
  }
}
