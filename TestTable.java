package Hashtable;

import java.util.Random;

public class TestTable {
    
    public static void main(String args[]){
        new TestTable();
    }
    public TestTable(){
        int maxRandom = 20;
        int values[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            values[i] = r.nextInt(maxRandom) + 1;
        }
        HashTable linearTable = new HashTable();
        for (int i = 0; i < values.length; i++){
            linearTable.put(values[i]);
        }
        System.out.println("linearTable\n");
        System.out.println(linearTable);
        // linearTable.put(new Integer(14));
        // System.out.println(linearTable);
        HashTable quadTable = new HashTable(HashTable.PROBING_METHOD.QUADRATIC_HASHING);
        for (int i = 0; i < values.length; i++){
            quadTable.put(values[i]);
        }
        System.out.println("quadraticTable\n");
        System.out.println(quadTable);
    }
}
