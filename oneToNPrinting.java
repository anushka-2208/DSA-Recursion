public class oneToNPrinting{
    public static void main(String[] args) {
        prnt(1,7);
    }
    public static void prnt(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        prnt(i+1,n);

    }
    public static void revStr(String a){
        for(int indx = a.length()-1; indx>=0; indx++){
            System.out.println(indx);
        }
    }
}

