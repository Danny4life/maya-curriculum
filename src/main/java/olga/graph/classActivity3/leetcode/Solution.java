package olga.graph.classActivity3.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Approach:
 * Check if the starting or ending cell is blocked (grid[0][0] == 1 or grid[n-1][n-1] == 1). If so, return -1.
 * Use BFS to explore all 8 directions (since diagonal movement is allowed).
 * Keep track of visited cells using the grid itself (mark visited cells with 1).
 * Return the shortest path length when reaching the bottom-right corner.
 * If no path exists, return -1.
 */

public class Solution {

    public int shortestPathBinaryMatrix(int[][] grid){
        int n = grid.length;

        // Handling Edge Cases
        //If the start (0,0) or end (n-1, n-1) is blocked (1), return -1 immediately.
        if(grid[0][0] == 1 || grid[n - 1][n - 1] == 1){

            return -1;
        }

        // These represent 8 possible movements in the grid:
        // Possible 8 directions (left, right, up, down, and diagonals)
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},{0,1},
                {1, -1}, {1, 0}, {1,1}
        };

        // Queue to perform BFS (stores {row, col, distance})
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // Start from top-left (0,0) with distance 1
        grid[0][0] = 1; // Mark as visited

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];


            // If we reach the bottom-right corner, return the distance
            if(row == n - 1 && col == n - 1){
                return distance;

            }

            // Explore all 8 directions
            for(int[] dir : directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Check if the new position is within bounds and is not blocked
                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0){
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                    grid[newRow][newCol] = 1; // Mark as visited

                }

            }

        }

            return -1; // If no path found

        /**
         * Take the front element from the queue.
         * If it's the bottom-right cell, return the distance.
         * Explore all 8 directions:
         * If a cell is inside bounds and is 0,
         * Mark it as visited (1)
         * Add it to the queue with distance + 1.
         * 🔹 Why mark visited?
         *
         * To avoid revisiting the same cell, which prevents infinite loops.
         */
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] grid1 = {{0, 1}, {1, 0}};
        System.out.println(solution.shortestPathBinaryMatrix(grid1)); // Output: 2

        int[][] grid2 = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(solution.shortestPathBinaryMatrix(grid2)); // Output: 4

        int[][] grid3 = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(solution.shortestPathBinaryMatrix(grid3)); // Output: -1
    }
}

/**
 * Time Complexity & Space Complexity:
 * ✅ Time Complexity: O(N²) (Each cell is visited at most once)
 * ✅ Space Complexity: O(N²) (For BFS queue in the worst case)
 */
