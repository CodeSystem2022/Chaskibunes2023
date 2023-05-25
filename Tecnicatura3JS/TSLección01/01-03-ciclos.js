// While
let contador = 0;
while (contador < 3) {
  console.log(contador); 0, 1, 2
  contador++;
}
console.log("Fin del ciclo While");

//Do While
let conteo = 0;
do {
  console.log(conteo); 0, 1, 2
  conteo++;
} while (conteo < 3);
console.log("Fin del ciclo Do While"); //Fin del ciclo do while

//For
for (let contando = 0; contando < 3; contando++) {
  console.log(contando); 0, 1, 2
}
console.log("Fin del ciclo For"); //Fin del ciclo for

//palabra reservada break
for (let contando = 0; contando < 10; contando++) {
    if (contando % 2 == 0) {
        console.log(contando); //muestra todos los pares 0
        break;
    }
}
console.log("Termina el ciclo al encontrar el primer número par");

//La palabra continue y Etiquetas label
inicio:
for (let contando = 0; contando <= 10; contando++) {
    if (contando % 2 !== 0) {
        break inicio; //ir a la siguiente iteración
    }
console.log(contando); 0, 2, 4, 6, 8, 10
    
}
console.log("Termina el ciclo");
