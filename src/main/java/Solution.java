public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length() >= 2) {
            if (x.substring(x.length() - 2, x.length()).equals("ly")) {
                return true;
            }
        }
        return false;
    }

    public String conCat(String s1, String s2) {
        String result = s1 + s2;
        if (s1.length() > 0 && s2.length() > 0) {
            if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
                result = s1 + s2.substring(1);
            }
        }
        return result;
    }

    public String withoutX(String s1) {
        if (s1.length() > 0 && s1.charAt(0) == 'x') {
            s1 = s1.substring(1);
        }
        if (s1.length() > 0 && s1.charAt(s1.length() - 1) == 'x') {
            s1 = s1.substring(0, s1.length() - 1);
        }
        return s1;
    }

    public String fizzString(String s1) {
        if (s1.length() > 0 && s1.charAt(0) == 'f') {
            if (s1.length() > 0 && s1.charAt(s1.length() - 1) == 'b') {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (s1.length() > 0 && s1.charAt(s1.length() - 1) == 'b') {
            return "Buzz";
        }
        return s1;
    }

    public String fizzString2(int x) {
        String s1 = String.valueOf(x);
        if ( x % 3 == 0) {
            if (x % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz!";
        } else if (x % 5 == 0) {
            return "Buzz";
        }
        String result= s1 + "!";
        return result;
    }

}
