package o;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Circle implements IShape {
    public Double radius;

    @Override
    public void calculate() {
        System.out.println(radius * radius * 3.14);
    }
}