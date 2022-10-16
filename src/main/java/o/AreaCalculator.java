package o;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class AreaCalculator {
    private IShape shape;

    public void calculate() {
        shape.calculate();
    }
}
