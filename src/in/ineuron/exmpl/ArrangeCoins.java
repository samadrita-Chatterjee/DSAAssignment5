package in.ineuron.exmpl;


class ArrangeCoins {
    public int arrangeCoins(int n) {
        int ans = 1;
    while(n > 0){
      ans++;
      n = n-ans;
    }
    return ans-1;
    }
}
