
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

### 2.1 Notaciones
Las notaciones son una forma especial en la que se pueden expresar una expresión matemática y puedan ser de 3 formas: infija, prefija y posfija. Los prefijos, Pre - Pos - In se refieren a la posición relativa del operador con respecto a los dos operandos.

- #### 2.1.1 Prefija

    - La expresión o notación prefija nos indica que el operador va antes de los Operandos sus características principales son:

    - Los operadores conservan el mismo orden que la notación infija equivalente.
    - No requiere de paréntesis para indicar el orden de precedencia de operadores ya que él es una operación.
    - Se evalúa de izquierda a derecha hasta que encuentra el primer operador seguido inmediatamente de un par de operando.
    - Se evalúa la expresión binaria y el resultado se cambia como un nuevo operando. Se repite hasta que nos quede un solo resultado.
    - El orden es operador, primer operando, segundo operando.

- #### 2.1.2 Infija

   - La expresión o notación infija es la forma más común que utilizamos para escribir expresiones   atemáticas, estas notaciones se refiere a que el operador esta entre los operadores. La notación infija puede estar completamente parentizada o puede basarse en un esquema de precedencia de operadores así como el uso de paréntesis para invalidar los arreglos al expresar el orden de evaluación de una expresión:  
    3*(4) = 12
    3*(4)+ = 14
    3*(4+2) = 18

    - La notación infija tiene el problema de que en expresiones con más de un operador existe ambigüedad sobre cuál es el orden de evaluación. Por ejemplo, la expresión 8/4/2 se puede interpretar como (8/4)/2 o bien 8/(4/2).
    - Las otras notaciones no sufren este problema.
    La notación habitual. El orden es primer operando, operador, segundo operando.

- #### 2.1.3 Postfija
    - Como su nombre lo indica se refiere a que el operador ocupa la posición 
    después de los operandos sus características principales son:
    - El orden de los operandos se conserva igual que la expresión infija equivalente no utiliza paréntesis ya que no es una operación ambigua.
    - La operación posfija no es exactamente lo inverso a la operación prefija equivalente.
    - El orden es primer operando, segundo operando, operando.
    (A+B)*C AB+C*
    Ejemplo:
    Si deseamos representar las expresiones (2+(3*4)) = xy ((2+3)*4) = x en las tres notaciones mencionadas, el resultado sería:
    (2+(3*4)) = x
    ((2+3)*4) = x
    Notación postfija
    2 3 4 * + x =
    2 3 + 4 * x =

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

<br>

##### Fuentes de información 

http://itpn.mx/recursosisc/7semestre/leguajesyautomatas2/Unidad%20II.pdf

http://dsc.itmorelia.edu.mx/~jcolivares/courses/ps207b/ps2_u6.pdf

https://alexisbladimirlopezfigueroa1998.blogspot.com/2019/09/?m=0

http://informatica.uv.es/docencia/iiguia/asignatu/2000/PL/2008/tema7.pdf

