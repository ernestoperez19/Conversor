package com.Conversor.javax.swing;

import javax.swing.JOptionPane;
public class ConversorDivisasJOptionPane {
    
    public static void main(String[] args) {
    	 String[] opciones = {"Conversor de Monedas", "Conversor de Temperaturas"};

         // MOSTRAR CUADRO DE DIALOGO PARA SELECCIONAR LA OPCION
         int opcionSeleccionada = JOptionPane.showOptionDialog(null,
                 "Seleccione la opción:",
                 "Conversores",
                 JOptionPane.DEFAULT_OPTION,
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 opciones,
                 opciones[0]);

         if (opcionSeleccionada == 0) {
             convertirDivisas();
         } else if (opcionSeleccionada == 1) {
             convertirTemperaturas();
         } else {
             JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
         }
     }

     private static void convertirDivisas() {
         // ... (CODIGO DEL CONVERSOR DE MONEDAS)
    	 String[] opciones1 = {"MXN a Dólar", "Dólar a MXN", "MXN a Euro", "Euro a MXN", "MXN a Libra Esterlina", "Libra Esterlina a MXN",
                 "MXN a Yen Japonés", "Yen Japonés a MXN", "MXN a Won Surcoreano", "Won Surcoreano a MXN"};
         
               
         // MOSTRAR CUADRO DE DIALOGO PARA SELECCIONAR LA OPCION
         int opcionSeleccionada = JOptionPane.showOptionDialog(null,
                 "Seleccione la opción:",
                 "Conversor de Divisas",
                 JOptionPane.DEFAULT_OPTION,
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 opciones1,
                opciones1[0]);
         		
        		

         if (opcionSeleccionada >= 0 && opcionSeleccionada < opciones1.length) {
             String montoString = JOptionPane.showInputDialog("Ingrese el monto a Convertir:");

             try {
                 double monto = Double.parseDouble(montoString);
                 double resultado = 0;

                 switch (opcionSeleccionada) {
                 case 0: // MNX a DOLAR
                     resultado = monto / 16.86; // TIPO DE CAMBIO: 1 USD = 16.77 MNX
                     JOptionPane.showMessageDialog(null, "El monto en Dólar es: " + resultado);
                     break;
                 case 1: // DOLAR a MNX
                     resultado = monto * 16.86; // TIPO DE CAMBIO: 16.77 MNX = 1 USD 
                     JOptionPane.showMessageDialog(null, "El monto en MXN es: " + resultado);
                     break;
                 case 2: // MNX a Euro
                     resultado = monto / 18.52; // TIPO DE CAMBIO: 1 EUR = 18.52 MNX
                     JOptionPane.showMessageDialog(null, "El monto en Euro es: " + resultado);
                     break;
                 case 3: // Euro a MNX
                     resultado = monto * 18.52; // TIPO DE CAMBIO: 18.52 MNX = 1 EUR 
                     JOptionPane.showMessageDialog(null, "El monto en MXN es: " + resultado);
                     break;
                 case 4: //  MNX a LIBRA ESTERLINA
                     resultado = monto /21.58; // TIPO DE CAMBIO: 1 GBP = 21.58 MNX
                     JOptionPane.showMessageDialog(null, "El monto en Libra Esterlina es: " + resultado);
                     break;
                 case 5: // LIBRA ESTERLINA a MNX
                     resultado = monto * 21.58; // TIPO DE CAMBIO: 21.58 MNX = 1 GBP 
                     JOptionPane.showMessageDialog(null, "El monto en MXN es: " + resultado);
                     break;
                 case 6: // MNX a YEN JAPONES
                     resultado = monto / 0.12; // TIPO DE CAMBIO: 1 JPY = 0.12 MNX
                     JOptionPane.showMessageDialog(null, "El monto en Yen Japonés es: " + resultado);
                     break;
                 case 7: // YEN JAPONES a MNX
                     resultado = monto * 0.12; // TIPO DE CAMBIO: 0.12 MNX = 1 JPY 
                     JOptionPane.showMessageDialog(null, "El monto en MXN es: " + resultado);
                     break;
                 case 8: // MNX a WON SURCOREANO
                     resultado = monto / 0.013; // TIPO DE CAMBIO: 1 KRW = 0.013 MNX
                     JOptionPane.showMessageDialog(null, "El monto en Won Surcoreano es: " + resultado);
                     break;
                 case 9: // WON SURCOREANO a MNX
                     resultado = monto * 0.013; // TIPO DE CAMBIO:  0.013 MNX = 1 KRW
                     JOptionPane.showMessageDialog(null, "El monto en MXN es: " + resultado);
                     break;
                 }
             } 
             catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "Ingrese un monto válido", "Error", JOptionPane.ERROR_MESSAGE);
             }
         } 
         else {
             JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
         }
     
     }

     private static void convertirTemperaturas() {
         String[] opcionesTemp = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};

         // MOSTRAR CUADRO DE DIALOGO PARA SELECCIONAR LA OPCION DE TEMPERATURA.
         int opcionSeleccionada = JOptionPane.showOptionDialog(null,
                 "Seleccione la opción:",
                 "Conversor de Temperaturas",
                 JOptionPane.DEFAULT_OPTION,
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 opcionesTemp,
                 opcionesTemp[0]);

         if (opcionSeleccionada >= 0 && opcionSeleccionada < opcionesTemp.length) {
             String temperaturaString = JOptionPane.showInputDialog("Ingrese la temperatura:");

             try {
                 double temperatura = Double.parseDouble(temperaturaString);
                 double resultado = 0;

                 switch (opcionSeleccionada) {
                     case 0: // CELSIUS A FAHRENHEIT. 
                         resultado = (temperatura * 9 / 5) + 32;
                         JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es: " + resultado);
                         break;
                     case 1: // FAHRENHEIT A CELSIUS. 
                         resultado = (temperatura - 32) * 5 / 9;
                         JOptionPane.showMessageDialog(null, "La temperatura en Celsius es: " + resultado);
                         break;
                 }
             } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "Ingrese una temperatura válida", "Error", JOptionPane.ERROR_MESSAGE);
             }
         } else {
             JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
		
    	
        
    }



