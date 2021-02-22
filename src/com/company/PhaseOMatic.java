package com.company;

public class PhaseOMatic {

    public static void main(String[] args) {
        String [] wordListOne = {"круглосуточный", "Токарь", "Луг", };
        String [] wordListTwo = {"Нурка", "Дорога", "фальш", "пик", "Торт", "Соша"};
        String [] wordListThree = {"Лука", "Фондан", "Архив", "дорадо", "вафелька", "ноут", "жаба", };
        String [] wordListFour = {"покер", "джокер", "карэ", "вальгалла","викинги"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = wordListFour.length;

        int rand1 = (int) (Math.random() * oneLength); // тут не понятно, зачем int в скобках - вообще не ясна структура
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour[rand4];

        System.out.println("Наши рандомные слова получились такими:" + phrase);



    }
}
