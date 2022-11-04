package curs19.list;

public class Complexitati {

    public static void main(String[] args) {
        //6*2+1 operatii unde 6 = nr de elemente
        // n elem => n operatii => pentru minim ne incadram in O(n)
        //O(n^2) muult mai mare
        int[] numbers = {1,2,-3,2,4,1};
        int minim = numbers[0];//O(1)
        for (int elem: numbers){
            if(elem < minim){//O(1)
                minim = elem; //O(1)
            }
        }
    //O(1) + O(1) = O(1)
        System.out.println("MINIM:" + minim);
    }
}
