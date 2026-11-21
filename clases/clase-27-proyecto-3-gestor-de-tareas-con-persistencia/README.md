# Clase 27 — PROYECTO 3: Gestor de Tareas con persistencia

**BLOQUE 3 — Java avanzado (clases 18–27)**

Consola. Integra TODO el bloque 3.

**Requisitos:**
- Tareas con id (UUID), título, descripción, prioridad (enum), estado (enum), fecha de creación, fecha límite, etiquetas (Set).
- Persistencia en JSON — carga al arrancar, guarda al salir. Si el archivo está corrupto, arranca vacío con un warning (no explota).
- Filtros combinables con streams: por estado, prioridad, etiqueta, vencidas, que vencen en los próximos N días.
- Reportes con `Collectors.groupingBy`: tareas por prioridad, por estado, promedio de días para completar.
- Excepciones custom del dominio (`TareaNoEncontradaException`, `EstadoInvalidoException`).
- Búsqueda por texto en título o descripción.

**Criterio:** cero `null` retornado (usá `Optional`). Toda la lógica de consulta con streams. Separación clara: modelo / repositorio / servicio / UI.
