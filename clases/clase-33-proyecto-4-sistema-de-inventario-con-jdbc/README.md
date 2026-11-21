# Clase 33 — PROYECTO 4: Sistema de Inventario con JDBC

**BLOQUE 5 — Bases de datos, JDBC y build tools (clases 28–34)**

Maven + PostgreSQL + JDBC puro. **Sin frameworks.**

**Requisitos:**
- Esquema con al menos 5 tablas relacionadas (productos, categorías, proveedores, movimientos de stock, usuarios) con FKs e índices justificados.
- CRUD completo vía DAOs.
- Operación transaccional real: registrar una venta que descuenta stock de varios productos y falla completa si uno no tiene stock suficiente.
- Reportes con JOINs y agregaciones.
- Migraciones SQL versionadas en el repo (`V1__init.sql`, `V2__...`).

**Criterio:** cero concatenación de strings en SQL. Todo `PreparedStatement`. Toda conexión cerrada con try-with-resources.
