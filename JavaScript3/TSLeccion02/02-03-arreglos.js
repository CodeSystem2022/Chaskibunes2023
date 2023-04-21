// SINTAXIS VIEJA   ----------------
// let autos = new Array('Ferrari', 'Renault','BMW');

const autos = ['Ferrari', 'Reanult', 'BMW'];
console.log(autos);

// Crecorremos los elementos del arreglo
console.log(autos[0]);
console.log(autos[2])

for(let i = 0; i < autos.length ; i++){
    console.log(i+': '+autos[i]);
}

//Modificamos los elemtos del arreglo
autos[1] = 'Volvo';
console.log(autos[1]);

//Agreagar nuevos valores al arreglo
autos.push('Audi');
console.log(autos);

//Otras formas de agregar elemtos al arreglo
autos[autos.length] = 'Porche';
console.log(autos);

//Alerta a la hora de usar este metodo
autos[6] = 'Renault';
console.log(autos);

//Como pregusntar si es in Array / Arreglo
console.log(Array.isArray(autos)); // Devuelve True o False dependiendo de lo que sea

console.log(autos instanceof Array); //Preguntamos lo mismo
