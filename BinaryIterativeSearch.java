class BinaryIterativeSearch implements Practice03Search {

  //@Override
  public String searchName() {
    return "Binary Iterative Search";
  }

  //@Override
  /*
  Finds a target in an integer array. Returns index of target.
  If target DNE, return -1.
  */
  // Binary Iterative - utilizes a while loop
	public int search(int [] arr, int target) {
    // Set lower and upper initial bounds
    int low = 0;
    int high = arr.length - 1;
    // While the bottom value isn't the top (i.e. val DNE)...
    while(bot <= top) {
      // Set the middle value to be halfway through
      int mid = (low+high)/2;
      // If the middle value is the target, return it
      if(arr[mid]==target) {
        return mid;
      }
      // If the target is greater than the mid value
      if(target > arr[mid]) {
        // Then shift the low value to the one above mid
        low = mid + 1 ;
      } else {
        // Else shift high value to the one below mid
        high = mid - 1 ;
      }
    }
    // If all of the above fails to find it, return -1.
    return -1;
  }
}
