package tjj;
import java.util.Deque;
import java.util.LinkedList;


public class DequeColec {
    Deque<String> d = new LinkedList<String>(); //declaracion del Deque
    //Similar a la cola pero en este caso se puede intecactuar tanto como al principio como al final
    
    public void addFirst(String s) { 
        d.addFirst(s); //Agrega al principio de la Cola
    }
    
    public void addLast(String s) { 
        d.addLast(s); //Agrega al final de la Cola
    }
    
    public String getFirst() { 
        return d.getFirst(); //Obtiene el string del principio de la Cola
    }
    
    public String getLast() { 
        return d.getLast(); //Obtiene el string del final de la Cola
    }

    public String peekFirst() { 
        return d.peekFirst(); //Obtiene el string del principio de la Cola si esta vacia retorna null
    }

    public String peekLast() { 
        return d.peekLast(); //Obtiene el string del final de la Cola si esta vacia retorna null
    }
    
    public String removeFirst() { 
        return d.removeFirst(); //Remueve y Obtiene el string del principio de la Cola
    }

    public String removeLast() { 
        return d.removeLast(); //Remueve y Obtiene el string del final de la Cola
    }

    public String pollFirst() { 
        return d.pollFirst(); //Remueve y Obtiene el string del principio de la Cola si esta vacia retorna null
    }

    public String pollLast() { 
        return d.pollLast(); //Remueve y Obtiene el string del final de la Cola si esta vacia retorna null
    }
   
    public int size() { 
        return d.size(); //Tamaño de la Cola
    }

    public String toString() { 
        return d.toString(); //printea la Cola
    }
}
