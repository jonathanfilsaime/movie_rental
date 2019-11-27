package refactored;

import java.math.BigDecimal;

public interface Item {
    BigDecimal getPrice();
    Type getType();
    Item  getItem();
}
