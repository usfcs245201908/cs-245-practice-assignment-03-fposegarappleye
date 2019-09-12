class BinaryRecursiveSearch implements Practice03Search {

  //@Override
  public String searchName() {
    return "Binary Recursive Search";
  }

  //@Override
  /*
  Finds a target in an integer array. Returns index of target.
  If target DNE, return -1.
  */
  // Binary Recursive
	public int search(int [] arr, int target) {
  // Set a top and bottom limit to search through
  return binSearch(arr, target, 0, a.length-1);
  }

  private int binSearch(int[] arr, int target, int low, int high) {
    // Base case handled
    if(low > high) {
      return -1;
    }
    int mid = (high+low)/2;
    if(arr[mid] == target) {
      return mid;
    }
    if(target > arr[mid]) {
      return binSearch(arr, target, mid+1, high);
    } else {
      retirn binSearch(arr, target, low, mid-1);
    }
  }
}
