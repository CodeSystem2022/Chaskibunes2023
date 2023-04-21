
myFuncion(8,2) // Esta forma de excribir codigo se conoce como HOSTING

function myFuncion(a, b){
    // console.log('Sumamos '+a+'+'+b+': '(a+b));
    return a + b;
}

//Llamamos la fución
myFuncion(5,4);

let resultado = myFuncion(6, 7);
console.log(resultado);

//Funciones de tipo expresion / tipo anonima    ------------------------------

let x = function(a, b){ return a+b };
resultado = x(5, 6);
console.log(resultado);

//Funciones de tipo SELF e INVOKING

(function(a, b){
    console.log('Ejecutando la funcion: '+ (a + b));
})(9, 6);


console.log(typeof myFuncion);
function myFuncionDos(a, b){
    console.log(arguments.length);
}

myFuncionDos(5, 7);

//toString
var miFuncionTexto = myFuncionDos.toString();
console.log(miFuncionTexto);

//Funciones Flecha ----------------------------------------
const suamrFuncionFlecha = (a, b) => a + b;
resultado = suamrFuncionFlecha(3, 7);
console.log(resultado);

let sumar = function(a = 4, b = 8){
    console.log(arguments[0]);  //muestras solo el parametro de "a"
    console.log(arguments[1]);
    return a + b + arguments[2];
}
resultado = sumar(3, 5, 9);
console.log(resultado);

//Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}

//Tipos primitivos
let k = 10;
function cambiarValor(a){  //Paso por valor ------------------
    a = 20;
}

cambiarValor(k)

const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}
console.log(persona);  //primer valor de persona
function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);
console.log(persona);  //valor de persona modificado por la funcion
