package com.dsa.hashing.Aug20_17;

import java.util.ArrayList;

/**
 * Created by vikas.e.mishra on 8/20/2017.
 * <p>
 * create own hashing function
 * insert, search
 */
public class HashMapSeperateChaining {

}

// Node of Chains
class HashNode<k, v> {
    private int key;
    private int value;

    private HashNode<k, v> next;

    public HashNode(int k, int v) {
        this.key = k;
        this.value = v;
    }
}

// Separate Chaining
class HashMap {
    private ArrayList<HashNode> bucketArray;
    private int numOfBuckets;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        numOfBuckets = 10;
        size = 0;

        for (int i = 0; i < numOfBuckets; i++) {
            bucketArray.add(null);
        }
    }
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }


}
