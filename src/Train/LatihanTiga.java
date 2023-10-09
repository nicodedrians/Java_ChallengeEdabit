package Train;

import java.util.Arrays;

public class LatihanTiga {
    public static void main(String[] args) {

        /*
        // challenge one
        String challengeOne = challengeOne("aabbcc");
        System.out.println(challengeOne);

        // challenge two
        String challengeTwo = Arrays.toString(challengeTwo("\"((()))(())()()(()())\""));
        System.out.println(challengeTwo);

        // challenge Three
        int challengeThree = challengeThree(9);
        System.out.println(challengeThree);

        // challenge Four
        int challengeFour = challengeFour(77);
        System.out.println(challengeFour);

        // challenge Five
        int challengeFive = challengeFive(17,24);
        System.out.println(challengeFive);

        tryAndError();

         */
    }
    static void tryAndError(){
        // a = 97
        // A = 65
        // z = 122
        // Z = 90
        String str = "aAzZ";
        int a = 97;
        int A = 65;
        int z = 122;
        int Z = 90;
        int addUpper = 25 + A;
        int lowUpper = 25 + a;

        int jarak = 0;
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
        int i;
        String temp = "";
        int tempInteger = 0;
        String result = "";
        for(i = 0; i < charArray.length;i++){
            if(charArray[i] >= 'A' && charArray[i] <= 'Z'){
                if(charArray[i] != A){
                    tempInteger = charArray[i];
                    jarak = tempInteger-A;
                    int tempIntegerNew = (tempInteger + 25) - jarak;
                    char tempChar = (char) tempInteger;
                    result+=tempChar;
                } else {
                    tempInteger = charArray[i];
                    tempInteger+=25;
                    char tempChar = (char) tempInteger;
                    result+=tempChar;
                }
            } else if(charArray[i] >= 'a' && charArray[i] <= 'z'){
                
            }
        }
        System.out.println(temp);
    }
    static String challengeOne(String str){
        char[] charArrayStr = str.toCharArray();
        StringBuilder strNew = new StringBuilder();
        int i,j;
        for(i = 0; i < charArrayStr.length;i++){
            boolean duplicate = false;
            for(j = i+1; j < charArrayStr.length;j++){
                if(charArrayStr[i] == charArrayStr[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                strNew.append(charArrayStr[i]);
            }
        }
        return strNew.toString();
    }
    static String[]challengeTwo(String str){
        String[] arrStr = str.split("");
        String quotation = arrStr[0];
        int i;
        String temp = "";
        for(i = 0; i < arrStr.length;i++) {
            char a = str.charAt(i);
            if(a == '\"'){
                temp=temp;
            } else {
                temp+=a;
            }
        }
        String[] arrTemp = temp.split("");
        int count = 0;
        String result = "";
        for(i = 0; i < arrTemp.length;i++){
            if(count == 0){
                result+="\"";
            }
            if(arrTemp[i].equalsIgnoreCase("(")){
                result+=arrTemp[i];
                count++;
            } else if(arrTemp[i].equalsIgnoreCase(")")){
                count--;
                result+=arrTemp[i];
            }
            if(count==0){
                result+= "\" ";
            }
        }
        String[]arrResult = result.split(" ");
        return arrResult;
    }
    static int challengeThree(int n){
        String nString = Integer.toString(n);
        String[] nArrString = nString.split("");
        int[] nArrInteger = new int[nArrString.length];
        int i;
        for(i = 0; i < nArrInteger.length;i++){
            nArrInteger[i]+=Integer.parseInt(nArrString[i]);
        }
        int sum = 0;
        for(i = 0; i <nArrInteger.length;i++) {
            sum += nArrInteger[i];
        }
        int additional = 0;
        boolean status = false;
        do{
            String sumString = Integer.toString(sum);
            String[]sumArr = sumString.split("");
            int[] sumIntegerArr = new int[sumArr.length];
            for(i = 0; i < sumIntegerArr.length;i++) {
                sumIntegerArr[i] += Integer.parseInt(sumArr[i]);
            }
            if(sumArr.length > 1){
                additional++;
                status = true;
            } else {
                status = false;
            }
            sum = 0;
            for(i = 0; i < sumArr.length;i++){
                sum+=sumIntegerArr[i];
            }
        } while(status);
        if(additional > 0) {
            additional+=1;
        } else {
            additional = 0;
        }
        return additional;
    }

    static int challengeFour(int n){
        String nString = Integer.toString(n);
        String[] nArrString = nString.split("");
        int[] nArrInteger = new int[nArrString.length];
        int i;
        for(i = 0; i < nArrInteger.length;i++){
            nArrInteger[i]+=Integer.parseInt(nArrString[i]);
        }
        int sum = 1;
        for(i = 0; i <nArrInteger.length;i++) {
            sum *= nArrInteger[i];
        }
        int additional = 0;
        boolean status = false;
        do{
            String sumString = Integer.toString(sum);
            String[]sumArr = sumString.split("");
            int[] sumIntegerArr = new int[sumArr.length];
            for(i = 0; i < sumIntegerArr.length;i++) {
                sumIntegerArr[i] += Integer.parseInt(sumArr[i]);
            }
            if(sumArr.length > 1){
                additional++;
                status = true;
            } else {
                status = false;
            }
            sum = 1;
            for(i = 0; i < sumArr.length;i++){
                sum*=sumIntegerArr[i];
            }
        } while(status);
        if(additional > 0) {
            additional+=1;
        } else {
            additional = 0;
        }
        return additional;
    }
    static int challengeFive(int a, int b){
        int i;
        int even = 2;
        int odd = 1;
        int sum = 0;
        boolean status = false;
        for(i = a; i <=b; i++){
            if(i%even == 0){
                if(i == 2){
                    i+=2;
                    status = true;
                }
                while(even < i){
                    if(status){
                        i-=2;
                        status = false;
                    }
                    if(even*even == i){
                        sum++;
                        even = i;
                    } else {
                        even+=2;
                    }
                }
            } else if(i%odd == 0){
                if(i == 1){
                    i+=2;
                    status = true;
                }
                while (odd < i) {
                    if(status){
                        i-=2;
                        status = false;
                    }
                    if (odd * odd == i) {
                        sum++;
                        odd = i;
                    } else {
                        odd += 2;
                    }
                }
            }
            even = 2;
            odd = 1;
        }
        return sum;
    }
    static String challengeSix(String str){
        String newStr = str;
        return newStr;
    }
}
