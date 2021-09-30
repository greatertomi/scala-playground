package IntQueue

trait Incrementing extends IntQueue {
  override abstract def put(x: Int): Unit = {super.put(x + 1)}
}
