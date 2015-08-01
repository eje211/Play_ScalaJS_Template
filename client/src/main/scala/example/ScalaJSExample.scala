package example

import scala.scalajs.js
import org.scalajs.dom
import shared.SharedMessages
import scala.scalajs.js.annotation.JSExport
import dom.document

@JSExport
object ScalaJSExample extends js.JSApp {
  @JSExport
  def main(): Unit = {
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks

  }
  @JSExport
  def appendPar(targetNode: dom.Node, text: String) : Unit = {
    //createElement creates element of the type specified as a string
    val parNode = document.createElement("p")
    //createTextNode accepts a string and creates a  node out of it
    val textNode = document.createTextNode(text)
    //Here we append a string to the paragraph node
    parNode.appendChild(textNode)
    //Here we append the created node to the document/html
    targetNode.appendChild(parNode)
  }

  //  Reacting ot user input
  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
}
