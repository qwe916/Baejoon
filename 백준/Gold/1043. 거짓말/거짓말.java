import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Person = Integer.parseInt(st.nextToken());//사람 수
        int Party = Integer.parseInt(st.nextToken());//파티 수

        st = new StringTokenizer(br.readLine());
        int knowNum = Integer.parseInt(st.nextToken());//진실을 아는 사람의 수
        boolean[] knowPeople;

        //진실을 아는 사람이 없다면 파티의 수를 출력하고 바로 종료
        if(knowNum == 0){
            System.out.println(Party);
            return;
        }
        //자신과 연결된 루트 노드를 설정
        parent = new int[Person+1];//부모 노드를 나타내는 배열
        for(int i = 1; i<=Person; i++)
            parent[i] = i;//각 사람마다 make-set을 한 상태(부모가 자기 자신)

        //진실을 아는 사람들의 배열을 생성 및 초기화
        knowPeople = new boolean[Person+1];
        for(int i = 0; i<knowNum; i++) {
            int num = Integer.parseInt(st.nextToken());
            knowPeople[num] = true;
        }

        //파티마다 참여한 사람들의 목록을 생성
        List<List<Integer>> partyList = new ArrayList<>();
        for(int i = 0; i<Party; i++)
            partyList.add(new ArrayList<>());

        for(int i = 0; i<Party; i++){
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());//파티 참가 인원
            for(int j = 0; j<num; j++) {
                partyList.get(i).add(Integer.parseInt(st.nextToken()));//파티에 참가한 사람

                //같이 파티에 참가한 사람을 확인
                if(j != 0){//2사람 부터
                    int nowIdx = partyList.get(i).get(j);
                    int exIdx = partyList.get(i).get(j-1);

                    union(exIdx, nowIdx);//전 사람들과 Union
                }
            }
        }
        
        //partyList에 Union된 집합들을 다시 Union
        boolean[] visited = new boolean[Person+1];
        for(int i = 1; i<=Person; i++){
            if(knowPeople[i] && !visited[i]) {//진실을 아는 사람이지만 방문을 하지 않은 사람
                int root = find(i);//root 찾기

                for (int j = 1; j <= Person; j++) {
                    if(find(j) == root){//진실을 아는 사람과 같은 부모를 가르키는 사람
                        knowPeople[j] = true;//그 사람은 이제 진실을 아는 사람이 된다.
                        visited[j] = true;//해당 사람은 방문 완료
                    }
                }
            }
        }

        //파티에 진실을 아는 사람이 있는지 확인
        boolean[] goParty = new boolean[Party];
        Arrays.fill(goParty, true);
        //PartyList을 반복문을 돌면서 진실을 아는 사람이 있는 파티는 갈 수 없다.
        for(int i = 0; i<Party; i++){
            for(int j = 1; j<=Person; j++){
                if(knowPeople[j]){
                    if(partyList.get(i).contains(j))//진실을 아는 사람이 있는 지 여부 확인
                        goParty[i] = false;//있다면 해당 파티는 갈 수 없다.
                }
            }
        }

        int sum = 0;
        for(int i = 0; i<Party; i++)
            if(goParty[i])
                sum++;

        System.out.println(sum);
    }

    //자신과 연결된 노드의 루트 노드를 탐색
    static int find(int idx){
        if(parent[idx] == idx)//자기 자신이 부모
            return idx;
        else {//부모가 다른 이라면 그 부모의 부모를 재귀를 통해 구한 후 저장
            parent[idx] = find(parent[idx]);
            return parent[idx];
        }
    }

    //연결된 노드가 다르다면 연결해줌
    static void union(int idx1, int idx2){
        int parent1 = find(idx1);
        int parent2 = find(idx2);

        if(parent1 != parent2)//Union 하려는 두 집합의 부모가 다르다면
            parent[parent2] = parent1;//두 집합 연결
    }
}