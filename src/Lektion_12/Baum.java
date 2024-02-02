package Lektion_12;

public class Baum {
    Knoten root;

    public Baum()
    {
        root = null;
    }

    public void insert(Knoten neu){
        if (root == null)
        {
            root = neu;
        }
            else {
                insert(root, neu);
        }
    }

    private void insert(Knoten temp, Knoten neu){
        if (neu.getWort().compareTo(temp.getWort()) < 0){
            if (temp.left == null)
            {
                temp.left = neu;
            }
            else
            {
                insert(temp.left, neu);
            }
        }
        else
        {
            if (temp.right == null)
            {
                temp.right = neu;
            }
            else
            {
                insert(temp.right, neu);
            }
        }
    }

    public void print(){
        print(root);
    }

    private void print(Knoten temp){
        if (temp.left != null) print(temp.left);
        System.out.println(temp.getWort());
        if(temp.right != null) print(temp.right);
    }

    public String search(String w){
        return search(w, root);
    }

    private String search(String w, Knoten k){
        if (k == null){
            return null;
        }

        if (w.equals(k.wort)){
            return k.bedeutung;
        }
            else if (w.compareTo(k.wort) < 0){
                return search(w, k.left);
        }
            else {
                return search(w, k.right);
        }
    }

    public static void main(String[] args){
        Baum tree = new Baum();
        Knoten k;
        k = new Knoten("Hallo","123");
        tree.insert(k);
        k = new Knoten("Servus","456");
        tree.insert(k);
        k = new Knoten("Moin","789");
        tree.insert(k);
        tree.print();
        System.out.println(tree.search("Moin"));
    }
}
