package POOV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



    public class uso_Empleado {
        public static void main(String[] args) throws ParseException {
            Date fechaContrato = new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2022");

            Empleado empleado1 = new Empleado("Kevin", 1080.0, fechaContrato);

            System.out.println("Nombre: " + empleado1.getNombre());
            System.out.println("Sueldo: " + empleado1.getSueldo());
            System.out.println("Fecha del contrato: " + empleado1.getFechaContrato());

            Date fechaContrato2 = new SimpleDateFormat("dd-MM-yyyy").parse("06-05-2022");
            Empleado empleado2 = new Empleado("Jose", 1080, fechaContrato2);

            empleado2.aumentoSueldo(10);


            System.out.println("El nuevo sueldo de " + empleado2.getNombre() + " es: " + empleado2.getSueldo());

            //Ejercicio 3: Comparación de Fechas de Contrato
            //Enunciado:
            //Crea dos objetos Empleado, empleado3 y empleado4, con fechas de contrato diferentes.
            //Escribe un código que compare sus fechas de contrato y determine cuál fue contratado
            //primero.

            Date fechaContrato3 = new SimpleDateFormat("dd-MM-yyyy").parse("08-02-2022");
            Empleado empleado3 = new Empleado("Miguel", 1100, fechaContrato3);

            Date fechaContrato4 = new SimpleDateFormat("dd-MM-yyyy").parse("07-03-2022");
            Empleado empleado4 = new Empleado("Juan", 1071, fechaContrato4);

            int comparacion = empleado3.getFechaContrato().compareTo(empleado4.getFechaContrato());
            if (comparacion < 0) {
                System.out.println(empleado3.getNombre() + " Fue contratado primero");

            } else if (comparacion > 0) {
                System.out.println(empleado4.getNombre() + "Fue cotratado primero");

            }
            //Ejercicio 4: Lista de Empleados
            //Enunciado:
            //Crea una lista de tres empleados y muestra sus nombres y sueldos utilizando un bucle.
            //Solución Paso a Paso:
            //1. Crea una ArrayList de objetos Empleado.
            //2. Agrega tres empleados a la lista.
            //3. Utiliza un bucle (por ejemplo, un for-each) para recorrer la lista.
            //4. Dentro del bucle, utiliza los métodos dameNombre y dameSueldo para obtener y mostrar los
            //datos de cada empleado.

            ArrayList<Empleado> listaEmpleados = new ArrayList<>();
            Date fechaContrato5 = new SimpleDateFormat("dd-MM-yyyy").parse("01-05-2022");
            Empleado empleado5 = new Empleado("Paulo", 1200, fechaContrato5);
            listaEmpleados.add(empleado5);

            Date fechaContrato6 = new SimpleDateFormat("dd-MM-yyyy").parse("07-05-2022");
            Empleado empleado6 = new Empleado("Julia", 1209, fechaContrato6);
            listaEmpleados.add(empleado6);

            Date fechaContrato7 = new SimpleDateFormat("dd-MM-yyyy").parse("01-05-2022");
            Empleado empleado7 = new Empleado("Marco", 1119, fechaContrato7);
            listaEmpleados.add(empleado7);
            System.out.println();

            //Ejercicio 5: Aumento de Sueldo Condicionado
            //Enunciado:
            //Dada una lista de empleados, aumenta el sueldo en un 5% solo a aquellos que fueron
            //contratados antes de 2021. Muestra los nombres y los sueldos actualizados.

            Date fechaContrato8 = new SimpleDateFormat("dd-MM-yyyy").parse("02-07-2021");
            Empleado empleado8 = new Empleado("Ivan", 1304, fechaContrato8);
            listaEmpleados.add(empleado8);

            Date fechaContrato9 = new SimpleDateFormat("dd-MM-yyyy").parse("08-02-2022");
            Empleado empleado9 = new Empleado("Gregorio", 1209, fechaContrato9);
            listaEmpleados.add(empleado9);

            Date fechaContrato10 = new SimpleDateFormat("dd-MM-yyyy").parse("04-09-2021");
            Empleado empleado10 = new Empleado("Marco", 1098, fechaContrato10);
            listaEmpleados.add(empleado10);
            for (Empleado empleado : listaEmpleados) {
                ;
                if (empleado.getFechaContrato().getYear() < 2021) {
                    empleado.aumentoSueldo(5);

                }
            }
            for (Empleado empleado : listaEmpleados) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Sueldo: " + empleado.getSueldo() + ", Fecha de contratacion: " + empleado.getFechaContrato());
            }

        }

}
