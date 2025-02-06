class Taza(val capacidad:Int = 50, val color: Color = Color.blanco) {

    var cantidad:Int = 0


        set(value){
            if(field > capacidad){
                field = capacidad
            }else{
                field = value
            }
        }

    fun llenar(){
        cantidad = capacidad
    }
    fun llenar(cantidadDeTaza: Int){
        this.cantidad = cantidadDeTaza
    }

    override fun toString(): String {
        return "Taza de color $color, capacidad $capacidad c.c., cantidad actual $cantidad"
    }
}


