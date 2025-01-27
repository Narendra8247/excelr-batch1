package LeetCode;

public class LTCode007 {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    return digits;
                }
            }
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
    
        public static void main(String[] args) {
            LTCode007 solution = new LTCode007();
            int[] digits = {9, 9, 9};
            int[] result = solution.plusOne(digits);
    
            System.out.print("Result: ");
            for (int digit : result) {
                System.out.print(digit + " ");
            }
        }
    }