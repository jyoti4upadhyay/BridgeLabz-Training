public class Otp {
    public static int generateOtp(){
        return (int)(Math.random()*900000)+100000;
    }
    public static boolean OtpUnique(int[] otparr){
        for(int i=0;i<otparr.length;i++){
            for(int j=i+1;j<otparr.length;j++){
                if(otparr[i]==otparr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void displayOTPs(int[] otps) {
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
    }
     public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs 10 times
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOtp();
        }

        displayOTPs(otps);

        // Validate uniqueness
        if (OtpUnique(otps)) {
            System.out.println("All OTPs are UNIQUE");
        } else {
            System.out.println("Duplicate OTP found");
        }
    }
}
