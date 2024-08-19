package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> words = detectAllWords(crossword, "home", "same");
        for (Word word : words) {
            System.out.println(word);
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> result = new ArrayList<>();
        for (String word : words) {
            int len = word.length();
            int firstSimbol = word.charAt(0);
            boolean find = false;
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {
                    //System.out.println(" --- " + (char)crossword[i][j] + " --- ");
                    if (crossword[i][j] == firstSimbol) {
                        // проверка идти назад
                        if (j - (len - 1) >= 0) {
                            find = true;
                            for (int k = 1; k < len; k++) {
                                if (crossword[i][j - k] != (int) word.charAt(k)) {
                                    find = false;
                                    break;
                                }
                            }
                            if (find) {
                                Word w = new Word(word);
                                w.setStartPoint(j, i);
                                w.setEndPoint(j - (len - 1), i);
                                result.add(w);
                            }
                        }
                        // проверка идти вперед
                        if (j + (len - 1) < crossword[i].length) {
                            find = true;
                            for (int k = 1; k < len; k++) {
                                if (crossword[i][j + k] != (int) word.charAt(k)) {
                                    find = false;
                                    break;
                                }
                            }
                            if (find) {
                                Word w = new Word(word);
                                w.setStartPoint(j, i);
                                w.setEndPoint(j + len - 1, i);
                                result.add(w);
                            }
                        }
                        // проверка идти вверх
                        if (i - (len - 1) >= 0) {
                            find = true;
                            for (int k = 1; k < len; k++) {
                                if (crossword[i - k][j] != (int) word.charAt(k)) {
                                    find = false;
                                    break;
                                }
                            }
                            if (find) {
                                Word w = new Word(word);
                                w.setStartPoint(j, i);
                                w.setEndPoint(j, i - (len - 1));
                                result.add(w);
                            }
                        }
                        // проверка идти вниз
                        if (i + (len - 1) < crossword.length) {
                            find = true;
                            for (int k = 1; k < len; k++) {
                                if (crossword[i + k][j] != (int) word.charAt(k)) {
                                    find = false;
                                    break;
                                }
                            }
                            if (find) {
                                Word w = new Word(word);
                                w.setStartPoint(j, i);
                                w.setEndPoint(j, i + (len - 1));
                                result.add(w);
                            }
                        }

                        // проверка идти назад-вверх
                        if (j - (len - 1) >= 0 && i - (len - 1) >= 0) {
                            find = true;
                            for (int k = 1; k < len; k++) {
                                if (crossword[i - k][j - k] != (int) word.charAt(k)) {
                                    find = false;
                                    break;
                                }
                            }
                            if (find) {
                                Word w = new Word(word);
                                w.setStartPoint(j, i);
                                w.setEndPoint(j - (len - 1), i - (len - 1));
                                result.add(w);
                            }
                        }

                        // проверка идти вперед-вверх
                        if (j + (len - 1) < crossword[i].length && i - (len - 1) >= 0) {
                            find = true;
                            for (int k = 1; k < len; k++) {
                                if (crossword[i - k][j + k] != (int) word.charAt(k)) {
                                    find = false;
                                    break;
                                }
                            }
                            if (find) {
                                Word w = new Word(word);
                                w.setStartPoint(j, i);
                                w.setEndPoint(j + (len - 1), i - (len - 1));
                                result.add(w);
                            }
                        }

                        // проверка идти вперед-вниз
                        if (j + (len - 1) < crossword[i].length && i + (len - 1) < crossword.length) {
                            find = true;
                            for (int k = 1; k < len; k++) {
                                if (crossword[i + k][j + k] != (int) word.charAt(k)) {
                                    find = false;
                                    break;
                                }
                            }
                            if (find) {
                                Word w = new Word(word);
                                w.setStartPoint(j, i);
                                w.setEndPoint(j + (len - 1), i + (len - 1));
                                result.add(w);
                            }
                        }

                        // проверка идти назад-вниз
                        if (j - (len - 1) >= 0 && i + (len - 1) < crossword.length) {
                            find = true;
                            for (int k = 1; k < len; k++) {
                                if (crossword[i + k][j - k] != (int) word.charAt(k)) {
                                    find = false;
                                    break;
                                }
                            }
                            if (find) {
                                Word w = new Word(word);
                                w.setStartPoint(j, i);
                                w.setEndPoint(j - (len - 1), i + (len - 1));
                                result.add(w);
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
