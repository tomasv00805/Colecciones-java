package tjj;
import java.util.ArrayList;

public class ArrayListcolec {
    ArrayList <String> a = new ArrayList<String>();//declaracion del ArrayList
    //Es como un array pero con la diferencia que este es dinamico

    public void add(String s) { 
        a.add(s); //Agrega al final de la lista
    }
    
    public void add(int i, String s) { 
        a.add(i, s); //Agregar en posicion
    }

    public boolean addAll(ArrayListcolec c) { 
        return a.addAll(c.a); //Agrega todos los elementos de la coleccion c
    }

    public String get(int i) { 
        return a.get(i); //Obtiene el string de la posicion i
    }

    public String remove(int i) { 
        return a.remove(i); //Remueve y Obtiene el string de la posicion i
    }

    public int size() { 
        return a.size(); //Tamaño de la lista
    }

    public String toString() { 
        return a.toString(); //printea la lista
    }


}
