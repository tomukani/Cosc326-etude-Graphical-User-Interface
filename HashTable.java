package Hashtable;

/**
 * Implementation of hash table for COSC326 etude 7
 *@author Thomas Hunt
 *@author Joshua Mullin
 */
public class HashTable {
    /**
     * The capacity of the HashTable
     */
    private int capacity;
    /**
     * The number of keys in the hash table
     */
    private int count;
    /**
     * The array containing the keys in the HashTable
     */    
    private int[] table;
    /**
     * The different probing methods available
     */
    protected enum PROBING_METHOD {
        LINEAR_PROBING,
        QUADRATIC_HASHING
    }
    /**
     * The current method of probing
     */
    protected PROBING_METHOD hashingT = PROBING_METHOD.LINEAR_PROBING;
    
    /**
     * Default constructor for hash table
     * Sets the default capacity to 10
     */    
    public HashTable() {        
        this(10);
    }
    /**
     * Constructor for hash table
     * Sets the capacity to capacity.
     *@param capacity the capacity of the hash table.
     */
    public HashTable(int capacity){
        this.capacity = capacity;
        table = new int[capacity];
    }    
    /**
     * Constructor for hash table
     * Sets the probing method to hashingT
     *@param hashingT probing method of the hash table
     */
    public HashTable(PROBING_METHOD hashingT){
        this();
        this.hashingT = hashingT;
    }
    /**
     * Constructor for hash Table
     * Sets the capacity to capacity
     * Sets the probing method to hashingT
     *@param hashingT probing method of the hash table
     */
    public HashTable(int capacity, PROBING_METHOD hashingT){
        this(capacity);
        this.hashingT = hashingT;
    }
    /**
     * Clears the elements in the hash table
     */
    public void clear(){
        for(int i = 0; i < capacity; i++){
            table[i] = 0;
        }
    }
    /**
     * Setter for hashingT
     */
    protected void setHashingT(PROBING_METHOD hashingT){
        this.hashingT = hashingT;
    }
    /**
     * Returns whether the hash table is empty
     */
    public boolean isEmpty(){
        return count == 0;
    }
    /**
     * Returns whether the hash table is full
     *@return whether the hash table is full
     */
    public boolean isFull(){
        return count == capacity;
    }
    /**
     * Determines the hashing method selected by the hashingT field and calls the appropriate probing method
     *@param value the value to be probed for
     */
    private int probe(int value){
        int prob;
        switch (hashingT){
            case QUADRATIC_HASHING:
                prob = quadraticProb(value);
                break;
            default:
                prob = linearProb(value);
        }
        return prob;
    }
    /**
     * Finds a place in the hash table for a given key via linear probing
     *@param value the value to input
     *@return the first index of the hash table where the value could be inserted/found, -1 if no suitable index found
     */
    private int linearProb(int value){
        int hash = hash(value, capacity);
        int collision = 0;        
        for (int i = 0; i < capacity; i++){
            if (hash >= capacity){
                hash = 0;
            }
            if (value == table[hash] || 0 == table[hash]){
                return hash;
            } else {
                collision++;
                hash++;                
            }
        }
        return -1;
    }
    /**
     * Returns a quadratic hash of the prob
     */
    public int quadHash(int value, int collision){
        return (hash(value, capacity) + (int) Math.pow(collision, 2)) % capacity;
    }
    /**
     * Finds a place in the hash table for a given key via quadratic probing
     *@param value the value to input
     *@return the first index of the hash table where the value could be inserted/found, -1 if no suitable index found
     */
    private int quadraticProb(int value){
        int hash = quadHash(value, capacity);
        int collision = 0;
        for (int i = 0; i < capacity; i++){
            if (hash >= capacity){
                hash = 0;
            }
            
            if (value == table[hash] || 0 == table[hash]){
                return hash;
            } else {
                collision++;
                hash = quadHash(value, collision) % capacity;
            }
        }
        return -1;
    }

    /**
     * Returns if the given value is in the hash table
     *@param value The given value
     */
    public boolean contains(int value){
        return probe(value) != -1;
    }
    /**
     * Returns the hash for the value
     *@param value the value to hash.
     *@param capacity the capacity of the hash table
     */
    public int hash(int value, int capacity){
        return value % capacity;
    }
    /**
     * Puts a value in the hash table
     *@param value the value to put into the hash table.
     */
    public boolean put(int value){      
        if (isFull() || value == 0){
            return false;
        }
        int prob = probe(value);
        if (prob == -1){
            return false;
        }
        //System.out.println(prob + " " + value);
        table[prob] = value;
        count++;
        return true;
    }
    /**
     * Removes a value from the hash table
     * @param value the value to be removed
     */
    public void remove(int value){
        //try {
        //    table[probe(value)] = 0;
        //} catch(ArrayIndexOutOfBoundsException e){
            //if probe returns -1 (not found)
        //    System.err.println("Problem with " + value + "\n");
        //}
        for(int i = 0; i < table.length; i++){
            if(table[i] == value){
                table[i] = 0;
                count --;
            }
        }
        
    }
    public String toString(){
        String string = "Key\tValue\n\n";
        for (int i = 0; i < capacity; i++){
            string += i + "\t" + table[i] + "\n";
        }
        return string;
    }
    /**
     * Returns the current count value
     * @return count 
     */
    public int getCount(){
        return count;
    }
    
    /**
     * Returns the actual hashtable
     * @return table
     */
    public int[] getTable(){
        return table;
    }
}

