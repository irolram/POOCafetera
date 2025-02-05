class Cafetera(var ubicacion: String) {

    var capacidad = 1000
    var cantidad: Int = 0


    constructor(ubicacion: String, capacidad: Int ): this(ubicacion){
        this.cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int , cantidad:Double): this(ubicacion, capacidad){

        if(this.cantidad > capacidad){
            this.cantidad = capacidad
        }
    }


    init {
        var cantidad: Int = 0

    }
    fun llenar(){
        this.cantidad = capacidad

    }

    /*fun servirTaza(taza: Taza){
        if (this.cantidad >= taza){
            taza.llenar()
            this.capacidad - cantidad
        }
    }

     */

    fun vaciar(){
        cantidad = 0
    }

    fun agregarCafe(cantidad: Int){


    }

}