package Test;

public class Baum {
    Baum tree = new Baum();
    Knoten root;

    public Baum(){
        root = null;
    }

    public void insert(Knoten k){
        if (root == null){
            root = k;
        }
            else{
                insert(root, k);
        }
    }

    private void insert(Knoten temp, Knoten k){
        if (k.wert < temp.wert){
            if (temp.links == null){
                temp.links = k;
            }
                else{
                    insert(temp.links, k);
            }
        }
            else {
                if (temp.rechts == null){
                    temp.rechts = k;
                }
                else {
                    insert(temp.rechts,k);
                }
        }
    }

    public void print(){
        print(root);
    }

    private void print(Knoten temp){
        if (temp.links != null) print(temp.links);
        System.out.println(temp.getWert());
        if(temp.rechts != null) print(temp.rechts);
    }

    class Knoten{
        int wert;
        Knoten links;
        Knoten rechts;

        public Knoten (int wert){
            this.wert = wert;
        }

        public int getWert(){
            return wert;
        }

        public void setWert(int w){
            wert = w;
        }

    }

    public static void main(String[] args){
        Baum tree = new Baum();
        Knoten k;
        k = new Knoten(123);
        tree.insert(k);
        k = new Knoten(456);
        tree.insert(k);
        k = new Knoten(789);
        tree.insert(k);
        tree.print();
    }
}

