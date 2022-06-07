public class ejercicio1 {
        public static void main(String[] args) {
            try {
                int a = 0;
                int b = 300;
                int resultado = b / a;
                System.out.println("Se ha producido un error");
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Programa finalizado");
            }
        }
    }
