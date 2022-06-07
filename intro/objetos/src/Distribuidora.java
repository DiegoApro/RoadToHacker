public class Distribuidora {
    public static void main(String[] args) {
        class Producto {
            String nombre;
            double precio;

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public Double getPrecio() {
                return precio;
            }

            public void setPrecio(Double precio) {
                this.precio = precio;
            }

            public String Distribuidora(String nombre, Double precio) {
                this.nombre = nombre;
                this.precio = precio;
                toString();
                return nombre;
            }

            public Double calcular(Double cantidadDeProductos) {
                int precioFinal = (int) (precio * cantidadDeProductos);
                return cantidadDeProductos;
            }
        }

        class Perecedero extends Producto {
            Double diasPorCaducar;

            public Double getdiasPorCaducar() {
                return diasPorCaducar;
            }

            public void setdiasPorCaducar(Double diasPorCaducar) {
                this.diasPorCaducar = diasPorCaducar;
            }

            public Double Peredecedero(Double diasPorCaducar) {
                this.diasPorCaducar = diasPorCaducar;
                this.diasPorCaducar = diasPorCaducar;
                toString();
                return diasPorCaducar;
            }

            public Double calcular(Double cantidadDeProductos) {
                int precioFinal = (int) (precio * cantidadDeProductos);
                if (diasPorCaducar == 1) {
                    precioFinal = precioFinal / 4;
                } if (diasPorCaducar == 2) {
                    precioFinal = precioFinal / 3;   //deberia retornar precioFinal
                }
                if (diasPorCaducar == 3) {
                    precioFinal = precioFinal / 2;
                }
                return cantidadDeProductos;
            }
        }
    }
}
