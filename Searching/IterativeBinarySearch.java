class BinarySearch
{
  public static int binarySearch(int[] arr, int target)
  {
     int left = 0; 
     int right = array.length - 1;
 
    while (left <= right)
    {
      
      int mid = (left + right) / 2;
 
      if (target == array[mid]) {
        return mid;
      }
 
     if (target < arr[mid]) {
        right = mid - 1;
      }
 
      if (target > arr[mid]) {
        left = mid + 1;
      }
    }
 
    return -1;
  }
 
   public static void main(String[] args)
  {
    int[] arr = { 2, 5, 6, 8, 9, 10 };
    int target = 6;
 
    int index = binarySearch(arr, target);
    if (index != -1) {
    System.out.println("Element found at index " + index);
     } else {
    System.out.println("Element not found in the array");
     }
  }
}


----------------------------------------------------------------------------
//Short Soultion

int start = 0, pivot;
        int end = nums.length - 1;
        while (start <= end) {
            pivot = start + (end - start) / 2;
            if(nums[pivot] == target)
                return pivot;
            if(target < nums[pivot])
                end = pivot - 1;
            else 
                start = pivot + 1;
        }
        return -1;
   }
}
