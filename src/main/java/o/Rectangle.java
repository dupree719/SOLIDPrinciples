package o;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Rectangle implements IShape {
    public Double height;
    public Double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}
