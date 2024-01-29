package POOV;

import java.util.Date;

public class Empleado {
        //Enunciado:
        //Crea un objeto de la clase Empleado llamado empleado1, con tu nombre, un sueldo de 3000.0,
        //y una fecha de contrato del 1 de enero de 2022. Luego, imprime el nombre, sueldo y fecha de
        //contrato de empleado1.

        private String nombre;
        private double sueldo;
        private Date fechaContrato;

        public Empleado(String nombre, double sueldo, Date fechaContrato) {
            this.nombre = nombre;
            this.sueldo = sueldo;
            this.fechaContrato = fechaContrato;
        }

        public String getNombre() {
            return nombre;
        }


        public double getSueldo() {
            return sueldo;
        }


        public Date getFechaContrato() {
            return fechaContrato;

        }
        public void aumentoSueldo(double porcentaje){
            double incremento = sueldo * (porcentaje / 100);
            sueldo += incremento;

        }

    }

