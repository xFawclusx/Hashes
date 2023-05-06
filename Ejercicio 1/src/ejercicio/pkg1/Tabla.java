package ejercicio.pkg1;

public class Tabla {
    Empleado[] T;
    
     public Tabla(){
         this.T=new Empleado[1000];
     }
     //metodo de aritmetica MODULAR
     public int aModular(int x){
         return x%997;
     }
     //METODO DE MULTIPLICACION
     public int multiplicacion(int x){
         int resultado;
         int cantPosiciones = 1024;
         Double n, R=0.618034;
         n = x*R - Math.floor(x*R);
         resultado = (int)(cantPosiciones*n);
         return resultado;        
     }
          
     //METODO DE PLEGAMIENTO
     public int plegamiento(int x){
         String palabra, mitadUno, mitadDos;
         int auxUno, auxDos, resultado;
         palabra = String.valueOf(x);
         int longDigito=palabra.length()/2;
         mitadUno=palabra.substring(0,longDigito);
         mitadDos=palabra.substring(longDigito, palabra.length());
         auxUno=Integer.valueOf(mitadUno);
         auxDos=Integer.valueOf(mitadDos);
         resultado=auxUno+auxDos;
         if(resultado>999){
            resultado=resultado-1000;
         }
         return resultado;
     }
     
     //METODO DEMITAD DEL CUADRADO
     public int mitadCuadrado(int x){
         long y=x;
         long r;
         int resultadoFinal;
         String aux;
         r = y*y;
         String num=String.valueOf(r);
         int longMitad = num.length()/2;
         aux=num.substring(longMitad, longMitad+3);
         resultadoFinal=Integer.valueOf(aux);
         return resultadoFinal;   
     }
     
     public void Insertar(Empleado e){
         //T[aModular(e.id)]=e;
         T[multiplicacion(e.id)]=e;
         //T[plegamiento(e.id)]=e;
         //T[mitadCuadrado(e.id)]=e;
     }
     public String getNombre(int id){
         return T[id].getNombre();
     }
     public String getPuesto(int id){
         return T[id].getPuesto();
     }
     public Double getSalario(int id){
         return T[id].getSalario();
     }    
}
