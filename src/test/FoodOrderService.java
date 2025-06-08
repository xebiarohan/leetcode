package test;

import java.math.BigDecimal;

public class FoodOrderService {
        public void placeOrder(FoodOrder foodOrder) {
            validateOrder(foodOrder);
            BigDecimal totalAmount = calculateTotalPrice(foodOrder);
            initiatePayment(totalAmount);
            initiateProduction(foodOrder);
        }

        private void validateOrder(FoodOrder foodOrder) {
            // implementation skipped for brevity
        }

        private BigDecimal calculateTotalPrice(FoodOrder foodOrder) {
            // implementation skipped for brevity
            return BigDecimal.ONE;
        }

        private void initiatePayment(BigDecimal totalAmount) {
            // implementation skipped for brevity
        }

        private void initiateProduction(FoodOrder foodOrder) {
            // implementation skipped for brevity
        }

}

record FoodOrder(String itemName, BigDecimal itemPrice, int quantity,
                 String deliveryAddress, String specialInstructions,
                 boolean isExpressDelivery, boolean applyDiscount) {}
