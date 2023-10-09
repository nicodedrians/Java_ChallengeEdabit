package Train;

import java.awt.event.ItemEvent;
import java.util.Arrays;

public class LatihanDua {
    public static void main(String[] args) {

        /*
        // challenge one
        boolean challengeOne = challengeOne(new int[] {10,7,8,6,9});
        System.out.println(challengeOne);

        // challenge two
        int challengeTwo = challengeTwo(new int[]{1,10,3,5});
        System.out.println(challengeTwo);

        // challenge three
        boolean challengeThree = challengeThree(new int[] {2,5,2,6,9}, new int[] {3,7,3,1,2});
        System.out.println(challengeThree);

        // challenge 4
        boolean challengeFour = challengeFour(120);
        System.out.println(challengeFour);

        // challenge 5
        boolean challengeFive = challengeFive(200);
        System.out.println(challengeFive);

        // challenge 6
        boolean challengeSix = challengeSix(new int[] {2,8,4,1});
        System.out.println(challengeSix);

        // challenge 7
        String challengeSeven = challengeSeven("lPaeesh le pemu mnxit ehess rtnisg!");
        System.out.println(challengeSeven);

        // challenge 8
        String challengeEight = challengeEight("Bananas");
        System.out.println(challengeEight);

        // challenge 9
        Boolean challengeNine = challengeNine("Rockstar");
        System.out.println(challengeNine);

        // challenge 10
        String challengeTen = challengeTen("(325)444-TEST");
        System.out.println(challengeTen);

        testAndError();
         */
    }
    static void testAndError(){

    }
    static boolean challengeOne(int[] arr){
        boolean status = false;
        int i;
        Arrays.sort(arr);
        for(i = 0; i < arr.length; i++){
            if(i < arr.length - 1) {
                if (arr[i] + 1 == arr[i + 1]) {
                    status = true;
                } else {
                    status = false;
                }
            }
        }
        return status;
    }
    static int challengeTwo (int[] numbers){
        Arrays.sort(numbers);
        int i;
        int sum = 0;
        String temp = "";
        for(i = 0; i < numbers.length; i++){
            if(i < numbers.length-1){
                sum = numbers[i+1] - numbers[i];
                temp+=sum;
                sum=0;
            }
        }
        String[] arrayString = temp.split("");
        int[] arrayInteger = new int[arrayString.length];
        for(i = 0; i < arrayInteger.length; i++){
            arrayInteger[i]+=Integer.parseInt(arrayString[i]);
        }
        Arrays.sort(arrayInteger);
        int result = arrayInteger[arrayInteger.length-1];
        return result;
    }
    static boolean challengeThree(int[] you, int[] opp){
        boolean status = false;
        Arrays.sort(you);
        Arrays.sort(opp);
        String firstNumber = "", secondNumber = "";
        firstNumber+=you[you.length-1];
        firstNumber+=you[you.length-2];
        secondNumber+=opp[opp.length-1];
        secondNumber+=opp[opp.length-2];
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(secondNumber);
        if(firstNumberInt > secondNumberInt){
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    static boolean challengeFour(int n){
        boolean status = false;
        int i;
        int sum = 1;
        for(i = 1; i <= n; i++){
            sum*=i;
            if(sum == n){
                status = true;
                i = n;
            }
        }
        return status;
    }
    static boolean challengeFive(int n){
        boolean status = false;
        int i;
        String newN = Integer.toString(n);
        String[] arrayN = newN.split("");
        int[] arrayIntN = new int[arrayN.length];
        for(i = 0; i < arrayIntN.length; i++){
            arrayIntN[i]+=Integer.parseInt(arrayN[i]);
        }
        int sum = 0;
        for(i = 0; i < arrayIntN.length;i++){
            sum+=arrayIntN[i];
        }
        if(n%sum == 0){
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    static boolean challengeSix(int[]arr){
        int i;
        boolean condition = false;
        String tempMinus = "";
        String tempPlus = "";
        boolean status = false;
        for(i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                status = true;
            }
        }
        if(status) {
            for (i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    tempMinus += arr[i] * -1 + " ";
                } else {
                    tempPlus += arr[i] + " ";
                }
            }
            String[] arrMinus = tempMinus.split(" ");
            String[] arrPlus = tempPlus.split(" ");
            int[] arrMinusInteger = new int[arrMinus.length];
            int[] arrPlusInteger = new int[arrPlus.length];
            for (i = 0; i < arrMinusInteger.length; i++) {
                arrMinusInteger[i] += Integer.parseInt(arrMinus[i]);
            }
            for (i = 0; i < arrPlusInteger.length; i++) {
                arrPlusInteger[i] += Integer.parseInt(arrPlus[i]);
            }
            Arrays.sort(arrMinusInteger);
            Arrays.sort(arrPlusInteger);
            Arrays.sort(arr);
            int sum = 1;
            if (arrMinusInteger[arrMinusInteger.length - 1] > arrPlusInteger[arrPlusInteger.length - 1]) {
                for (i = 1; i < arr.length; i++) {
                    sum *= arr[i];
                }
                if (sum == arr[0]) {
                    condition = true;
                } else {
                    condition = false;
                }
            } else {
                for (i = 0; i < arr.length - 1; i++) {
                    sum *= arr[i];
                }
                if (sum == arr[arr.length - 1]) {
                    condition = true;
                } else {
                    condition = false;
                }
            }
        } else {
            Arrays.sort(arr);
            int sum = 1;
            for(i = 0; i < arr.length-1; i++){
                sum*=arr[i];
            }
            if(sum == arr[arr.length-1]){
                condition = true;
            } else {
                condition = false;
            }
        }
        return condition;
    }
    static String challengeSeven(String str){
        String[] arrayStr = str.split("");
        int i;
        String temp = "";
        int count = 2;
        int barrier = 0;
        for(i = 0; i < arrayStr.length;i++){
            if(barrier < 2 ) {
                count--;
                temp += arrayStr[count];
            } else if(barrier == 2){
                count+=3;
                temp+= arrayStr[count];
                barrier = 0;
            }
            barrier++;
        }
        return temp;
    }
    // hTsii  s aimex dpus rtni.g
    static String challengeEight(String str){
        // One two three four
        String[] arrayStr = str.split(" ");
        int i;
        String temp = "";
        for(i = 0; i < arrayStr.length;i++){
            if(arrayStr[i].length()%2 == 0){
                temp+=arrayStr[i] + " ";
            } else {
                StringBuilder input = new StringBuilder();
                input.append(arrayStr[i]);
                input.reverse();
                temp+=input + " ";
                input.delete(0, input.length()-1);
            }
        }
        return temp;
    }
    static boolean challengeNine(String strInput){
        boolean status = false;
        String str = strInput.toLowerCase();
        int i;
        char[]arrChar = str.toCharArray();
        int[]arrInteger = new int[arrChar.length];
        for(i = 0; i < arrChar.length; i++){
            arrInteger[i] = arrChar[i]-96;
        }
        System.out.println(Arrays.toString(arrInteger));
        int firstSum = arrInteger[0] + arrInteger[1];
        int secondSum = arrInteger[arrInteger.length-2] + arrInteger[arrInteger.length-1];
        String strUpper = strInput.toUpperCase();
        String[] arrStrUpper = strUpper.split("");
        String printSTR = "";
        for(i = 0; i < strUpper.length(); i++){
            printSTR+= arrStrUpper[i];
            if(i == 1){
                printSTR+="|";
                printSTR+= arrStrUpper[arrStrUpper.length-2];
                printSTR+= arrStrUpper[arrStrUpper.length-1];
                i = strUpper.length();
            }
        }
        System.out.println(printSTR);
        System.out.println(firstSum + "|" + secondSum);
        if(firstSum == secondSum){
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    static String challengeTen(String phone){
        String temp = "", result = "";
        int i;
        for(i = 0; i < phone.length(); i++){
            char a = phone.charAt(i);
            if(Character.isAlphabetic(a)){
                temp+=a;
            } else {
                result+=a;
            }
        }
        String tempTwo = "";
        int loop = 0;
        do{
            String newTemp = temp.toLowerCase();
            char a = newTemp.charAt(loop);
            if(a == 'a' || a == 'b' || a == 'c'){
                tempTwo+="2";
            } else  if(a == 'd' || a == 'e' || a == 'f'){
                tempTwo+="3";
            } else  if(a == 'g' || a == 'h' || a == 'i'){
                tempTwo+="4";
            } else  if(a == 'j' || a == 'k' || a == 'l'){
                tempTwo+="5";
            } else  if(a == 'm' || a == 'n' || a == 'o'){
                tempTwo+="6";
            } else  if(a == 'p' || a == 'q' || a == 'r' || a == 's'){
                tempTwo+="7";
            } else  if(a == 't' || a == 'u' || a == 'v'){
                tempTwo+="8";
            } else  if(a == 'w' || a == 'x' || a == 'y' || a == 'z') {
                tempTwo+="9";
            }
            loop++;
        } while(loop < temp.length());
        result = result + tempTwo;
        return result;
    }
}


