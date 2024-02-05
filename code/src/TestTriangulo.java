import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangulo {
    @Test
    public void testTrianguloEquilatero() throws ExcepcionTriangulo {
        Triangulo equilatero = new Triangulo(5, 5, 5);
        assertEquals("Equilátero", equilatero.identificarTipo());
    }

    @Test
    public void testArea() throws ExcepcionTriangulo {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        double area = triangulo.calcularArea();
        assertEquals(6.0, area, 0.001);
    }

    @Test
    public void testEsTrianguloValido() throws ExcepcionTriangulo {
        try {
            Triangulo triangulovalido = new Triangulo(1, 2, 3);
            assertTrue("Triangulo válido",triangulovalido.esTrianguloValido());
        } catch (ExcepcionTriangulo e) {
            
        }
    }
    @Test
    public void testEsTrianguloNOValido() throws ExcepcionTriangulo {
        try {
            Triangulo trianguloInvalido = new Triangulo(1, 2, 3);
        } catch (ExcepcionTriangulo e) {
            assertFalse("Los lados proporcionados no forman un triángulo válido",
                    e.getMessage().isEmpty());
        }
    }
    // Ricardo
    @Test
    public void testTrianguloLongitudNegativa() throws ExcepcionTriangulo {
        // Caso de prueba para longitudes de lado negativas
        Triangulo trianguloConLadosNegativos = new Triangulo(-1, -1, -1);
        assertFalse("Los lados proporcionados no pueden ser negativos",
                trianguloConLadosNegativos.esTrianguloValido());
    }

    // Santi
    @Test
    public void testTrianguloConLadoCero() throws ExcepcionTriangulo {
        // Caso de prueba para longitudes de lado que incluyen cero
        Triangulo trianguloConLadoCero = new Triangulo(0, 4, 5);
        assertFalse("El triángulo no debe ser válido con un lado de longitud cero",
                trianguloConLadoCero.esTrianguloValido());
    }
}
