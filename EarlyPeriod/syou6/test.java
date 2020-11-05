package syou6;

public class test {
    public static void main(String[] args) {
        int ans = 0;
        for(int i=1;i<=5;i++){
            switch (i){
                case 1:
                    ans +=10;
                    break;
                case 2:
                case 4:
                    ans *=2;
                    break;
                case 3:
                    ans /= 3;
                    break;
                default:
                    ans++;

            }
            System.out.println(ans);
        }
    }
}
