<img src="img/itma.png" width="90">_________________________________<img src="img/tec.png" width="90">

### TECNOLOGICO NACIONAL DE MEXICO
### INSTITUTO TECNOLOGICO DE MILPA ALTA II
### LENGUAJES AUTOMATAS II
### PROFESOR:
#### ROLDAN AQUINO SEGURA 
### ALUMNO:
#### ALEJANDRO POZOS RIVERA
### TEMA:
#### GENERACION DE CODIGO OBJETO
#### NUMERO DE UNIDAD: 4°
### FECHA: 
#### 10 DE ENERO DE 2021


<br>
<br>
<br>
<br>

#### 4.1 Registro
- Los registros son la memoria principal de la computadora. Existen diversos
registros de propósito general y otros de uso exclusivo.
Algunos registros de propósito general son utilizados para cierto tipo de funciones.
Existen registros acumuladores, puntero de instrucción, de pila, etc.<br>
**Distribución**<br>
- La distribución es el proceso en el que el programa generado puede ejecutarse en
otras máquinas.
    Con respecto al ensamblador, la mayoría del direccionamiento se hace relativo
    para que el programa sea relocalizable por un programa llamado cargador.
    En el caso de programas compilados se necesitan de las librerías, si son estáticas
    se incluyen en el ejecutable por lo que el programa se hace gráfico, si son
    dinámicas no pero el programa es más pequeño.
    Debido a la complejidad del software actual se necesitan de asistentes para poder
    instalar y ejecutar un programa.
    Operar sobre registros es más rápido y eficiente que operar sobre memoria. Por
    ello, la adjudicación eficiente de registros tiene un gran impacto en la performance.
- El uso de registros puede dividirse en dos subproblemas:
    - Durante la reserva de registros (allocation), se seleccionan el conjunto de
    variables que vivirá en registros en un punto del programa. 
    - Durante la (posterior) asignación de registros (assignation), se elige el registro
    específico para cada variable.
