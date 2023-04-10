package domain;

import java.util.Scanner;

public class Day09 {
    public static void stringformat(String s){
        StringBuilder str = null;
        StringBuilder str1 = null;
        String resultStr =s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            str = new StringBuilder();
            for(int j = i; j < s.length(); j++) {
                   int flag = 0;
                str1 = new StringBuilder(str);
                str1.append(s.charAt(j));
                for (int k = 1; k <= str1.length()/2; k++) {
                    for (int l = 0; l <= str1.length()-k*2; l++) {
                        String s1 = str1.toString().substring(l, l + k);
                        String s2 = new String();
                        if(l+2*k == str1.length()){
                           s2 = str1.toString().substring(l+k);
                        }else {
                           s2 = str1.toString().substring(l + k, l + 2 * k);
                        }
                        if(s1.equals(s2)){
                           flag =1;
                            break;
                        }
                    }
                    if(flag == 1){
                        break;
                    }
                }
                if(flag == 0){
                    str.append(s.charAt(j));
                }else{
                    break;
                }
            }
           if(str.length()>resultStr.length()){
               resultStr = str.toString();
           }
        }
        System.out.println("因为无重复字符的最长子串是”"+resultStr+"”，所以其长度为"+resultStr.length()+"。");
    }
    public static void stringformats(String s){
        int flag = 0;
        StringBuilder str = null;
        String resultStr =s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            str = new StringBuilder();
            flag =0;
            for (int j = i; j < s.length(); j++) {
                if(i ==j){
                    str.append(s.charAt(j));
                }else {
                    for (int k = 0; k < str.length(); k++) {
                        if (str.toString().charAt(k) == s.charAt(j)) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 1) {
                        break;
                    } else {
                        str.append(s.charAt(j));
                    }
                }
            }
            if(str.length()>resultStr.length()){
                resultStr = str.toString();
            }
        }
        System.out.println("因为无重复字符的最长子串是”"+resultStr+"”，所以其长度为"+resultStr.length()+"。");
    }
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        String str = sacnner.next();
        stringformats(str);
      //  stringformat(str);
    }
}
