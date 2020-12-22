package com.eyepoppy;

//import java.lang.reflect.Array;

public class Array {

    private int[] items;
    private int count;//this need count valueable. Why don't I trust my instinct?

    public Array(int length){//constructor
        items = new int[length];

        //int[] item = new Array[len];
        //initial Array
        //naming convention

    }

    public void print(){
        //System.out.println("count: " + count);
        //System.out.println("Length: " + items.length);

        for (int i = 0; i < count; i++){//i < count:0 won't
            //System.out.println("i: " + i);
            System.out.println(items[i]);
        }

        System.out.println("count: " + count);
    }

    public void test(){
        if (10 > 5 ){//10 is bigger than 5
            System.out.println("10 > 5");
        }

        if (5 < 10 ){//10 is bigger than 5
            System.out.println("5 < 10");
        }
    }

    public void insert(int item){

        if(items.length <= count){//plus 1? 3 < 1
            int tempArray[] = new int[items.length * 2];

            for (int i = 0; i < count; i++)
                tempArray[i] = items[i];
            items = tempArray;

        }

        items[count] = item;//same issues again.
        count++;
        System.out.println("items.length: " + items.length);
    }

    public void removeAt(int index){
        //System.out.println("remove at: " + items[index]);
        //Validate the index
        if(index < 0 || index >= count)//count = 4
            throw new IllegalArgumentException();

        for (int i = index; i < items.length-1; i++){//that's why u need length-1
            //System.out.println("remove at: " + items[i]);
            //System.out.println("remove at: " + items[i + 1]);
            items[i] = items[i + 1];

        }
        count--;

    }



    public int indexOF(int index){
        //0(N) running complexity
        for (int i=0; i < count; i++){
            if(items[i] == index){
                return i;
            }
        }

        return -1;

    }

    public int[] intersect(){
        //int[] commonArray;
        //int common = -1;
        int[]common = new int[count];
        int commonCount = 0;

        for (int i = 0; i < count; i++){
            for (int a = i + 1; a < count; a++){
                if(items[i] == items[a]){
                    System.out.println("inside: " + items[i]);
                    common[commonCount] = items[i];
                    commonCount++;
                    //return multiple answer
                    //array or file or display on screen;

                }
            }
        }
        return common;
    }

    public int[] reverse(){

        int[]reverse = new int[count];
        int temp = count;

        for (int i = 0; i < count; i++){//count = 6
            reverse[i] = items[temp-1];
            temp--;
        }
        return reverse;
    }

    public void insertAt(int item, int index){

        if(index < 0 || index >= count)//count = 4
            throw new IllegalArgumentException();

        if(items.length <= count-1) {//count -1 will be safer because it will create 1 extra space or safe gap
            int tempArray[] = new int[items.length * 2];

            for (int i = 0; i < count; i++)
                tempArray[i] = items[i];
            items = tempArray;
        }

        int temp = count;
        for (int i = index; i < count; i++){//that's why u need length-1

            items[temp] = items[temp -1];//4 = 3
            temp--;
        }

        items[index] = item;//same issues again.
        count++;
        //System.out.println("items.length: " + items.length);

    }

    public int max(){
        int max = 0;
        for (int i=0; i<count; i++){
            System.out.println(items[i]);
            if(items[i] > max){
                max = items[i];
            }
        }
        return max;
    }

}
