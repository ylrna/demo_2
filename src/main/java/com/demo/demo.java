package com.demo;

import com.demo.IllegalInputException;
import com.demo.MyException;

import java.util.ArrayList;
import java.util.HashMap;

public class demo {
    //初始化，建立数字与字母的关系
    private static HashMap<Integer,char[]> map = new HashMap();

    public static void init(){
        char letterofOne[] = {};
        char letterofTwo[] = {'a','b','c'};
        char letterofThree[] = {'d','e','f'};
        char letterofFour[] = {'g','h','i'};
        char letterofFive[] = {'j','k','l'};
        char letterofSix[] = {'m','n','o'};
        char letterofSeven[] = {'p','q','r','s'};
        char letterofEight[] = {'t','u','v'};
        char letterofNine[] = {'w','x','y','z'};
        char letterofZero[] = {};
        map.put(1,letterofOne);
        map.put(2,letterofTwo);
        map.put(3,letterofThree);
        map.put(4,letterofFour);
        map.put(5,letterofFive);
        map.put(6,letterofSix);
        map.put(7,letterofSeven);
        map.put(8,letterofEight);
        map.put(9,letterofNine);
        map.put(0,letterofZero);
    }
    /***
     * 获取返回的数组
     * @author wl
     * @param arr
     * @return
     */
   public static ArrayList<String> get_letter_combinations(int arr[]) throws Exception {
//     初始化
       if(arr == null || arr.length == 0){
           throw new MyException("传入的参数为空");
       }

       for(int i = 0;i < arr.length;i++){
           if(arr[i] < 0 || arr[i]>99){
               throw new IllegalInputException("输入非法，请输入[0-99]的数字");
           }
       }
       init();
       ArrayList<String> res = new ArrayList<String>();
       res.add("");
       String num = "";
//     将整形数组转化为字符串   简化整形数组中出现大于10的操作
       for(int i = 0;i < arr.length;i++){
           num = num + arr[i];
       }
//     根据之前建立的hashmap中数字与字母的关系进行运算
       for(int i = 0;i < num.length();i++){
           String letter = "";
           ArrayList<String> tmp = new ArrayList<String>();
           int len = map.get(Integer.parseInt(String.valueOf(num.charAt(i)))).length;
           for(int j = 0;j < len;j++){
               char c = map.get(Integer.parseInt(String.valueOf(num.charAt(i))))[j];
               for(int k = 0;k < res.size();k++){
                   tmp.add(res.get(k) + c);
               }
           }
           res = tmp;
       }
//     得到返回结果
       return res;
   }

   public static void main(String[] args){
       int arr[] = {4,5};
       ArrayList<String> res = null;
       try {
           res = get_letter_combinations(arr);
       } catch (Exception e) {
           e.printStackTrace();
       }
       for(int i = 0;i < res.size();i++){
           System.out.print(res.get(i) + " ");
       }
   }

}
