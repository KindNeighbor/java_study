package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    Random random = new Random();

    public static void main(String[] args) {
        RandomNumberMaker rnm = new RandomNumberMaker();
        rnm.makeRandomNumbers(10);
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> numberSet = new HashSet<Integer>();
        do {
            int tempNumber = random.nextInt(45);
            numberSet.add(tempNumber);
        } while (numberSet.size() != 6);
        return numberSet;
    }

    public void makeRandomNumbers(int count) {
        for(int i=0;i<count;i++){
            HashSet<Integer> set = getSixNumber();
            System.out.println(set);
        }
    }
}
