//Primero creamos las variables ya inicializadas que ocuparemos para echar a andar nuestro programa, para que sea mas como todas seran de tipo String
var nombre = "Maria Ofelia";
var ap_paterno = "Peredo";
var ap_materno = "Dominguez";
var fecha = "15-03-1956";
var rfc = "";
/*for (let index = 0; index < fecha.length; index++) {
    const element = fecha[index];
    
}*/
//Se crea una funcion que se llama caracter invalido para cada ves que cualquier apellido que incie con Ñ lo cambie por una X
function caracter_invalido(letra) {
    return letra.replace("Ñ", "X").replace("/", "X");
}
//La siguiente funcion quita el primer nombre si es MARIA, MA, MA., JOSE, J o J., lo remplaza por algo vacio y agrego trim para eliminar espacios al inicio y final
function quita_primer_nom(palabra) {
    return palabra.replace("MARIA", "").replace("MA.", "").replace("MA", "").replace("JOSE", "").replace("J", "").replace("J.", "").trim();
}
/*La siguiente funcion quita todos los articulos cuando el apellido tiene DEL, LAS, DE, LA, Y, A a lo cual por medio del metodo replace lo cambia por un espacio en
blanco*/
function quita_articulos(palabra) {
    return palabra.replace("DEL ", "").replace("LAS ", "").replace("DE ", "").replace("LA ", "").replace("Y ", "").replace("A ", "");
}
/*La siguiente funcion quita todos los articulos cuando el apellido tiene DA, DAS, DE, DEL, DER, DI, DIE, DD, EL, LA, LOS, LAS, LE, LES, MAC, MC, VAN, VON, Y
a lo cual por medio del metodo replace lo cambia por un espacio en blanco*/
function quita_preposicion(palabra) {
    return palabra.replace("DA", "").replace("DAS", "").replace("DE", "").replace("DEL", "").replace("DER", "").replace("DI", "").replace("DIE", "").replace("DD", "").replace("EL", "").replace("LA", "").replace("LAS", "").replace("LE", "").replace("LES", "").replace("MAC", "").replace("MC", "").replace("VAN", "").replace("VON", "").replace("Y", "").trim();
}
//Para empezar a los apellidos tanto materno como paterno les quitamos los articulos por medio de la funcion antes ya declarada
ap_materno = quita_articulos(ap_materno.toUpperCase());
ap_paterno = quita_articulos(ap_paterno.toUpperCase());
/*Aqui creamos una nueva variable que sera un array de tipo String donde le asignaremos el nombre en mayusculas partido con el metodo split por si encuentra un
segundo nombre */
var nombre_x_partes = nombre.toUpperCase().split(" ");
/*Con la siguiente condicional lo que se esta realizando es que si encuentra una "Ñ" al principio de los apellidos los mandara a la duncion caracter invalido para
de esa forma cambiar la letra "Ñ" por una "X"*/
if (ap_paterno.charAt(0) == "Ñ" || ap_materno.charAt(0) == "Ñ" || ap_paterno.charAt(1) == "/" || ap_materno.charAt(1) == "/") {
    ap_paterno = caracter_invalido(ap_paterno.toUpperCase());
    ap_materno = caracter_invalido(ap_materno.toUpperCase());
}
/*En esta condicional lo que se esta realizando es la busqueda si el ususario tiene 2 nombres y si alguno de ellos empieza con algunos de los nombres o letras
especificadas dentro del if, si es asi lo mandara a la funcion quitar primer nombre */
if (nombre_x_partes[0] == "MARIA" || nombre_x_partes[0] == "MA." || nombre_x_partes[0] == "MA" ||
    nombre_x_partes[0] == "JOSE" || nombre_x_partes[0] == "J" || nombre_x_partes[0] == "J.") {
    nombre = quita_primer_nom(nombre.toUpperCase());
    /*En la siguinte condicional se realiza lo contrario a la primera, se esta preguntando si es diferente de los siguientes nombres ocupar solo el primero */
}
else if (nombre_x_partes[0] != "MARIA" || nombre_x_partes[0] != "MA." || nombre_x_partes[0] != "MA" ||
    nombre_x_partes[0] != "JOSE" || nombre_x_partes[0] != "J" || nombre_x_partes[0] != "J.") {
    nombre.replace(" ", "");
}
/*Aqui creamos una nueva variable que sera un array de tipo String donde le asignaremos el nombre en mayusculas partido con el metodo split por si encuentra un
segundo Apellido en materno y paterno */
var apellidop_x_partes = ap_paterno.toUpperCase().split(" ");
var apellidom_x_partes = ap_materno.toUpperCase().split(" ");
/*Aqui creamos una nueva variable que sera un array de tipo String donde le asignaremos los datos que no se pueden ingresar y posteriormente compararlos */
/*DA, DAS, DE, DEL, DER, DI, DIE, DD, EL, LA, LOS, LAS, LE, LES, MAC, MC, VAN, VON, Y */
var no_valido = ["DA", "DAS", "DE", "DEL", "DER", "DI", "DIE", "DD", "EL", "LA", "LOS", "LAS", "LE", "LES", "MAC", "MC", "VAN", "VON", "Y"];
/*Aqui leemos todos los datos que tenga el array que creamos  */
for (var index = 0; index < no_valido.length; index++) {
    /*Comparamos todos los datos para que no haya datos invalidos*/
    if (apellidop_x_partes[0] != no_valido[index] || apellidom_x_partes[0] != no_valido[index]) {
        ap_paterno = quita_preposicion(ap_paterno.toUpperCase());
        ap_materno = quita_preposicion(ap_materno.toUpperCase());
    }
    else {
        ap_paterno.replace(" ", "");
        ap_materno.replace(" ", "");
    }
}
//Aqui mande a imprimir por medio de un consol por que no sabia como me regresaria la fecha 
console.log(fecha.split("-"));
/*Nuevamente por medio de la funcion split cortamos la cadena para obtener lo que nececitamos*/
var fecha_x_partes = fecha.split("-");
/*Aqui creamos nuevas variables donde asignaremos dia, mes y año que son los datos que nos interesan*/
var dia = fecha_x_partes[0];
var mes = fecha_x_partes[1];
var ano = fecha_x_partes[2];
/*Por ultimo agregamos los datos a la variable rfc con '+=' para evitarnos mas lineas de codigo, y le asignamos por medio del metodo substr los fragmentos de cadena
que nos importa en realidad de cada uno de los valores */
rfc += ap_paterno.substr(0, 2).toUpperCase();
rfc += ap_materno.substr(0, 1).toUpperCase();
rfc += nombre.substr(0, 1).toUpperCase();
rfc += ano.substr(2, 4);
rfc += mes.substr(0, 2);
rfc += dia.substr(0, 2);
/*Agregamos un nuevo array de tipo String donde le asignaremos las palabras antisonantes  */
var palabras_feas = ["BACA", "BAKA", "BUEI", "BUEY", "CACA", "CACO", "CAGA", "CAGO", "CAKA", "CAKO", "COGE", "COGI", "COJA", "COJE", "COJI", "COJO", "PUTO", "CACA", "PENE",
    "NEPE", "PIPI", "PEDO"];
/*Por medio de la siguiente estructura de repeticion nos apoyaremos para poder leer todas las palabras feas */
for (var index = 0; index < palabras_feas.length; index++) {
    /*Con la siguiente estructura condicional validaremos que en el tramo de cadena que vamos a obtener por medio del substr, si es igual a una palabra antisonante
    elimine el espacio de la palanra 2 y lo remplace por una "X" */
    if (rfc.substr(0, 4) == palabras_feas[index]) {
        rfc = rfc.slice(0, 1);
        rfc += "X";
        rfc += ap_materno.substr(0, 1).toUpperCase();
        rfc += nombre.substr(0, 1).toUpperCase();
        rfc += ano.substr(2, 4);
        rfc += mes.substr(0, 2);
        rfc += dia.substr(0, 2);
    }
}
/*Y mandamos a imprimir nuestra variable por medio del consol.log*/
console.info("Nombre: " + nombre.toUpperCase() + "\nApellido Paterno: " + ap_paterno + "\nApellido Materno: " + ap_materno + "\nFecha de nacimiento: " + fecha);
console.warn("Tu RFC es: " + rfc);
