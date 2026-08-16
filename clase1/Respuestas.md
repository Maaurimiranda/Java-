Preguntas de Control: 

1. (int) -9.7 da -9 porque el casting trunca el valor. No redondea al valor mas cercano.
2. long poblation = 8 000 000 000 no compila porque lo interpreta como int. Para que lo interprete como long debe tener una L al final. Lo mismo sucede con los float 
3. char c = “A”; int n = c + 1;  n vale 66 porque ‘A’  tiene el valor Unicode de 65. Compila porque los char se vuelven int en una suma numerica. Lo mismo con byte, short y char. 
4. Integer puede ser null porque es un objeto. En cambio int es un primitivo y siempre tiene que tener algun valor.