public class Triangulo {
    private double lado1, lado2, lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3) throws ExcepcionTriangulo {
        if (lado1 != 0 && lado2 != 0 && lado3 != 0) {
            if (!esTrianguloValido()){
                throw new ExcepcionTriangulo("Los lados proporcionados no forman un triángulo válido");
            }
            if (esTrianguloNegativo()){
                throw new ExcepcionTriangulo("Los lados proporcionados no pueden ser negativos");
            }
        }else {
            throw new ExcepcionTriangulo("El triángulo no debe ser válido con un lado de longitud cero");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String identificarTipo() {
        if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
            return "Equilátero"; // 3 lados iguales
        } else if (this.lado1 == this.lado2 || this.lado1 == this.lado3 || this.lado2 == this.lado3) {
            return "Isósceles"; // 2 lados iguales
        } else {
            return "Escaleno"; // Lados desiguales
        }
    }

    public boolean esTrianguloValido() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public boolean esTrianguloNegativo() {
        return (lado1 > 0) && (lado2 > 0) && (lado3 > 0);
    }

    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

}