public class Triangulo {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String identificarTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";  //3 lados iguales
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";  //2 lados iguales
        } else {
            return "Escaleno"; // Lados desiguales
        }
    }

    /*
    Método para validar los lados de un tríangulo mediante desigualdad triangular.  
    La suma de dos de sus lados debe ser mayor a la longitud del tercer lado. */
    public boolean esTrianguloValido() {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    //Método de Heron para calcular el área de un triangulo.
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
}
