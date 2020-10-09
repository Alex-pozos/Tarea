## Tarea Actividad2

### Línea del tiempo de la historia de los compiladores
<html xmlns="http://www.w3.org/1999/xhtml">
<div class="linea-tiempo">
  <div class="momento">
    <h3>2010</h3>
    <div class="descripcion">
      Poop on grasses fight an alligator and win and fight own tail.
    </div>
  </div>
  <div class="momento">
    <h3>2011</h3>
    <div class="descripcion">
      Poop on grasses fight an alligator and win and fight own tail.
    </div>
  </div>
  <div class="momento">
    <h3>2013</h3>
    <div class="descripcion">
      Poop on grasses fight an alligator and win and fight own tail.
    </div>
  </div>
  <div class="momento">
    <h3>2019</h3>
    <div class="descripcion">
      Poop on grasses fight an alligator and win and fight own tail.
    </div>
  </div>
</div>

<style>.linea-tiempo {
    position: relative;
    width: 500px;
    max-width: 95vw;
    height: 100%;
    font-family: Arial;
  }
   
  .momento {
    position: relative;
    width: 45%;
    box-sizing: border-box;
  }
   
  .momento:nth-child(even) {
    left: 55%;
  }
.linea-tiempo::before {
  content: '';
  position: absolute;
  width: 3px;
  background-color: #000;
  left: 50%;
  height: 100%;
  border-radius: 10px;
}
 
.momento::after {
  content: '';
  position: absolute;
  top: calc(50% + 10px);
  right: calc(-11.11% - 11.5px);
  height: 20px;
  width: 20px;
  background-color: #000;
  border-radius: 50%;
}
 
.momento:nth-child(even)::after {
  left: calc(-11.11% - 8.5px);
}
.momento h3 {
    margin: 10px 0px;
    font-size: 30px;
    text-align: center;
  }
   
  .momento .descripcion {
    background-color: #eee;
    border-radius: 10px;
    padding: 10px;
    line-height: 22px;
    font-size: 14px;
  }
   
  .momento .descripcion::after {
    content: '';
    position: absolute;
    right: -10px;
    top: calc(50% + 10px);
    height: 0;
    width: 0;
    border-top: 10px solid transparent;
    border-bottom: 10px solid transparent;
    border-left: 12px solid #eee;
  }
   
  .momento:nth-child(even) .descripcion {
    background-color: #3393FE;
    color: white;
  }
   
  .momento:nth-child(even) .descripcion::after{
    left: -10px;
    border-top: 10px solid transparent;
    border-bottom: 10px solid transparent;
    border-right: 12px solid #3393FE;
    border-left: none;
  }
  </style>
  </html>
