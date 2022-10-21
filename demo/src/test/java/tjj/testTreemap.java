package tjj;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testTreemap {
    @Test
    public void agregaunelemento() {
        TreeMapcolec a = new TreeMapcolec();
        a.put(1, "chau");
        assertEquals(1, a.size());
    }
    @Test
    public void obtieneelemento() {
        TreeMapcolec a = new TreeMapcolec();
        a.put(1, "chau");
        assertEquals("chau", a.get(1));
    }
    @Test
    public void obtieneeltercerelemento() {
        TreeMapcolec a = new TreeMapcolec();
        a.put(1, "chau");
        a.put(2, "hola");
        a.put(3, "chau");
        assertEquals("chau", a.get(3));
    }
    @Test
    public void remueveelemento() {
        TreeMapcolec a = new TreeMapcolec();
        a.put(1, "chau");
        a.put(2, "hola");
        a.put(3, "chau");
        assertEquals("chau", a.remove(3));
    }
    @Test
    public void printealalista() {
        TreeMapcolec a = new TreeMapcolec();
        a.put(1, "chau");
        a.put(2, "hola");
        a.put(3, "chau");
        assertEquals("{1=chau, 2=hola, 3=chau}", a.toString());
    }
    @Test
    public void obtieneprimerkey() {
        TreeMapcolec a = new TreeMapcolec();
        a.put(1, "chau");
        a.put(2, "hola");
        a.put(3, "chau");
        assertEquals("1", a.firstKey().toString());
    }
}
