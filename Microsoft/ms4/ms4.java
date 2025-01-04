package ms4;
//661. Image Smoother
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] helper = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 0}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                // take a look at below thoroughly (just by using helper array we're getting sum)
                // Iterate over all plausible nine indices.
                for (int[] direction : helper) {
                    // If the indices form a valid neighbor
                    int i_ = i + direction[0];
                    int j_ = j + direction[1];

                    if (i_ >=0 && i_ < m && j_ >=0 && j_ < n) {
                        sum += img[i_][j_];
                        count += 1;
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
}

