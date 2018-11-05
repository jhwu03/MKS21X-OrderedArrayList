import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int cap){
    super(cap);
  }

  private int Index(T value){
    boolean right = false ;
    int index = 0 ;
    while ( right == false && index < this.size() ) {
      if ( value.compareTo( this.get(index) ) <= 0 ) {
        right = true ;
      }else{
        index = index + 1 ;
      }
    }
    return index ;
  }

  public boolean add(T value){
    int i = 0;
    if (value == null){
  throw new IllegalArgumentException ();
}else{
  super.add(Index(value), value);
}
    return true;
  }

  public void add (int index, T value){
    this.add(value);
  }

  public T set (int index, T value){
    if (value == null){
      throw new IllegalArgumentException ();
    }else{
      T nn = this.get(index);
      this.remove(index);
      add(value);
      return nn;
      }
    }

}
