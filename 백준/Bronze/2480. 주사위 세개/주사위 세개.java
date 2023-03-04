import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ju_1 = sc.nextInt();
        int ju_2 = sc.nextInt();
        int ju_3 = sc.nextInt(); 

        if((ju_1==ju_2)&&(ju_2==ju_3)){ 
            System.out.println(10000 + ju_1 * 1000);
        }else if((ju_1==ju_2) || (ju_2==ju_3) || (ju_1 == ju_3)){ 
            if((ju_1==ju_2)||(ju_1 == ju_3)){ 
                System.out.println(1000 + ju_1 * 100);
            }else { 
                System.out.println(1000 + ju_2 * 100);
            }
        }else { //　주사위 수가 다 다른 경우
            if((ju_1 > ju_2) && (ju_1 > ju_3)){  
                System.out.println(ju_1 * 100);
            }else if((ju_2>ju_3)&&(ju_2>ju_1)){ 
                System.out.println(ju_2 * 100);
            }else { 
                System.out.println(ju_3 * 100); 
            }
        }

        sc.close();
    }
    
}