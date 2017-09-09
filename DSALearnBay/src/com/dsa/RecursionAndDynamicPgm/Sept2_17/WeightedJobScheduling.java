package com.dsa.RecursionAndDynamicPgm.Sept2_17;

/**
 * Created by vikas.e.mishra on 9/2/2017.
 * <p>
 * Given N jobs where every job is represented by following three elements of it.
 * <p>
 * Start Time
 * Finish Time
 * Profit or Value Associated
 * Find the maximum profit subset of jobs such that no two jobs in the subset overlap.
 * <p>
 * <p>
 * Input: Number of Jobs n = 4
 * Job Details {Start Time, Finish Time, Profit}
 * Job 1:  {1, 2, 50}
 * Job 2:  {3, 5, 20}
 * Job 3:  {6, 19, 100}
 * Job 4:  {2, 100, 200}
 * Output: The maximum profit is 250.
 * We can get the maximum profit by scheduling jobs 1 and 4.
 * Note that there is longer schedules possible Jobs 1, 2 and 3
 * but the profit with this schedule is 20+50+100 which is less than 250.
 * <p>
 * http://www.geeksforgeeks.org/weighted-job-scheduling-log-n-time/
 * <p>
 * Weighted Job Scheduling in O(nLogn)
 */

import java.util.Arrays;
import java.util.Comparator;

// Class to represent a job
class Job {
    int start, finish, profit;

    // Constructor
    Job(int start, int finish, int profit) {
        this.start = start;
        this.finish = finish;
        this.profit = profit;
    }
}

// Used to sort job according to finish times
class JobComparator implements Comparator<Job> {
    public int compare(Job a, Job b) {
        return a.finish < b.finish ? -1 : a.finish == b.finish ? 0 : 1;
    }
}

public class WeightedJobScheduling {
    /* A Binary Search based function to find the latest job
      (before current job) that doesn't conflict with current
      job.  "index" is index of the current job.  This function
      returns -1 if all jobs before index conflict with it.
      The array jobs[] is sorted in increasing order of finish
      time. */
    static public int binarySearch(Job jobs[], int index) {
        // Initialize 'lo' and 'hi' for Binary Search
        int lo = 0, hi = index - 1;

        // Perform binary Search iteratively
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (jobs[mid].finish <= jobs[index].start) {
                if (jobs[mid + 1].finish <= jobs[index].start)
                    lo = mid + 1;
                else
                    return mid;
            } else
                hi = mid - 1;
        }

        return -1;
    }

    // The main function that returns the maximum possible
    // profit from given array of jobs
    static public int schedule(Job jobs[]) {
        // Sort jobs according to finish time
        Arrays.sort(jobs, new JobComparator());

        // Create an array to store solutions of subproblems.
        // table[i] stores the profit for jobs till jobs[i]
        // (including jobs[i])
        int n = jobs.length;
        int table[] = new int[n];
        table[0] = jobs[0].profit;

        // Fill entries in M[] using recursive property
        for (int i = 1; i < n; i++) {
            // Find profit including the current job
            int inclProf = jobs[i].profit;
            int l = binarySearch(jobs, i);
            if (l != -1)
                inclProf += table[l];

            // Store maximum of including and excluding
            table[i] = Math.max(inclProf, table[i - 1]);
        }

        return table[n - 1];
    }

    // Driver method to test above
    public static void main(String[] args) {
        Job jobs[] = {new Job(1, 2, 50), new Job(3, 5, 20),
                new Job(6, 19, 100), new Job(2, 100, 200)};

        System.out.println("Optimal profit is " + schedule(jobs));
    }
}
