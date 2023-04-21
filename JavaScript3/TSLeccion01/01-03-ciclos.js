// cilco WHILE  -------------------------

let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log('Fin del ciclo while');

// ciclo DO WHILE   ---------------------

let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log('Fin del ciclo do while');

// ciclo FOR    ----------------------

for(let contando = 0; contando<3 ;contando++){
    console.log(contando);
}
console.log('Fin del ciclo for');

// Palabra reservada BREAK  ----------------

for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando);
        break
    }
}
console.log('Termina el ciclo al encontrar el primer par')

// Palabra reservada CONTINUE   ----------------------

for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue;
    }
    console.log(contando)
}
console.log('Termina el ciclo')

//Etiquetas LABELS  ---------------------
inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando);
        break inicio; // la etiqueta inicio le indica donde debe de romper
    }
}
console.log('Termina el ciclo al encontrar el primer par')


