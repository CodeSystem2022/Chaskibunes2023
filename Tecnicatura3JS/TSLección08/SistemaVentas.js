class Producto {
    static contadorProductos = 0;
    constructor(nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    //Getters and Setters

    get idProducto() {
        return this._idProducto;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get precio() {
        return this._precio;
    }

    set precio(precio) {
        this._precio = precio;
    }
    toString(){ //Template Literals: Nos permite insertar código dinamicamente
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
} //Fin de la clase Producto

class Orden{
    static contadorOrdenes = 0;
    static getMax_PRODUCTOS(){ //Simula una constante
        return 5
    }
    
    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._Productos = [];
        this._contadorProductosAgregas = 0;
    }
    get idOrden(){
        return this._idOrden;
    }
    agregarProducto(producto) {
        if (this._Productos.length < Orden.getMax_PRODUCTOS()) {
            this._Productos.push(producto);//Tenemos 2 tipos de sintaxis: 1
            //this._productos[this._contadorProductosAgregados++] = producto; //Segunda instancia
        } else { //Fin ciclo if
            console.log('No se pueden agregar más productos');
        }//Fin del ciclo else
    }//Fin del método agregarProducto

    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._Productos){
            totalVenta += producto.precio;
        }//Fin ciclo for
        return totalVenta;
    }//Fin del método calcularTotal

    mostrarOrden() {
        let productosOrden = ' ';
        for (let producto of this._Productos) {
            productosOrden += '\n{ ' + producto.toString() + ' }';
        }
            console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosOrden}`);
    }//Fin del método mostrarOrden

}//Fin de la clase Orden

let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 150);
let producto3 = new Producto('Cinturon', 50);
let orden1 = new Orden();
let orden2 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden1.mostrarOrden();
orden2.mostrarOrden();
