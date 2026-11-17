import java.util.ArrayList;
import java.util.HashMap;

class TwoSumClass 
{
    public static void main(String[] args) 
    {
 
       System.out.println("Indices: " + java.util.Arrays.toString(TwoSumClass.TwoSum(new int[] {2, 7, 9, 15}, 11)));
        
       System.out.println("Indices: " + java.util.Arrays.toString(TwoSumClass.TwoSum2(new int[] {2, 7, 9, 15}, 11)));

       System.out.println("Indices: " + java.util.Arrays.toString(TwoSumClass.TwoSum2(new int[] {1,3,7,9,2}, 11)));
    }

    public static int[] TwoSum(int[] nums, int target) 
    {
        for (int p1 = 0; p1 < nums.length; p1++) 
        {
            int numberToFind = target - nums[p1];

            for (int p2 = p1 + 1; p2 < nums.length; p2++) 
            {
                if (numberToFind == nums[p2])
                {
                    return new int[] {p1, p2};
                }
            }
        }
        return new int[] {};
    }

    public static int[] TwoSum2(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return new int[] {map.get(nums[i]), i};
            }
            int numberToFind = target - nums[i];
            map.put(numberToFind, i);
        }
        return new int[] {};
    }
    
}

