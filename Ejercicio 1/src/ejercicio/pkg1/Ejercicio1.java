package ejercicio.pkg1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Empleado eUno, eDos, eTres;
        //Definimos 3 empleados con sus respectivos atributos;
        eUno = new Empleado(245643, "Facundo", 1500000.00);
        eDos = new Empleado(245981, "Joel", 90000.0);
        eTres = new Empleado(257135, "Lautaro", 2000000.00);
        
        Tabla tablilla = new Tabla();
        tablilla.Insertar(eUno);
        tablilla.Insertar(eDos);
        tablilla.Insertar(eTres);
        int posicion;
        //ARITMETICA
        /*posicion = tablilla.aModular(eUno.id);
        System.out.println("========================");
        System.out.println("Empleado UNO: ");
        System.out.println("Nombre: " + tablilla.getNombre(posicion));
        System.out.println("Salario: " + tablilla.getSalario(posicion));
        System.out.println("Posicion: " + posicion);
        System.out.println("========================");
        System.out.println("========================");
        posicion = tablilla.aModular(eDos.id);
        System.out.println("Empleado DOS: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        System.out.println("========================");
        System.out.println("========================");
        posicion = tablilla.aModular(eTres.id);
        System.out.println("Empleado TRES: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        */
        
        
        
        
        //MULTIPLICACION
        posicion = tablilla.multiplicacion(eUno.id);
        System.out.println("========================");
        System.out.println("Empleado UNO: ");
        System.out.println("Nombre: " + tablilla.getNombre(posicion));
        System.out.println("Salario: " + tablilla.getSalario(posicion));
        System.out.println("Posicion: " + posicion);
        System.out.println("========================");
        System.out.println("========================");
        posicion = tablilla.multiplicacion(eDos.id);
        System.out.println("Empleado DOS: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        System.out.println("========================");
        System.out.println("========================");
        posicion = tablilla.multiplicacion(eTres.id);
        System.out.println("Empleado TRES: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        
        
        
        //PLEGAMIENTO
        /*posicion = tablilla.plegamiento(eUno.id);
        System.out.println("========================");
        System.out.println("Empleado UNO: ");
        System.out.println("Nombre: " + tablilla.getNombre(posicion));
        System.out.println("Salario: " + tablilla.getSalario(posicion));
        System.out.println("Posicion: " + posicion);
        System.out.println("========================");
        System.out.println("========================");
        posicion = tablilla.plegamiento(eDos.id);
        System.out.println("Empleado DOS: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        System.out.println("========================");
        System.out.println("========================");
        posicion = tablilla.plegamiento(eTres.id);
        System.out.println("Empleado TRES: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        */
        
        
        //MITAD DEL CUADRADO
        /*posicion = tablilla.mitadCuadrado(eUno.id);
        System.out.println("========================");
        System.out.println("Empleado UNO: ");
        System.out.println("Nombre: " + tablilla.getNombre(posicion));
        System.out.println("Salario: " + tablilla.getSalario(posicion));
        System.out.println("Posicion: " + posicion);
        System.out.println("========================");
        System.out.println("========================");
        posicion = tablilla.mitadCuadrado(eDos.id);
        System.out.println("Empleado DOS: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        System.out.println("========================");
        System.out.println("========================");
        posicion = tablilla.mitadCuadrado(eTres.id);
        System.out.println("Empleado TRES: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        */
        
    }
    
}
