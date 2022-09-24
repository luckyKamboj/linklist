package search.linear;

public class FindMinMax {

        static int[] values = {12,53,645,76,34,346,57,7,56,86,8,786,8,6,45,3,536,457,47,8546,76,334};

        public static void main(String[] args) {
                System.out.println("Minimum of array is : " + getMinimumValue(values));
                System.out.println("Maximum of array is : " + getMaxValue(values));
        }

        private static int getMinimumValue(int[] arrElements) {
                if(arrElements == null){
                        return Integer.MAX_VALUE;
                }
                int minValue = Integer.MAX_VALUE;
                for (int val: arrElements ) {
                        if(minValue > val){
                                minValue = val;
                        }
                }
                return minValue;
        }

        private static int getMaxValue(int[] arrElements) {
                if(arrElements == null){
                        return Integer.MIN_VALUE;
                }
                int maxValue = Integer.MIN_VALUE;
                for (int val: arrElements ) {
                        if(maxValue < val){
                                maxValue = val;
                        }
                }
                return maxValue;
        }

}
