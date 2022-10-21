package tjj;
import java.util.LinkedList;

public class linkedListcolec {
    LinkedList<String> l = new LinkedList<String>(); //declaracion del LinkedList
    /*Es un array list pero con punteros al nodo siguiente*/

    
    public void add(String s) { 
        l.add(s); //Agrega al final de la lista
    }

    public void add(int i, String s) { 
        l.add(i, s); //Agregar en posicion
    }

    public String get(int i) { 
        return l.get(i); //Obtiene el string de la posicion i
    }

    public String remove(int i) { 
        return l.remove(i); //Remueve y Obtiene el string de la posicion i
    }

    public boolean remove(String s) { 
        return l.remove(s); //Remueve el string buscandolo en el array
    }

    public String getFirst() { 
        return l.getFirst(); //Obtiene el string del principio de la lista
    }

    public String pollLast() { 
        return l.pollLast(); //Remueve y Obtiene el string del final de la lista si esta vacia retorna null
    }

    public int size() { 
        return l.size(); //Tamaño de la lista
    }

    public String toString() { 
        return l.toString(); //printea la lista
    }


}
