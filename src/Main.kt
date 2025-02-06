//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina
    val cafetera1 = Cafetera("Sala")

    val cafetera2 = Cafetera("Cocina", 750)
    cafetera2.agregarCafe(750)

    val cafetera3 = Cafetera("Oficina", 500, 200)

    //TODO: Crear una lista de 20 tazas con capacidades aleatorias

    val posiblesCapacidadesTazas = intArrayOf(50,75,100)
    val listaTazas = mutableListOf<Taza>()

    for (i in 1..20){
        listaTazas.add(Taza(posiblesCapacidadesTazas.random(), Color.entries.random()))
    }





    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.

    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    listaTazas.forEach({
        println(it)
    })

    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    println("Vaciar la cafetera2...")
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    println("Agregar 400 c.c. de café a la cafereta3...")

    //TODO: Llenar la cafetera1 de café.

    cafetera1.llenar()

    //TODO: Vaciar la cafetera2.

    cafetera2.vaciar()

    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.

    cafetera2.agregarCafe(cafetera2.capacidad/2)

    //TODO: Agregar 400 c.c. de café a la cafereta3

    cafetera3.agregarCafe(400)

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras

    println(cafetera1)
    println(cafetera2)
    println(cafetera3)


    println("**********************************************")
    println("Servir café en las tazas...")

    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.

    val listaCafeteras = arrayOf<Cafetera>(cafetera1, cafetera2, cafetera3)

    for (cafetera in listaCafeteras){
        for (taza in listaTazas){
            if (taza.cantidad != taza.capacidad){
                cafetera.servirTaza(taza)
                println(cafetera.ubicacion+"  "+taza)
            }
        }
    }

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.


}