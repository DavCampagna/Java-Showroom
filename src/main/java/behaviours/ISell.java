package behaviours;

import models.Car;

public interface ISell {
    void sellTo(IBuyable product, IBuy buyer);
}
