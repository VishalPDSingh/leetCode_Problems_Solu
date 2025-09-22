class Solution {
    public boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        boolean found  = false;
        if(arr.length <=1)
        return found;

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]==arr[i-1])
                found = true;
        }
        return found;
    }
}
