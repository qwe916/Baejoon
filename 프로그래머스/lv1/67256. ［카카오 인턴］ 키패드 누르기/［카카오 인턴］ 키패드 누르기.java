class Solution {
    public String solution(int[] numbers, String hand) {
       String answer = "";
        int lefthand = 10;
        int righthand = 12;
        for (int n : numbers
             ) {
            switch (n) {
                case 1 :case 4 :case 7 :
                    lefthand = n;
                    answer +="L";
                    break;
                case 3 :case 6 :case 9 :
                    righthand = n;
                    answer +="R";
                    break;
                case 2 :case 5 :case 8 :case 0 :
                    if (count(n, righthand) == count(n, lefthand)) {
                        if (hand.equals("right")) {
                            righthand = n;
                            answer += "R";
                            break;
                        } else {
                            lefthand = n;
                            answer += "L";
                            break;
                        }
                    }
                    if (count(n, righthand) > count(n, lefthand)) {
                        lefthand = n;
                        answer += "L";
                        break;
                    } else {
                        righthand = n;
                        answer += "R";
                        break;
                    }
            }
        }
        return answer;
    }
     public static int count(int n,int hand) {
        int count = 0;
        int tempn = (n == 0) ? 11 : n;
        int temphand = (hand == 0) ? 11 : hand;
        while (true) {
            if(temphand == tempn) break;
            if (temphand > tempn) {
                if (temphand - tempn >= 3) {
                    temphand -= 3;
                    count++;
                } else {
                    temphand -= 1;
                    count++;
                }
            } else {
                if (tempn - temphand >= 3) {
                    temphand += 3;
                    count++;
                } else {
                    temphand += 1;
                    count++;
                }
            }
        }
        return count;
    }
}