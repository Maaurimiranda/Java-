E1 — Descomponer segundos. Pedís una cantidad de segundos y mostrás X días, Y horas, Z minutos, W segundos. Solo con / y %. Sin bucles, sin if.

E2 — Overflow demostrado. Partís de Integer.MAX_VALUE, le sumás 1, imprimís el resultado. Después hacés lo mismo con long y Long.MAX_VALUE. En un comentario me explicás qué pasó.

E3 — Ficha de usuario. Pedís nombre (texto), edad (entero), altura en metros (decimal) y si es estudiante (boolean). Mostrás una ficha formateada con la altura a 2 decimales. Este es el que te va a hacer pelear con Scanner.

E4 — Precisión de la plata. Sumás 0.1 + 0.2 con double e imprimís el resultado crudo. Después hacés la misma suma con BigDecimal usando el constructor de String (new BigDecimal("0.1")) e imprimís. Me explicás la diferencia en un comentario.

E5 — Intercambio sin variable auxiliar. Tenés int a = 7, b = 3; y los tenés que intercambiar sin declarar una tercera variable. Hay dos formas: una con aritmética y otra con XOR. Buscá al menos una vos.


Criterios de aceptación
- Ningún warning del compilador. 
- Cero números mágicos: si aparece un 3600, es una static final con nombre. 
- Nombres de variables en español o inglés, pero consistente en todo el repo. Elegí uno.
camelCase para variables, PascalCase para clases, MAYUS_CON_GUION para constantes. 
- Cada archivo compila y corre solo.