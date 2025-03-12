package framework;

import java.util.HashMap;
import java.util.Map;

public class PecaCache {
    private Map<String, Peca> cache = new HashMap<>();

    public Peca getPeca(String tipo) {
        Peca peca = cache.get(tipo);
        if (peca == null) {
            peca = new Peca(tipo);
            cache.put(tipo, peca);
        }
        return peca;
    }
}
