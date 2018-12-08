/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.util;

/**
 *
 * @author DayannaSilva
 */
public class Validation {
    public boolean validationOfIdentifyCard(String identifyCard) {
        
        boolean correct_Identify_Card = false;
        try {
            if (identifyCard.length() == 10||identifyCard.length()==13 ) // ConstantesApp.LongitudCedula
            {
                int digit_region = Integer.parseInt(identifyCard.substring(0,2));
                if (digit_region >= 1 && digit_region <=24 ){//Varifica segun la provincia
                    int digitThree = Integer.parseInt(identifyCard.substring(2, 3));
                if (digitThree < 6) { //El tercer dígito es un número menor a 6 (0,1,2,3,4,5).
                    int[] coefValCard = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };//Los coeficientes usados para verificar el décimo dígito de la cédula, mediante el “Módulo 10”.
                    int checker = Integer.parseInt(identifyCard.substring(9,10));
                    int add = 0;
                    int digit = 0;
                    for (int i = 0; i < (identifyCard.length() - 1); i++) {
                        digit = Integer.parseInt(identifyCard.substring(i, i + 1))* coefValCard[i];
                        add += ((digit % 10) + (digit / 10));
                    }
                    if ((add % 10 == 0) && (add % 10 == checker)) {
                        correct_Identify_Card = true;
                    }
                    else if ((10 - (add % 10)) == checker) {
                        correct_Identify_Card = true;
                    } else {
                        correct_Identify_Card = false;
                    }
                } else {
                    correct_Identify_Card = false;
                }
                
                }else {
                    correct_Identify_Card = false;
                }                
                
            } else {
                correct_Identify_Card = false;
            }
        } catch (NumberFormatException e) {
            correct_Identify_Card = false;
        } catch (Exception er) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            correct_Identify_Card = false;
        }
        if (!correct_Identify_Card) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return correct_Identify_Card;
    }
}
