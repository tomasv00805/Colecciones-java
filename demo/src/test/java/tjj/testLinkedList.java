package tjj;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testLinkedList {
    //test linkedlist
    @Test
    public void agregaunelemento() {
        linkedListcolec a = new linkedListcolec();
        a.add("hola");
        assertEquals(1, a.size());
    }
    @Test
    public void agregaunelementoenunaposicion() {
        linkedListcolec a = new linkedListcolec();
        a.add("hola");
        a.add(0, "chau");
        assertEquals("chau", a.get(0));
    }
    @Test
    public void obtieneelemento() {
        linkedListcolec a = new linkedListcolec();
        a.add("hola");
        a.add("chau");
        assertEquals("chau", a.get(1));
    }
    @Test
    public void remueveunelementoyloretorna() {
        linkedListcolec a = new linkedListcolec();
        a.add("hola");
        a.add("chau");
        assertEquals("chau", a.remove(1));
    }
    @Test
    public void remueveunstring() {
        linkedListcolec a = new linkedListcolec();
        a.add("hola");
        a.add("chau");
        
        assertEquals(true,a.remove("chau"));
        assertEquals(false,a.remove("chau"));
        assertEquals(1, a.size());
    }
    @Test
    public void printealalista() {
        linkedListcolec a = new linkedListcolec();
        a.add("hola");
        a.add("chau");
        assertEquals("[hola, chau]", a.toString());
    }
    @Test
    public void obtieneelprimeroelemento() {
        linkedListcolec a = new linkedListcolec();
        a.add("hola");
        a.add("chau");
        assertEquals("hola", a.getFirst());
    }
    @Test
    public void obtieneelultimoelemento() {
        linkedListcolec a = new linkedListcolec();
        a.add("hola");
        a.add("chau");
        a.add("que tal");
        assertEquals("que tal", a.pollLast());
        assertEquals(2,a.size());
    }
}
