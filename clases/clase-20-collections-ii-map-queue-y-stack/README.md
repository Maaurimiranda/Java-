# Clase 20 — Collections II: Map, Queue y Stack

**BLOQUE 3 — Java avanzado (clases 18–27)**

- **Cómo funciona `HashMap` por dentro:** función de hash, `hash(key) & (n-1)`, buckets, colisiones, lista enlazada → árbol rojo-negro (treeify a partir de 8), load factor 0.75, resize y rehash.
- `HashMap` vs `LinkedHashMap` vs `TreeMap` vs `Hashtable` vs `ConcurrentHashMap`.
- `Queue`, `Deque`, `ArrayDeque`, `PriorityQueue`, `Stack` (y por qué usar `ArrayDeque` en vez de `Stack`).
- **Tabla de decisión:** qué colección elegir según el caso de uso.
