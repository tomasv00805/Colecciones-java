package tjj;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testAbstracList {
    @Test
    public void agregaunelemento() {
        AbstracListcolec a = new AbstracListcolec();
        assertEquals(null,a.a.get(0));
    }
    @Test
    public void agregaunelementoenunaposicion() {
        AbstracListcolec a = new AbstracListcolec();
        a.a.add( "chau");
        assertEquals("chau", a.a.get(0));
    }
        
}
