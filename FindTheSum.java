import java.util.*;


public class FindTheSum {

    public static void main(String[] args) {
        char[] arr1={'G','Q','R'};
        char[] arr2={'R','T','U'};

        Set<Character> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                set.remove(arr2[i]);
            }
            else{
                set.add(arr2[i]);
            }
        }
        int sum1=0;
        for(char c:set){
            sum1+=(int)c;
        }
        
        while(sum1>10){
            int sum=0;
            while(sum1!=0){
                int digit=sum1%10;
                sum+=digit;
                sum1/=10;
            }
            sum1=sum;
        }
        System.out.println(sum1);;
    }
}
