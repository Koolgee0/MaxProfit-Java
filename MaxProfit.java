package profit;

public class MaxProfit {


        public Integer find(Integer[] input) {
            int buy_price = 0;
            int sell_price = 0;
            int max_profit = -1;

            for (int i = 0; i < input.length; i++) {
                if (((i + 1) < input.length) && (input[i + 1] > input[i])) {
                    if (buy_price == 0 || input[i] < buy_price) {
                        buy_price = input[i];
                    }

                    sell_price = input[i + 1];

                    int curMaxProfit = sell_price - buy_price;

                    if (curMaxProfit > max_profit) {
                        max_profit = curMaxProfit;
                    }
                }
            }

            return max_profit;
        }
}
