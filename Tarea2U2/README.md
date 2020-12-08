
<img src="img/itma.png" width="90">_________________________________<img src="img/tec.png" width="90">

### TECNOLOGICO NACIONAL DE MEXICO
### INSTITUTO TECNOLOGICO DE MILPA ALTA II
### LENGUAJES AUTOMATAS II
### PROFESOR:
#### ROLDAN AQUINO SEGURA 
### ALUMNO:
#### ALEJANDRO POZOS RIVERA
### TEMA:
#### 2.2 REPRESENTACIÓN DE CÓDIGO INTERMEDIO
#### 2.3 ESQUEMA DE GENERACIÓN 

#### NUMERO DE UNIDAD: 2°
### FECHA: 
#### 01 DE DICIEMBRE DE 2020


<br>
<br>
<br>
<br>

### 2.2 Representación de código intermedio 

Existen maneras formales para representar código intermedio.
Estas notaciones simplifican la traducción de nuestro código fuente a nuestro código objeto ya que ahorran y acotan símbolos de la tabla de símbolos.

- #### 2.2.1 Notacion Polaca
    - La notación polaca, también conocida como notación de prefijo o notación prefija, es una forma de notación para la lógica, la aritmética, el álgebra y la computación. Su característica distintiva es que coloca los operadores a la izquierda de sus operandos. Si la aridad de los operadores es fija, el resultado es una sintaxis que carece de paréntesis u otros signos de agrupación, y todavía puede ser analizada sin ambigüedad. 

- #### 2.2.2 Código P.
    - El código P hace referencia a máquinas que utilizan o se auxilian de pilas para generar código objeto.
    - En muchos caso la P se asociado a código portable el cual garantiza que el código compilado en una máquina se pueda ejecutar en otras.
    - Para garantizar la portabilidad del código se necesita que el lenguaje este estandarizado por algún instituto y que dicho código no tenga extensiones particulares.
    - También se recomienda la no utilización de carácterísticas especiales exclusivas de alguna arquitectura de computadoras en particular.

- #### 2.2.3 Triplos 

    - Cada instrucción en triples presentación tiene tres campos: op, arg1, arg2. Los resultados de las respectivas sub-expresiones son indicados por la posición de expresión. Similitud con Triples representan DAG y árbol de sintaxis. Son equivalentes a DAG al tiempo que representan las expresiones.
    - Se debe tener en cuenta el proceso de asignación, de declaración, expresiones booleanas.
    - Las expresiones lógicas también pueden pasarse a código de tres direcciones, utilizando para ello expresiones en corto circuito.
    - La evaluación de expresiones en corto circuito implica que se evalúan condiciones revisando valores anteriores; por ejemplo, para el operador AND con una condición que se detecte como falsa toda la expresión es falsa, en el caso del operador OR si se encuentra una condición verdadera todo será verdadera.

        Op. | Arg1 | Arg2 
        :------------: | :-----------: | :-----------:
        (*) | c | d 
        (+) | b | (0)
        (+) | (1) | (0)
        (=) | (2) | 

- #### 2.2.4 Cuádruplos
    - Cada instrucción cuadruplica exposición se divide en cuatro campos: operador, arg1, arg2, y resultado. El ejemplo anterior se representa a continuación cuadruplica en formato:

        Op. | Arg1 | Arg2 | Resultado
        :------------: | :-----------: | :-----------: | :-----------:
        (*) | c | d | r1
        (+) | b | r1 | r2
        (+) | r2 | r1 | r3
        (=) | r3 |  | a

### 2.3 Esquema de generación
Los esquemas de generación son las estrategias o acciones que se deberán realizarse y tomarse en cuenta en el momento de generar código intermedio.
Los esquemas de generación dependen de cada lenguaje. Tomaremos algunos esquemas de generación del lenguaje C.

- #### 2.3.1 Expresiones
    - Para generar expresiones estas deben representarse de manera más simple y más literal para que su conversión sea más rápida.
    - Por ejemplo la traducción de operaciones aritméticas debe especificarse una por una, de tal forma que una expresión sea lo más mínimo posible.

- #### 2.3.2  Declaración de variables y constantes
    - Las declaraciones de variables y constantes deben separarse de tal manera que queden las expresiones una por una de manera simple.
    - Por ejemplo: int a,b,c; se descompone a int a; int b; intc; respectivamente.

- #### 2.3.3 Instrucción de asignación 
    - Las operaciones de asignación deben quedar expresadas por una expresión
sencilla, si está es compleja se debe reducir hasta quedar un operador sencillo.
    - Por ejemplo: x = a+b/5; debe quedar de la forma y = b/5; z = a+y; x=z;

- #### 2.3.4 Instrucciones de control
    - Las intrucciones de control deben expresarse de manera lo más sencilla posible de tal forma que puedan evaluarse en cortocircuito. Por ejemplo una instrucción como: if (a == b && f!=5 && f%3==0) se evalúa primero x = (a==b
    && f!=5) y = x && f%3==0; if (y)
    - Las instrucciones de decisión compleja como switch se reducen a una versión complejas de if’s.

- #### 2.3.5 Funciones
    - Las funciones pueden reducir a en línea, lo que se hace es expander el código original de la función.
    - Las funciones se descomponen simplificando los parámetros de manera individual al igual que el valor de retorno.

- #### 2.3.6 Estructuras
    - Estructura y fases de un compilador.
     Análisis lineal También conocido como: análisis léxico o exploración.
     Ejemplo, en la proposición de asignación: posicion = inicial + velocidad * 60 Se identifican los siguientes componentes léxicos Identificador (posicion) Símbolo de asignación (=) Identificador (inicial) Signo de suma (+) Identificador (velocidad) Signo de multiplicación (*) Número (60)

