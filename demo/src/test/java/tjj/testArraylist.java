package tjj;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testArraylist {
    //arraylist
    @Test
    public void agregaunelemento() {
        ArrayListcolec a = new ArrayListcolec();
        a.add("hola");
        assertEquals("hola", a.get(0));
        assertEquals(1, a.size());
    }
    @Test
    public void agregaunelementoenunaposicion() {
        ArrayListcolec a = new ArrayListcolec();
        a.add("hola");
        a.add(0, "chau");
        assertEquals("chau", a.get(0));
    }
    @Test
    public void agregatodosloselementosdeunacoleccion() {
        ArrayListcolec a = new ArrayListcolec();
        ArrayListcolec b = new ArrayListcolec();
        a.add("hola");
        a.add("chau");
        b.add("hola");
        b.add("chau");
        a.addAll(b);
        assertEquals(4, a.size());
    }
    @Test
    public void remueveunelementoyloretorna() {
        ArrayListcolec a = new ArrayListcolec();
        a.add("hola");
        a.add("chau");
        assertEquals("chau", a.remove(1));
    }
    @Test
    public void printealalista() {
        ArrayListcolec a = new ArrayListcolec();
        a.add("hola");
        a.add("chau");
        assertEquals("[hola, chau]", a.toString());
    }
}
