import java.util.ArrayList;

public class heap1 {
    public static class heaps{
        public void insert(int data,ArrayList<Integer> arr){
            arr.add(data);
            int parent = (arr.g - 1) / 2;
            while(data<arr.get(parent)){
                if(arr.get(parent) > data){
                int temp = arr.get(parent);
                arr.add(parent, data);
                arr.add(arr, null);
            }
            }
            
    }
    }
    

    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(5);
       arr.add(10);
       heaps h = new heaps();
       h.insert(1,arr);


    }
}
