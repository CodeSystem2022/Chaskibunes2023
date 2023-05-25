let x = 10; // Variable de tipo primitiva
console.log(x.length);
console.log('Tipos Primitivos');

//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'es',
    get lang(){
        return this.idioma.toUpperCase(); // Convierte la minúscula a mayúsculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ //método o función en JavaScript
        return this.nombre+' '+this.apellido;
    },
    get nombreEdad(){ //Este es el método get
        return this.nombre+' edad: '+this.edad;
    }
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

console.log('Ejecutando con un objeto');
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.dirección = 'Salada 14';
persona2.telefono = '6543314677';
console.log(persona2.telefono);

console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); //Accedemos como si fuera un arreglo

console.log('Usamos el ciclo for in');
//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');
persona.apellido //Cambiamos dinamicamente un valor del objeto
delete persona.apellido //Eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto
//Número 1: la más sencilla: concatenar cada valor de cada propiedad
console.log('Distinta formas de imprimir un objeto: forma 1');
console.log(persona.nombre+', '+persona.apellido);

//Número 2: A través del ciclo for in
console.log('Distinta formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Número 3: La función Object.values()
console.log('Distinta formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilizaremos el método JSON.stringfy
console.log('Distinta formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el método get')
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this. nombreCompleto = function() {
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3('Leo', 'Lopez', 'lopez1@gmail.com');
padre.nombre = 'Luis'; //Modificamos el nombre
padre.telefono = '549261239445'; //Una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la función
let madre = new Persona3('Laura', 'Contrera', 'contreta1@gmail.com' );
console.log(madre);
console.log(madre.telefono); //La propiedad no esta definida
console.log(madre.nombreCompleto());


//Diferentes formas de crear objetos
//caso número 1
let miObjeto = new Object(); //Esta es una opción formal
//caso número 2
let miObjeto2 = {}; //Esta opción es breve y recomendada

//caso String 1
let miCaddena = new String('Hola'); //Sintaxis formal
//caso String 2
let miCaddena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//caso con números 1
let miNumero = new Number(1); //Es formal no recomendable
//caso con números 2
let miNumero2 = 1; //Sintaxis recomendada

//caso boolean 1
let miBoolean1 = new Boolean(flase); //Formal
//caso boolean 2
let miBoolean2 = false; //Sintaxis recomendada

//caso Arreglos 1
let miArreglo1 = new Array(); //Formal
//caso Arreglos 2
let miArreglo2 = []; //Sintaxis recomendada

//caso function 1
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//caso function 2
let miFuncion2 = function(){}; //Notación simplificada y recomendada

//Uso de prototype
Persona3.prototype.telefono = '261488598';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '549261949589';
console.log(madre.telefono);

//Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        //return titulo+': '+this.nombre+' '+this.apellido+' '+ telefono;
        return this.nombre+' '+this.apellido;   
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '549261432894'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '549261322345'));

//Método Apply
let arreglo = ['Ing.', '549261322345'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));