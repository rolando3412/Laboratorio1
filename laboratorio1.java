import java.util.Scanner;

public class laboratorio1 {

  public static void main(String[] args) {
    /*?La oficina de admiciones de un instituto tegnologico desea calcular 
            cuanto tiene que pagar un estudiante anualmente si el
          - #1 Precio de la matricula es de 400.00 lps
          - #2 El precio por cada asignatura es de 150.00 lps 
          - #3 El costo de laboratorio es de 15%  del total de costo de asignatura 
          - #4 El costo mensual por el uso de materiales (10 meses) esta dado como un 
               40% del triple de la edad del estudiante, 
         */

    Scanner entrada = new Scanner(System.in);

    //!VARIABLES DE ENTRADA
    String Nombre;
    int Numero_De_Cuenta ;
    int Edad;
    int Costo_Asignatura ;
    int Cantidad_De_Asignaturas;
    double Total_Costo_De_Asignaturas;
    double Total_Uso_De_Laboratorios;
    double Total_Uso_De_Materiales;
    double Pago_Total;
    double D1;
    double D2;
    double D3;

    System.out.println("Ingrese_Su_Nombre");
    Nombre = entrada.nextLine();
    System.out.println("Ingrese_Su_Numero_De_Cuenta");
    Numero_De_Cuenta = entrada.nextInt();
    System.out.println("Ingrese_Su_Edad");
    Edad = entrada.nextInt();
    System.out.println("Ingrese_La_Cantidad_De_Asignaturas");
    Cantidad_De_Asignaturas = entrada.nextInt();

    // PROSESO DE DATOS

    D1 = Total_Costo_De_Asignaturas = Cantidad_De_Asignaturas * 150;

    D2 = Total_Uso_De_Laboratorios = Cantidad_De_Asignaturas * 0.15;

    D3 = Total_Uso_De_Materiales = (Edad * 3) * (0.40) * 10;

    Pago_Total = D1 + D2 + D3;

    
    //! SALIDAS DE CALCULO
    System.out.println("Pago_Total_Por_Asignaturas_ES;           " + D1);

    System.out.println("Pago_Total_Por_Uso_De_Laboratorios_ES:   " + D2);

    System.out.println("Pago_Total_Por_Uso_De_Materiales_ES:     " + D3);
    
    System.out.println("El_Total_A_Pagar_Es:                     "+ Pago_Total );




  }


}
