
const automoviles = ['Chevrolet', 'Renault', 'Ford'];
console.log(automoviles);

//Recorremos elementos 
console.log(automoviles[0]);
console.log(automoviles[2]);

for(let i = 0; i < automoviles.length; i++){
    console.log(i+ ' : '+automoviles[i]); 
}


//Modificamos elementos
automoviles[1] = 'Volvo';
console.log(automoviles[1]);

//Agregamos valores
automoviles.push('Audi'); //Agregamos el elemento al final 
console.log(automoviles);

//Otras formas de agregar elementos 
automoviles[automoviles.length] = 'Peugeot';
console.log(automoviles);

//Otra forma de agregar elementos teniendo CUIDADO
automoviles[6] = 'Renault';
console.log(automoviles);

//Como preguntar si es una Array o Arreglo
console.log(Array.isArray(automoviles)); //Devuelve un booleano

console.log(automoviles instanceof Array); //Preguntamos si la variable es una instacia de la clase Array
