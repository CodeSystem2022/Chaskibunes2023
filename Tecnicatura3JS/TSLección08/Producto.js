class Prodcuto{

    static contadorProcutos = 0;

    constructor(nombre,precio){
        this._idProducto = ++Prodcuto.contadorProcutos;
        this._nombre = nombre;
        this._precio = precio;
    }

    getIdProducto(){
        return this._idProducto;
    }

    getNombre(){
        return this._nombre;
    }

    getPrecio(){
        return this._precio;
    }

    setNombre(nombre){
        this._nombre = nombre;
    }

    setPrecio(precio){
        this._precio = precio;
    }

    toString(){
        return `${this._idProducto}: ${this._nombre} $${this._precio}`
    }

}