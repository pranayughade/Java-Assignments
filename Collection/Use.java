
class Use<T> implements Product<T>{
    T t[];

    public void print(){
        for (int i = 0; i<t.length; i++){
            System.out.println(t[i]);
        }
    }

    public void set(T[] t){
        this.t = t;
    }
    public T[] get(){
        return t;
    }


}


