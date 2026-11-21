# Clase 57 — Deploy y observabilidad

**BLOQUE 7 — Skills de la industria (clases 51–58)**

- Deploy real: Railway / Render / Fly.io, o VPS con Docker Compose + Nginx + certificado SSL.
- Variables de entorno y configuración por perfil, secretos en producción.
- **Observabilidad** = poder responder preguntas sobre el sistema sin desplegar código nuevo. Los tres pilares: **logs** (qué pasó), **métricas** (cuánto/cuántas veces), **traces** (el recorrido de un request).
- **Spring Boot Actuator**: `/health` (liveness y readiness), `/metrics`, `/info`, `/env`, endpoints custom, y cómo asegurarlos.
- Micrometer + Prometheus + Grafana: dashboard con latencia, throughput y tasa de errores.
- Monitoreo ≠ observabilidad: monitoreo son alertas sobre lo que sabías que podía fallar; observabilidad es poder investigar lo que no previste.
