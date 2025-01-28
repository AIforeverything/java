class p2{
    public int add(int n1,int n2){
        int results=n1+n2;
        return  results;
    }
}

public class P1{
    public static void main(String args[]){
        p2 a=new p2();
        int x=a.add(5,7);
        System.out.println(x);
    }
}