package tjj;
import java.util.AbstractList;

public class AbstracListcolec {
    //abstrac list modifcable
    AbstractList<String> a = new AbstractList<String>(){
        @Override
        public String get(int index) {
            return null;
        }
        @Override
        public int size() {
            return 0;
        }
        public boolean add(String string) {
            return a.add(string);
        }
    };

    

    public Object size() {
        return a.size();
    }

    
    

}
