import java.util.*;
public class Main{
    public static  void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String ar=in.nextLine();
        int c=0;
        int cha=0;
        //老板的
        StringBuilder ab=new StringBuilder(a);
        //我的
        StringBuilder arb=new StringBuilder(ar);
        for(int i=0;i<arb.length();i++){
            //自己需要的珠串
            int b=0;
            for(int j=0;j<ab.length();j++){
                //老板给的珠串
                if(arb.charAt(i)==ab.charAt(j)){
                    c++;
                    b++;
                    //如果有，就从老板的删一个
                    ab.deleteCharAt(j);
                    //因为可能重复，所以找到一个删一个就跳出，不然会多删
                    break;
                }
            }
            if(b==0){
                //想要的某个珠子老板没有，也就是老板那缺少的珠子
                cha++;
            }
        }
        //从老板那删除的个数和我的想要的珠串个数是否相等
        if(c==arb.length()){
            //老板的减去我的串子数量，就是多余的
            System.out.println("Yes"+" "+(a.length()-ar.length()));
        }else{
            System.out.println("No"+" "+(cha));
        }
    }
}