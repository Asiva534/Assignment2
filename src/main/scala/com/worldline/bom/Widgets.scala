package com.worldline.bom


trait Widgets {
  def positionX :Int
  def positionY :Int
  def drawWidget :Unit
}

/**
 *
 * @param positionX must be greater than 0
 * @param positionY must be greater than 0
 * @param width must be greater than 0
 * @param height must be greater than 0
 */
case class Rectangle(positionX: Int, positionY: Int,width:Int,height:Int) extends Widgets {
  require(positionX > 0,s"Rectangle positionX must be greater than 0")
  require(positionY >0,s"Rectangle positionY must be greater than 0")
  require(width >0,s"Rectangle width must be greater than 0")
  require(height >0,s"Rectangle height must be greater than 0")

  override def drawWidget: Unit = {
    println(s"Rectangle($positionX,$positionY) width=$width height=$height")
  }
}

/**
 *
 * @param positionX must be greater than 0
 * @param positionY must be greater than 0
 * @param width must be greater than 0
 */
case class Square(positionX: Int, positionY: Int,width:Int) extends Widgets {
  require(positionX > 0,s"Square positionX must be greater than 0")
  require(positionY >0,s"Square positionY must be greater than 0")
  require(width >0,s"Square width must be greater than 0")
  override def drawWidget: Unit = {
    println(s"Square($positionX,$positionY) width=$width")
  }
}

/**
 *
 * @param positionX must be greater than 0
 * @param positionY must be greater than 0
 * @param diameterH must be greater than 0
 * @param diameterV must be greater than 0
 */
case class Ellipse(positionX: Int, positionY: Int,diameterH:Int,diameterV:Int) extends Widgets {
  require(positionX >0,s"Ellipse positionX must be greater than 0")
  require(positionY >0,s"Ellipse positionY must be greater than 0")
  require(diameterH >0,s"Ellipse diameterH must be greater than 0")
  require(diameterV >0,s"Ellipse diameterV must be greater than 0")
  override def drawWidget: Unit = {
    println(s"Ellipse($positionX,$positionY) diameterH=$diameterH diameterV=$diameterV")
  }
}

/**
 *
 * @param positionX must be greater than 0
 * @param positionY must be greater than 0
 * @param size must be greater than 0
 */
case class Circle(positionX: Int, positionY: Int,size:Int) extends Widgets {
  require(positionX >0,s"Circle positionX must be greater than 0")
  require(positionY >0,s"Circle positionY must be greater than 0")
  require(size >0,s"Circle size must be greater than 0")
  override def drawWidget: Unit = {
    println(s"Circle($positionX,$positionY) diameter=$size")
  }
}

/**
 *
 * @param positionX must be greater than 0
 * @param positionY must be greater than 0
 * @param width must be greater than 0
 * @param height must be greater than 0
 * @param text is optional
 */
case class TextBox(positionX: Int, positionY: Int,width:Int,height:Int,text:String="") extends Widgets {
  require(positionX >0,s"TextBox positionX must be greater than 0")
  require(positionY >0,s"TextBox positionY must be greater than 0")
  require(width >0,s"TextBox width must be greater than 0")
  require(height >0,s"TextBox height must be greater than 0")
  override def drawWidget: Unit = {
    println(s"TextBox($positionX,$positionY) width=$width height=$height text=$text")
  }
}