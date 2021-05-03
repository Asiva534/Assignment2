package com.worldline.bom

import org.scalatest.flatspec.AnyFlatSpec

class BOMAPPSpec extends AnyFlatSpec{

  /*
   Build widgets with valid input
  */
  "BOMApp creating Rectangle" should "succeed" in {
    val rect = BOMApp.buildRect(1,3,5,7)
        assert(rect.positionX ==1)
        assert(rect.positionY ==3)
        assert(rect.width ==5)
        assert(rect.height ==7)
    }
  "BOMApp creating Square" should "succeed" in {
    val square = BOMApp.buildSquare(1,3,5)
    assert(square.positionX ==1)
    assert(square.positionY ==3)
    assert(square.width ==5)
  }
  "BOMApp creating Ellipse" should "succeed" in {
    val ellipse = BOMApp.buildEllipse(1,3,5,7)
    assert(ellipse.positionX ==1)
    assert(ellipse.positionY ==3)
    assert(ellipse.diameterH ==5)
    assert(ellipse.diameterV ==7)
  }
  "BOMApp creating Circle" should "succeed" in {
    val circle = BOMApp.buildCircle(1,3,5)
    assert(circle.positionX ==1)
    assert(circle.positionY ==3)
    assert(circle.size ==5)
  }

  "BOMApp creating TextBoxWithMsg" should "succeed " in {
    val textBoxWithMsg = BOMApp.buildTextBoxWithMsg(1,3,5,7,"sample test")
    assert(textBoxWithMsg.positionX ==1)
    assert(textBoxWithMsg.positionY ==3)
    assert(textBoxWithMsg.width ==5)
    assert(textBoxWithMsg.height ==7)
    assert(textBoxWithMsg.text =="sample test")
  }

  /*
   Build widgets with invalid input
  */
  "BOMApp while creating Rectangle" should "throws exception " in {
    val caught = intercept[RuntimeException] {
    BOMApp.buildRect(-1, 3, 5, 7)
    }
    assert(caught.getMessage.contains("Rectangle positionX must be greater than 0"))
  }
  "BOMApp while creating Circle" should "throws exception" in {
    val caught = intercept[RuntimeException] {
      BOMApp.buildCircle(1, 3, -5)
    }
    assert(caught.getMessage.contains("Circle size must be greater than 0"))
  }
  "BOMApp while creating Ellipse" should "throws exception" in {
    val caught = intercept[RuntimeException] {
      BOMApp.buildEllipse(1, 3, -2,5)
    }
    assert(caught.getMessage.contains("Ellipse diameterH must be greater than 0"))
  }
  "BOMApp while creating Square widget" should "throws exception" in {
    val caught = intercept[RuntimeException] {
      BOMApp.buildSquare(1, 3, -2)
    }
    assert(caught.getMessage.contains("Square width must be greater than 0"))
  }
  "BOMApp while creating TextBoxWithMsg widget" should "throws exception" in {
    val caught = intercept[RuntimeException] {
      BOMApp.buildTextBoxWithMsg(1, -3, 1,4)
    }
    assert(caught.getMessage.contains("TextBox positionY must be greater than 0"))
  }

}
