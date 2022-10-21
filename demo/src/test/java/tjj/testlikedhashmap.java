package tjj;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testlikedhashmap {
    @Test
    public void agregaunelemento() {
        LinkedHashMapcolec a = new LinkedHashMapcolec();
        a.put("1", "chau");
        assertEquals(1, a.size());
    }
    //tener llave
    @Test
    public void tieneunllave() {
        LinkedHashMapcolec a = new LinkedHashMapcolec();
        a.put("1", "chau");
        a.put("3", "hola");
        

        assertEquals("[1, 3]", a.KeySet().toString());
    }
    @Test
    public void valores(){
        LinkedHashMapcolec a = new LinkedHashMapcolec();
        a.put("1", "chau");
        a.put("3", "hola");
        assertEquals("[chau, hola]", a.values());
    }
    @Test
    public void printealalistaentrySet() {
        LinkedHashMapcolec a = new LinkedHashMapcolec();
        a.put("1", "chau");
        a.put("3", "hola");
        assertEquals("[1=chau, 3=hola]", a.entrySet().toString());
    }
    @Test
    public void obtenerelementoconkey() {
        LinkedHashMapcolec a = new LinkedHashMapcolec();
        a.put("1", "chau");
        a.put("3", "hola");
        assertEquals("chau", a.get("1"));
        assertEquals("hola", a.get("3"));
    }
}
