/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.minimum.length.sub.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author andre
 */
public class Solution {

    public static int minimumLength(Character[] A, Character[] S) {
        List<Character> a = Arrays.asList(A);
        Set<Character> s = new HashSet<>(Arrays.asList(S));
        Map<Character, Integer> map = new HashMap<>();
        int count = Integer.MAX_VALUE;

        int nums = s.size();

        for (int l = 0, r = 0; r < a.size(); r++) {
            Character charRight = a.get(r);
            if (s.contains(charRight)) {
                if (map.get(charRight) == null) {
                    map.put(charRight, 1);
                } else {
                    map.put(charRight, map.get(charRight) + 1);
                }
            }
            while (map.size() == nums) {
                Character charLeft = a.get(l);
                if (s.contains(charLeft)) {
                    if (map.get(charLeft).equals(1)) {
                        count = Math.min(count, r - l + 1);
                        map.remove(charLeft);
                    } else {
                        map.put(charLeft, map.get(charLeft) - 1);
                    }
                }
                l++;
            }

        }
        return count;
    }
}
