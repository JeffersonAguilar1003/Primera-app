package com.example.jeffffffff

import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.jeffffffff.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //saludo()
        //println("hola estudiantes de programacion IV")

        VariableyConstantes()
    }

    /**
     * A native method that is implemented by the 'jeffffffff' native library,
     * which is packaged with this application.
     */

    fun saludo(){
        println("hola estudiantes de progra IV")
    }

    private fun VariableyConstantes(){
        //variables
        var miprimeravariable = "hola estudiantes de ingenieria"
        println(miprimeravariable)

        miprimeravariable = "aqui cambiamos el valor de la variable"
        println(miprimeravariable)

        //constantes
        val miprimeraconstante = "esto es una contante"
        println(miprimeraconstante)
        //una constante no se puede cambiar

        val misegundaconstante = miprimeraconstante
        println(misegundaconstante)

        var minumero = 1
        var midouble = 2.2

    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun sjercicioVarVal(){
        print("hola alumnos")
        val nombre:String="Pedro"

        var apellido:String = "Lopes"
        apellido = "Lopez"

        var edad:Int = 21
        edad = 22

        var salario = 1200
        salario = 1220

        var NombreCompleto = nombre + " " + apellido
        println(NombreCompleto)

        val añonacimiento = 2000
        var añoactual = Calendar.getInstance().get(Calendar.YEAR)
        var Edad = añoactual-añonacimiento
        println("tu edad es: " +Edad)
        println("tu edad es: $Edad")

    }

    private fun tiposdedatos(){
        //Enteros(Byte,Short,Int,Long)
        val miInt = 1
        val miInt2:Int = 3
        val miInt3:Int = miInt+miInt2
        println(miInt3)

        //Decimales(Floot,Double)
        val miFloat = 1.7f
        val mifloat2 = 1.7f
        val miDouble = 1.3
        val miDouble2:Double = 1.4
        val miDouble3:Double = 1.4
        var miSumaDouble = miDouble+miDouble2+miDouble3
        println(miSumaDouble)

        //boolean(boll)
        val miBoolean:Boolean = true
        val miBoolean2 = true
        val miBoolean3:Boolean = true
        println(miBoolean==miBoolean2)
        println(miBoolean&&miBoolean3)


    }


    private fun tiposDeDatosDeducidoExplicitos(){
        var enteroExplicito:Int = 45
        println(enteroExplicito.javaClass)
        var enteroDeducido:Int = 35
        println(enteroDeducido.javaClass)

        var dobleExplicito:Double = 45.45
        println(dobleExplicito.javaClass)
        var dobleDeducido:Double = 35.35
        println(dobleDeducido.javaClass)

        var flotanteExplicito:Float = 45.45f
        println(flotanteExplicito.javaClass)
        var flotanteDeducido:Float = 35.35f
        println(flotanteDeducido.javaClass)

        var largoExplicito:Long = 454545
        println(largoExplicito.javaClass)
        var largoDeducido:Long = 353535
        println(largoDeducido.javaClass)

        var textoExplicito:String = "45"
        println(textoExplicito.javaClass)
        var textoDeducido:String = "35"
        println(textoDeducido.javaClass)

        enteroExplicito=textoExplicito.toInt()
        println(enteroExplicito.javaClass)

        enteroDeducido=textoDeducido.toInt()
        println(enteroDeducido.javaClass)

    }









    companion object {
        // Used to load the 'jeffffffff' library on application startup.
        init {
            System.loadLibrary("jeffffffff")
        }
    }
}