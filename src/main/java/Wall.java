import java.util.List;
import java.util.Optional;
/*
zaimplementowanie metod findBlockByColor, findBlocksByMaterial, count w klasie Wall
- najchętniej unikając powielania kodu i umieszczając całą logikę w klasie Wall.
Z uwzględnieniem w analizie i implementacji interfejsu CompositeBlock!
 */

public class Wall implements Structure {
    private List blocks;

    @Override
    public Optional findBlockByColor(String color) {

        return Optional.empty();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}