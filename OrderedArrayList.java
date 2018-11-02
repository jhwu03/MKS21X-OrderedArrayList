import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int cap){
    super(cap);
  }

  public boolean add(T value){
    int i = 0;
    if (value.compareTo(this.get(i)) > 0){
      i = i + 1;
      add(value);
    }
    if(value.compareTo(this.get(i)) <= 0){
      super.add(i,value);
      i = 0;
    }
    return true;
  }

}
