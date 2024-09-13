public class pow4 {
    public static boolean powerOfFour(int n){
        if(n==1){
            return true; 
        }
        else if(n%4!=0 || n==0){
            return false;
        }
        else{
            return powerOfFour(n/4);
        }
    }
    public static void main(String[] args) {
        System.out.println(powerOfFour(16)); // true
        System.out.println(powerOfFour(12)); //false
        System.out.println(powerOfFour(64)); //true
        System.out.println(powerOfFour(0));  //false
    }   
}
