/*
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                for(int k = j + 1; k < arr.length; k++) {

                    if(arr[i] + arr[j] + arr[k] == 0) {

                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);

                        Collections.sort(temp);

                        if(!ans.contains(temp)) {
                            ans.add(temp);
                        }
                    }
                }
            }
        }

        return ans;
    }
}
*/

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(arr);

      for(int i=0;i<arr.length;i++){
        //skip duplicates of i
        if(i>0 && arr[i]==arr[i-1]){
            continue;
        }
        int j=i+1;
        int k=arr.length-1;

        while(j<k){
            int sum=arr[i] + arr[j] + arr[k];
            if(sum<0){
                j++;
            }else if(sum>0){
                k--;
            }else{
                 ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
                j++;
                k--;

                //skip duplicates
                while(j<k && arr[j]==arr[j-1]){
                    j++;
                }
                 while(j<k && arr[k]==arr[k+1]){
                    k--;
                }
            }
        }
      }
      return ans;
    }
}