
package quiz1sistemas;

import java.util.Scanner;

public class App {
    public static int calcularValorBoleta( String Boleta , int  NumeroBoletas ){
        try{
            int VALOR_BOLETA = 0 , Operacion = 0;
            

            switch (Boleta) {
                case "G":
                        VALOR_BOLETA = 10000;
                    break;
                case "V":
                        VALOR_BOLETA = 15000;
                break ;   
            
                default:
                        System.out.println("Error del Datos incorrectos");
                    break;
            }

            Operacion = VALOR_BOLETA * NumeroBoletas;

            
    
    
            return Operacion;   //INGRESAMOS LO QUE VAMOS A DEVOLVER ALA FUNCION
        }
        catch (Exception e){
            
            return -1;
        
      }
    }

    public static int calcularValorNetoCombo( int NumeroCombo , int UCombos){
        try {
             long ValorCombo = 0;
             int OPERACION = 0;

            switch (NumeroCombo) {
                case 1:
                        ValorCombo = 40000;
                    break;
                case 2:
                        ValorCombo = 30000;
                    
                    break;
                case 3:
                        ValorCombo = 42000;
                    break;    
            
                default:
                        System.out.println("VALOR INCORRECTO");
                    break;
            }

                OPERACION =(int) ValorCombo * UCombos;





            return OPERACION;
            
        } catch (Exception e) {
           return -1;
        }
    }

        public static int calcularDescuentoCombo (String Boleta , int NumeroCombo ,  int calcularValorNetoCombo){
            try {
                double Descuento = 0;
                
                

                switch (Boleta) {
                    case "G":
                            Descuento = calcularValorNetoCombo;
                               
                            
                        break;
                    case "V":
                             if( NumeroCombo == 1 ){
                                Descuento = (calcularValorNetoCombo*0.05)/ 100;
                             }else if (NumeroCombo == 2){
                                Descuento = (calcularValorNetoCombo*0.06)/ 100;

                             } else if (NumeroCombo == 3){
                                Descuento = (calcularValorNetoCombo*0.03)/ 100;
                             }else{
                               
                             }

                            
                    break ;   
                
                    default:
                            System.out.println("Error del Datos incorrectos");
                        break;
                }
                return (int) Descuento;
            } catch (Exception e) {
                return -1;
            }
    }
    
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        try {
            byte NumeroCombo = 0 ;
            String Boleta = "";
            short NumeroBoletas = 0 , UCombos = 0 ;
            
            System.out.println("INGRESA TIPO DE BOLETA QUIERES COMPRAR ? ");
            System.out.println("G: General  Valor $ 10.000");
            System.out.println("V: VIP  Valor $ 15.000");
            Boleta = en.nextLine();

            System.out.println("CUANTAS BOLETAS QUIERES COMPRAR ?");
            NumeroBoletas = en.nextShort();

            System.out.println("QUE COMBO DESEAS COMPRAR ? :");
            System.out.println("1.Combo #1: Hamburguesa y Perro caliente  Valor $ 40.000");
            System.out.println("2.Combo #2: Crispetas con dos Gaseosas Valor $ 30.000");
            System.out.println("3.Combo #3: Dos Perros calientes con Dos Gaseosas  Valor $ 42.000");
            NumeroCombo = en.nextByte();

            System.out.println("CUANTOS COMBOS ?");
            UCombos = en.nextShort();


          
            
        } catch (Exception e) {
            System.out.println("ERROR DEL PROGRAMA" + e);
        }

       
    }

    /*  1 Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  2 Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  3 Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /* 4  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}
