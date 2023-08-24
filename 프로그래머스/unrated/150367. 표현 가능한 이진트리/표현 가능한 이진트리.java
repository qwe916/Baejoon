class Solution {
	private int result = 1;
	
    public int[] solution(long[] numbers) {
    	int[] answer = new int[numbers.length];
    	
    	for(int i = 0 ; i < numbers.length ; i++) {
    		String binaryStr = Long.toBinaryString(numbers[i]);

    		
    		int len = binaryStr.length();
    		int depth = 1;
    		int nodeCnt = 0;
    		
    		while((nodeCnt = (int)Math.pow(2, depth) -1) < len) {
    			depth++;
    		}

    		boolean[] binary = new boolean[nodeCnt];
    		int index = nodeCnt - len;
    		for(int j = 0 ; j < len ; j++) {
    			binary[index++] = (binaryStr.charAt(j) == '1');
    		}
    		
    		result = 1;
    		validTree(binary, 0, nodeCnt-1);
    		answer[i] = result;
    	}
        return answer;
    }
    
    
    void validTree(boolean[] target, int start, int end) {
    	if(start == end) return;
    	
    	int root = getRootIndex(start, end);
    	boolean m = target[root];
    	boolean l = target[getRootIndex(start, root-1)];
    	boolean r = target[getRootIndex(root+1, end)];
    	
    	if( !m && (l || r) ) {
    		result = 0;
    		return;
    	}
    	
        validTree(target, start, root-1);

        validTree(target, root+1, end);
    	
    	return;
    }
    
    
    int getRootIndex(int start, int end) {
    	return (start + end) / 2;
    } 
}

