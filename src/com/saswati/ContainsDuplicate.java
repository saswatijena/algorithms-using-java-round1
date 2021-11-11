package com.saswati;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for(int num: nums){
            if(set.contains(num))
                return true;
            else set.add(num);
        }
        return false;
    }
}
