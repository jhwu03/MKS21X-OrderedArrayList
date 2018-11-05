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
    while ( bad == false && index < this.size() ) {
      if ( value.compareTo( this.get(index) ) <= 0 ) {
        bad = true ;
      }else{
        index = index + 1 ;
      }
    }
    return index ;
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
