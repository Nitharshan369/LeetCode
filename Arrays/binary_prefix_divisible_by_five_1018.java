import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();

        int currentMod = 0;

        for (int bit : nums) {
            currentMod = ((currentMod << 1) + bit) % 5;
            res.add(currentMod == 0);
        }

        return res;
    }
}