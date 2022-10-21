package tjj;
import java.util.TreeMap;

public class TreeMapcolec {
    TreeMap<Integer, String> t = new TreeMap<Integer, String>(); //declaracion del TreeMap

    public void put(Integer s, String s2) { 
        t.put(s, s2); //Agrega al final de la lista
    }

    public String values(){
        return t.values().toString();//retorna los valores
    }

    public Object remove(Integer s){
        return t.remove(s); //remueve el valor de la key
    }
    
    public  Integer firstKey(){
        return t.firstKey();//retorna la primer keys
    }

    public Integer lastKey(){
        return t.lastKey(); //retorna la ultima de las keys
    }

    public String get(Integer i){
        return t.get(i); //retorna el valor de la key i
    }

    public void clear(){
        t.clear(); //limpia el map
    }

    public int size(){
        return t.size(); //retorna el tamaño del map
    }

    public String toString() { 
        return t.toString(); //printea la lista
    }

    
}
