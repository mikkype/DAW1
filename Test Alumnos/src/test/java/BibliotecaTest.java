import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @Before
    public void inicializar() {
        biblioteca = new Biblioteca();
        biblioteca.agregarLibro("El principito", 3);
        biblioteca.agregarLibro("Don Quijote de la Mancha", 2);
    }
        //
    @Test
    public void test(){
    biblioteca.prestarLibro("toni1","El principito");
    }


}
