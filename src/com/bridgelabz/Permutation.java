package com.bridgelabz;

public class Permutation {
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
        private void permute(String str, int startindex, int endindex) {
            if (startindex == endindex)
                System.out.println(str);
            else {
                for (int i = startindex; i <= endindex; i++) {
                    str = swap(str, startindex, i);
                    permute(str, startindex + 1, endindex);
                    str = swap(str, startindex, i);
                }
            }
        }

        /**
         * Swap Characters at position
         *
         * @param a string value
         * @param i position 1
         * @param j position 2
         * @return swapped string
         */
        public String swap(String a, int i, int j) {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }
        public void permutationsOprations(){
            String str = "ABC";
            int n = str.length();
            Permutation permutation = new Permutation();
            permutation.permute(str, 0, n-1);
        }

}

