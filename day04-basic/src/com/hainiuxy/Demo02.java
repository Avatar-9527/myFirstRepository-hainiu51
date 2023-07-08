package com.hainiuxy;



public class Demo02 {


    public static int add(int a,int b){
        int c =a +b;
        return c;


    }
    public static void add1(){
        System.out.println(1);

    }


    public static void print99(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i +"*"+j+"="+(i*j)+"\t");
            }

            System.out.println();
        }

    }



    public static void main(String[] args) {
    int[] arr = new int [12];
    int arr2[];
    int[] arr3 = new int[5];

    System.out.println(arr[1]);

    int[] arr4 = {1,2,3,4};
    System.out.println(arr4[2]);

    int[] arr5 = new int[4];
    System.out.println(arr5);
    System.out.println(arr5[1]);

    int[] arr6 = {11,22,33,44,55};

    for(int i=0;i<arr6.length;i++){
        System.out.println(arr6[i]);

    }

    int[] arr7 = {44,55,66,77};
    int max = arr7[0];
    for(int i=1;i<arr7.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
        System.out.println("max:"+max);



    int[][] arr8 = new int[2][3];
    int[][] arr9 = new int[][]{{1,2,3},{4,5,6}};

    System.out.println(arr9[0][1]);

    //遍历二维数组
    for(int i = 0;i<arr9.length;i++){
        for(int j=0;j<arr9[i].length;j++){

            System.out.println(arr9[i][j]);

        }
        System.out.println();

    }

    print99();










    }
}
