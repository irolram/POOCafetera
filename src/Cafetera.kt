class Cafetera(var ubicacion: String) {

     var capacidad = 1000
     var cantidad: Int = 0


    constructor(ubicacion: String, capacidad: Int ): this(ubicacion){
        this.cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(ubicacion, capacidad){
        if(cantidad > capacidad){
            this.cantidad = capacidad
        }else{
            this.cantidad = cantidad
        }
    }



    fun llenar(){
        this.cantidad = capacidad

    }

    fun servirTaza(taza: Taza): Boolean {

        var cafeterallena = true


                if (this.cantidad != 0){



                    if (this.cantidad >= taza.capacidad - taza.cantidad){
                        this.cantidad -= (taza.capacidad - taza.cantidad)
                        taza.llenar()
                    }else{
                        taza.llenar(this.cantidad)
                        this.cantidad = 0
                        cafeterallena = false
                    }



                }




        return cafeterallena
    }



    fun vaciar(){
        cantidad = 0
    }

    fun agregarCafe(cantidad: Int = 200){

        if (this.cantidad + cantidad > capacidad){
            this.cantidad = capacidad
        }else{
          this.cantidad += cantidad
        }

    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad, cantidad = $cantidad)"
    }
}