package com.worldline.bom

import com.typesafe.scalalogging.LazyLogging

/**
 * Building Bill of material app
 */
object BOMApp extends App with LazyLogging{
  /**
   *
   * @param widgets draws the respective shape
   */
  private def drawWidget(widgets: Widgets) :Unit ={
    widgets.drawWidget
  }

    def buildRect(x:Int,y:Int,w:Int,h:Int):Rectangle = Rectangle(positionX = x, positionY = y, width = w,height = h)
    def buildSquare (x:Int,y:Int,w:Int):Square = Square(positionX = x, positionY = y, width = w)
    def buildEllipse (x:Int,y:Int,dh:Int,dv:Int):Ellipse = Ellipse(positionX = x, positionY = y, diameterH = dh, diameterV = dv)
    def buildCircle  (x:Int,y:Int,s:Int):Circle = Circle(positionX = x, positionY = y, size = s)
    def buildTextBoxWithMsg  (x:Int,y:Int,w:Int,h:Int,t:String=""):TextBox = TextBox(positionX = x, positionY = y, width = w, height = h, text = t)

  try {
    val rect = buildRect(10,10,30,40)
    val square = buildSquare(15,30,35)
    val ellipse = buildEllipse(100,150,300,200)
    val circle = buildCircle(1,1,300)
    val textBoxWithMsg = buildTextBoxWithMsg(5,5,200,100,"sample text")
    println("---------------------------------------------------------")
    println("Bill Of Materials")
    println("---------------------------------------------------------")
    Seq(rect,square,ellipse,circle,textBoxWithMsg).foreach(widget=> drawWidget(widget))
    println("---------------------------------------------------------")
  }catch {
    case ex:Exception => {
      logger.error("Bill of Material generation failed",ex)
      println("+++++Abort+++++")
    }
  }
}
