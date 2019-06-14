class SinglyLinkedList
{
  var head: Node? = null

  fun insert(value: Int)
  {
    var temp = Node(value)
    temp.next = head
    head = temp
  }

  fun remove(value: Int)
  {
    if(head == null)
    {
      throw Exception("List is empty.")
    }

    var current = head

    while(current?.next != null && current.next?.nodeValue != value)
    {
      current = current.next
    }

    if(current?.next?.nodeValue == value)
    {
      current.next = current.next?.next
    }
  }

  fun printList()
  {
    var current = head

    while(current != null)
    {
      println(current.nodeValue)
      current = current.next
    }
  }
}

class Node(value: Int)
{
  var next: Node? = null
  var nodeValue: Int = value
}

fun main(args: Array<String>)
{
  var linkedList = SinglyLinkedList()
  linkedList.insert(5)
  linkedList.insert(6)
  linkedList.insert(1)
  linkedList.insert(9)
  linkedList.printList()
  println()
  linkedList.remove(5)
  linkedList.printList()
}
