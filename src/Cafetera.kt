class Cafetera(var ubicacion: String) {

    var capMax = 1000.0
    var cantidad: Double = 0.0


    constructor(ubicacion: String, capacidad: Double ): this(ubicacion){
        this.cantidad = capMax
    }

    constructor(ubicacion: String, capacidad: Double , cantidad:Double): this(ubicacion, capacidad){

        if(this.cantidad > capacidad){
            this.cantidad = capMax
        }
    }


    init {
        var cantidad: Double = 0.0

    }
    fun llenar(){
        this.cantidad = capMax
    }

    fun servirTaza(taza: Taza){
        if (this.cantidad >= taza){
            taza.llenar()
            this.capacidad - cantidad
        }
    }


}