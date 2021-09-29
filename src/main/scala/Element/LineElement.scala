package Element

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width: Int = super.width
  override def height: Int = 1
}
