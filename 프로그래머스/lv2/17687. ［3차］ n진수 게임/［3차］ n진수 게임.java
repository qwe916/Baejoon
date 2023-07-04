class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int i = 1;
        sb.append(0);
        while(sb.length()<m*t) {
            sb.append(notation(i++,n));
        }
        
        for(int j=p-1; j<m*(t-1)+p; j+=m) {
            answer += sb.charAt(j);
        }
        return answer;
    }

    String notation(int num, int n) {
        String nStr = "";
        while(num!=0) {
            if(num%n<10)
                nStr = num%n + nStr;
            else 
                nStr = String.valueOf((char)(num%n + 55)) + nStr;
            num /= n;
        }
        return nStr;
    }
}