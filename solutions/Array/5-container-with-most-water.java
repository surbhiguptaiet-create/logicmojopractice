class Solution {
    public int maxArea(int[] height) {

        int lp = 0;
        int rp = height.length - 1;

        int water = 0;
        int ans = 0;

        while(lp < rp)
        {
            water =
                (rp - lp) *
                Math.min(height[rp], height[lp]);

            ans = Math.max(water, ans);

            if(height[lp] > height[rp])
            {
                rp--;
            }
            else if(height[lp]==height[rp])
            {
                lp++;
                rp--;
            }
            else
            {
                lp++;
            }
        }

        return ans;
    }
}