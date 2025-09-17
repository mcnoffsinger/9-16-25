public class NumberStairs {
    
    public static void main(String[] args) {
        String output = "";
        for(int i = 1;i<=10;i++){
            for (int j = 1;j<=i;j++ ){
                output += j;
            }
            System.out.println(output);
            output = "";
        }
    }




}
