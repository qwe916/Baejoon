import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> dwarfs = new ArrayList<Integer>();
        int dwarf = 9;
        while ( dwarf-->0) {
            int tall = Integer.parseInt(bufferedReader.readLine());
            dwarfs.add(tall);
        }
        Realdwarfs(dwarfs);
    }
    public static void Realdwarfs(ArrayList<Integer> dwarfs){
        int sum = 0;
        dwarfs.sort(Comparator.naturalOrder());
        for(int i = 0; i<dwarfs.size();i++){
            sum += dwarfs.get(i);
        }
        for(int j = 0; j<dwarfs.size();j++){
            if(dwarfs.contains(sum-100-dwarfs.get(j))){
                dwarfs.remove(dwarfs.indexOf(sum - 100 - dwarfs.get(j)));
                dwarfs.remove(dwarfs.get(j));
                break;
            }
        }
        for(int k = 0; k<dwarfs.size();k++){
            System.out.println(dwarfs.get(k));
        }
    }
}
