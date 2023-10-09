package Train;

import java.util.Arrays;

public class LatihanJava {
    public static void main(String[] args) {

        /*
        // Challenge 1
        int hasilChallengeSatu = challengeSatu(new int[]{1, 2});
        System.out.println(hasilChallengeSatu);

        // Challenge 2
        String hasilChallengeDua = challengeDua("2", "2");
        System.out.println(hasilChallengeDua);

        // challenge 3
        int sumChallengeThree = challengeThree("2", "2", "subtract");
        System.out.println(sumChallengeThree);

        // challenge 4
        String challengeFour = challengeFour(-1234);
        System.out.println(challengeFour);

        // challenge 5
        boolean challengeFive = challengeFive(1,5,7,4,1);
        System.out.println(challengeFive);

        // challenge 6
        int challengeSix = challengeSix('a');
        System.out.println(challengeSix);

        //challenge 7
        boolean challengeSeven = challengeSeven("3 4 2013");
        System.out.println(challengeSeven);

        // challenge 8
        String challengeEight = challengeEight(new int[]{1, 2, 7, 4});
        System.out.println(challengeEight);

        // challenge 9
        String challengeNine = challengeNine("Hello my friend");
        System.out.println(challengeNine);

        // challenge 10
        boolean challengeTen = challengeTen("123456");
        System.out.println(challengeTen);

        // challenge 11
        boolean challengeEleven = challengeEleven(14);
        System.out.println(challengeEleven);

         */
    }
    static int challengeSatu(int[] arr){
        int jumlah =0;
        int i;
        for(i = 0; i < arr.length;i++){
            jumlah+=arr[i];
        }
        return jumlah;
    }
    static String challengeDua(String satu, String dua){
        int jumlahAngka = 0;
        int angkaSatu = Integer.parseInt(satu);
        int angkaDua = Integer.parseInt(dua);
        jumlahAngka = angkaSatu+angkaDua;

        String jumlah = Integer.toString(jumlahAngka);
        return jumlah;
    }
    static int challengeThree(String a, String b, String op){
        int numberOne = Integer.parseInt(a);
        int numberTwo = Integer.parseInt(b);
        int sum = 0;
        if(op.equalsIgnoreCase("add")){
            sum = numberOne + numberTwo;
        } else if(op.equalsIgnoreCase("subtract")){
            sum = numberOne - numberTwo;
        } else if(op.equalsIgnoreCase("divide")){
            sum = numberOne / numberTwo;
        } else {
            System.out.println("INVALID INPUT");
        }
        return sum;
    }
    static String challengeFour(int n){
        String nString = Integer.toString(n);
        int i;
        String newNstring = "";
        for(i = 0; i < nString.length(); i++){
            char a = nString.charAt(i);
            if(Character.isDigit(a)){
                newNstring+=a;
            }
        }
        String[] NumberStringArray = newNstring.split("");
        String temp = "";
        for(i = NumberStringArray.length-1; i >= 0; i--){
            temp+=NumberStringArray[i];
        }
        return temp;
    }
    static boolean challengeFive(int a, int b, int c, int w, int h){
        boolean status = false;
        if(a == w && b == h || a < w && a < h || a == w && b < h || a < w && b == h){
            status = true;
        } else if(a == w && c == h || a < w && c < h || a == w && c < h || a < w && c == h){
            status = true;
        } else if(b == w && c == h || b < w && b < h || b == w && c < h || b < w && c == h){
            status = true;
        } else if(a < w && b > h && w >= b || a < w && c > h && w >= c || b < w && c > h && w >= c){
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    static int challengeSix(char ch){
        int bilASCII = 0;
        bilASCII = ch;
        return bilASCII;
    }
    static boolean challengeSeven(String str){
        boolean status = false;
        String[] deretTanggal = str.split(" ");
        int firstNumber = Integer.parseInt(deretTanggal[0]);
        int secondNumber = Integer.parseInt(deretTanggal[1]);
        int param = Integer.parseInt(deretTanggal[2]);
        int sum = firstNumber * secondNumber;
        String sumString = Integer.toString(sum);
        String paramString = Integer.toString(param);
        if(sumString.length() == 1){
            if(sumString.equalsIgnoreCase(paramString.substring(3,4))){
                status = true;
            } else {
                status = false;
            }
        } else if (sumString.length() == 2) {
            if(sumString.equalsIgnoreCase(paramString.substring(2,4))){
                status = true;
            } else {
                status = false;
            }
        } else if (sumString.length() == 3) {
            if(sumString.equalsIgnoreCase(paramString.substring(1,4))){
                status = true;
            } else {
                status = false;
            }
        } else if (sumString.length() == 4) {
            if(sumString.equalsIgnoreCase(paramString)){
                status = true;
            } else {
                status = false;
            }
        } else {
            status = false;
        }
        return status;
    }
    static String challengeEight(int[] arr){
        String seven = "Boom!";
        String noSeven = "There is no 7 in the array";
        boolean status = false;
        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == 7){
                status = true;
            }
        }
        if(status){
            return seven;
        } else {
            return noSeven;
        }
    }
    static String challengeNine(String str){
        String[] deretString = str.split(" ");
        int i, j;
        String temp = "";
        for(i = 0; i < deretString.length; i++){
            for(j = i+1; j < deretString.length; j++){
                if(deretString[i].length() > deretString[j].length()){
                    temp = deretString[i];
                    deretString[i] = deretString[j];
                    deretString[j] = temp;
                }
            }
        }
        String result = "";
        for(i = 0; i < deretString.length;i++){
            result+=deretString[i] + " ";
        }
        return result;
    }
    static boolean challengeTen(String pin){
        boolean status = false;
        int i;
        String temp = "";
        if(pin.length() == 0){
            status = false;
        } else if(pin.length() <=6 && pin.length() >= 4){
            for(i = 0; i < pin.length(); i++){
                char a = pin.charAt(i);
                if(!Character.isDigit(a)){
                    status = false;
                } else {
                    status = true;
                }
            }
        } else {
            status = false;
        }
        return status;
    }
    static boolean challengeEleven(int n){
        boolean status = false;
        double firstOrder = Math.pow(2, n) + 1;
        double secondOrder = (2*n) + 1;
        if(firstOrder%secondOrder == 0){
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    static void doubleArray(){
        int[][] arrayDouble = {{1,2,3}, {4,5,6}};
        System.out.println(arrayDouble[0][1]);
        System.out.println(arrayDouble[1][1]);
    }
    static void tryAndError(){
        String str = "1 1 2011";
        String[] deretString = str.split(" ");
        System.out.println(Arrays.toString(deretString));
    }
}