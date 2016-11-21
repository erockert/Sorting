public class sorting
{
  //setting variables
  private Node head;
  private int size;
  //sorting method
  public sorting()
  {
    //setting the head to null
    head = null;
    //setting size equal to 0
    size = 0;
  }
  //SortSize method   
   public int SortSize() 
   {     
     //return size
        return size;
    }
        //printSort method 
       public void printSort()
       {
         //setting the tempNode euqla to the head
        Node tempNode = head;
        //while the head doesnt equal null
        while(tempNode != null) 
        {
          //data equals the head value
            int data = tempNode.getData();
            //print the head
            System.out.println(data);
            //head equals the next of head
            tempNode = tempNode.next;
        }
    }
       //sort method
   public void sort() 
   {
     //if the size is greater than 1 
        if (size > 1) 
        {
          //for when i equals 0, and i is less than size and i+1 
            for (int i = 0; i < size; i++ )
            {
              //temp equals head
                Node tempNode = head;
                //next equals the next of head
                Node next = head.next;
                
                for (int j = 0; j < size - 1; j++) 
                {
                  //if the temp value is greater than the next value 
                 if (tempNode.data > next.data)
                 {
                   //temp  = temp data
                    int temp = tempNode.data;
                    //temp data = the next data
                    tempNode.data = next.data;
                    //the next of data equals temp
                    next.data = temp;
                 }
                 //temp equals next
                    tempNode = next;
                    //next = the next of next
                    next = next.next;                   
                } 
            }
        }
    }
     public void add(int data)
  {
       //calling the new class
    Node node = new Node(data);
    //if the head equals null
    if(head == null)
    {
      //set head to the node
      this.head = node;
    }
    else 
    {
      //setting the tempnode to head
      Node tempNode = head;
      //while head.next doesnt equal null
      while(tempNode.next != null)
      {
        //set tempnode to the next of temp node
        tempNode = tempNode.next;
      }
      //the next of tempNode equals node
      tempNode.next = node;
    }
    //size plus 1
    size++;
  }
  //is empty method
    public boolean isEmpty() 
    {
        return size == 0;
    }
}