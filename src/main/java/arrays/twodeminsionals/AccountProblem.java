package arrays.twodeminsionals;

public class AccountProblem {
  static  int [][] account = {
            {1234,645,65,56,45},
            {34,54,54,64,657,76,57,75,3},
            {654334,353,23},
            {654334,353,23},
            {23423,234342,4,2,4,34,2,3}
    };

    public static void main(String[] args) {
        System.out.println("Richest Player : " + getRichestPlayers(account));
    }

    private static String getRichestPlayers(int[][] account) {
        StringBuilder result = new StringBuilder();
        int previousResult = 0;
        for (int[] playerMoney: account) {
            int totalMoney = 0;
            for (int amount: playerMoney) {
                totalMoney = totalMoney + amount;
            }
            if(previousResult < totalMoney){
                previousResult = totalMoney;
                result = new StringBuilder();
                result.append(previousResult);
            }else if(previousResult == totalMoney){
                result.append(", ").append(totalMoney);
            }
        }
        return result.toString();
    }
}
