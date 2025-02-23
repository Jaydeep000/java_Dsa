#include <stdio.h>

void buy_coupon(int n, int x, int y, int prices[]) {
    int total_price = 0, total_coupon = x;
    
    for (int i = 0; i < n; i++) {
        total_price += prices[i];
        total_coupon += (prices[i] > y) ? (prices[i] - y) : 0;
    }
    
    if (total_coupon < total_price) {
        printf("Coupon\n");
    } else {
        printf("No Coupon\n");
    }
}

int main() {
    int t;
    scanf("%d", &t);
    
    while (t--) {
        int n, x, y;
        scanf("%d %d %d", &n, &x, &y);
        
        int prices[n];
        for (int i = 0; i < n; i++) {
            scanf("%d", &prices[i]);
        }
        
        buy_coupon(n, x, y, prices);
    }
    
    return 0;
}
