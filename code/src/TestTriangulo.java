import static org.junit.Assert.*;
import org.junit.Test;

public class TestTriangulo {
    @Test
    public void testTrianguloEquilatero() {
        Triangulo equilatero = new Triangulo(5, 5, 5);
        assertEquals("Equilátero", equilatero.identificarTipo());
    }

    @Test
    public void testArea() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        double area = triangulo.calcularArea();
        assertEquals(6.0, area, 0.001);
    }

    @Test
    public void testEsTrianguloValido() {
        // Caso de prueba para un triángulo válido
        Triangulo trianguloValido = new Triangulo(3, 4, 5);
        assertTrue("El triángulo debe ser válido", trianguloValido.esTrianguloValido());
    }

    //Kevin
    @Test
    public void testTrianguloInvalido(){
        // Caso de prueba para un triángulo inválido (no cumple la desigualdad triangular)
        Triangulo trianguloInvalido = new Triangulo(1, 2, 3);
        assertFalse("El triángulo no debe ser válido", trianguloInvalido.esTrianguloValido());
    }

    //Ricardo
    @Test
    public void testTrianguloLongitudNegativa(){
        // Caso de prueba para longitudes de lado negativas
        Triangulo trianguloConLadosNegativos = new Triangulo(-1, -1, -1);
        assertFalse("El triángulo no debe ser válido con lados negativos", trianguloConLadosNegativos.esTrianguloValido());
    }

    //Santi
    @Test
    public void testTrianguloConLadoCero(){
        // Caso de prueba para longitudes de lado que incluyen cero
        Triangulo trianguloConLadoCero = new Triangulo(0, 4, 5);
        assertFalse("El triángulo no debe ser válido con un lado de longitud cero", trianguloConLadoCero.esTrianguloValido());
    }
}
