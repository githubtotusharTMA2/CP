// find max in array int:
static int maxInArray(int[] arr) {
    int max = arr[0];
    for(int element : arr) max = Math.max(max, element);
    return max;
}