//Linear Search implemented

class LinearSearch {
    public static void main(String[] args) {
        int [] arr = new int[]{1,25,1,51,2,1};
        System.out.println(linearSearch(arr,12));
    }
    
    public static int linearSearch(int []arr, int find){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == find)
                return arr[i];
        }
        return -1;
    }
    
}
