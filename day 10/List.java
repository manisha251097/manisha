/**
 * 
 */

public class List extends AbstractList {
    list(){
        super();
    }

    public void add(int item){
        this.list[size]=item;
        size++;
        if(size==capacity){
            resize();
        }
    }

public void add(int index,int item){

    for(int i=size;i>index;i-- ){
        list[i]=list[i-1];


    }
    list[index]=item;
    size++;
}
    
}