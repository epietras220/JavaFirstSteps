package com.github.epietras220;


public class Test {


    public static void main(String[] args) {

        int suma=0;

        String liczbaRzymska = "MCCIX";
        char[] lista = liczbaRzymska.toCharArray();

        for ( int i =0; i<lista.length; i++){
            while (lista[i]=='M'){
                suma = suma+1000;
            } while(lista[i]=='D'){
                suma = suma+500;
            } while(lista[i] =='C'){
                if (lista[i+1] == 'D'){
                    suma = suma+400;
                }
                suma = suma+100;
            } while (lista[i]=='L'){
                suma = suma +50;
            } while(lista[i]=='X') {
                if (lista[i + 1] == 'C') {
                    suma = suma + 90;
                } else if (lista[i + 1] == 'L') {
                    suma = suma + 40;
                }
                suma = suma + 10;
            } while(lista[i] =='V'){
                suma = suma +5;
            } while (lista[i]=='I'){
                if (lista[i+1]=='V'){
                    suma=suma+4;
                } else if (lista[i+1]=='X'){
                    suma=suma+9;
                }
                suma=suma+1;
            }

























//        int liczba = 234;
//        char jeden ='I';
//        char piec = 'V';
//        char dziesiec = 'X';
//        char piecdziesiat = 'L';
//        char sto = 'C';
//        char piecset = 'D';
//        char tysiac = 'M';
//
//        int dziesiatki = liczba%10;
//        int setki = liczba%100;
//        int tysiace = liczba% 1000;
//
//        switch (dziesiatki){
//            case 1:
//                System.out.print(jeden);
//            case 2:
//                System.out.print(jeden*2);
//            case 3:
//                System.out.print(jeden*3);
//            case 4:
//                System.out.print(jeden+piec);


            }
        System.out.println(suma);


        }


    }



