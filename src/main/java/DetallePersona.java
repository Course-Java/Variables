public class DetallePersona {
    public static void main(String[] args) {
        String nombre = "Marco Antonio Góngora Sánchez";
        int edad = 20;
        float altura = 1.75F;
        String pais = "Perú";
        char casado = 'S';

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(pais);
        System.out.println(casado);
    }
}

/*
* NOTAS:
* Al colocar un F al lado de 1.75, estamos especificando que el tipo de valor es un tipo float, ya que si lo dejamos cómo está, dará un error que indicará que el tipo de valor debería ser un double y no un float.
* */
