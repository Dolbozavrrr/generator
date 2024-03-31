

public class Main {
    public static void main(String[] args) {
        String[] wordList = {"абажурный", "абазинский", "абверовский", "абиогенный", "абонементный"};
        String[] wordList2 = {"баббитный", "баварский", "багажный", "багетный", " багорный"};
        String[] wordlist3 = {"вавилонский", "вагонеточный", "вагоноремонтный", "валеночный", "валлонский"};

        // A - длина массива
        int A1 = wordList.length;
        int A2 = wordList2.length;
        int A3 = wordlist3.length;

        int random1 = (int)(Math.random() * A1);
        int random2 = (int)(Math.random() * A2);
        int random3 = (int)(Math.random() * A3);

        String compliment = "В этот " + wordList[random1] +" день, ты сегодня " + wordList2[random2] + " и немножечко " + wordlist3[random3] + ", с чем я тебя и поздравляю!";
        String ps = "Оставайся таким же стеклопакетным, с 1 апреля!";
        System.out.println(compliment);
        System.out.println(ps);
    }
}