class LRUCache {
     class Node{ 
      int key ;
      int val;
      Node prev;
      Node next;
     public Node(int key ,int val){
        this.key = key ;
        this.val= val;

      }
     }
       HashMap<Integer,Node> map= new HashMap<>();
       int capacity;
       Node head;
      Node tail;
    



     




    public LRUCache(int capacity) {
    this.capacity= capacity;
      head = new Node(-1,-1);
   tail = new Node (-1,-1);
    head.next = tail;
    tail.prev=head;
        
    }
    
    public int get(int key) {
       Node node = map.get(key);
       if(node==null){
        return  -1;
       }
       remove(node);
       insert(node);

    

       return node.val;
       }
    
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
         remove(map.get(key));

        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
        
    }
    public void insert(Node node){
      map.put(node.key,node);
      node.next=head.next;
      node.next.prev = node;
      node.prev=head;
      head.next=node;



    }
    public void remove(Node node){
    map.remove(node.key);
    node.prev.next=node.next;
    node.next.prev=node.prev;
    
    
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */