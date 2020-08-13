import { Component } from '@angular/core';

import {estacion} from './interfaces/estacion';
@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent  {

  


   

  precio = 0
  precioD = 0
  descuento = 0




  isLogged:boolean = false

  cedula:String = ""

  source:String =""
  target:String = ""
  fecha:Number=0



  verprecio(){
  
    this.precio++
    this.precioD++
    this.descuento++
    console.log(this.precio)
    console.log(this.precioD)
    console.log(this.descuento)

  } 


  constructor(){
    
  }

  comprar(){

  }

}
