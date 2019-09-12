class LinearSearch implements Practice03Search {

  //@Override
  public String searchName() {
    return "Linear Search";
  }

  //@Override
  /*
  Finds a target in an integer array. Returns index of target.
  If target DNE, return -1.
  */
	public int search(int [] arr, int target) {
    if(arr.length == 0) {
      return -1;
    }
    for(int i = 0; i < arr.length - 1 ; i++) {
      if(arr[i] == target) {
        return i;
      }
    }
    return -1;
  }
}
