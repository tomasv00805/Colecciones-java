package tjj;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class testDeque {
    //test deque
    @Test
    public void agregaunelementoalprincipio() {
        DequeColec a = new DequeColec();
        a.addLast("hola");
        a.addLast("chau");
        assertEquals("hola", a.getFirst());
    }
    
    @Test
    public void agregaunelementoalFinal() {
        DequeColec a = new DequeColec();
        a.addLast("chau");
        a.addFirst("hola");
        assertEquals("chau", a.getLast());
        
    }
    @Test
    public void agregaunelementoalPrincipioyotroalfinal() {
        DequeColec a = new DequeColec();
        a.addFirst("hola");
        a.addLast("chau");
        assertEquals(2, a.size());
        assertEquals("hola", a.getFirst());
        assertEquals("chau", a.getLast());
    }
    @Test
    public void agregaunelementoalprincipioyotroalfinalylosremueveconremove() {
        DequeColec a = new DequeColec();
        a.addFirst("hola");
        a.addLast("chau");
        assertEquals("hola", a.removeFirst());
        assertEquals("chau", a.removeLast());
        assertEquals(0,a.size());
    }
    @Test
    public void agregaunelementoalprincipioyotroalfinaylosremueveconpoll() {
        DequeColec a = new DequeColec();
        a.addFirst("hola");
        a.addLast("chau");
        assertEquals("hola", a.pollFirst());
        assertEquals("chau", a.pollLast());
        assertEquals(null, a.pollLast());
        assertEquals(0,a.size());
    }
    @Test
    public void agregaunelementoalprincipioyotroalfinalylosobtieneconpeek() {
        DequeColec a = new DequeColec();
        a.addFirst("hola");
        a.addLast("chau");
        assertEquals("hola", a.peekFirst());
        assertEquals("chau", a.peekLast());
        assertEquals("hola", a.peekFirst());
        assertEquals(2,a.size());
    }
    @Test
    public void agregaUnElementoAlPrincipioYOtroAlFinalYLosObtiene() {
        DequeColec a = new DequeColec();
        assertEquals(null, a.peekFirst());
    }
    @Test
    public void agregaunelementoalprincipioyotroalfinalylosobtieneconget() {
        DequeColec a = new DequeColec();
        a.addFirst("hola");
        a.addLast("chau");
        assertEquals("hola", a.getFirst());
        assertEquals("chau", a.getLast());
        assertEquals(2,a.size());
    }
}
