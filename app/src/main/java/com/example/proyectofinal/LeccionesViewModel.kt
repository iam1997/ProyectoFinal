package com.example.proyectofinal

import android.util.Log
import androidx.lifecycle.ViewModel
import java.util.*

class LeccionesViewModel : ViewModel() {

    private var _flashcards = mutableListOf<Flashcards>()

    var flashcards = _flashcards

    init {
        Log.d("LeccionesViewModel", "LeccionesViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("LeccionesViewModel", "LeccionesViewModel destroyed!")
    }

    var leccAList = mutableListOf(
        Flashcards("A", R.drawable.abc_a, "Con la mano cerrada, se muestran las uñas y se estira el dedo pulgar hacia un lado. La palma mira al frente."),
        Flashcards("B", R.drawable.abc_b, "Los dedos índice, medio, anular y meñique se estiran bien unidos y el pulgar se dobla hacia la palma, la cual mira al frente."),
        Flashcards("C", R.drawable.abc_c, "Los dedos índice, medio, anular y meñique se mantienen bien unidos y en posición cóncava; el pulgar también se pone en esa posición. La palma mira a un lado."),
        Flashcards("D", R.drawable.abc_d, "Los dedos medio, anular, meñique y pulgar se unen por las puntas y el dedo índice se estira. La palma mira al frente."),
        Flashcards("E", R.drawable.abc_e, "Se doblan los dedos completamente, y se muestran las uñas. La palma mira al frente."),
        Flashcards("F", R.drawable.abc_f, "Con la mano abierta y los dedos bien unidos, se dobla el índice hasta que su parte lateral toque la yema del pulgar. La palma mira a un lado."),
        Flashcards("G", R.drawable.abc_g, "Se cierra la mano y los dedos índice y pulgar se estiran. La palma mira hacia usted."),
        Flashcards("H", R.drawable.abc_h, "Con la mano cerrada y los dedos índice y medio bien estirados y unidos, se extiende el dedo pulgar señalando hacia arriba. La palma mira hacia usted."),
        Flashcards("I", R.drawable.abc_i, "Con la mano cerrada, el dedo meñique se estira señalando hacia arriba. La palma se pone de lado."),
        Flashcards("J", R.drawable.abc_j, "Con la mano cerrada, el dedo meñique bien estirado señalando hacia arriba y la palma a un lado dibuja una j en el aire."),
        Flashcards("K", R.drawable.abc_k, "Se cierra la mano con los dedos índice, medio y pulgar estirados. La yema del pulgar se pone entre el índice y el medio. Se mueve la muñeca hacia arriba."),
        Flashcards("L", R.drawable.abc_l, "Con la mano cerrada y los dedos índice y pulgar estirados, se forma una l. La palma mira al frente."),
        Flashcards("M", R.drawable.abc_m, "Con la mano cerrada, se ponen los dedos índice, medio y anular sobre el pulga."),
        Flashcards("N", R.drawable.abc_n, "Con la mano cerrada, se ponen los dedos índice y medio sobre el pulgar."),
        Flashcards("Ñ", R.drawable.abc_enje, "Con la mano cerrada, se ponen los dedos índice y medio sobre el pulgar. Se mueve la muñeca a los lados."),
        Flashcards("O", R.drawable.abc_o, "Con la mano se forma una letra o. Todos los dedos se tocan por las puntas."),
        Flashcards("P", R.drawable.abc_p, "Con la mano cerrada y los dedos índice, medio y pulgar estirados, se pone la yema del pulgar entre el índice y el medio."),
        Flashcards("Q", R.drawable.abc_q, "Con la mano cerrada, se ponen los dedos índice y pulgar en posición de garra. La palma mira hacia abajo, y se mueve la muñeca hacia los lados."),
        Flashcards("R", R.drawable.abc_r, "Con la mano cerrada, se estiran y entrelazan los dedos índice y medio. La palma mira al frente."),
        Flashcards("S", R.drawable.abc_s, "Con la mano cerrada, se pone el pulgar sobre los otros dedos. La palma mira al frente."),
        Flashcards("T", R.drawable.abc_t, "Con la mano cerrada, el pulgar se pone entre el índice y el medio. La palma mira al frente."),
        Flashcards("U", R.drawable.abc_u, "Con la mano cerrada, se estiran los dedos índice y medio unidos. La palma mira al frente."),
        Flashcards("V", R.drawable.abc_v, "Con la mano cerrada, se estiran los dedos índice y medio separados. La palma mira al frente."),
        Flashcards("W", R.drawable.abc_w, "Con la mano cerrada, se estiran los dedos índice, medio y anular separados. La palma mira al frente."),
        Flashcards("X", R.drawable.abc_x, "Con la mano cerrada, el índice y el pulgar en posición de garra y la palma dirigida a un lado, se realiza un movimiento al frente y de regreso."),
        Flashcards("Y", R.drawable.abc_y, "Con la mano cerrada, se estira el meñique y el pulgar. La palma mira hacia usted."),
        Flashcards("Z", R.drawable.abc_z, "Con la mano cerrada, el dedo índice estirado y la palma al frente, se dibuja una letra z en el aire."))

    var leccBlist = mutableListOf(
        Flashcards("Amarillo", R.drawable.color_amarillo, "Se coloca una letra a sobre el dorso de la otra mano, y se mueve en círculo sin separarse."),
        Flashcards("Anaranjado", R.drawable.color_anaranjado, "Se coloca una letra c sobre la mejilla, tocándola con la parte lateral del dedo índice y pulgar, y se cierra y abre la mano."),
        Flashcards("Azul", R.drawable.color_azul, "Se coloca una letra a sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y se mueve en círculo sin separarla."),
        Flashcards("Azul Rey", R.drawable.color_azul_rey, "Se coloca una letra a sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y se mueve en círculo sin separarla. Luego se coloca una letra r a la altura de la oreja, y se mueve en círculo."),
        Flashcards("Blanco", R.drawable.color_blanco, "Se coloca una letra b sobre el dorso de la otra mano, y se desliza a un lado en línea recta, sin separarse."),
        Flashcards("Brilliante", R.drawable.color_brilliante, "Se colocan las palmas al frente, una al lado de la otra, y se mueven, uno a uno, los dedos."),
        Flashcards("Bronce", R.drawable.color_bronce, "Se coloca una letra b sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y se golpea la palma varias veces."),
        Flashcards("Café", R.drawable.color_caf_, "Se hace la letra c con ambas manos colocadas una sobre la otra, tocándose con la parte lateral del dedo índice y meñique, y se mueven en círculo sin separarse."),
        Flashcards("Claro", R.drawable.color_claro, "Se hace un capullo con ambas manos, tocándose con las puntas de los dedos, y se mueven en medio círculo hacia arriba y a los lados, abriendo las manos al mismo tiempo."),
        Flashcards("Color", R.drawable.color_color, "Con el dedo índice se toca el dorso de la otra mano y se desliza el dedo hacía usted."),
        Flashcards("Morado", R.drawable.color_morado, "Se hace una letra m, y con la punta de los dedos de esa mano se toca la parte lateral del dedo índice de la otra, y se mueven a los lados, sin separarse."),
        Flashcards("Negro", R.drawable.color_negro, "Se coloca una letra n sobre la palma de la otra mano, tocándola con las yemas de los dedos, y se mueve en línea recta al frente y de regreso."),
        Flashcards("Oscuro", R.drawable.color_oscuro, "Se hace la letra o con ambas manos a los lados, y se mueven al mismo tiempo al centro, hasta cruzarse al frente. Los dedos terminan señalando a los lados."),
        Flashcards("Oro", R.drawable.color_oro, "Se coloca una letra o sobre la palma de la otra mano, tocándola con la parte lateral del dedo meñique, y la golpea varias veces."),
        Flashcards("Plata", R.drawable.color_plata, "Se coloca una letra p sobre la palma de la otra mano, tocándola con la parte lateral de la mano, y la golpea varias veces, sin separarse."),
        Flashcards("Rojo (1)", R.drawable.color_rojo_1, "Con la yema del dedo índice estirado, se  tocan los labios, y se mueve hacia abajo varias veces."),
        Flashcards("Rojo (2)", R.drawable.color_rojo_2, "Se coloca una letra r sobre los labios, y se mueve un poco hacia abajo."),
        Flashcards("Rosa", R.drawable.color_rosa, "Se coloca una letra r sobre la palma de la otra mano, y se desliza al frente y a usted varias veces."),
        Flashcards("Verde", R.drawable.color_verde, "Se coloca una letra v sobre la palma de la otra mano, y se desliza a la punta de los dedos y de regreso."),
        Flashcards("Verde limón", R.drawable.color_verde_lim_n, "Se coloca una letra v sobre la palma de la otra mano, y se desliza a la punta de los dedos y de regreso. Luego, se coloca la mano abierta sobre la mejilla, y se cierra en punta."))

    var leccClist = mutableListOf(
        Flashcards("Lunes", R.drawable.calendario_lunes, "Se hace una letra l, y se mueve en círculo."),
        Flashcards("Martes", R.drawable.calendario_martes, "Se hace una letra l con el dedo medio estirado, y se mueve en círculo."),
        Flashcards("Miércoles", R.drawable.calendario_miercoles, "Se hace una letra l con los dedos medio, anular y meñique estirados, y se mueve en círculo."),
        Flashcards("Jueves", R.drawable.calendario_jueves, "Se hace una letra j, y se mueve en círculo."),
        Flashcards("Viernes", R.drawable.calendario_viernes, "Se hace una letra v, y se mueve en círculo."),
        Flashcards("Sábado", R.drawable.calendario_sabado, "Se hace una letra s, y se mueve en círculo."),
        Flashcards("Domingo", R.drawable.calendario_domingo, "Se hace una letra d, y se mueve en círculo."),
        Flashcards("Enero", R.drawable.calendario_enero, "Se hace una letra e, y se rota la muñeca a los lados."),
        Flashcards("Febrero", R.drawable.calendario_febrero, "Se hace una letra f, y se rota la muñeca a los lados."),
        Flashcards("Marzo", R.drawable.calendario_marzo, "Se hace una letra m, y se mueve en círculo alrededor de la oreja."),
        Flashcards("Abril", R.drawable.calendario_abril, "Se hace una letra a, y se mueve en círculo alrededor de la oreja."),
        Flashcards("Mayo", R.drawable.calendario_mayo, "Se hace una letra m, y se rota la muñeca a los lados."),
        Flashcards("Junio", R.drawable.calendario_junio, "Se hace una letra i, y se rota la muñeca a los lados."),
        Flashcards("Julio", R.drawable.calendario_julio, "Se hace una letra i con el pulgar y el índice estirados, y se rota la muñeca a los lados."),
        Flashcards("Agosto", R.drawable.calendario_agosto, "Se hace una letra a, y se rota la muñeca a los lados."),
        Flashcards("Septiembre", R.drawable.calendario_septiembre, "Se hace una letra s, y se rota la muñeca a los lados."),
        Flashcards("Octubre", R.drawable.calendario_octubre, "Se hace una letra o, y se rota la muñeca a los lados."),
        Flashcards("Noviembre", R.drawable.calendario_noviembre, "Se hace una letra u, y se rota la muñeca a los lados."),
        Flashcards("Diciembre", R.drawable.calendario_diciembre, "Se hace una letra d, y se rota la muñeca a los lados."))

    var leccDlist = mutableListOf(
        Flashcards("Barba", R.drawable.cuerpohumano_barba, "Se coloca la mano en posición de garra sobre la parte superior de la barba, tocándola con la punta de los dedos, y se recorre hacia abajo."),
        Flashcards("Barbilla", R.drawable.cuerpohumano_barbilla, "Con el índice y el pulgar se rodea la barbilla, y los dedos vibran en su lugar."),
        Flashcards("Bigote", R.drawable.cuerpohumano_bigote, "Con el índice y el pulgar se simula tomar el bigote, y se mueven los dedos en medio círculo hacia arriba y a un lado."),
        Flashcards("Boca", R.drawable.cuerpohumano_boca, "Con el índice se señala la boca, y se mueve en círculo alrededor de ella."),
        Flashcards("Brazo", R.drawable.cuerpohumano_brazo, "Se coloca la mano abierta sobre el otro brazo, y se desliza hacia la muñeca."),
        Flashcards("Cadera", R.drawable.cuerpohumano_cadera, "Se coloca la mano abierta sobre la cadera, y la golpea ligeramente."),
        Flashcards("Cara", R.drawable.cuerpohumano_cara, "Con el índice se señala la frente, y se mueve el dedo alrededor de la cara."),
        Flashcards("Ceja", R.drawable.cuerpohumano_ceja, "Con el índice se recorre la ceja."),
        Flashcards("Codo", R.drawable.cuerpohumano_codo, "Con la mano abierta se rodea el codo del otro brazo doblado, y se mueve en círculo alrededor de éste."),
        Flashcards("Cuello", R.drawable.cuerpohumano_cuello, "Con las yemas de la mano abierta se toca el cuello."),
        Flashcards("Diente", R.drawable.cuerpohumano_diente, "Con el índice se señala un diente, y lo golpea ligeramente."),
        Flashcards("Espalda", R.drawable.cuerpohumano_espalda, "Se coloca la mano abierta sobre la espalda."),
        Flashcards("Estómago", R.drawable.cuerpohumano_estomago, "Con la palma de la mano se golpea el estómago ligeramente."),
        Flashcards("Frente", R.drawable.cuerpohumano_frente, "Se coloca la palma de la mano sobre la frente, y vibra en su lugar."),
        Flashcards("Garganta", R.drawable.cuerpohumano_garganta, "Se coloca una letra u sobre el cuello, tocándolo con las yemas, y se desliza hacia abajo, sin separarse."),
        Flashcards("Hombro", R.drawable.cuerpohumano_hombro, "Con las yemas de la mano abierta se toca el hombro."),
        Flashcards("Hueso", R.drawable.cuerpohumano_hueso, "Se colocan los dedos índices y medios, estirados y unidos, unos sobre los otros, tocándose por la parte lateral del dedo medio, y se rotan las muñecas hacia adelante y atrás sin despegarse."),
        Flashcards("Labios", R.drawable.cuerpohumano_labios, "Con el índice se señalan los labios, y se recorren de un lado al otro."),
        Flashcards("Lengua", R.drawable.cuerpohumano_lengua, "Con el índice se señala la lengua."),
        Flashcards("Mano", R.drawable.cuerpohumano_mano, "Se muestra la mano abierta a la persona con quien se habla."),
        Flashcards("Mejilla", R.drawable.cuerpohumano_mejilla, "Con el índice y el pulgar se pellizca la mejilla, y los dedos vibran en su lugar."),
        Flashcards("Muñeca", R.drawable.cuerpohumano_muneca, "Con la mano abierta se rodea la muñeca de la otra mano."),
        Flashcards("Nariz", R.drawable.cuerpohumano_nariz, "Con la punta del índice se señala la nariz."),
        Flashcards("Ojo", R.drawable.cuerpohumano_ojo, "Con el índice se señala el ojo."),
        Flashcards("Oreja", R.drawable.cuerpohumano_oreja, "Con el índice y el pulgar se jala la oreja."),
        Flashcards("Pecho", R.drawable.cuerpohumano_pecho, "Con la mano se golpea el pecho ligeramente."),
        Flashcards("Pelo", R.drawable.cuerpohumano_pelo, "Con el índice y el pulgar se toma un mechón de pelo, y se muestra."),
        Flashcards("Pestañas", R.drawable.cuerpohumano_pestana, "Se coloca la mano abierta frente al ojo, tocando la cara con el dorso de la muñeca, y se mueve hacia arriba, levantándose."),
        Flashcards("Pulgar", R.drawable.cuerpohumano_pulgar, "Con el índice se señala el dedo pulgar de la otra mano."),
        Flashcards("Uña", R.drawable.cuerpohumano_una, "Con el índice y el pulgar tocándose por las yemas, se rodea la uña del índice de la otra mano.")
    )

    var leccElist = mutableListOf(
        Flashcards("Adjetivo", R.drawable.appa_adjectivo, "Se coloca una letra a sobre la palma de la otra mano, se desliza hacia la punta de los dedos, hasta transformarse en una d."),
        Flashcards("Ante", R.drawable.appa_ante, "Se colocan las manos abiertas, una frente a la otra, sin tocarse."),
        Flashcards("Artículo", R.drawable.appa_articulo, "Se coloca una letra a sobre la palma de la otra mano, tocándola con la punta del pulgar, y se mueve en medio círculo hacia abajo."),
        Flashcards("Cada", R.drawable.appa_cada, "Se hace el número 6, y se mueve en medio círculo a un lado varias veces."),
        Flashcards("Conmigo", R.drawable.appa_conmigo, "Se colocan los pulgares señalando hacia arriba y unidos por los dorsos de los dedos, y se mueven en línea recta hacia usted."),
        Flashcards("Contigo (1)", R.drawable.appa_contigo_1, "Se colocan los pulgares señalando hacia arriba y unidos por los dorsos de los dedos, y se mueven en línea recta hacia el frente."),
        Flashcards("Contigo (2)", R.drawable.appa_contigo_2, "Se colocan los pulgares señalando hacia arriba y unidos por los dorsos de los dedos. Luego se señala con el índice a la persona de quien se trata."),
        Flashcards("De", R.drawable.appa_de, "Se hace una letra d, y se mueve hacia un lado."),
        Flashcards("Èl / Ella", R.drawable.appa_el_ella, "Se estira el dedo índice, y se dirige a la persona de quien se trata."),
        Flashcards("Ellos", R.drawable.appa_ellos, "Se estira el dedo índice, se mueve en medio círculo, y con él se señala a varias personas."),
        Flashcards("En", R.drawable.appa_en, "Se colocan los dedos índice y medio dentro del puño de la otra mano."),
        Flashcards("Entre (1)", R.drawable.appa_entre_1, "Se introduce la mano abierta entre los dedos índice y medio de la otra mano."),
        Flashcards("Entre (2)", R.drawable.appa_entre_2, "Con un movimiento hacia abajo, se coloca la mano abierta entre los dedos índice y pulgar de la otra mano."),
        Flashcards("Ésa / Ése / Eso", R.drawable.appa_esa, "Se colocan los dedos índice y medio en posición de garra, y se mueven hacia arriba y abajo varias veces."),
        Flashcards("Mi / Mío", R.drawable.appa_mi, "Con la mano abierta, se golpea el pecho."),
        Flashcards("Ni", R.drawable.appa_ni, "Se hace la letra h con ambas manos, tocándose por la punta de los dedos medios, se separan hacia abajo y se hace la letra i."),
        Flashcards("Nos / Nosotros / Nuestro", R.drawable.appa_nos, "Se coloca una letra n a un lado del pecho, y se mueve en medio círculo a un lado."),
        Flashcards("Para", R.drawable.appa_para, "Se coloca el dedo índice a un lado de la frente, y se mueve hacia abajo y a un lado."),
        Flashcards("Por", R.drawable.appa_por, "Con la mano abierta se roza el puño de la otra mano, y se mueve a un lado."),
        Flashcards("Primero", R.drawable.appa_primero, "Con el dedo índice, se toca el pulgar de la otra mano."),
        Flashcards("Propio", R.drawable.appa_propio, "Se hace una letra p, y con ella se golpea el corazón."),
        Flashcards("Suyo", R.drawable.appa_suyo, "Se hace una letra p, y se mueve hacia la persona de quien se habla."),
        Flashcards("También", R.drawable.appa_tambien, "Se estiran los dedos índice y medio, señalando al frente, y se unen y se separan."),
        Flashcards("Todavía", R.drawable.appa_todavia, "La mano en capullo, toca la palma de la otra mano golpeándola ligeramente."),
        Flashcards("Todo", R.drawable.appa_todo, "Se hace la letra t con ambas manos, señalándose por la punta de los dedos, y se mueven en círculos alternados."),
        Flashcards("Tú", R.drawable.appa_tu, "Con el dedo índice se señala a la persona de quien se trata."),
        Flashcards("Tuyo", R.drawable.appa_tuyo, "Se hace una letra p, y se rota la muñeca hacia la persona de quien se habla."),
        Flashcards("Usted", R.drawable.appa_usted, "Se hace la letra u con la palma arriba, y se mueve en medio círculo hacia un lado."),
        Flashcards("Yo (1)", R.drawable.appa_yo_1, "Se coloca una letra y sobre el pecho."),
        Flashcards("Yo (2)", R.drawable.appa_yo_2, "Con el índice se señala el pecho."))

    fun setLeccion(option: Int) {
        if( option  == 1){
            flashcards = leccAList
        }
        if (option == 2)
        {
            flashcards = leccBlist
        }
        if (option == 3)
        {
            flashcards = leccClist
        }
        if (option == 4)
        {
            flashcards = leccDlist
        }
        if (option == 5)
        {
            flashcards = leccElist
        }
        //repetir hasta el num y final de lecc#letra disponibles
    }
}