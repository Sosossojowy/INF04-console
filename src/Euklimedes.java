public class Euklimedes {
    public int zrob(int a, int b){

        while(a!=b){
            if (a>b){
                a-=b;
            }else b-=a;
        }
        return  a;
    }

}
