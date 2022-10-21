package tjj;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapcolec {
    LinkedHashMap<String, String> l = new LinkedHashMap<String, String>(); //declaracion del LinkedHashMap

    public void put(String s, String s2) { 
        l.put(s, s2); //Agrega al final de la lista
    }

    public String values(){
        return l.values().toString();//retorna los valores
    }
    
    public  Set<String> KeySet(){//retorna un set con las keys
        return l.keySet();
    }

    public Set<Entry<String, String>> entrySet(){
        return l.entrySet(); //retorna un set con las keys y sus respectivas variables
    }
    
    public String get(String i){
        return l.get(i); //retorna el valor de la key i
    }

    public void clear(){
        l.clear(); //limpia el map
    }

    public int size(){
        return l.size(); //retorna el tamaño del map
    }
    public String toString() { 
        return l.toString(); //printea la lista
    }

}