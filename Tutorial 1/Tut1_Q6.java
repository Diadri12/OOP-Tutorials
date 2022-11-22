package Tutorial1;

import java.util.Arrays;

public class Tut1_Q6 {
    static boolean checkvalue(){
        int lotterynum[] = new int[6];
        for (int i = 0; i < lotterynum.length; i++){
            int value = lotterynum[i];
            if (lotterynum[i] == value){
                return true;
        }
    }
        return false;
    }

    public static void main(String[] args) {
        int max = 49;
        int min = 1;
        int lotterynum[] = new int[6];
        for(int i = 1; i < lotterynum.length; i++){
                lotterynum[i] = (int)(Math.random()*(max - min)) + min;
                checkvalue();
        }
        System.out.println(Arrays.toString(lotterynum));
    }
}
