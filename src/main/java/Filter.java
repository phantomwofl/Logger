import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        int k = 0;
        for (Integer i : source) {
            if (i >= treshold) {
                result.add(i);
                k += 1;
                logger.log("Элемент \"" + i + "\"  проходит");
            } else {
                logger.log("Элемент \"" + i + "\"  не проходит");
            }
        }
        logger.log("Прошло фильтр " + k + " элемента из " + source.size());
        return result;
    }
}
