# Clase 16 — PROYECTO 2: Sistema de Biblioteca

**BLOQUE 2 — Programación Orientada a Objetos (clases 9–17)**

Modelado de dominio real, todo en POO. Consola.

**Requisitos:**
- Jerarquía de `Material` (Libro, Revista, DVD) con comportamiento distinto por tipo (días de préstamo, multa por día).
- `Socio` con historial de préstamos y límite según categoría (enum: ESTUDIANTE, DOCENTE, GENERAL).
- Préstamo y devolución con cálculo de multa por atraso.
- Búsqueda por título, autor y disponibilidad.
- Interfaz `Prestable` y clase abstracta donde corresponda — y tenés que justificarme por qué elegiste cada una.
- `equals`/`hashCode`/`toString` bien implementados en todas las entidades.

**Criterio:** cero `if` que pregunte por el tipo de material. Si aparece un `instanceof` en la lógica de negocio, está mal diseñado.
