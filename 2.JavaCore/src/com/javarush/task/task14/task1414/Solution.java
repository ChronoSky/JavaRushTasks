package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String keyWord = "";
        Movie movie = null;
        do{
            keyWord = br.readLine();
            if (keyWord.equals("cartoon")){
                movie = MovieFactory.getMovie(keyWord);
                System.out.println(movie.getClass().getSimpleName());
            }else if(keyWord.equals("thriller")){
                movie = MovieFactory.getMovie(keyWord);
                System.out.println(movie.getClass().getSimpleName());
            }else if(keyWord.equals("soapOpera")){
                movie = MovieFactory.getMovie(keyWord);
                System.out.println(movie.getClass().getSimpleName());
            }else{
                movie = MovieFactory.getMovie(keyWord);
                break;
            }
        }while(true);


        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }else if("cartoon".equals(key)){
                movie = new Cartoon();
            }else if("thriller".equals(key)){
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6


            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3

    public static class Cartoon extends Movie{

    }

    public static class Thriller extends Movie{

    }
}
