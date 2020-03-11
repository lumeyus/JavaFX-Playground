package algorithms;

public class insertionsort {
    public int[] sortNumbers(int[] list){
            for (int j = 2; j < list.length; j++){
                int key = list[j];
                int i = j - 1;
                while (i > 0 && list[i] > key){
                    list[i + 1] = list[i];
                    i = i - 1;
                }
                list[i + 1] = key;
            }
        return list;
    }
}
