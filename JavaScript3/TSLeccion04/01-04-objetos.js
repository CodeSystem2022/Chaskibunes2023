let x = 10;
console.log(x.lenght);

//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    //método o funcion
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto())

//Otra forma de crear un objeto
let persona2 = new Object();
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '54678798234';
console.log(persona2.telefono);

//accedemos a los datos como si fuea un arreglo
console.log(persona['apellido']);

//for in
for(propiedad in persona){
    console.log(propiedad)
    console.log(persona[propiedad])
}

persona.apellidos = 'Bentandoud';
console.log(persona);
delete persona.apellidos;

//Distintas formas de imprimir un objeto
//Numero 1: la mas sencilla--concatenacion
console.log(persona.nombre+', '+persona.apellido);

//Numero 2: Ciclo for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: Con un metodo -- Object.values()
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: El metodo --JSON.stringify
let personaString = JSON.stringify(persona);
console.log(personaString);
