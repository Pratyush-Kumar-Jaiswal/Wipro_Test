public class ASCII_Sum {
    public static void main(String[] args) {
        String s="Hello Hii";

        int flag=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&& c<='Z')){
                flag=0;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println(1);
            return;
        }
        System.out.println(s.charAt(0)+s.charAt(s.length()-1));
    }
}
